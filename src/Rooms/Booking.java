package Rooms;

import java.time.LocalDate;

public class Booking {
    private LocalDate startDate;
    private LocalDate endDate;
    private String bookingName;
    private int totalPrice;
    private Room room;
    public Booking(String bookingName, int amountOfNights, int pricePerNight){
        this.bookingName = bookingName;
        this.totalPrice = amountOfNights * pricePerNight;
    }

    public String getBookingName() {
        return bookingName;
    }

    public int getTotalPrice() {
        return totalPrice;
    }
}
