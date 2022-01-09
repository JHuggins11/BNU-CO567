import java.time.LocalDate;
import java.time.LocalTime;

/**
 * The Ticket class stores information about an issued ticket after a consumer has
 * paid for their order. This includes a unique ID, the consumer who bought it,
 * the chosen venue, show and seat, as well as the dates and times for when
 * the ticket was purchased and when the show is taking place. 
 *
 * @author Jason Huggins
 * @version 09/01/2022
 */
public class Ticket
{
    int ticketID;
    Consumer consumer;
    Person agent;
    Show show;
    Venue venue;
    LocalDate ticketPurchaseDate;
    LocalTime ticketPurchaseTime;
    LocalDate ticketStartDate;
    LocalTime ticketStartTime;
    double ticketPrice;
    String seatNo;
    
    /**
     * Constructor for objects of class Ticket
     * @param startDate The start date of the show the ticket is for in DD/MM/YYYY format.
     * @param startTime The start time of the show the ticket is for in HH:MM format.
     */
    public Ticket(int id, Consumer consumer, Show show, Venue venue, String startDate, 
        String startTime, double price, String seat)
    {
        ticketID = id;
        this.consumer = consumer;
        this.show = show;
        this.venue = venue;
        ticketPurchaseDate = LocalDate.now();
        ticketPurchaseTime = LocalTime.now();
        
        // TODO: Change this to use the PricingStructure enum
        ticketPrice = price;
        seatNo = seat;
        
        ticketStartDate = DateTimeManager.getDateInput(startDate);
        ticketStartTime = DateTimeManager.getTimeInput(startTime);
    }
    
    /**
     * Prints the details of the ticket.
     */
    public void printTicket()
    {
        System.out.println("Ticket ID: " + ticketID);
        System.out.println("Ticket Holder: " + consumer.getName());
        System.out.println("Purchased: " + ticketPurchaseDate + " " + ticketPurchaseTime);
        System.out.println("Show: " + show);
        System.out.println("Show Date/Time: " + ticketStartDate+ " " + ticketPurchaseTime);
        System.out.println("Price: " + ticketPrice);
        System.out.println("Seat: " + seatNo);
    }    
}
