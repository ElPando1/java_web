package com.ebenmedia.javaweb.servlets.usuarios;

import com.ebenmedia.javaweb.negocio.Usuario;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "svUsuarios", value = "/svUsuarios")
public class svUsuarios extends HttpServlet {
    List<Usuario> listaUsuarios = new ArrayList<>();
    HttpSession sesionActual = null;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        listaUsuarios.add(new Usuario("0001", "George", "Michaels", "Nichols", "56214563"));
        listaUsuarios.add(new Usuario("0002", "Alfred", "Pennyworth", "Dark", "56254623"));
        listaUsuarios.add(new Usuario("0003", "Walter", "Hartwell", "Jameson", "56123463"));
        listaUsuarios.add(new Usuario("0004", "Jose", "Lopez", "Hernandez", "56654663"));
        listaUsuarios.add(new Usuario("0005", "Walter", "Michaels", "Justified", "56214512"));

        sesionActual = request.getSession();
        sesionActual.setAttribute("listaUsuarios", listaUsuarios);

        response.sendRedirect("mostrarUsuarios.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String requestCURP = request.getParameter("curp");
        String requestNombre = request.getParameter("first_name");
        String requestApellidoPaterno = request.getParameter("last_name1");
        String requestApellidoMaterno = request.getParameter("last_name2");
        String requestTelefono = request.getParameter("cellphone");

        listaUsuarios.add(new Usuario(requestCURP, requestNombre, requestApellidoPaterno, requestApellidoMaterno, requestTelefono));
        sesionActual = request.getSession();

        sesionActual.setAttribute("listaUsuarios", listaUsuarios);
        response.sendRedirect("mostrarUsuarios.jsp");

    }
}