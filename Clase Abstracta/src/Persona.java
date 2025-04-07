public abstract class Persona {
    private int edad;
    private String nombre;

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    //Concreta = implementacion
    public void dormir(){
        System.out.println("Estoy durmiendo");
    }
    // Abstracta = NO body, NO implementacion
    public abstract void comer() ;
}
