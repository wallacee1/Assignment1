
/**
 * Program to simulate a heater with settings to increment temperatures.
 *
 * @author Eric Wallace
 * @version 1/25/2023
 */
public class Heater
{
    // instance variables - replace the example below with your own
    private double temperature;
    private double min;
    private double max;
    private double increment;

    /**
     * Constructor for objects of class Heater setting the default temp
     * at 15 degrees. Also setting the min, max, and incrementn to the parameters
     * entered.
     */
    public Heater(double min, double max, double increment)
    {
        temperature = 15.0;
        this.min = min;
        this.max = max;
        this.increment = increment;
    }

    /**
     * Mutator to increase the temperature.
     *
     */
    public void warmer()
    {
        if(temperature + increment <= max){
            temperature += increment;
        }
    }
    
    /**
     * Mutator to decrease the temperature.
     *
     */
    public void cooler()
    {
        if(temperature + increment >= min){
            temperature -= increment;
        }
    }
    
    /**
     * Accessor to return the current temperature.
     *
     */
    public double getTemperature()
    {
        return temperature;
    }
    
    /**
     * Mutator to set the incrementation.
     */
    public void setIncrememnt(double increment)
    {
        if(increment > 0){
            this.increment = increment;
        }
        else{
            System.out.println("Increment cannot be set to a negative number.");
        }
    }
}
