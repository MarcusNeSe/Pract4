package Entornos.Practica3;

public class Gato extends Mascota
{
    @Override
    public void sonido() {
        System.out.println("Miau, Miau");
    }

    //Atributs
    private String raza = new String();

    //Constructor
    public Gato()
    {
        this.raza = null;
    }

    public Gato(String nombre, int edad, String raza)
    {
        super(nombre, edad);
        this.raza = raza;
    }

    //Metodos

    //Setters y getters
    public String getRaza() {return raza;}
    public void setRaza(String raza) {this.raza = raza;}
}
