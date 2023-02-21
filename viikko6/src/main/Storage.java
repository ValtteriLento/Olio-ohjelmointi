package main;

import java.util.ArrayList;

public class Storage {

    private ArrayList<Vehicle> vehicles;
    
    public Storage() {
        vehicles = new ArrayList<Vehicle>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void listVehicles() {
        for(Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getType() + ": " + vehicle.getManufacturer() + " " + vehicle.getModel());
            vehicle.getEngine();
            System.out.println("Huippunopeus: " + vehicle.getMaxSpeed() + "km/h");
            System.out.println();
        }
    }
}
