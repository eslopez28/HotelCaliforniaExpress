package clases;

public class Cliente {

    private String nombre;
    private int id;
    private String correo;
    private String pais;
    private int telefono;
    private String provincia;
    private String tipo;

    public Cliente() {
    }

    public Cliente(String nombre, int id, String correo, String pais, int telefono, String provincia, String tipo) {
        this.nombre = nombre;
        this.id = id;
        this.correo = correo;
        this.pais = pais;
        this.telefono = telefono;
        this.provincia = provincia;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {

        return "Identificacion del Cliente:\t" + this.id + "\n"
                + "Nombre:\t" + this.nombre + "\n"
                + "Correo:\t" + this.correo + "\n"
                + "Pais:\t" + this.pais;
    }

}
