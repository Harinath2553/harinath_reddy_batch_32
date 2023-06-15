import java.util.ArrayList;
import java.util.List;

class TicketBookingSystem {
    private int availableTickets;
    private List<String> bookedTickets;

    public TicketBookingSystem(int availableTickets) {
        this.availableTickets = availableTickets;
        this.bookedTickets = new ArrayList<>();
    }

    public synchronized void bookTicket(String passengerName) {
        if (availableTickets > 0) {
            System.out.println("Booking ticket for " + passengerName);
            bookedTickets.add(passengerName);
            availableTickets--;
            System.out.println("Ticket booked for " + passengerName);
            System.out.println("Available tickets: " + availableTickets);
        } else {
            System.out.println("Sorry, no more tickets available for " + passengerName);
        }
    }
}

class Passenger implements Runnable {
    private String name;
    private TicketBookingSystem bookingSystem;

    public Passenger(String name, TicketBookingSystem bookingSystem) {
        this.name = name;
        this.bookingSystem = bookingSystem;
    }

    @Override
    public void run() {
        bookingSystem.bookTicket(name);
    }
}

public class TicketBookingSimulation {
    public static void main(String[] args) {
        TicketBookingSystem bookingSystem = new TicketBookingSystem(3);

        Thread passenger1 = new Thread(new Passenger("Ro-hit", bookingSystem));
        Thread passenger2 = new Thread(new Passenger("sachin", bookingSystem));
        Thread passenger3 = new Thread(new Passenger("sarah", bookingSystem));
        Thread passenger4 = new Thread(new Passenger("Gill", bookingSystem));

        passenger1.start();
        passenger2.start();
        passenger3.start();
        passenger4.start();
    }
}
