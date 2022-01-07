import java.util.ArrayList;

/**
 * The Venue class stores the basic details of a venue, such as a unique ID, its name,
 * the venue manager assigned to the venue, the list of shows held there and 
 * its seating plan.
 *
 * @author Jason Huggins
 * @version 07/01/2022
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
     */
    public Venue(int id, String name, Person venueManager)
    {
        venueID = id;
        venueName = name;
        this.venueManager = venueManager;
        shows = new ArrayList<Show>();
        seatPlan = new ArrayList<String>();
        
        // For testing, will add 3 seats to the seating plan
        seatPlan.add("1A");
        seatPlan.add("2A");
        seatPlan.add("3A");
    }
    
    public void printShows()
    {
        System.out.println("List of Shows");
        
        for (int i = 1; i < shows.size(); i++)
        {
            System.out.println("Show " + i);
            shows.get(i).printShow();
        }
    }
    
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
