
public class Persona {
   
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    
    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

   
    public void correr() {
        System.out.println(nombre + " está corriendo.");
    }

   
    public static void main(String[] args) {
       
        Persona persona = new Persona("Paulo", 21);
        
      
        persona.mostrar();
       
        persona.correr();
    }
}