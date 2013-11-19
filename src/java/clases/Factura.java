package clases;

import java.util.Calendar;

public class Factura {

    private int id;
    private Cliente c;
    private Hotel h;
    private Reserva r;
    private Habitacion ha;
    private Extra e;
    private Precio p;
    private Promocion promo;

    public Factura() {
    }

    public Factura(int id, Cliente c, Hotel h, Reserva r, Habitacion ha, Extra e, Precio p, Promocion promo) {
        this.c = c;
        this.h = h;
        this.r = r;
        this.ha = ha;
        this.e = e;
        this.p = p;
        this.promo = promo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getC() {
        return c;
    }

    public void setC(Cliente c) {
        this.c = c;
    }

    public Hotel getH() {
        return h;
    }

    public void setH(Hotel h) {
        this.h = h;
    }

    public Reserva getR() {
        return r;
    }

    public void setR(Reserva r) {
        this.r = r;
    }

    public Habitacion getHa() {
        return ha;
    }

    public void setHa(Habitacion ha) {
        this.ha = ha;
    }

    public Extra getE() {
        return e;
    }

    public void setE(Extra e) {
        this.e = e;
    }

    public Precio getP() {
        return p;
    }

    public void setP(Precio p) {
        this.p = p;
    }

    public Promocion getPromo() {
        return promo;
    }

    public void setPromo(Promocion promo) {
        this.promo = promo;
    }

    @Override
    public String toString() {
        String separar = System.lineSeparator();
        return "Cliente: " + this.c.getNombre() + "\t" + "Numero de Orden: " + this.id + "\n" + separar
                + "Telefono: " + this.c.getTelefono() + "\t" + "Fecha: " + Calendar.getInstance().getTime() + "\n"+ separar
                //"Responsable: " + this.c.getResponsable() + "\t" + "Tipo de cliente: " + prueba() + "\n" + separar
                + "__________________________________________________________________________________" + "\n" + separar
                + "Hotel\tHabitacion\tPrecio\tDescuento\tImpuesto\tSubToral\n" + separar
                + h.getNombre() + "\t" + ha.getCampo() + "\t" + p.getPrecioTempAlta() + "\t" /*aqui falta otros campos mas*/
                + "__________________________________________________________________________________" + "\n"+separar
                + "Total:\n"+separar
                + /*aqui falta el total*/separar;
        
    }

}
