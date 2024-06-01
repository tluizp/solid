package vehicle;

import maintenance.MaintenanceVehicle;

public class Truck extends Vehicle implements MaintenanceVehicle {

    @Override
    public void startEngine() {
        System.out.println("Truck engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Truck engine stopped.");
    }

    @Override
    public Double costMonth() {
        return 100.0;
    }

}
