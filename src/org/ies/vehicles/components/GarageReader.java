package org.ies.vehicles.components;


import org.ies.vehicles.model.Garage;
import org.ies.vehicles.model.VehicleType;

import java.util.Scanner;

public class GarageReader {
    private final Scanner scanner;

    public GarageReader(Scanner scanner) {
        this.scanner = scanner;
    }
    public Garage read() {
        System.out.println("Introduce los datos del garage ");
        System.out.println("Nombre ");
        String name = scanner.nextLine();
        System.out.println("Dirección ");
        String address = scanner.nextLine();
        System.out.println("Cuantos vehiculos hay ? ");
        int size = scanner.nextInt();
        scanner.nextLine();

        VehicleType
    }
}
