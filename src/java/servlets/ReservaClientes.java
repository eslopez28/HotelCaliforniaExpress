package servlets;

import clases.Cliente;
import clases.Reserva;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ReservaClientes", urlPatterns = {"/ReservaClientes"})
public class ReservaClientes extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            response.sendRedirect("reservaH.jsp");
           String nombre = request.getParameter("nombre");
           String id = request.getParameter("id");
           String nacionalidad = request.getParameter("nacionalidad");
           String correo = request.getParameter("correo");
            Cliente c = new Cliente(nombre, Integer.parseInt(id), correo, nacionalidad, 83236004, "xxxx", "sdf");
            request.getSession().setAttribute("cliente", c);
            String dia = request.getParameter("dia");
            String mes= request.getParameter("mes");
            String anno = request.getParameter("anno");
            String dia2 = request.getParameter("dia2");
            String mes2= request.getParameter("mes2");
            String anno2 = request.getParameter("anno2");
            
            String horaS= request.getParameter("horaS");
            String minutosS= request.getParameter("minutosS");
            String selampppm2= request.getParameter("selampppm2");
            String horaL= request.getParameter("horaL");
            String minutosL= request.getParameter("minutosL");
            String selampppm= request.getParameter("selampppm");
            
            String adultoscant= request.getParameter("adultoscant");
            String ninnoscant= request.getParameter("ninnoscant");
            
            String fechaLlegada =dia + "/"+mes+"/"+anno;
            String fechaSalida= dia2+ "/" + mes2+ "/" + anno2;
            String horaLlegada = horaL+ ":" + minutosL +" "+ selampppm;
            String horaSalida = horaS+ ":" + minutosS+ " "+ selampppm2;
            
            int adultos= Integer.parseInt(adultoscant);
            int ninnos= Integer.parseInt(ninnoscant);
            Random ran =new Random(1000);
            int codigo = ran.nextInt();
            Reserva r = new Reserva(fechaLlegada, fechaSalida, horaLlegada, horaSalida, c, codigo, ninnos, adultos);
            
            request.getSession().setAttribute("reserva", r);
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
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
     * Handles the HTTP <code>POST</code> method.
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
