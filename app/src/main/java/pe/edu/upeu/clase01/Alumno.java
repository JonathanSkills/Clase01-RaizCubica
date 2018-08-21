package pe.edu.upeu.clase01;

public class Alumno {
    private String codigo;
    private String nombres;
    private String apellidos;
    private String escuela;

    public Alumno(String nombres, String apellidos, String escuela) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.escuela = escuela;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }
}
