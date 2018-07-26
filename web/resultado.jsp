<%@page import="model.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Concurso</h1>

        <%
            Persona p = (Persona) request.getAttribute("persona");

            if(p == null){
                out.print("Usted no ha ganado! :C"); // echo
            }else{
                out.print("Ha ganado!! Felicitaciones "+p.getNombre());
            }
        %>

        <!-- Ha ganado!!! <h4>Felicitaciones ${persona.nombre}</h4> -->
        <a href="index.html">Volver</a>
    </body>
</html>
