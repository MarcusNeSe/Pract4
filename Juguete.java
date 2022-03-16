package Entornos.Practica4;
public class Juguete {
    //Atributos
    private String nombre = new String();
    private int precio;
    private int edadRecomendada;

    //Constructores
    public Juguete() {
        this.nombre = null;
        this.precio = 0;
        this.edadRecomendada = 0;
    }

    public Juguete(String nombre, int precio, int edadRecomendada) {
        this.nombre = nombre;
        this.precio = precio;
        this.edadRecomendada = edadRecomendada;
    }

    //Metodos
    @Override
    public String toString() {
        String texto = new String();
        texto = "Nombre: " + nombre + ", Precio: " + precio + ", Edad Recomendada: " + edadRecomendada;
        return texto;
    }

    //Setters y Getters
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public int getPrecio() {return precio;}
    public void setPrecio(int precio) {this.precio = precio;}
    public int getEdadRecomendada() {return edadRecomendada;}
    public void setEdadRecomendada(int edadRecomendada) {this.edadRecomendada = edadRecomendada;}

}
