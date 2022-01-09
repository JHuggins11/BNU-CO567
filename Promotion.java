import java.time.LocalDate;
import java.util.ArrayList;

/**
 * The Promotion class stores the information about each promotion that a venue runs. It
 * will include information on the promotion's name, dates, times, a description and a 
 * discount rate that will be applied to the PricingStructure enum so the ticket 
 * prices are discounted. 
 *
 * @author Jason Huggins
 * @version 09/01/2022
 */
public class Promotion
{
    int promoID;
    String promoName;
    String promoDescription;
    LocalDate promoStartDate;
    LocalDate promoEndDate;
    ArrayList<Show> promoShows;
    Venue venue;
    double discountRate;
    
    /**
     * Constructor for objects of class Promotion
     */
    public Promotion(int id, String name, String description, String startDate,
        String endDate, Venue venue, double discount)
    {
        promoID = id;
        promoName = name;
        promoDescription = description;
        promoStartDate = DateTimeManager.getDateInput(startDate);
        promoEndDate = DateTimeManager.getDateInput(endDate);
        this.venue = venue;
        discountRate = discount;
        promoShows = new ArrayList<Show>();
    }
    
    /**
     * Adds a show to the promotion.
     */
    public void addShow(Show show)
    {
        promoShows.add(show);
    }
    
    /**
     * Removes a show from the promotion (needs an index number for the list).
     * Valid index range is from 0 to the size of the list.
     */
    public void removeShow(int index)
    {
        if (promoShows.size() >= index)
        {
            promoShows.remove(index);
        }
        else
        {
            System.out.println("Invalid index, it must be in the range of 0 to " + 
                promoShows.size());
        }
    }
    
    /**
     * Prints the details of the promotion.
     */
    public void printPromotion()
    {
        System.out.println("\nPromotion ID: " + promoID);
        System.out.println("Name: " + promoName);
        System.out.println("Description: " + promoDescription);
        System.out.println("Start Date: " + promoStartDate);
        System.out.println("End Date: " + promoEndDate);
        System.out.println("\nShows in Promotion:");
        
        for (Show show : promoShows)
        {
            show.printShow();
        }
        
        System.out.println("\nDiscount Rate: " + discountRate);
    }
}
