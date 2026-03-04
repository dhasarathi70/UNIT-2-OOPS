public class Solution {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Choose Booking Platform:\n1. Book Ticket\n2. Exit");

        int n = s.nextInt();
        s.nextLine(); 

        
            TicketBooking t = new BookMyShow();
            t.selectMovie();
            t.selectSeats();
            t.makePayment();
            
        }
    }
}
