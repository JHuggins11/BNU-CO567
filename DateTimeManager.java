import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.*;

/**
 * The DateTimeManager class handles user input of dates and times, retrieving it as
 * a string, formatting into the DD/MM/YYYY date format and parsing it into a LocalDate.
 *
 * @author Jason Huggins
 * @version 09/01/2022
 */
public class DateTimeManager
{
    /**
     * Gets a string input from the user for a date in DD/MM/YYYY format, which is then
     * formatted and parsed into a LocalDate with that date format. 
     */
    public static LocalDate getDateInput(String input)
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("DD/MM/YYYY");
        LocalDate formattedDate = LocalDate.parse(input, formatter); 
        
        return formattedDate;
    }
    
    /**
     * Gets a string input from the user for a time in HH:MM format, which is then
     * formatted and parsed into a LocalTime with that time format. 
     */
    public static LocalTime getTimeInput(String input)
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:MM");
        LocalTime formattedTime = LocalTime.parse(input, formatter);
        
        return formattedTime;
    }
}
