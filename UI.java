import java.util.ArrayList;
import java.util.Scanner;

/**
 * The UI class handles the booking process for a ticket between the system and user.
 * After logging in and entering their details (in the case of this partial
 * implementation, it's assumed that this has already been done), the user
 * can choose the venue they want to go to, the show and their seat, then
 * going to checkout afterwards.
 *
 * @author Jason Huggins
 * @version 09/01/2022
 */
public class UI
{
    int choice;
    Person user;
    Venue selectedVenue;
    Show selectedShow;
    int noOfPeople;
    ArrayList<String> selectedSeats;
    ArrayList<Ticket> ticketsInBasket;
    boolean validChoice;
    Scanner sc;
    
    /**
     * Constructor for objects of class UI.
     */
    public UI(Person user, Venue venue)
    {
        this.user = user;
        selectedVenue = venue; // For testing, will be set as BCPA by default
        validChoice = false;
        sc = new Scanner(System.in);
    }

    /**
     * Asks the user to select a venue by entering a number from a list of options.
     * 
     * For the scope of this project, it will be assumed that there will be only one venue, 
     * the Bucks Centre for the Performing Arts, and this will be set as the default. As
     * a result, this method won't be used yet for testing.
     */
    public void selectVenue()
    {
        System.out.println("Venue Selection");
        // call to method listing venues will be placed here
        
        while (validChoice = false) 
        {
            System.out.print("Select a venue (enter a number): ");
            choice = sc.nextInt();
            
            // Once a method to show all venues is made, it will be used here.
            /* if (listOfVenues[choice] not out of bounds)
            {
                selectedVenue(listOfVenues[choice]);
                validChoice = true;
            }
            else
            {
                println("Invalid choice. Please try again.");
            } */
        }
        
        selectShow();
    }
    
    /**
     * Asks the user to select a show by entering a number from a list of options.
     */
    public void selectShow()
    {
        System.out.println("Show Selection");
        /* For now, this will just print a list of shows at the venue, but later on will
           the user to choose to filter by upcoming dates or a date range. */
        selectedVenue.printShows();
    
        while (validChoice = false) 
        {
            System.out.print("Select a show (enter a number): ");
            choice = sc.nextInt();
            
            // Checking if the user's choice is out of bounds for the number of shows
            if (selectedVenue.shows.size() >= choice)
            {
                selectedShow = selectedVenue.shows.get(choice);
                validChoice = true;
            }
            else
            {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        
        selectSeats();
    }
    
    /**
     * Asks the user to select a seat for a show by entering a number from a list 
     * of options.
     */
    public void selectSeats()
    {
        System.out.println("Seat Selection");
        selectedVenue.listSeatPlan();
        
        while (validChoice = false) 
        {
            System.out.print("Select a seat (enter a number): ");
            choice = sc.nextInt();
            
            // Checking if the user's choice is out of bounds for the number of seats
            if (selectedVenue.seatPlan.size() >= choice)
            {
                selectedSeats.add(selectedVenue.seatPlan.get(choice));
                validChoice = true;
            }
            else
            {
                System.out.println("Invalid choice. Please try again.");
            }
        }        
    }
    
    /**
     * After selecting a venue, show and seat, the user can proceed to checkout and get
     * their ticket issued after payment.
     */
    public void checkout()
    {
        System.out.println("Checkout");
        
        for (Ticket ticket : ticketsInBasket)
        {
            ticket.printTicket();
            }
            
            while (validChoice = false) 
            {
                System.out.print("Confirm choice (enter a number): ");
                choice = sc.nextInt();
            
                if (choice == 1)
                {
                    // call to method dealing with payment will be placed here
                    validChoice = true;
                }
                else if (choice == 2)
                {
                    // call to method going back to the summary page will be placed here
                    validChoice = false;
                }
                else 
                {
                    System.out.println("Invalid choice. Please try again.");
                }
            }
        }
}

