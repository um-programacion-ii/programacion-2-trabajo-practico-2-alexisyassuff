public class Empleado extends Persona {
    private int legajo;

    public Empleado(int edad, String nombre, int legajo) {
        super(edad, nombre);
        this.legajo = legajo;
    }

    //Me obliga a implementar metodo abstracto
    @Override
    public void comer() {
    }
}

