package hu.szamalk.idomok;

public abstract class FaIdom {
    private static double fajsuly = 0.0;

    public  abstract double terfogat();


    public double suly(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "Faldom{}";
    }
}
