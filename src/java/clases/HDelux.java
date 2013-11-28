/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author laboratorio
 */
<<<<<<< HEAD
public class HDelux extends Habitacion{

    public HDelux(int precio, String campo, int numeroHabitacion, boolean ocupada) {
        super(precio, campo, numeroHabitacion, ocupada);
    }

    

    @Override
    public int getPrecioPorNoche() {
        return precio;
    }

    @Override
    public String getTipo() {
        return "Habitacion Delux";
    }

    
    
=======
public class HDelux extends Habitacion {

    private double porcentajeTempAlta = 1.5; // 1.X aumenta el numero
    private double porcentajeTempBaja = 0.2;// 0.X disminuye el numero

    public HDelux(int campo, int numeroHabitacion, int precioBase) {
        super(campo, numeroHabitacion, precioBase);
    }

    @Override
    public double getPrecioTempAlta() {
        return this.precioBase + (porcentajeTempAlta * precioBase);
    }

    @Override
    public void setPorcentajeTempAlta(double porcentaje) {
        this.porcentajeTempAlta = porcentaje;
    }

    @Override
    public double getPrecioTempBaja() {
        return this.precioBase + (porcentajeTempBaja * precioBase);
    }

    @Override
    public void setPorcentajeTempBaja(double porcentaje) {
        this.porcentajeTempBaja = porcentaje;
    }

    @Override
    public String getTipo() {
        return "Habitacion Delux";
    }

>>>>>>> origin/Andrea
}
