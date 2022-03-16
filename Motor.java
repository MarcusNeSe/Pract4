package Entornos.Practica3;

public class Motor
{
    //Atributs
    private String Fabricante = new String();
    private String Potencia = new String();
    private int Codigo;

    //Constructors
    public Motor()
    {
        this.Fabricante = null;
        this.Potencia = null;
        this.Codigo = 0;
    }

    public Motor(String Fabricante, String Potencia, int Codigo)
    {
        this.Fabricante = Fabricante;
        this.Potencia = Potencia;
        this.Codigo = Codigo;
    }

    //Métodos
    @Override
    public String toString()
    {
        Motor Ferrari = new Motor();
        String uno = Ferrari.toString();
        System.out.println(Ferrari);

        return uno;
    }

    //Setters i getters
    public String getFabricante() {return Fabricante;}
    public void setFabricante(String Fabricante) {this.Fabricante = Fabricante;}
    public String getPotencia() {return Potencia;}
    public void setPotencia(String Potencia) {this.Potencia = Potencia;}
    public int getCodigo() {return Codigo;}
    public void setCodigo(int Codigo) {this.Codigo = Codigo;}
}
