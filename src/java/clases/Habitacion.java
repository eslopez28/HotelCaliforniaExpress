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


    protected int campo;
    protected int numeroHabitacion;
    protected boolean ocupada = false;
    protected int precioBase;
    protected List<Servicio> lstServicios = new ArrayList<Servicio>();

    public Habitacion(int campo, int numeroHabitacion, int precioBase) {
        this.campo = campo;
        this.numeroHabitacion = numeroHabitacion;
        this.precioBase = precioBase;

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
    

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;

    }

    public List<Servicio> getLstServicios() {
        return lstServicios;
    }


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


    public abstract String getTipo();

    @Override
    public String toString() {
        return "Habitacion{" + "campo=" + campo + "\n"
                + ", numeroHabitacion=" + numeroHabitacion + "\n"
                + ", ocupada=" + ocupada + "\n"
                + ", lstServicios=" + lstServicios + '}';
    }
}
