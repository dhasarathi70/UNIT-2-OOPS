import java.io.*;
import java.util.*;

interface TicketBooking {
    void selectMovie();
    void selectSeats();
    void makePayment();
}

class BookMyShow implements TicketBooking {

    Scanner s = new Scanner(System.in);
    String movieName;
    int seats;
    double amount;

    public void selectMovie() {
        System.out.println("Enter movie name:");
        movieName = s.nextLine();
        System.out.println("Movie Selected: " + movieName);
    }

    public void selectSeats() {
        System.out.println("Enter number of seats:");
        seats = s.nextInt();
        amount = seats * amount
        System.out.println("Seats Selected: " + seats);
    }

    public void makePayment() {
        System.out.println("Total Amount: Rs." + amount);
        System.out.println("Payment Successful!");
        System.out.println("Booking Confirmed for " + movieName + 
                           " | Seats: " + seats);
    }
}
