/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author laboratorio
 */
public class HDoble extends Habitacion{

    public HDoble(int precio, String campo, int numeroHabitacion, boolean ocupada) {
        super(precio, campo, numeroHabitacion, ocupada);
    }



    @Override
    public int getPrecioPorNoche() {
        return precio;
    }
 @Override
    public String getTipo() {
        return "Habitacion Doble";
    }

    
}

