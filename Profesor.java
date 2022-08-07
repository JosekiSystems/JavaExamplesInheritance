package com.josekisystems.pooherencia;

import com.josekisystems.pooherencia.Persona;

public class Profesor extends Persona {

    public Profesor(){
        System.out.println("Profersor: Iniciamos constructor");
    }
    public Profesor(String nombre, String apellido){
        super(nombre, apellido);
    }
    public Profesor(String nombre, String apellido, String asignatura){
        super(nombre, apellido);
        this.asignatura = asignatura;
    }

    private String asignatura;

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String saludar() {
        return "Hola soy el profesor de " +getAsignatura() + "y mi nobre es" + getNombre();
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nasignatura='" + asignatura + '\'';
    }
}
