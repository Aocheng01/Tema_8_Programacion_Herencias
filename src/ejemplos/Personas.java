
package ejemplos;


public class Personas {
    String nombre;
    String apellido;

    public Personas(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Personas{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
    

}
