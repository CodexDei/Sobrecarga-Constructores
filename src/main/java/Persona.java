public class Persona {
    private int idPersona;
    private String nombre;
    private int edad;
    private static int contadorPersonas;
    
    private Persona(){
        //super() se llama de manera automatica o implicita, lo hace 
        //el compilador de Java
        this.idPersona = ++contadorPersonas; 
    }
    //constructor completo - sobrecarga
    public Persona(String nombre, int edad){
        this();
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public int getIdPersona() {
        return idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
}
