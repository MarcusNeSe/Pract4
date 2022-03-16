package Entornos.Practica4;
//import java.util.ArrayList;
//import java.util.Scanner;

public class Niño extends Persona{ 
    public Juguete juguete;
    
    //Atributos
    private String colegio = new String();

    //Constructores
    public Niño() {
        this.colegio = null;
    }

    public Niño(String nombre, String apellidos, String dni, int edad, String colegio) {
        super(nombre, apellidos, dni, edad);
        this.colegio = colegio;
    }
    //Metodos (Crear, eliminar, buscar niño, comprar juge)
    @Override
    public String toString() {
        String texto = new String();
        texto = "Nombre: " + this.getNombre() + ", Apellidos: " + this.getApellidos() + ", DNI: " + this.getDni() + ", Edad: " + this.getEdad() + ",Colegio: " + colegio;
        return texto;
    }

    /*public static void comprarJuguete() {
        Scanner teclado = new Scanner(System.in);
        Juguete jugeute = new Juguete();

        System.out.println("Introduce el nombre del juguete que ha comprado: ");
        jugeute.setNombre(teclado.nextLine());

        System.out.println("Introduce el precio del jugeute: ");
        jugeute.setPrecio(teclado.nextLine());

        System.out.println("Introduce la edad recomendada: ");
        jugeute.setEdadRecomendada(teclado.nextLine());
    }*/
    /*public static void agregarNiño(ArrayList<Niño>listaNiños) {
        Scanner teclado = new Scanner(System.in);
        Niño niño = new Niño();

        System.out.println("Introduce el colegio: ");
        niño.setColegio(teclado.nextLine());

        listaNiños.add(niño);
        teclado.close();
    }*/

    //Setters y Getters
    /**
     * 
     * @return colegio
     */
    public String getColegio() {return colegio;}
    /**
     * 
     * @param colegio
     */
    public void setColegio(String colegio) {this.colegio = colegio;}
}
