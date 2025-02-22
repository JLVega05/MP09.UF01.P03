package jairon.vega.planificacio.fils;

public class ExecucioFils {
    public static void main(String[] args) {
        Cronometre cronoAlfa = new Cronometre("CronoAlfa", 21);
        Cronometre cronoBravo = new Cronometre("CronoBravo", 15);
        Cronometre cronoCharlie = new Cronometre("CronoCharlie", 12);
        Cronometre cronoDelta = new Cronometre("CronoDelta", 6);
        Cronometre cronoEcho = new Cronometre("CronoEcho", 11);
        Cronometre cronoFoxtrot = new Cronometre("CronoFoxtrot", 4);
        Cronometre cronoGolf = new Cronometre("CronoGolf", 7);

        System.out.println("Inici");

        cronoAlfa.start();
        cronoCharlie.start();
        cronoFoxtrot.start();
        cronoGolf.start();

        try {
            cronoAlfa.join();
            cronoCharlie.join();
            cronoFoxtrot.join();
            cronoGolf.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        cronoBravo.start();
        try {
            cronoBravo.join(4000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        cronoDelta.start();
        try {
            cronoDelta.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        cronoEcho.start();
        try {
            cronoEcho.join(8000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        

        System.out.println("Final");
    }
}
