package model;

public class Incidente {

    private int id;
    private String descripcion;
    private String estado;

    public Incidente(String descripcion, String estado) {
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEstado() {
        return estado;
    }
}
