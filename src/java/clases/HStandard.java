/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author laboratorio
 */
public class HStandard extends Habitacion{

   

    public HStandard(String campo, int numeroHabitacion, boolean ocupada) {
        super(campo, numeroHabitacion, ocupada);
    }

    
        
    @Override
    public int getPrecioPorNoche() {
        return 24;
    }

     @Override
    public String getTipo() {
        return "Habitacion Standard";
    }
    
    
//    @Override
//    public String getPrecioTempAlta() {
//        throw new UnsupportedOperationException("Not supported yet.");
//    }
//
//    @Override
//    public void setPrecioTempAlta() {
//        throw new UnsupportedOperationException("Not supported yet.");
//    }
//
//    @Override
//    public String getPrecioTempBaja() {
//        throw new UnsupportedOperationException("Not supported yet.");
//    }
//
//    @Override
//    public void setPrecioTempBaja() {
//        throw new UnsupportedOperationException("Not supported yet.");
//    }
//    
}
