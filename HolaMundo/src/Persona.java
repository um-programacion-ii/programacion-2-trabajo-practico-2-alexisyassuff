public class Persona {
    private int edad;
    private String nombre;
    private int legajo;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public Persona(int edad, String nombre, int legajo) {
        this.edad = edad;
        this.nombre = nombre;
        this.legajo = legajo;
    }
    public void presentarse() {
        System.out.println("Hola soy "+ this.nombre + " tengo "+ this.edad+" y mi legajo es "+ this.legajo);
    }
    public void cumpliraños(){
        this.edad = this.edad + 1;    }
}

