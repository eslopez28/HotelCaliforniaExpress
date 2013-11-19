/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import clases.Hotel;
import clases.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Andrea
 */
public class ServletMantenimientoHotelesModificar extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
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

        String id = request.getParameter("id");
        String nombre = request.getParameter("Nombre");
        String direccion = request.getParameter("Direccion");
        String estrellas = request.getParameter("Estrellas");
        String horario = request.getParameter("Horario");
        String cupoTotal = request.getParameter("CupoTotal");

        int indexHotel = (Integer) request.getSession().getAttribute("indexHotel");

        Hotel hotel; //(Hotel) request.getSession().getAttribute("hotel");
        Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
        hotel = usuario.getLstHoteles().get(indexHotel);
        try {
            
           
            // usuario.getLstHoteles().get(indexHotel)
            usuario.getLstHoteles().get(indexHotel).setId(Integer.parseInt(id));
            usuario.getLstHoteles().get(indexHotel).setNombre(nombre);
            usuario.getLstHoteles().get(indexHotel).setDireccion(direccion);
            usuario.getLstHoteles().get(indexHotel).setEstrellas(Integer.parseInt(estrellas));
            usuario.getLstHoteles().get(indexHotel).setHorario(horario);
            usuario.getLstHoteles().get(indexHotel).setCupoTotal(Integer.parseInt(cupoTotal));

            request.getSession().removeAttribute("hotel");

            response.sendRedirect("paginaDeHotel.jsp");
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
