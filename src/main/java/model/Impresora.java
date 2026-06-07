package model;

public class Impresora extends Equipamiento {

    private String modelo;

    public Impresora(String numeroSerie, String modelo) {

        super(numeroSerie);

        this.modelo = modelo;
    }

    @Override
    public void mostrarInfo() {

        System.out.println(
                "Impresora - Serie: "
                        + numeroSerie
                        + " - Modelo: "
                        + modelo
        );
    }
}