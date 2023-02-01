
/**
 * Creating a program to take a customer order and compute the price of the
 * desk.
 *
 * @author Eric Wallace
 * @version 1/25/2023
 */
public class Desk
{
    // instance variables - replace the example below with your own
    private int orderNumber;
    private String customerName;
    private double length;
    private double width;
    private String woodType;
    private int numberOfDrawers;

    /**
     * Constructor for objects of class Desk
     */
    public Desk(int orderNumber, String customerName, double length, double width,String woodType, int numberOfDrawers)
    {
        this.orderNumber = orderNumber;
        this.customerName = customerName;
        this.length = length;
        this.width = width;
        this.woodType = woodType;
        this.numberOfDrawers = numberOfDrawers;
    }

    /**
     * A mutator method to calculate the total cost of the desk.
     *
     * @param  Parameters are the length, width, woodType, and numberOfDrawers.
     * @return    Returning the total price of the desk.
     */
    public double calculatePrice()
    {
        double price = 200;
        double surface = length * width;
        if (surface > 750) {
            price +=50;
        }
        if (woodType.contains("mahogany")) {
            price += 150;
        } else if (woodType.contains("oak")) {
            price += 125;
        }
        price += (numberOfDrawers * 30);
        return price;
    }
    
    public void displayOrderDetails() {
        System.out.println("Order Number: " + orderNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Wood Type: " + woodType);
        System.out.println("Number of drawers: " + numberOfDrawers);
        System.out.println("Total price: $" + calculatePrice());
    }
}
