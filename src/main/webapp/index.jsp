<%@ page import="mx.edu.utez.animalesdemo3.HelloServlet" %>
<%@ page import="mx.edu.utez.animalesdemo3.models.DaoAnimal" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" href="css/bootstrap.css">

</head>
<body>
 <br/>
<br/>
<br/>
<div><h1>Presiona el siguiente boton para mostrar la tabla animales</h1></div>
<br/>
<br/>


<br/>


<div>

    <form action="hello-servlet" method="get">
        <button type="submit" class="btn btn-primary">Mostrar tabla</button>
    </form>

</div>
<br/>
<br/>

<script src="js/bootstrap.js"></script>
</body>
</html>