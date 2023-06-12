package mx.edu.utez.animalesdemo3.models;
//import mx.edu.utez.animalesdemo3

public class Animal {

//creaamos los atriutos de la clase animal con los siguientes atributos: id, especie, dieta, habitat, nombreCientifico, nombreComun y nombreDelAnimal
    private int id;
    private String especie;
    private String dieta;
    private String habitat;
    private String nombreCientifico;
    private String nombreComun;
    private String nombreDelAnimal;

//creamos el constructor de la clase animal con los siguientes atributos: id, especie, dieta, habitat, nombreCientifico, nombreComun y nombreDelAnimal
    public Animal(int id, String especie, String dieta, String habitat, String nombreCientifico, String nombreComun, String nombreDelAnimal) {
        this.id = id;
        this.especie = especie;
        this.dieta = dieta;
        this.habitat = habitat;
        this.nombreCientifico = nombreCientifico;
        this.nombreComun = nombreComun;
        this.nombreDelAnimal = nombreDelAnimal;
    }
    //constructor vacio
    public Animal(){

    }

    //getters y setters de los atributos de la clase animal
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public String getNombreDelAnimal() {
        return nombreDelAnimal;
    }

    public void setNombreDelAnimal(String nombreDelAnimal) {
        this.nombreDelAnimal = nombreDelAnimal;
    }



}
