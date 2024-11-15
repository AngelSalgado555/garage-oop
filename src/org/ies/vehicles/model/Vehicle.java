package org.ies.vehicles.model;

import java.util.Objects;

public class Vehicle {
    private VehicleType vehicleType ;
    private String color;
    private int maxSpeed;
    private String plate;

    public Vehicle(VehicleType vehicleType, String color, int maxSpeed, String plate) {
        this.vehicleType = vehicleType;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.plate = plate;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getPlate() {
        return plate;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return maxSpeed == vehicle.maxSpeed && vehicleType == vehicle.vehicleType && Objects.equals(color, vehicle.color) && Objects.equals(plate, vehicle.plate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleType, color, maxSpeed, plate);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleType=" + vehicleType +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", plate='" + plate + '\'' +
                '}';
    }
}
