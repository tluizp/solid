package maintenance;

public class Calculate {

    public Double costYear(MaintenanceVehicle maintenanceVehicle){
        System.out.println("Calculo de manutencao anual para " + maintenanceVehicle.getClass().getName());
        return maintenanceVehicle.costMonth() * 12;
    }
}
