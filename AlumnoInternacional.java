package com.josekisystems.pooherencia;

public class AlumnoInternacional extends Alumno {

    private String pais;
    private double notaIdiomas;

    public AlumnoInternacional(){
        System.out.println("Alumno Internacional: Iniciamos Constructor");
    }

    public AlumnoInternacional(String nombre, String apellido){
        super(nombre, apellido);
    }
    public AlumnoInternacional(String nomnbre, String apellido, String pais){
        super(nomnbre,apellido);
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }

    @Override
    public String saludar() {
        return super.saludar()+" internacional de " + getPais() + "y me llamo " + getNombre();
    }
    @Override
    public double calcularPromedio() {
        System.out.println("clases invocadas para el metodo calcular promedio en AlumnoInternacional" + AlumnoInternacional.class.getCanonicalName());
        return ((super.calcularPromedio() * 3) + notaIdiomas) / 4;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\npais='" + pais + '\'' +
                ", notaIdiomas=" + notaIdiomas;
    }

    /*@Override
    public double calcularPromedio() {
        System.out.println("clases invocadas para el metodo calcular promedio en AlumnoInternacional" + this.getClass().getCanonicalName());
        return ((super.calcularPromedio()*3) + notaIdiomas)/4;
    }

     */
}
