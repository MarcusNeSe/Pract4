package Entornos.Practica3;

import java.util.Scanner;
//import java.util.*;

public class Barco implements Sonido
{
    @Override
    public void sonido() {
        
    }

    //Atributs
    private String Nombre = new String();
    private int numCamarotes;
    private int fechaConstruccion;

    //Constructors
    public Barco() {
        this.Nombre = null;
        this.numCamarotes = 0;
        this.fechaConstruccion = 0;
    }

    public Barco(String Nombre, int numCamarotes, int fechaConstruccion) {
        //this(nombre,numCamarotes,true,fechaConstruccion);
        this.Nombre = Nombre;
        this.numCamarotes = numCamarotes;
        this.fechaConstruccion = fechaConstruccion;
    }

    //Métodos
    public int numCamarotes()
    {
        int numero = 0;
        Scanner reader = new Scanner(System.in);
        numero = reader.nextInt();
        System.out.println("El número de camarotes es: " + numero);
        
        reader.close();
        return numCamarotes;
    }

    //Setters i getters
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNumCamarotes() {return numCamarotes;}

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    public float getFechaConstruccion() {
        return fechaConstruccion;
    }

    public void setFechaConstruccion(int fechaConstruccion)
    {
        this.fechaConstruccion = fechaConstruccion;
    }  
}