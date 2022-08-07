package com.josekisystems.ejemplo;

import com.josekisystems.pooherencia.*;

public class EjemploHerenciaConstructores {
    public static void main(String[] args) {

        //Alumno alumno = new Alumno();

        System.out.println("--- Creando la instancia de la clase Alumno ---");

        Alumno alumno = new Alumno("Laika", "Lacrau",4,"UNAM Juriquilla");

        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);
        alumno.setEmail("laikitalamasbonita@josekisystems,com");

        System.out.println("--- Creando la instancia de la clase Alumno Internacional ---");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Aeon","Flux","Utopia");

        alumnoInt.setEdad(25);
        alumnoInt.setInstitucion("Umbrella Academy");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);
        alumnoInt.setEmail("aeon@josekisystems.com");


        System.out.println("--- Creando la instancia de Profesor ---");
         Profesor profesor = new Profesor("Roro","Lacrau","Matemáticas");
         profesor.setEdad(39);
         profesor.setEmail("roro@josekisystems.com");


        System.out.println("alumno = "
                + alumno.getNombre() + " "
                + alumno.getApellido() + " "
                + alumno.getInstitucion());

        System.out.println("===   ===");
        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);


    }

    public static void imprimir(Persona persona){
        System.out.println("--- persona ---");
        System.out.println("persona  = "
                + persona.getNombre() + " Nombre "
                + persona.getApellido() + " Apellido "
                + persona.getEdad() + " Edad "
                + persona.getEmail() + " email ");
        if(persona instanceof Alumno){
            System.out.println("--- Imprimiendo datos del Alumno ---");
            System.out.println("Institucion ((Alumno) persona).getInstitucion() = " + ((Alumno) persona).getInstitucion());
            System.out.println(" NotaMatemáticas ((Alumno) persona).getNotaMatematica() = " + ((Alumno) persona).getNotaMatematica());
            System.out.println("NotaHistoria ((Alumno) persona).getNotaHistoria() = " + ((Alumno) persona).getNotaHistoria());
            System.out.println("NotaCastellano ((Alumno) persona).getNotaCastellano() = " + ((Alumno) persona).getNotaCastellano());

            if(persona instanceof AlumnoInternacional){
                System.out.println("--- Imprimiendo datos del AlumnoInternacional ---");
                System.out.println("NotaIdiomas ((AlumnoInternacional) persona).getNotaIdiomas() = " + ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("Pais ((AlumnoInternacional) persona).getPais() = " + ((AlumnoInternacional) persona).getPais());

            }
            System.out.println("---    sobre escritura promedio   ---");
            System.out.println("Promedio:  " + ((Alumno) persona).calcularPromedio());
            System.out.println("---    ---   ---");
        }
        if(persona instanceof Profesor){
            System.out.println("--- Imprimiendo datos del Profesor ---");
            System.out.println("((Profesor) persona).getAsignatura() = " + ((Profesor) persona).getAsignatura());


        }
        System.out.println("---    sobre escritura saludar   ---");
        System.out.println("persona.saludar() = " + persona.saludar());
        System.out.println("---    ---   ---");



    }

}
/*
Al haber declarado los atributos de perosna como protected estos no necesitan ser invocados,
es suficiente con iniciarlos

*/