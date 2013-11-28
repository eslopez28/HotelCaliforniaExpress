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
public class Hotel {
private List<Habitacion> lstHabitacion;
private List<Cliente> lstClientes;
private int estrellas;
private String direccion;
private String nombre;
private int id;
private int cupoTotal; // <-- el total de personas que caben en el hotel
private String descripcion;
private String horario; // horario de atencion, puede ser algo tipo
                        // "abierto de X:XX am a X:XX pm "
private List<FormaDePago> lstFormasDePago; //tarjeta, efectivo, paypal, etc

    public Hotel(int estrellas, String direccion, String nombre, int id, int cupoTotal, String descripcion, String horario) {
        this.estrellas = estrellas;
        this.direccion = direccion;
        this.nombre = nombre;
        this.id = id;
        this.cupoTotal = cupoTotal;
        this.descripcion = descripcion;
        this.horario = horario;
        
        //inicializando las listas...
        lstFormasDePago = new ArrayList<FormaDePago>();
        lstHabitacion = new ArrayList<Habitacion>();
        lstClientes = new ArrayList<Cliente>();
    }

    ////// gets y sets
    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    
    }

    public String getIdString(){
    String i;
    i = String.valueOf(id);
        return i;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCupoTotal() {
        return cupoTotal;
    }

    public void setCupoTotal(int cupoTotal) {
        this.cupoTotal = cupoTotal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
//////////////////////
    // metodos para las listas
    
    public void addLstHabitacion(Habitacion habitacion){
        lstHabitacion.add(habitacion);
    }
    public void addLstClientes(Cliente cliente){
        lstClientes.add(cliente);
    }
    public void addLstFormaDePago(FormaDePago formaDePago){
        lstFormasDePago.add(formaDePago);
    }
    public void removerLstHabitacion (Habitacion habitacion){
    lstHabitacion.remove(habitacion);
    }
    public void removerLstCliente ( Cliente cliente){
    lstClientes.remove(cliente);
    }
    public void removerLstFormaDePago (FormaDePago formaDePago){
    lstFormasDePago.remove(formaDePago);
    }
    
    //obtiene la lista como objeto
    public List<Habitacion> getListHabitacion(){
    return lstHabitacion;
    }
     public List<Cliente> getListClientes(){
    return lstClientes;
    }
      public List<FormaDePago> getListFormasDePago(){
    return lstFormasDePago;
    }
}
