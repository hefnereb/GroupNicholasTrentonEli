import java.util.Random;

/**
 * An implementation of the abstract class.
 * 
 * @author Nicholas Olson
 * @version 2024-08-19
 */
public class MyClassB extends MyAbstractClass
{
    /**
     * A random number generator used to produce the message.
     */
    private Random rand = null;

    /**
     * Constructs the class with a new random number generator (no parameters).
     */
    public MyClassB()
    {
        rand = new Random();
    }

    /**
     * Provides a message that contains a random number.
     * 
     * @return the message.
     */
    public String getMessage()
    {
        int randInt = rand.nextInt();
        return "Hello from class B! Here's a random integer: " + randInt;
    }
}
