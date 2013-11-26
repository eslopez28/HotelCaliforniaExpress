/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author laboratorio
 */
public class HDelux extends Habitacion{

    public HDelux(String campo, int numeroHabitacion, boolean ocupada) {
        super(campo, numeroHabitacion, ocupada);
    }

    @Override
    public int getPrecioPorNoche() {
        return 98;
    }

    @Override
    public String getTipo() {
        return "Habitacion Delux";
    }

    
    
}
