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
public abstract class Habitacion implements IPrecio {

<<<<<<< HEAD

    private String campo;
    private int numeroHabitacion;
    private boolean ocupada;
    private Precio precio;
    List<Servicio> lstServicios = new ArrayList<Servicio>();

    public Habitacion() {
    }



    public Habitacion(String campo, int numeroHabitacion, boolean ocupada, int precio) {

        this.campo = campo;
        this.numeroHabitacion = numeroHabitacion;
        this.ocupada = ocupada;
        this.precio = precio;

=======
    protected int campo;
    protected int numeroHabitacion;
    protected boolean ocupada = false;
    protected int precioBase;
    protected List<Servicio> lstServicios = new ArrayList<Servicio>();

    public Habitacion(int campo, int numeroHabitacion, int precioBase) {
        this.campo = campo;
        this.numeroHabitacion = numeroHabitacion;
        this.precioBase = precioBase;
>>>>>>> origin/Andrea
    }

    public int getCampo() {
        return campo;
    }

    public void setCampo(int campo) {
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

<<<<<<< HEAD
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
=======
    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
>>>>>>> origin/Andrea
    }

    public List<Servicio> getLstServicios() {
        return lstServicios;
    }

<<<<<<< HEAD
=======
    public void setLstServicios(List<Servicio> lstServicios) {
        this.lstServicios = lstServicios;
    }

    @Override
    public abstract double getPrecioTempAlta();

    @Override
    public abstract void setPorcentajeTempAlta(double porcentaje);

    @Override
    public abstract double getPrecioTempBaja();

    @Override
    public abstract void setPorcentajeTempBaja(double porcentaje);

>>>>>>> origin/Andrea
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

<<<<<<< HEAD
    public abstract int getPrecioPorNoche();

=======
>>>>>>> origin/Andrea
    public abstract String getTipo();

    @Override
    public String toString() {
        return "Habitacion{" + "campo=" + campo + "\n"
                + ", numeroHabitacion=" + numeroHabitacion + "\n"
                + ", ocupada=" + ocupada + "\n"
                + ", lstServicios=" + lstServicios + '}';
    }
}
