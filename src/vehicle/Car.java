package vehicle;

import maintenance.MaintenanceVehicle;

public class Car extends Vehicle implements MaintenanceVehicle {

    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped.");
    }

    @Override
    public Double costMonth() {
        return 20.0;
    }
}
