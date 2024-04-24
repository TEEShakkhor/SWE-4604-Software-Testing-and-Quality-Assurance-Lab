import code.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
public class VanTest {
        private Van van;
        private DateTime startDate;
        private DateTime endDate;

        @BeforeEach
        public void setUp() {
            van = new Van("V_1", 2023, "Nissan", "LandCruiser", 0, new VehicleType(5, new DateTime(1, 1, 2023)));
            startDate = new DateTime(1, 9, 2023);
            endDate = new DateTime(6, 9, 2023);
        }


    @Test
    public void testCompleteMaintenance_VehicleUnderMaintenance() {
        van.vehicleStatus = 2;
        DateTime completionDate = new DateTime(1, 9, 2023);
        assertTrue(van.completeMaintenance(completionDate));
    }



    @Test
    public void testReturnVehicle_VehicleRented() {
        van.vehicleStatus = 1;
        DateTime returnDate = new DateTime(10, 9, 2021);
        DateTime estimatedate = new DateTime(12, 9, 2021);
        DateTime rentDate = new DateTime(5, 9, 2021);
        van.records[0] = new RentalRecord("V_1", rentDate, estimatedate);
        assertTrue(van.returnVehicle(returnDate));
    }

    @Test
    public void testReturnVehicle_VehicleNotRented() {
        van.vehicleStatus = 0;
        DateTime returnDate = new DateTime(10, 9, 2021);
        assertFalse(van.returnVehicle(returnDate));
    }

    @Test
    public void testReturnVehicleBeforeMinimumDays() {
        van.rent("Customer1", new DateTime(1,1,2020), 3);
        assertTrue(van.returnVehicle(new DateTime(3,1,2020)));
    }

    @Test
    public void testGetLateFee() {
        assertEquals(299* DateTime.diffDays(endDate,startDate), van.getLateFee(endDate, startDate), 0);
    }

    @Test
    public void testGetLateFee_ReturnDateOnStartDate() {
        assertEquals(0.0, van.getLateFee(startDate, startDate));
    }



    }
