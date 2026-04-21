package org.example;

public class Bookings {
    int bookingID;
    String bookingDate;
    String bookingTime;
    int bookedRedBoxId;
    boolean booked;

    public Bookings(int bookingID, String bookingDate, String bookingTime, int bookedRedBoxId, boolean booked) {
        this.bookingID = bookingID;
        this.bookingDate = bookingDate;
        this.bookingTime = bookingTime;
        this.bookedRedBoxId = bookedRedBoxId;
        this.booked = booked;
    }

    //GETTERS
    public int getBookingID() {
        return bookingID;
    }

    public String getBookingTime() {
        return bookingTime;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public int getBookedRedBoxId() {
        return bookedRedBoxId;
    }

    public boolean isBooked() {
        return booked;
    }

    //SETTERS
    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public void setBookingTime(String bookingTime) {
        this.bookingTime = bookingTime;
    }

    public void setBookedRedBoxId(int bookedRedBoxId) {
        this.bookedRedBoxId = bookedRedBoxId;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    //TO STRING//
    @Override
    public String toString() {
        return "Booking ID: "+ bookingID +
                "Date of booking: " + bookingDate +
                "Time of booking: " + bookingTime +
                "Red Box ID: " + bookedRedBoxId;
    }

}