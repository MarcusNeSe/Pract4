package Entornos.Practica3;

public abstract class Mascota implements NuevaInterfaz
{   
    //Atributs
    private String nombre = new String();
    private int edad;

    //Constructor
    /**
     * 
     */
    public Mascota()
    {
        this.nombre = null;
        this.edad = 0;
    }

    /**
     * 
     * @param nombre: Nuevo valor nombre.
     * @param edad: Nuevo valor edad.
     */
    public Mascota(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Metodos

    //Setters y getters
    /**
     * El getNombre nos devuelve un nombre.
     * @return nos devuelve un nombre
     */
    public String getNombre() {return nombre;}
    /**
     * 
     * @param nombre
     */
    public void setNombre(String nombre) {this.nombre = nombre;}
    public int getEdad() {return edad;}
    public void setEdad(int edad) {this.edad = edad;}

}
