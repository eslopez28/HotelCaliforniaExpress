package servlets;

import clases.Administracion;
import clases.HDelux;
import clases.HDoble;
import clases.HStandard;
import clases.Hotel;
import clases.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "LoginUsuario", urlPatterns = {"/LoginUsuario"})
public class LoginUsuario extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        HttpSession user = request.getSession();
        String username = request.getParameter("username");
        String pass = request.getParameter("password");

        Usuario usuario = new Usuario("prueba", "123", 123);
        Hotel a = new Hotel(5, "asdasd", "hotel1", 23, 4123, "hotel de prueba", "de 123 a d3");
        Hotel sd = new Hotel(234, "sdwer", "hotel2", 2233, 414523, "hotel de prueba 2", "de 123 a d3");


        HDelux hdlux1 = new HDelux(45, "6", 56, false);
        HStandard hstandard1  = new HStandard(65, "2", 789, false);
        HDoble hdoble1 = new HDoble(123, "3", 68, false);

        
        a.addLstHabitacion(hstandard1);
        a.addLstHabitacion(hdoble1);
        a.addLstHabitacion(hdlux1);
        
        usuario.addLstHoteles(sd);
        usuario.addLstHoteles(a);

        Administracion adminUsuario = new Administracion();
        adminUsuario.agregarUsuario(usuario);

        try {


            if (("1".equals(username) && "1".equals(pass)) || (adminUsuario.getParameters("user").equals(username) && adminUsuario.getParameters("pass").equals(pass))) {

                user.setAttribute("usuario", usuario);
                response.sendRedirect("mantenimientoDeHoteles.jsp");
            } else {
                response.sendRedirect("error.jsp");
            }

        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
