import code.Car;
import code.DateTime;
import code.RentalRecord;
import code.VehicleType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {
    private Car car;
    private DateTime startDate;
    private DateTime endDate;

    @BeforeEach
    public void setUp() {
        car = new Car("C_1", 2017, "Honda", "Civic", 0, new VehicleType(5));
        startDate = new DateTime(5, 9, 2021);
        endDate = new DateTime(10, 9, 2021);
    }

    @Test
    public void testReturnVehicleBeforeMinimumDays() {
        car.rent("Customer1", new DateTime(1,1,2020), 3);
        assertTrue(car.returnVehicle(new DateTime(3,1,2020)));
    }
    @Test
    public void testReturnVehicleAfterMaximumDays() {
        car.rent("Customer2", new DateTime(1,3,2023), 13);
        assertTrue(car.returnVehicle(new DateTime(17,3,2023)));
    }

    @Test
    public void testGetLateFee() {
        assertEquals(1.25 * 78 * DateTime.diffDays(endDate, startDate), car.getLateFee(endDate, startDate), 0);
    }

    @Test
    public void testGetLateFee_ReturnDateIsOnStartDate() {
        assertEquals(0.0, car.getLateFee(startDate, startDate));
    }


    @Test
    public void testReturnVehicle_VehicleRented() {
        car.vehicleStatus = 1;
        DateTime returnDate = new DateTime(10, 9, 2021);
        DateTime estimatedate = new DateTime(12, 9, 2021);
        DateTime rentDate = new DateTime(5, 9, 2021);
        car.records[0] = new RentalRecord("C_1", rentDate, estimatedate);
        assertTrue(car.returnVehicle(returnDate));
    }

    @Test
    public void testReturnVehicle_VehicleNotRented() {
        car.vehicleStatus = 0;
        DateTime returnDate = new DateTime(10, 9, 2021);
        assertFalse(car.returnVehicle(returnDate));
    }

    @Test
    public void testCompleteMaintenance_VehicleUnderMaintenance() {
        car.vehicleStatus = 2;
        assertTrue(car.completeMaintenance());
    }

    @Test
    public void testCompleteMaintenance_VehicleAlreadyAvailable() {
        car.vehicleStatus = 1;
        assertFalse(car.completeMaintenance());
    }

    @Test
    public void testCompleteMaintenance_VehicleNotUnderMaintenance() {
        car.vehicleStatus = 0;
        assertFalse(car.completeMaintenance());
    }



    @Test
    public void testGetDetailsWithNoRentalRecords() {
        Car car = new Car("C_22", 2020, "Toyota", "Camry", 0, new VehicleType(5));
        String details = car.getDetails();
        assertTrue(details.contains("RENTAL RECORD:\tempty"));
    }

    

}
