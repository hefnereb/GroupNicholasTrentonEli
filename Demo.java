package;

import java.util.Scanner;

/**
 * A demo of this project.
 * 
 * Classes are selected by entering prompts via the keyboard. The prompts
 * themselves are case-insensitive.
 * 
 * Internally, all prompts are lowercase (so that only the input needs to be
 * converted to a case).
 * 
 * @author Nicholas Olson
 * @version 2024-08-14
 */
public class Demo
{
    /**
     * The prompt, without formatting applied.
     * 
     * There are two values: the value for class A, and the value for class B.
     * 
     * The prompt does not need to be printed with a newline.
     */
    private static final String PROMPT_PATTERN = "Select a class (%s/%s): ";

    /**
     * The prompt that is provided to select class A.
     * 
     * Note that prompts are case-insensitive.
     */
    private static final String PROMPT_VALUE_CLASS_A = "a";

    /**
     * The prompt that is provided to select class A.
     * 
     * Note that prompts are case-insensitive.
     */
    private static final String PROMPT_VALUE_CLASS_B = "b";

    /**
     * An error message that is printed when an unrecognized input is provided.
     * 
     * This message should be printed with a newline.
     */
    private static final String PROMPT_ERROR_UNRECOGNIZED = "Um... try again.";

    /**
     * The selected class, or null if no class has been selected.
     */
    private static MyAbstractClass selectedClass = null;

    /**
     * Runs the demo.
     * 
     * @param args the command line arguments. These are ignored.
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        while (selectedClass == null)
        {
            String promptValue = null;
            
            System.out.print(String.format(PROMPT_PATTERN, PROMPT_VALUE_CLASS_A, PROMPT_VALUE_CLASS_B));
            promptValue = input.nextLine();

            switch (promptValue)
            {
                case PROMPT_VALUE_CLASS_A:
                    selectedClass = new MyClassA();
                    break;
                case PROMPT_VALUE_CLASS_A:
                    selectedClass = new MyClassB();
                    break;
                default:
                    System.out.println(PROMPT_ERROR_UNRECOGNIZED);
                    break;
            }
        }

        System.out.println(selectedClass.getMessage());
        input.close();
    }
}