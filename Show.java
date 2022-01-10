import java.time.LocalDate;
import java.time.LocalTime;

/**
 * The Show class stores the information for each show at a venue, including 
 * its name, release date and times, as well as its age rating, genre and 
 * duration. It will also be used to make an ArrayList of shows for the 
 * Venue and Promotion classes.
 *
 * @author Jason Huggins
 * @version 10/01/2022
 */
public class Show
{
    int showID;
    String showName;
    String showGenre;
    LocalDate showReleaseDate;
    int showAgeRating;
    LocalTime showStartTime;
    int showDuration;
    
    /**
     * Constructor for objects of class Show
     * @param releaseDate DD-MM-YYYY format (with dashes)
     * @param startTime HH-MM format (24-hour time; with dashes)
     */
    public Show(int id, String name, String genre, String releaseDate, int rating, 
        String startTime, int duration)
    {
        showID = id;
        showName = name;
        showGenre = genre;
        showReleaseDate = DateTimeManager.getDateInput(releaseDate);
        showAgeRating = rating;
        showStartTime = DateTimeManager.getTimeInput(startTime);
        showDuration = duration;
    }
    
    /**
     * Prints the details of the show.
     */
    public void printShow()
    {
        System.out.println("\nShow Name: " + showName);
        System.out.println("Genre: " + showGenre);
        System.out.println("Release Date: " + showReleaseDate);
        System.out.println("Age Rating: " + showAgeRating);
        System.out.println("Start Time: " + showStartTime);
        System.out.println("Duration: " + showDuration + "\n");
    }
}
