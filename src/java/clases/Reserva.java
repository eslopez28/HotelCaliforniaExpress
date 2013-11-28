package clases;

public class Reserva {

    private String fechaLlegada;
    private String fechaSalida;
    private String horaLlegada;
    private String horaSalida;
    private Cliente cliente;
    private int codigo;
    private int cantidadNinnos;
    private int cantidadAdultos;
    private Habitacion habitacion;

    public Reserva() {
    }

    public Reserva(String fechaLlegada, String fechaSalida, String horaLlegada, String horaSalida, Cliente cliente, int codigo, int cantidadNinnos, int cantidadAdultos, Habitacion habitacion) {
        this.fechaLlegada = fechaLlegada;
        this.fechaSalida = fechaSalida;
        this.horaLlegada = horaLlegada;
        this.horaSalida = horaSalida;
        this.cliente = cliente;
        this.codigo = codigo;
        this.cantidadNinnos = cantidadNinnos;
        this.cantidadAdultos = cantidadAdultos;
        this.habitacion = habitacion;
    }

    public Reserva(String fechaLlegada, String fechaSalida, String horaLlegada, String horaSalida, Cliente cliente, int codigo, int cantidadNinnos, int cantidadAdultos) {
        this.fechaLlegada = fechaLlegada;
        this.fechaSalida = fechaSalida;
        this.horaLlegada = horaLlegada;
        this.horaSalida = horaSalida;
        this.cliente = cliente;
        this.codigo = codigo;
        this.cantidadNinnos = cantidadNinnos;
        this.cantidadAdultos = cantidadAdultos;

    }

    public String getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(String fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidadNinnos() {
        return cantidadNinnos;
    }

    public void setCantidadNinnos(int cantidadNinnos) {
        this.cantidadNinnos = cantidadNinnos;
    }

    public int getCantidadAdultos() {
        return cantidadAdultos;
    }

    public void setCantidadAdultos(int cantidadAdultos) {
        this.cantidadAdultos = cantidadAdultos;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
}
