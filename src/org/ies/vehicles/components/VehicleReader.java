package org.ies.vehicles.components;

import org.ies.vehicles.model.VehicleType;
import org.ies.vehicles.model.Vehicle;

import java.util.Scanner;

public class VehicleReader {

    private final Scanner scanner;

    public VehicleReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Vehicle read() {
        System.out.println("Introduce los datos del vehiculo");

        int option;
        do {
            System.out.println("Elige el tipo de vehiculo: ");
            System.out.println("1. Coche ");
            System.out.println("2. Moto ");
            System.out.println("3. Camion ");
            option = scanner.nextInt();
        } while (option != 1 && option != 2 && option != 3);

        VehicleType vehicleType;
        if (option == 1) {
            vehicleType = VehicleType.Car;
        } else if (option == 2) {
            vehicleType = VehicleType.Motorbike;
        } else {
            vehicleType = VehicleType.Truck;
        }

        System.out.println("Velocidad máxima ");
        int maxSpeed = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Color ");
        String color = scanner.nextLine();

        System.out.println("Matricula ");
        String plate = scanner.nextLine();

        return new Vehicle(
                vehicleType,
                maxSpeed,
                color,
                plate
        );

    }
}
