package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Persona;

@WebServlet(name = "BuscarPersonaServlet", urlPatterns = {"/buscarPersona.do"})
public class BuscarPersonaServlet extends HttpServlet {

   
    // Procesar peticiones GET
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("index.html").forward(request, response);
    }

    // Procesar peticiones POST
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String dni = request.getParameter("DNI");
        
        Persona p = null;

        if(dni.equals("11-1")){
            p = new Persona("11-1", "Erick Cabrera");
        }else if(dni.equals("22-2")){
            p = new Persona("22-2", "Ángeles Ubilla Pérez");
        }
        
        request.setAttribute("persona", p); 
        request.getRequestDispatcher("resultado.jsp").forward(request, response);
    }

}
