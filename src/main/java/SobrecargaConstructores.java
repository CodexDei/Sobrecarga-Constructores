public class SobrecargaConstructores {

    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Pedro", 37);
        System.out.println("Persona1: " + persona1);
        
        Empleado empleado1 = new Empleado("pepe", 43, 3000000);
        System.out.println("Empleado1: " + empleado1);
    }
}
