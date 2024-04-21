package com.ebenmedia.javaweb.servlets.usuarios;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "svUsuarios", value = "/svUsuarios")
public class svUsuarios extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String requestCURP = request.getParameter("curp");
        String requestNombre = request.getParameter("nombre");
        String requestApellidoPaterno = request.getParameter("apellido_paterno");
        String requestApellidoMaterno = request.getParameter("apellido_materno");
        String requestTelefono = request.getParameter("telefono");

    }
}