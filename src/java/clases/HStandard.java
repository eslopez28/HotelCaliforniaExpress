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
public class HStandard extends Habitacion{

    public HStandard(int precio, String campo, int numeroHabitacion, boolean ocupada) {
        super(precio, campo, numeroHabitacion, ocupada);
    }

   
=======
public class HStandard extends Habitacion {

    private double porcentajeTempAlta = 1.5; // 1.X aumenta el numero
    private double porcentajeTempBaja = 0.2;// 0.X disminuye el numero

    public HStandard(int campo, int numeroHabitacion, int precioBase) {
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
>>>>>>> origin/Andrea

    
    
        
    @Override
<<<<<<< HEAD
    public int getPrecioPorNoche() {
        return precio;
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
=======
    public double getPrecioTempBaja() {
        return this.precioBase + (porcentajeTempBaja * precioBase);
    }

    @Override
    public void setPorcentajeTempBaja(double porcentaje) {
        this.porcentajeTempBaja = porcentaje;
    }

    @Override
    public String getTipo() {
        return "Habitacion Standard";
    }

>>>>>>> origin/Andrea
}
