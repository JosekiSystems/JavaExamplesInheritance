package com.josekisystems.ejemplo;
import com.josekisystems.pooherencia.*;

public class EjemploHerencia {
    public static void main(String[] args) {

        //Alumno alumno = new Alumno();

        System.out.println("--- Creando la instancia de la clase Alumno ---");

        Alumno alumno = new Alumno();

        alumno.setNombre("Laika");
        alumno.setApellido("Lacrau");
        alumno.setInstitucion("UNAM Juriquilla");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);

        System.out.println("--- Creando la instancia de la clase Alumno Internacional ---");
        AlumnoInternacional alumnoInt = new AlumnoInternacional();

        alumnoInt.setNombre("Aeon");
        alumnoInt.setApellido("Flux");
        alumnoInt.setPais("Utopia");
        alumnoInt.setEdad(25);
        alumnoInt.setInstitucion("Umbrella Academy");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);

        /*
        ((Alumno)alumno).setInstitucion("UNAM Juriquilla");
        En caso de iniciar el alumno con los atributos de Persona hacemos un cast al declarar e imprimir.
        */

       // alumno.nombre = "Liaka";
       // alumno.apellido = "Lacrau";
        System.out.println("--- Creando la instancia de Profesor ---");
         Profesor profesor = new Profesor();
         profesor.setNombre("Roro");
         profesor.setApellido("Lacrau");

        //profesor.nombre = "Roro";
        //profesor.apellido = "Lacrau";
        profesor.setAsignatura("Matemáticas");


        System.out.println("alumno = "
                + alumno.getNombre() + " "
                + alumno.getApellido() + " "
                + alumno.getInstitucion());


        System.out.println("profesor = "
                + profesor.getAsignatura() + " : "
                + profesor.getNombre() + " "
                + profesor.getApellido());

        System.out.println("alumnoInt = "
                + alumnoInt.getNombre() + " Nombre "
                + alumnoInt.getApellido() + " Apellido "
                + alumnoInt.getPais() + " Nacionalidad "
                + alumnoInt.getEdad() + " Edad "
                + alumnoInt.getInstitucion() + " Colegio "
                + alumnoInt.getNotaIdiomas() + " NI "
                + alumnoInt.getNotaCastellano()+ " NC "
                + alumnoInt.getNotaHistoria() + "NH  "
                +alumnoInt.getNotaMatematica()+ " NM ");


        System.out.println("===   ===");
        Class clase = alumnoInt.getClass();

        while (clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + "hija (AlumnoInt) heredera de = " + padre + " = superclassAlumno");
            clase = clase.getSuperclass();
        }

    }
}
/*
Al haber declarado los atributos de perosna como protected estos no necesitan ser invocados,
es suficiente con iniciarlos

*/