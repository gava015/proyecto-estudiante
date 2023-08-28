package co.edu.uniquindio.estudiante;

import co.edu.uniquindio.estudiante.model.Estudiante;

public class Main {

    public static Estudiante crearEstudiante(String nombre, String correo, int semestre, int edad, double notaUno,
                                             double notaDos, double notaTres) {

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

    public static int calcularPromedioEdad(int edad1, int edad2, int edad3) {
        return (edad1 + edad2 + edad3) / 3;
    }

    public static double calcularPromedioCurso(double definitivaEstudianteUno, double definitivaEstudianteDos, double definitivaEstudianteTres) {
        return (definitivaEstudianteUno + definitivaEstudianteDos + definitivaEstudianteTres) / 3;
    }

    public static double calcularPromedioNotaUno(double nota1EstudianteUno, double nota1EstudianteDos, double nota1EstudianteTres) {
        return (nota1EstudianteUno + nota1EstudianteDos + nota1EstudianteTres) / 3;
    }

    public static double calcularNotaMayorDelCurso(double definitivaEstudianteUno, double definitivaEstudianteDos, double definitivaEstudianteTres) {
        double notaMayor;
        if (definitivaEstudianteUno > definitivaEstudianteDos) {
            notaMayor = definitivaEstudianteUno;
        } else {
            notaMayor = definitivaEstudianteDos;
        }
        if (definitivaEstudianteTres > notaMayor) {
            notaMayor = definitivaEstudianteTres;
        }
        return notaMayor;
    }

    public static double calcularNotaMenorCurso(double definitivaEstudianteUno, double definitivaEstudianteDos, double definitivaEstudianteTres) {
        double notaMenor;
        if (definitivaEstudianteUno < definitivaEstudianteDos) {
            notaMenor = definitivaEstudianteUno;
        } else {
            notaMenor = definitivaEstudianteDos;
        }

        if (definitivaEstudianteTres < notaMenor) {
            notaMenor = definitivaEstudianteTres;
        }
        return notaMenor;
    }

    public static String verificarAprobacionCurso(double notaDefinitiva) {
        String aprobacionCurso;

        if (notaDefinitiva >= 3.0) {
            aprobacionCurso = "aprobó";
        } else {
            aprobacionCurso = "Reprobó";
        }
        return aprobacionCurso;
    }

    public static double calcularPorcentajeGanaronCurso(double definitivaEstudianteUno, double definitivaEstudianteDos, double definitivaEstudianteTres) {
        //contar la cantidad de estudiantes que aganaron el curso
        int contadorAprobaron = 0;

        if (verificarAprobacionCurso(definitivaEstudianteUno).equals("aprobó")) {
            contadorAprobaron += 1;
        }
        if (verificarAprobacionCurso(definitivaEstudianteDos).equals("aprobó")) {
            contadorAprobaron += 1;
        }
        if (verificarAprobacionCurso(definitivaEstudianteTres).equals("aprobó")) {
            contadorAprobaron += 1;
        }

        return (contadorAprobaron * 100) / 3;
    }

    public static double calcularPorcentajePerdieronCurso(double definitivaEstudianteUno,double definitivaEstudianteDos,double definitivaEstudianteTres){

        int contadorReprobaron= 0;

        if(verificarAprobacionCurso(definitivaEstudianteUno).equals("Reprobó")){
            contadorReprobaron+=1;
        }
        if(verificarAprobacionCurso(definitivaEstudianteDos).equals("Reprobó")) {
            contadorReprobaron += 1;
        }
        if(verificarAprobacionCurso(definitivaEstudianteTres).equals("Reprobó")) {
            contadorReprobaron += 1;
        }

        return (contadorReprobaron * 100)/3;
    }

    public static String  obtenerEstudianteNotasMayor4 (double notaUno, double notaDos, double notaTres){
        String notaMayor4;

        if(notaUno >= 4.0 && notaDos >= 4.0 && notaTres >= 4.0){
            notaMayor4 = "cumple la condicion notas mayor o igual a 4";

        }else {
            notaMayor4 = "No cumple la condicion notas mayores o iguales a 4";
        }
        return notaMayor4;
    }

    public static double calcularMaximaNotaEstudiante (double notaUno, double notaDos, double notaTres){
        double maximaNota;

        if(notaUno > notaDos){
            maximaNota = notaUno;
        }else {
            maximaNota = notaDos;
        }
        if(notaTres > maximaNota){
            maximaNota = notaTres;
        }
        return  maximaNota;
    }

    public static void main(String[] args) {

        Estudiante estudianteUno = crearEstudiante("Valentina Garzón", "valentina.g@uqvirtual.edu.co", 2, 26, 2.6, 2.5, 2.0);
        Estudiante estudianteDos = crearEstudiante("Juan Pablo Gomez", "juanpablo@uqvirtual.edu.co", 2, 20, 4.5, 4.4, 4.9);
        Estudiante estudianteTres = crearEstudiante("Camilo Cardona", "camilouqvirtual.edu.co", 2, 22, 2.9, 3.9, 4.8);

        System.out.println("El promedio de edad del curso es : " + calcularPromedioEdad(estudianteUno.getEdad(),estudianteDos.getEdad(),estudianteTres.getEdad()));

        double definitivaEstudianteUno = estudianteUno.calcularNotaDefinitiva();
        System.out.println("Nota definitiva estudiante1: " + definitivaEstudianteUno);
        double definitivaEstudianteDos = estudianteDos.calcularNotaDefinitiva();
        System.out.println("Nota definitiva estudiante2: " + definitivaEstudianteDos);
        double definitivaEstudianteTres = estudianteTres.calcularNotaDefinitiva();
        System.out.println("Nota definitiva estudiante3: " + definitivaEstudianteTres);

        System.out.println("El promedio del curso es: " + calcularPromedioCurso( definitivaEstudianteUno,definitivaEstudianteDos,definitivaEstudianteTres));

        System.out.println("El promedio de la nota 1 de los estudiantes es: " +  calcularPromedioNotaUno(estudianteUno.getNotaUno(),estudianteDos.getNotaUno(),estudianteTres.getNotaUno()));

        System.out.println("La nota menor del curso es: " + calcularNotaMenorCurso(definitivaEstudianteUno,definitivaEstudianteDos,definitivaEstudianteTres));

        System.out.println("La nota mayor del curso es: " + calcularNotaMayorDelCurso(definitivaEstudianteUno,definitivaEstudianteDos,definitivaEstudianteTres));

        System.out.println("El estudiante uno " + verificarAprobacionCurso(definitivaEstudianteUno));
        System.out.println("El estudiante Dos " + verificarAprobacionCurso(definitivaEstudianteDos));
        System.out.println("El estudiante Tres " +verificarAprobacionCurso(definitivaEstudianteTres));

        System.out.println("Porcentaje Aprobaron: " + calcularPorcentajeGanaronCurso(definitivaEstudianteUno,definitivaEstudianteDos,definitivaEstudianteTres));
        System.out.println("Porcentaje Reprobaron: " + calcularPorcentajePerdieronCurso(definitivaEstudianteUno,definitivaEstudianteDos,definitivaEstudianteTres));

        System.out.println("El estudiante Uno " + obtenerEstudianteNotasMayor4(estudianteUno.getNotaUno(),estudianteUno.getNotaDos(),estudianteUno.getNotaTres()));
        System.out.println("El estudiante Dos " + obtenerEstudianteNotasMayor4(estudianteDos.getNotaUno(),estudianteDos.getNotaDos(),estudianteDos.getNotaTres()));
        System.out.println("El estudiante Tres " + obtenerEstudianteNotasMayor4(estudianteTres.getNotaUno(),estudianteTres.getNotaDos(),estudianteTres.getNotaTres()));

        System.out.println("La máxima nota del estudiante Uno es: " + calcularMaximaNotaEstudiante(estudianteUno.getNotaUno(),estudianteUno.getNotaDos(),estudianteUno.getNotaTres()));
        System.out.println("La máxima nota del estudiante Uno es: " + calcularMaximaNotaEstudiante(estudianteDos.getNotaUno(),estudianteDos.getNotaDos(),estudianteDos.getNotaTres()));
        System.out.println("La máxima nota del estudiante Uno es: " + calcularMaximaNotaEstudiante(estudianteTres.getNotaUno(),estudianteTres.getNotaDos(),estudianteTres.getNotaTres()));
    }
}