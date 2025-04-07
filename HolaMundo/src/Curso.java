import java.util.ArrayList;
import java.util.List;

public class Curso {
    // Atributos
    private String nombreCurso;
    private List<Persona> alumnos;

    // Constructor
    public Curso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
        this.alumnos = new ArrayList<>();
    }

    //Getter and Setters atributos simples (String, int, etc.)

    //Metodos acceder, agregar o sacar en lista
    public List<Persona> getAlumnos() {
        return alumnos;
    }
    private List<Persona> eliminarAlumno(Persona alumno){
        alumnos.remove(alumno);
        return alumnos;
    }
}
