/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author laboratorio
 */
public class Promocion {
    private int descuento;
    private  String condiciones;
    private String extras;
    
    public Promocion() {
        
    }

    public Promocion(int descuento, String condiciones, String extras) {
        this.descuento = descuento;
        this.condiciones = condiciones;
        this.extras = extras;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public String getCondiciones() {
        return condiciones;
    }

    public void setCondiciones(String condiciones) {
        this.condiciones = condiciones;
    }

    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

}
