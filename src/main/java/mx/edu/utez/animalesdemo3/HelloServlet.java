package mx.edu.utez.animalesdemo3;

import mx.edu.utez.animalesdemo3.models.Animal;
import mx.edu.utez.animalesdemo3.models.DaoAnimal;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.*;


@javax.servlet.annotation.WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet  {
    private String message;

    public void init() {
        message = "Hello Servlet!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        DaoAnimal dao = new DaoAnimal();
        List<Animal> animales = dao.findall();



        //estructura de la tabla css con las columnas: id, especie, dieta, habitat, nombreCientifico, nombreComun y nombreDelAnimal
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Tabla de Animales</title>");
        out.println("<style>");
        out.println("table {");
        out.println("  width: 100%;");
        out.println("  border-collapse: collapse;");
        out.println("}");

        out.println("th, td {");
        out.println("  padding: 8px;");
        out.println("  text-align: left;");
        out.println("  border-bottom: 1px solid #ddd;");
        out.println("}");

        out.println("th {");
        out.println("  background-color: #f2f2f2;");
        out.println("}");

        out.println("</style>");

        //insertamos bootstrap
        out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">");

        out.println("</head>");
        out.println("<body>");

        out.println("<table class=\"table table-striped\">");
        out.println("<thead>");
        out.println("<tr>");
        out.println("<th scope=\"col\">#id</th>");
        out.println("<th scope=\"col\">Especie</th>");
        out.println("<th scope=\"col\">Dieta</th>");
        out.println("<th scope=\"col\">Habitat</th>");
        out.println("<th scope=\"col\">Nombre Cientifico</th>");
        out.println("<th scope=\"col\">Nombre Comun</th>");
        out.println("<th scope=\"col\">Nombre del Animal</th>");
        out.println("</tr>");
        out.println("</thead>");
        out.println("<tbody>");

        //pasamos los datos de la tabla de la base de datos a la tabla de bootstrap
        int i = 1;
        for (Animal animal : animales) {
            out.println("<tr>");
            out.println("<td>" + animal.getId() + "</td>");
            out.println("<td>" + animal.getEspecie() + "</td>");
            out.println("<td>" + animal.getDieta() + "</td>");
            out.println("<td>" + animal.getHabitat() + "</td>");
            out.println("<td>" + animal.getNombreCientifico() + "</td>");
            out.println("<td>" + animal.getNombreComun() + "</td>");
            out.println("<td>" + animal.getNombreDelAnimal() + "</td>");
            out.println("</tr>");
            i++;

        }

        out.println("</tbody>");
        out.println("</table>");
        // insertamos bootstrap js
        out.println("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>");
        out.println("</body></html>");


    }



    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    // esto ya no lo ocuope
        response.setContentType("text/html");
        DaoAnimal dao = new DaoAnimal();
        List<Animal> animales = dao.findall();
        request.getRequestDispatcher("mostrarTabla.jsp").forward(request, response);

        // Hello de prueba
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");


        out.println("</body></html>");



    }

    public void destroy() {

    }


}