package jairon.vega.planificacio.fils;

public class Cronometre extends Thread {
    private String nomProces;
    private int segons;

    public Cronometre(String nomProces, int segons) {
        this.nomProces = nomProces;
        this.segons = segons;
    }

    @Override
    public void run() {
        cronometre();
    }

    public void cronometre() {
        int segonActual = 0;
        while (segonActual <= segons) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Procés " + nomProces + " Segon: " + segonActual);
            segonActual++;
        }
    }
}
