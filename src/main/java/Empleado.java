public class Empleado extends Persona{
    
        private double sueldo;
    
    public Empleado(String nombre, int edad) {
        super(nombre, edad);
    }
    //si lo usamos el parametro sueldo marcara un error
    //ya que obligarorimente debe tener parametros de la clase Padre, base o superclase
    public Empleado(String nombre, int edad,double sueldo){
        this(nombre,edad);
    // super(nombre,edad); //se comenta porque solo debe estar this o super, ambos funcionan igual para este caso
        this.sueldo = sueldo;
    }
    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado{" + "sueldo=" + sueldo + '}';
    }
    
    
}
