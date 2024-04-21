<%@ page import="com.ebenmedia.javaweb.negocio.Usuario" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Armando
  Date: 21/04/2024
  Time: 02:16 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Administración de usuarios</title>
</head>
<body>
    <h1> Lista de Usuarios Registrados </h1>
        <%
            List<Usuario> listaUsuarios = (List) request.getSession().getAttribute("listaUsuarios");
            int count = 1;
            for (Usuario usuario : listaUsuarios) {
        %>
            <p><b>Usuario N°<%=count%></b></p>
            <p>CURP: <%=usuario.getCurp()%></p>
            <p>Nombre: <%=usuario.getNombre()%></p>
            <p>Apellido Paterno: <%=usuario.getApellidoPaterno()%></p>
            <p>Apellido Materno: <%=usuario.getApellidoMaterno()%></p>
            <p>Teléfono: <%=usuario.getTelefono()%></p>
            <% count = count + 1;%>
            <p>------------------------------------------------------</p>
        <%
        }
        %>


</body>
</html>
