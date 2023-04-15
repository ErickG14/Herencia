import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Tesla","S",2380000);
       vehiculo.encender();
       vehiculo.apagarse();
        System.out.println( vehiculo);

        System.out.println("--------------------------------------------------------------");

        Automovil auto = new Automovil("Tesla","S",2380000,4,true, Color.black);
        auto.encender();
        auto.apagarse();
        auto.cambiardevelocidad();
        auto.frenar();
        System.out.println(auto);

        System.out.println("----------------------------------------------------------------");

        Taxi taxi = new Taxi("Tesla","S",2380000,4,true,Color.black,"PEB1416",true,2023);
        taxi.encender();
        taxi.apagarse();
        taxi.cambiardevelocidad();
        taxi.frenar();
        taxi.abrirpuertas();
        taxi.cargarpasaje();
        System.out.println(taxi);
    }
}