import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class LeapYearTest {

    @Test
    public void returnsBooleanIfLeapYear() {
        LeapYear luckyLeapYear = new LeapYear();
        assertEquals(true, luckyLeapYear.leapYear(1996));
        assertEquals(false, luckyLeapYear.leapYear(2001));
        assertEquals(true, luckyLeapYear.leapYear(2000));
        assertEquals(false, luckyLeapYear.leapYear(1900));
    }
}