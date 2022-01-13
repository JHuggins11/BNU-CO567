import java.util.ArrayList;

/**
 * The Venue class stores the basic details of a venue, such as a unique ID, its name,
 * the venue manager assigned to the venue, the list of shows held there and 
 * its seating plan.
 *
 * @author Jason Huggins, Tyronne Bradburn, Dan Hale
 * @version 10/01/2022
 */
public class Venue
{
    int venueID;
    String venueName;
    Person venueManager;
    ArrayList<Show> shows;
    ArrayList<String> seatPlan;
    
    /**
     * Constructor for objects of class Venue
     * (excluding the venue manager for now to test solely from the
     * consumer's perspective)
     */
    public Venue(int id, String name)
    {
        venueID = id;
        venueName = name;
        shows = new ArrayList<Show>();
        seatPlan = new ArrayList<String>();
        
        // For testing, will add 6 seats to the seating plan
        seatPlan.add("0A");
        seatPlan.add("1A");
        seatPlan.add("2A");
        seatPlan.add("3A");
        seatPlan.add("1B");
        seatPlan.add("2B");
        seatPlan.add("3B");
    }
    
    /**
     * Prints a list of shows being shown at the venue.
     */
    public void printShows()
    {
        System.out.println("List of Shows");
        
        for (int i = 1; i < shows.size(); i++)
        {
            System.out.println("Show " + i);
            shows.get(i).printShow();
        }
    }
    
    /**
     * Prints a list of seats forming the seating plan of the venue.
     */
    public void listSeatPlan()
    {
        System.out.println("Seating Plan");
        
        for (int i = 1; i < seatPlan.size(); i++)
        {
            System.out.println("Seat " + i);
            System.out.println(seatPlan.get(i));
        }
    }    
}
