import code.DateTime;
import org.junit.Test;
import static org.junit.Assert.*;
public class DateTimeTest {

    @Test
    public void testDefaultConstructor() {
        DateTime dateTime = new DateTime();
        assertNotNull(dateTime);
        assertTrue(dateTime.getTime() > 0);
    }

    @Test
    public void testDateConstructor() {
        DateTime dateTime = new DateTime(12, 3, 2024);
        assertNotNull(dateTime);
        assertEquals("12/03/2024", dateTime.getFormattedDate());
    }

    @Test
    public void testGetNameOfDay() {
        DateTime dateTime = new DateTime(12, 3, 2024);
        assertEquals("Tuesday", dateTime.getNameOfDay());
    }

    @Test
    public void testGetCurrentTime() {
        String currentTime = DateTime.getCurrentTime();
        assertNotNull(currentTime);
    }

    @Test
    public void testGetFormattedDate() {
        DateTime dateTime = new DateTime(8, 3, 2024);
        assertEquals("12/03/2024", dateTime.getFormattedDate());
    }

    @Test
    public void testGetEightDigitDate() {
        DateTime dateTime = new DateTime(8, 3, 2024);
        assertEquals("12032024", dateTime.getEightDigitDate());
    }

    @Test
    public void testDiffDays() {
        DateTime startDate = new DateTime(8, 3, 2024);
        DateTime endDate = new DateTime(12, 3, 2024);
        assertEquals(4, DateTime.diffDays(endDate, startDate));
    }

    @Test
    public void diffDays_SameDates() {
        DateTime startDate = new DateTime(1, 1, 2024);
        DateTime endDate = new DateTime(1, 1, 2024);
        int diff = DateTime.diffDays(endDate, startDate);
        assertEquals(0, diff);
    }

    @Test
    public void diffDays_NegativeForEndDateLessThanStartDate() {
        DateTime startDate = new DateTime(1, 8, 2023);
        DateTime endDate = new DateTime(1, 9, 2023);
        int diff = DateTime.diffDays(endDate, startDate);
        assertEquals(-31, diff);
    }

    @Test
    public void testSetAdvance() {
        DateTime dateTime = new DateTime(8, 3, 2024);
        dateTime.setAdvance(2, 3, 30);
        assertEquals("08/03/2024", dateTime.getFormattedDate());
    }
}
