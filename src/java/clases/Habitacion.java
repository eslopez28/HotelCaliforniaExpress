/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author laboratorio
 */
public abstract class Habitacion {

<<<<<<< HEAD
    protected int precio;
    protected String campo;
    protected int numeroHabitacion;
    protected boolean ocupada;
     protected List<Servicio> lstServicios = new ArrayList<Servicio>();

    public Habitacion(int precio, String campo, int numeroHabitacion, boolean ocupada) {
        this.precio = precio;
=======
    private String campo;
    private int numeroHabitacion;
    private boolean ocupada;
    private Precio precio;
    List<Servicio> lstServicios = new ArrayList<Servicio>();

    public Habitacion() {
    }

    public Habitacion(String campo, int numeroHabitacion, boolean ocupada, Precio precio) {
>>>>>>> Reserva y Clientes
        this.campo = campo;
        this.numeroHabitacion = numeroHabitacion;
        this.ocupada = ocupada;
        this.precio= precio;
    }

   

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }
    
    public Precio getPrecio(){
        return precio;
    }
    
    public void setPrecio(Precio precio){
        this.precio= precio;
    }

    public List<Servicio> getLstServicios() {
        return lstServicios;
    }
    
    
    public String getLstServiciosString() {
        String lista = "";
        for (Servicio s : lstServicios) {
            lista += s;
        }
        return lista;
    }

    public void addLstServicios(Servicio s) {
        this.lstServicios.add(s);
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    
    
    public abstract int getPrecioPorNoche();

    public abstract String getTipo();

    @Override
    public String toString() {
        return "Habitacion{" + "campo=" + campo + "\n"
                + ", numeroHabitacion=" + numeroHabitacion + "\n"
                + ", ocupada=" + ocupada + "\n"
                + ", lstServicios=" + lstServicios + '}';
    }
}
