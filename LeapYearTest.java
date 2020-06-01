import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class LeapYearTest {

    @Test
    public void returnsBooleanIfLeapYear() {
        assertEquals(true, leapYear(1992));
        assertEquals(false, leapYear(2001));
        assertEquals(true, leapYear(2008));
        assertEquals(false, leapYear(1900));
    }

    private Object leapYear(int i) {
        return null;
    }
}