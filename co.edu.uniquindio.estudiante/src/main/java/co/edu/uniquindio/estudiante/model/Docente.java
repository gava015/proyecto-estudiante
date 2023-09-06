package co.edu.uniquindio.estudiante.model;

public class Docente {
    private String nombre;
    private String correo;

    public Docente(String nombre, String correo){
        this.nombre = nombre;
        this.correo = correo;
    }


    public Docente(){

    }

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
}
