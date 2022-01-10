import java.time.LocalDate;

/**
 * The Consumer class inherits the attributes and methods from the Person 
 * abstract class.
 *
 * @author Jason Huggins
 * @version 10/01/2022
 */
public class Consumer extends Person
{
    /**
     * Constructor for objects of class Consumer
     */
    public Consumer(int id, String firstName, String lastName, String dob, String email,
        String contactNo)
    {
        super(id, firstName, lastName, dob, email, contactNo);
    }
}
