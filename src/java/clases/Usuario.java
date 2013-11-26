package clases;

import java.util.ArrayList;
import java.util.List;

//falta hacer el metodo de BUSCAR HOTEL
//ver diagrama de clases cualquier cosa
public class Usuario {

    private String usuario;
    private String contrasena;
    private int id;
    private List<Hotel> lstHoteles;

    public Usuario(String usuario, String contrasena, int id) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.id = id;
        lstHoteles = new ArrayList<Hotel>();
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addLstHoteles(Hotel hotel) {
        lstHoteles.add(hotel);
    }

    public void removerLstHoteles(Hotel hotel) {
        lstHoteles.remove(hotel);
    }

    public List<Hotel> getLstHoteles() {
        return lstHoteles;
    }

    @Override
    public String toString() {
        return "<p><input name=\"usuario1\" type=\"radio\" value=" + getUsuario() + "" + "/>"
                + getUsuario() + "</p>";
    }
}
