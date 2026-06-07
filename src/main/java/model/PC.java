package model;

public class PC extends Equipamiento {

    private int memoriaRam;

    public PC(String numeroSerie, int memoriaRam) {

        super(numeroSerie);

        this.memoriaRam = memoriaRam;
    }

    @Override
    public void mostrarInfo() {

        System.out.println(
                "PC - Serie: "
                        + numeroSerie
                        + " - RAM: "
                        + memoriaRam
                        + " GB"
        );
    }
}
