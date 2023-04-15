public class Vehiculo {
 protected String marca;
 protected String modelo;
 protected int precio;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                '}';
    }

    public void encender(){
        System.out.println("El Vehiculo esta listo para iniciar el viaje");
    }

    public void apagarse(){
        System.out.println("El Vehiculo ha sido apagado.....");
    }
}
