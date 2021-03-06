
/**
 * The TestInitialiser class is solely used for testing the program by
 * creating some object instances of the Consumer, Show, Venue and
 * Promotion classes with test data, which will save time with 
 * not having to re-enter test data manually each time an
 * object is made in BlueJ.
 *
 * @author Jason Huggins, Tyronne Bradburn
 * @version 13/01/2022
 */
public class TestInitialiser
{
    Consumer consumer1;
    Venue venue1;
    Show show1;
    Promotion promo1;
    
    /**
     * Constructor - initialises an object instance for the Consumer, Venue,
     * Show and Promotion classes.
     */
    public TestInitialiser()
    {
        consumer1 = new Consumer(1, "Mark ", "Wayne", "15-05-1989",
            "mw123@mail.com", "01763293782");
        venue1 = new Venue(1, "BCPA");
        show1 = new Show(1, "Mamma Mia", "Musical", "10-01-2022", 7, "12-00",
            60);
        promo1 = new Promotion(1, "Mamma Mia Promotion", "Test Promotion",
            "13-01-2022", "13-01-2022", venue1, 17.5);
    }
}
