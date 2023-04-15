import java.awt.*;

public class Taxi extends Automovil{
    private String placas;
    private boolean sedan;
    private int anio;

    public Taxi() {
    }

    public Taxi(String marca, String modelo, int precio, int numdepuertas, boolean electrico, Color color, String placas, boolean sedan, int anio) {
        super(marca, modelo, precio, numdepuertas, electrico, color);
        this.placas = placas;
        this.sedan = sedan;
        this.anio = anio;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public boolean isSedan() {
        return sedan;
    }

    public void setSedan(boolean sedan) {
        this.sedan = sedan;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "placas='" + placas + '\'' +
                ", sedan=" + sedan +
                ", anio=" + anio +
                ", Numdepuertas=" + Numdepuertas +
                ", electrico=" + electrico +
                ", color=" + color +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                '}';
    }

    public void cargarpasaje(){
        System.out.println("El Taxi esta cargando pasaje....");

    }

    public void abrirpuertas(){
        System.out.println("El taxi tiene abiertas las puertas");
    }
}
