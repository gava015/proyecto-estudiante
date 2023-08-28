package co.edu.uniquindio.estudiante.model;

public class Estudiante {
    private String nombre;
    private String correo;
    private int semestre;
    private int edad;
    private double notaUno;
    private double notaDos;
    private double notaTres;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNotaUno() {
        return notaUno;
    }

    public void setNotaUno(double notaUno) {
        this.notaUno = notaUno;
    }

    public double getNotaDos() {
        return notaDos;
    }

    public void setNotaDos(double notaDos) {
        this.notaDos = notaDos;
    }

    public double getNotaTres() {
        return notaTres;
    }

    public void setNotaTres(double notaTres) {
        this.notaTres = notaTres;
    }

    public  double calcularNotaDefinitiva() {
        Double definitiva = (this.notaUno + this.notaDos + this.notaTres) / 3;
        return definitiva;
    }
}