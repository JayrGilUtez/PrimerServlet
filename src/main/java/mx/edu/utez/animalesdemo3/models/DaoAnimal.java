package mx.edu.utez.animalesdemo3.models;

import mx.edu.utez.animalesdemo3.models.Animal;
import mx.edu.utez.animalesdemo3.utils.MysqlConector;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class DaoAnimal implements DaoRepository<Animal> {



    @Override
    public List<Animal> findall() {
        List<Animal> animales = new ArrayList<>();

        // Crear la conexión
        MysqlConector conexion = new MysqlConector();
        // Verificar si la conexión fue exitosa
        try (Connection con = conexion.connect()) {
            try {
                PreparedStatement stmt = con.prepareStatement("Select * from animalesdemo1wk.animales");
                ResultSet resultado = stmt.executeQuery();

                while (resultado.next()) {
                    int id = resultado.getInt("id");
                    String especie = resultado.getString("especie");
                    String dieta = resultado.getString("dieta");
                    String habitat = resultado.getString("habitat");
                    String nombreCientifico = resultado.getString("nombreCientifico");
                    String nombreComun = resultado.getString("nombreComun");
                    String nombreDelAnimal = resultado.getString("nombreDelAnimal");


                    Animal animal = new Animal(id,especie, dieta, habitat, nombreCientifico, nombreComun, nombreDelAnimal);
                    animales.add(animal);
                }


            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return animales;
    }

    @Override
    public Animal findOne(int id) {
        return null;
    }

    @Override
    public boolean create(Animal object) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean update(Animal object, int id) {
        return false;
    }
}

