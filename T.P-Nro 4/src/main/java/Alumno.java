public class Alumno extends Persona {

    private String curso;

    public Alumno(String curso, String nombre, int edad, int dni, direccion dir) {
        super(nombre, edad, dni, dir);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void mostrarSusDatos() {
        super.mostrarSusDatos();
        System.out.println("Estoy cursando el grado de " + curso);
    }
}