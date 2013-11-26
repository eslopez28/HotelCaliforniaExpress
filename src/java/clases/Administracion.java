package clases;

import java.util.ArrayList;
import java.util.List;

public class Administracion {
    List<Usuario> listUsuarios = new ArrayList<Usuario>();

    public Administracion() {
    }

    public List<Usuario> getListUsuarios() {
        return listUsuarios;
    }

    public void setListUsuarios(List<Usuario> listUsuarios) {
        this.listUsuarios = listUsuarios;
    }
    
    public void agregarUsuario(Usuario usuario){
        this.listUsuarios.add(usuario);
    }
    
    public String verUsuarios(){
        String usuarios = "";
        for(Usuario u : listUsuarios){
            usuarios += u;
        }
        return usuarios;
    }
    
    public String getParameters(String dato){
        String envio = "";
        for(Usuario u : listUsuarios){
            if("user".equals(dato)){
                envio = u.getUsuario();
            } else {
                envio = u.getContrasena();
            }
        }
        return envio;
    }
    
    public Usuario removerUsuario(String name){
        Usuario remover = null;
        for(Usuario u : listUsuarios){
            if(u.getUsuario().equals(name)){
                remover = u;
            }
        }
        return remover;
    }
    
    public int modificarUsuario(String name){
        int posicion = 0;
        for(Usuario u : listUsuarios){
            if(u.getUsuario().equals(name)){
                posicion = listUsuarios.indexOf(u);
            }
        }
        return posicion;
    }
}
