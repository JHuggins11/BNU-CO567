import java.time.LocalDate;

/**
 * The Person abstract class stores the basic details for each person 
 * registered in the online ticketing system, including their name, 
 * date of birth, email address and contact number. This also 
 * acts as the superclass for the Consumer, Agent and 
 * VenueManager classes.
 *
 * @author Jason Huggins
 * @version 06/01/2022
 */
public abstract class Person
{
    int personID;
    String firstName;
    String lastName;
    LocalDate dateOfBirth;
    String emailAddress;
    String contactNo;
    
    /**
     * Constructor for objects of class Person
     */
    public Person(int id, String firstName, String lastName, LocalDate dob, String email,
        String contactNo)
    {
        personID = id;
        this.firstName = firstName;
        this.lastName = lastName;
        dateOfBirth = dob;
        emailAddress = email;
        this.contactNo = contactNo;
    }
    
    public String getName()
    {
        return firstName + " " + lastName;
    }
    
    public void changeName(String newFirstName, String newLastName) 
    {
        firstName = newFirstName;
        lastName = newLastName;
    }
    
    public void changeEmail(String newEmail)
    {
        emailAddress = newEmail;
    }
    
    public void changeContactNo(String newContactNo)
    {
        contactNo = newContactNo;
    }
}
