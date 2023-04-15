import java.awt.*;

public class Automovil extends Vehiculo{
    protected int Numdepuertas;
    protected boolean electrico;
    protected Color color;

    public Automovil() {
    }

    public Automovil(String marca, String modelo, int precio, int numdepuertas, boolean electrico, Color color) {
        super(marca, modelo, precio);
        Numdepuertas = numdepuertas;
        this.electrico = electrico;
        this.color = color;
    }

    public int getNumdepuertas() {
        return Numdepuertas;
    }

    public void setNumdepuertas(int numdepuertas) {
        Numdepuertas = numdepuertas;
    }

    public boolean isElectrico() {
        return electrico;
    }

    public void setElectrico(boolean electrico) {
        this.electrico = electrico;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "Numdepuertas=" + Numdepuertas +
                ", electrico=" + electrico +
                ", color=" + color +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                '}';
    }

    public void cambiardevelocidad(){
        System.out.println("El Automovil esta revolucionando velocidades");
    }

    public void frenar(){
        System.out.println("El Automovil esta frenando....");
    }
}
