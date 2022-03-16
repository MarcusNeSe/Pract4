package Entornos.Practica3;
//import java.util.ArrayList;
//import java.util.Scanner;

public class Adulto extends Persona {
    //Atributos
    private String nss = new String();
    private String direccion = new String();

    //Constructores
    public Adulto() {
        this.nss = null;
        this.direccion = null;
    }

    public Adulto(String nombre, String apellidos, String dni, int edad, String nss, String direccion) {
        super(nombre, apellidos, dni, edad);
        this.nss = nss;
        this.direccion = direccion;
       
    }
    //Metodos (Crear, eliminar, buscar Adulto)
    @Override
    public String toString() {
        String texto = new String();
        texto = "Nombre: " + this.getNombre() + ", Apellidos: " + this.getApellidos() + ", DNI: " + this.getDni() + ", Edad: " + this.getEdad() + ", NSS: " + nss + ", Dirección: " + direccion;
        return texto;
    }

    /*public static void agregarAdulto(ArrayList<Adulto>listaAdultos) {
        Scanner teclado = new Scanner(System.in);
        Adulto adulto = new Adulto();
        
        System.out.println("Introduce el NSS: ");
        adulto.setNss(teclado.nextLine());

        System.out.println("Introduce la dirección: ");
        adulto.setDireccion(teclado.nextLine());

        listaAdultos.add(adulto);
        teclado.close();
    }*/

    //Setters y Getters
    /**
     * 
     * @return nss
     */
    public String getNss() {return nss;}
    /**
     * 
     * @param nss
     */
    public void setNss(String nss) {this.nss = nss;}
    /**
     * 
     * @return direccion
     */
    public String getDireccion() {return direccion;}
    /**
     * 
     * @param direccion
     */
    public void setDireccion(String direccion) {this.direccion = direccion;}
}
