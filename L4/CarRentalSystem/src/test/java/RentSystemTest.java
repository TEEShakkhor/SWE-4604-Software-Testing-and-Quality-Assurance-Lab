import code.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.Assert.*;

public class RentSystemTest {

    private RentSystem rentSystem;
    private Car car;
    private Van van;

    @BeforeEach
    public void setUp() {
        rentSystem = new RentSystem();
        car = new Car("C_1", 2023, "Honda", "Civic", 0, new VehicleType(5));
        van = new Van("V_1", 2023, "Toyota", "LandCruiser", 0, new VehicleType(15, new DateTime(1, 1, 2022)));
    }



    @Test
    public void add_VehicleInvalidType() {
        String input = "plane\n2022\nToyota\nCamry\n1\n4\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertThrows(Exception.class, () -> rentSystem.add(new Scanner(System.in)));
    }

    @Test
    public void rentCar_Available() {
        RentSystem rentSystem = new RentSystem();
        rentSystem.cars[0] = new Car("C_1", 2023, "Honda", "Civic", 0, new VehicleType(5));

        String input = "C_1\nCUST_1\n01/01/2022\n5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        rentSystem.rent(new Scanner(System.in));

        assertEquals(1, rentSystem.cars[0].vehicleStatus);
    }

    @Test
    public void rentCar_Unavailable() {
        RentSystem rentSystem = new RentSystem();
        rentSystem.cars[0] = new Car("C_1", 2023, "Honda", "Civic", 1, new VehicleType(5));

        String input = "C_1\nCUST_1\n01/01/2022\n5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        rentSystem.rent(new Scanner(System.in));

        assertEquals(1, rentSystem.cars[0].vehicleStatus);
    }

    @Test
    public void rentVan_Available() {
        RentSystem rentSystem = new RentSystem();
        rentSystem.vans[0] = new Van("V_1", 2023, "Toyota", "LandCruiser", 0, new VehicleType(15, new DateTime(1, 1, 2022)));

        String input = "V_1\nCUST_1\n01/01/2022\n5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        rentSystem.rent(new Scanner(System.in));

        assertEquals(1, rentSystem.vans[0].vehicleStatus);
    }

    @Test
    public void rentVan_Unavailable() {
        RentSystem rentSystem = new RentSystem();
        rentSystem.vans[0] = new Van("V_1", 2023, "Toyota", "LandCruiser", 1, new VehicleType(15, new DateTime(1, 1, 2022)));

        String input = "V_1\nCUST_1\n01/01/2022\n5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        rentSystem.rent(new Scanner(System.in));

        assertEquals(1, rentSystem.vans[0].vehicleStatus);
    }



    @Test
    public void returnCar_Rented() {
        RentSystem rentSystem = new RentSystem();
        rentSystem.cars[0] = new Car("C_1", 2023, "Honda", "Civic", 0, new VehicleType(5));

        // Rent the car first
        String rentInput = "C_1\nCUST_1\n01/01/2022\n5\n";
        InputStream rentIn = new ByteArrayInputStream(rentInput.getBytes());
        System.setIn(rentIn);
        rentSystem.rent(new Scanner(System.in));

        // Now return the rented car
        String returnInput = "C_1\n01/02/2022\n";
        InputStream returnIn = new ByteArrayInputStream(returnInput.getBytes());
        System.setIn(returnIn);
        rentSystem.returnCar(new Scanner(System.in));

        assertEquals(0, rentSystem.cars[0].vehicleStatus);
    }

    @Test
    public void returnCar_NotRented() {
        RentSystem rentSystem = new RentSystem();
        rentSystem.cars[0] = new Car("C_1", 2023, "Honda", "Civic", 1, new VehicleType(5));

        String input = "C_1\n1/2/2022\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertThrows(Exception.class, () -> rentSystem.returnCar(new Scanner(System.in)));
    }

    @Test
    public void returnVan_Rented() {
        RentSystem rentSystem = new RentSystem();
        rentSystem.vans[0] = new Van("V_1", 2023, "Toyota", "LandCruiser", 0, new VehicleType(15, new DateTime(1, 1, 2022)));

        // Rent the van first
        String rentInput = "V_1\nCUST_1\n01/01/2022\n5\n";
        InputStream rentIn = new ByteArrayInputStream(rentInput.getBytes());
        System.setIn(rentIn);
        rentSystem.rent(new Scanner(System.in));

        // Now return the rented van
        String returnInput = "V_1\n01/02/2022\n";
        InputStream returnIn = new ByteArrayInputStream(returnInput.getBytes());
        System.setIn(returnIn);
        rentSystem.returnCar(new Scanner(System.in));

        assertEquals(0, rentSystem.vans[0].vehicleStatus);
    }

    @Test
    public void returnVan_NotRented() {
        RentSystem rentSystem = new RentSystem();
        rentSystem.vans[0] = new Van("V_1", 2023, "Toyota", "LandCruiser", 1, new VehicleType(15, new DateTime(1, 1, 2022)));

        String input = "V_1\n1/2/2022\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertThrows(Exception.class, () -> rentSystem.returnCar(new Scanner(System.in)));
    }


    @Test
    public void notSetVehicleToMaintenanceWhenIdIsInvalid() {
        RentSystem rentSystem = new RentSystem();
        rentSystem.cars[0] = new Car("C_1", 2023, "Honda", "Civic", 0, new VehicleType(5));
        rentSystem.vans[0] = new Van("V_1", 2023, "Toyota", "LandCruiser", 1, new VehicleType(15, new DateTime(1, 1, 2022)));

        String input = "C_2\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        rentSystem.vehicleMaintenance(new Scanner(System.in));

        assertEquals(0, rentSystem.cars[0].vehicleStatus);
    }

    @Test
    public void notCompleteMaintenanceWhenVehicleIdIsInvalid() {
        RentSystem rentSystem = new RentSystem();
        rentSystem.cars[0] = new Car("C_1", 2023, "Honda", "Civic", 2, new VehicleType(5));
        rentSystem.vans[0] = new Van("V_1", 2023, "Toyota", "LandCruiser", 0, new VehicleType(15, new DateTime(1, 1, 2022)));

        String input = "C_2\n01/02/2022\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        rentSystem.completeMaintenance(new Scanner(System.in));

        assertEquals(2, rentSystem.cars[0].vehicleStatus);
    }

}
