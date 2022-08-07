package com.josekisystems.pooherencia;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private String email;

    public Persona() {
        System.out.println("Persona: iniciamos constructor");
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String nombre, String apellido, int edad) {
        this(nombre, apellido);
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String saludar() {
        return "Hola que tal!";

    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", email='" + email + '\''+
                ", saludo=" + this.saludar();
    }
}

/*Para que las clases herederas tengan acceso a los atributos del padre podemos
* declarar los atributos como protected o iniciar un constructor con getter and setter
* en el padre y asi mantener los atributos como privados*/
