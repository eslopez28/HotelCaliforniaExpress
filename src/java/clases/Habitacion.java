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

    private String campo;
    private int numeroHabitacion;
    private boolean ocupada;
    private Precio precio;
    List<Servicio> lstServicios = new ArrayList<Servicio>();

    public Habitacion() {
    }

    public Habitacion(String campo, int numeroHabitacion, boolean ocupada, Precio precio) {
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

    public String getLstServicios() {
        String lista = "";
        for (Servicio s : lstServicios) {
            lista += s;
        }
        return lista;
    }

    public void setLstServicios(Servicio s) {
        this.lstServicios.add(s);
    }

    @Override
    public String toString() {
        return "Habitacion{" + "campo=" + campo + "\n"
                + ", numeroHabitacion=" + numeroHabitacion + "\n"
                + ", ocupada=" + ocupada + "\n"
                + ", lstServicios=" + lstServicios + '}';
    }
}
