<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Formulario de Prueba</title>
</head>
<body>
<div>
    <h1><%= "Hello World!" %></h1>
    <br/>
    <h2>Datos del usuario</h2>
    <form action="svUsuarios" method="POST">
        <p><label>CURP:</label><input type="text" name="curp"></p>
        <p><label>Nombre/s:</label><input type="text" name="first_name"></p>
        <p><label>Apellido Paterno:</label><input type="text" name="last_name1"></p>
        <p><label>Apellido Materno:</label><input type="text" name="last_name2"></p>
        <p><label>Teléfono:</label><input type="text" name="cellphone"></p>
        <button type="submit">Enviar</button>
    </form>
    <a href="">Hello Servlet</a>
</div>

<div>
    <h1>Ver lista de usuarios</h1>
    <p>Traer todos los usuarios</p>
    <form action="svUsuarios" method="get">
        <button type="submit">Mostrar usuarios</button>
    </form>
</div>
</body>
</html>