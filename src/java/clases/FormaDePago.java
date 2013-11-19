/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

/**
 *especifica la forma de pago
 */

public class FormaDePago {
    private String tipo; // paypal, cash, tareta, etc
    private int impuesto; //si tiene, si no tiene entonces se multiplica por 1

    /** si no hay que aplicar ningun impuesto entonces el 'impuesto'
    es 1
  */
    public FormaDePago(String tipo, int impuesto) {
        this.tipo = tipo;
        this.impuesto = impuesto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(int impuesto) {
        this.impuesto = impuesto;
    }
    
    
}
