import org.example.Bookings;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class BookingsTest {
    private Bookings trueBooking;
    private Bookings falseBooking;

    @BeforeEach
    void setUp() {
        trueBooking = new Bookings(2003,"14/04/2026","14:30",0023,true);
        falseBooking = new Bookings(2004,"02/03/2026","12:10",0014, false);
    }



    //FIRST TEST//
    @Test
    void testBookingAvailabilities() {
        assertTrue(trueBooking.isBooked());
        assertFalse(falseBooking.isBooked());
    }

    @Test
    void testBookingIDs() {
        assertEquals(2003, trueBooking.getBookingID());
        trueBooking.setBookingID(2001);
        assertEquals(2001, trueBooking.getBookingID());
    }

    @Test
    void testBookingDate() {
        assertEquals("14/04/2026", trueBooking.getBookingDate());

        trueBooking.setBookingDate("15/04/2026");
        assertEquals("15/04/2026", trueBooking.getBookingDate());
    }

    @Test
    void testBookingTime() {
        assertEquals("14:30", trueBooking.getBookingTime());

        trueBooking.setBookingTime("16:00");
        assertEquals("16:00", trueBooking.getBookingTime());
    }
}
