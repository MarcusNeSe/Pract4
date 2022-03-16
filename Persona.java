package Entornos.Practica3;
/*import java.util.ArrayList;
import java.util.Scanner;*/

public abstract class Persona {
    //Atributos
    private String nombre = new String();
    private String apellidos = new String();
    private String dni = new String();
    private int edad;

    //Constructores
    public Persona() {
        this.nombre = null;
        this.apellidos = null;
        this.dni = null;
        this.edad = 0;
    }

    public Persona(String nombre, String apellidos, String dni, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
    }
    //Metodos (Crear, eliminar, buscar Persona)
    @Override
    public String toString() {
        String texto = new String();
        texto = "Nombre: " + nombre + ", Apellidos: " + apellidos + ", DNI: " + dni + ", Edad: " + edad;
        return texto;
    }

    /*public static void agregarPersona(ArrayList<Persona>listaPersonas) {
        Scanner teclado = new Scanner(System.in);
        Persona persona = new Persona();

        System.out.println("Introduce el nombre: ");
        persona.setNombre(teclado.nextLine());
        
        System.out.println("Introduce los apellidos: ");
        persona.setApellidos(teclado.nextLine());
        
        System.out.println("Introduce el DNI: ");
        persona.setDni(teclado.nextLine());

        System.out.println("Introduce la edad: ");
        persona.setEdad(Integer.parseInt(teclado.nextLine()));

        listaPersonas.add(persona);
        teclado.close();
    }

    public static int buscarDNI(ArrayList<Persona>listaPersonas) {
        Scanner teclado = new Scanner(System.in);
        String dni;
        boolean encontrado = false;
        int posicion = -1;

        System.out.println("Introduzca el DNI que quiera buscar: ");
        dni = teclado.nextLine();
        
        int i = 0;
        while (!encontrado && i < listaPersonas.size()) {
            if(listaPersonas.get(i).getDni().equals(dni)) {
                encontrado = true;
                posicion = i;
            }
            i = i + 1;
        }
        
        if (encontrado) {
            System.out.println("Se ha encontrado a la persona en la posición: " + posicion);
        }
        else {
            System.out.println("No se ha encontrado a la persona.");
        }
        teclado.close();
        return posicion;
    }

    public static void eliminarPersona(ArrayList<Persona>listaPersonas) {
        int posicion = buscarDNI(listaPersonas);
        
        listaPersonas.remove(posicion);
    }*/
    
    //Getters y Setters
    /**
     * 
     * @return nombre
     */
    public String getNombre() {return nombre;}
    /**
     * 
     * @param nombre
     */
    public void setNombre(String nombre) {this.nombre = nombre;}
    /**
     * 
     * @return apellidos
     */
    public String getApellidos() {return apellidos;}
    /**
     * 
     * @param apellidos
     */
    public void setApellidos(String apellidos) {this.apellidos = apellidos;}
    /**
     * 
     * @return dni
     */
    public String getDni() {return dni;}
    /**
     * 
     * @param dni
     */
    public void setDni(String dni) {this.dni = dni;}
    /**
     * 
     * @return edad
     */
    public int getEdad() {return edad;}
    /**
     * 
     * @param edad
     */
    public void setEdad(Integer edad) {this.edad = edad;}
}