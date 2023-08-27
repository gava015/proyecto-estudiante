package co.edu.uniquindio.estudiante;

import co.edu.uniquindio.estudiante.model.Estudiante;

public class Main {

    public static Estudiante crearEstudiante(String nombre,String correo,int semestre, int edad, double notaUno, double notaDos,
    double notaTres) {
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre(nombre);
        estudiante.setCorreo(correo);
        estudiante.setSemestre(semestre);
        estudiante.setEdad(edad);
        estudiante.setNotaUno(notaUno);
        estudiante.setNotaDos(notaDos);
        estudiante.setNotaTres(notaTres);
        return estudiante;

    }

    public static void main(String[] args) {

        Estudiante estudianteUno = crearEstudiante("Valentina Garzón","valentina.g@uqvirtual.edu.co",2,26,2.6,3.5,5.0);
        Estudiante estudianteDos = crearEstudiante("Juan Pablo Gomez","juanpablo@uqvirtual.edu.co",2,20,3.2,4.4,3.9);
        Estudiante estudianteTres= crearEstudiante("Camilo Cardona","camilouqvirtual.edu.co",2,22,2.9,3.9,4.8);

        double definitivaEstudianteUno = 









    }
}