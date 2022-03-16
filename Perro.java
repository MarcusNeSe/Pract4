package Entornos.Practica3;

public class Perro extends Mascota
{
    
    //Atributs
    private String raza = new String();

    //Constructor
    public Perro()
    {
        this.raza = null;
    }

    public Perro(String nombre, int edad, String raza)
    {
        super(nombre, edad);
        this.raza = raza;
    }

    //Metodos

    //Setters y getters
    public String getRaza() {return raza;}
    public void setRaza(String raza) {this.raza = raza;}
}
