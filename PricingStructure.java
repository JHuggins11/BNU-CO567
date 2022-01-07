
/**
 * Enumeration class PricingStructure - stores the ticket prices for shows based on
 * four categories (adult, child, student, senior citizen). These prices will be 
 * adjusted during promotions and a discount is applied to them.
 *
 * @author Jason Huggins
 * @version 06/01/2022
 */
public enum PricingStructure
{
    // Example prices, subject to change.
    ADULT_PRICE(5.00),
    CHILD_PRICE(3.70),
    STUDENT_PRICE(4.00),
    SENIOR_PRICE(3.90);
    
    // Private attribute to get each ticket price.
    private double price;
    
    /**
     * Constructor of enum PricingStructure
     */
    PricingStructure(double price)
    {
        this.price = price;
    }
    
    public double getPrice()
    {
        return this.price;
    }
}
