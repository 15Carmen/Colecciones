package Ejercicio_dia7;

public class Empleado implements Comparable<Empleado> {

    //atributos
    String nombre, apellido;
    Integer antiguedad;

    //constructor
    public Empleado(String nombre, String apellido, Integer antiguedad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.antiguedad = antiguedad;
    }

    //Reescribimos el metodo compareTo del objeto Empleados.
    //Si la antiguedad es igual entonces comparamos los apellidos y los ordenamos alfabeticamente
    @Override
    public int compareTo(Empleado o) {
        if (antiguedad.equals(o.antiguedad)){
            return apellido.compareTo(o.apellido);
        }else{
            return antiguedad.compareTo(o.antiguedad);
        }
    }

    //Reescribimos el metodo toString
    @Override
    public String toString() {
        return  String.format("%s, %s, %d \n", nombre, apellido, antiguedad);
    }
}
