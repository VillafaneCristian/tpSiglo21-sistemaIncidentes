package model;

public abstract class Equipamiento {

    protected String numeroSerie;

    public Equipamiento(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public abstract void mostrarInfo();
}