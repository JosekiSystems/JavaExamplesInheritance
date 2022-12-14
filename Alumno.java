package com.josekisystems.pooherencia;

public class Alumno extends Persona {
    private String institucion;
    private double notaMatematica;
    private double notaCastellano;
    private double notaHistoria;

    public Alumno(){
        System.out.println("Alumno: iniciamos el constructor");
    }

    public Alumno(String nombre, String apellido){
        super(nombre, apellido);
    }

    public Alumno(String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
    }

    public Alumno(String nombre, String apellido, int edad,String institucion){
        super(nombre, apellido, edad);
        this.institucion = institucion;
    }

    public Alumno (String nombre,
            String apellido,
            int edad,
            String institucion,
            double notaMatematica,
            double notaCastellano,
            double notaHistoria){
        this(nombre, apellido, edad, institucion);
        this.notaMatematica = notaMatematica;
        this.notaCastellano = notaCastellano;
        this.notaHistoria = notaHistoria;
    }

   /* public String getNombre(){return nombre; }
   No es necesario pedir el nombre en alumno ya que es parte de la herencia del padre Persona
    */


    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaCastellano() {
        return notaCastellano;
    }

    public void setNotaCastellano(double notaCastellano) {
        this.notaCastellano = notaCastellano;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    @Override
    public String saludar(){
        String saludar = super.saludar();
        return saludar + " soy alumno y mi nombre es " + getNombre();
    }

    public double calcularPromedio(){
        System.out.println("clases invocadas para el metodo calcular promedio en Alumno = " + Alumno.class.getCanonicalName());
        return (notaHistoria+ notaCastellano+ notaMatematica)/3;
    }

    @Override
    public String toString() {
        return  super.toString()+"\ninstitucion='" + institucion + '\'' +
                ", notaMatematica=" + notaMatematica +
                ", notaCastellano=" + notaCastellano +
                ", notaHistoria=" + notaHistoria+
                ",promedio ="+ this.calcularPromedio();
    }
}
