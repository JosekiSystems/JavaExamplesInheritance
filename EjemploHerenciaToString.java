package com.josekisystems.ejemplo;

import com.josekisystems.pooherencia.Alumno;
import com.josekisystems.pooherencia.AlumnoInternacional;
import com.josekisystems.pooherencia.Persona;
import com.josekisystems.pooherencia.Profesor;

public class EjemploHerenciaToString {
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
        System.out.println("===   ===");
        System.out.println(persona);

    }

}
/*
Al haber declarado los atributos de perosna como protected estos no necesitan ser invocados,
es suficiente con iniciarlos

*/