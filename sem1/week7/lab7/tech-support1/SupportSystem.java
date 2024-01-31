import java.util.HashSet;

/**
 * This class implements a technical support system. It is the top level class 
 * in this project. The support system communicates via text input/output 
 * in the text terminal.
 * 
 * This class uses an object of class InputReader to read input from the user,
 * and an object of class Responder to generate responses. It contains a loop
 * that repeatedly reads input and generates output until the users wants to 
 * leave.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
public class SupportSystem
{

    private InputReader reader;
    private Responder responder;
    
    public static void main(String[] args) {
        SupportSystem supportSystem1 = new SupportSystem();
        supportSystem1.start();
    }

    /**
     * Creates a technical support system.
     */
    public SupportSystem()
    {
        reader = new InputReader();
        responder = new Responder();
    }

    /**
     * Start the technical support system. This will print a welcome
     * message and enter into a dialog with the user, until the user
     * ends the dialog.
     */
    public void start()
    {
        boolean finished = false;

        printWelcome();

        while(!finished) {
            String input = reader.getInput();
            input = input.trim();
            input = input.toLowerCase();

            String[] listOfWords = input.split(" ");
            HashSet<String> repeatInputs = new HashSet<String>();
            
            for (String word : listOfWords) {
                repeatInputs.add(word);
            }
            
            String newInput = "";
            for( String uniqueWord : repeatInputs) {
                newInput += uniqueWord + " ";
                newInput.trim();
            }
            System.out.println(newInput);

            if(input.equalsIgnoreCase("bye")) {
                finished = true;
            }
            else {
                String response = responder.generateResponse(input);
                System.out.println(response);
            }
        }

        printGoodbye();
    }

    /**
     * Print a welcome message to the screen.
     */
    private void printWelcome()
    {
        System.out.println("I finished this labsheet at 8.30am in the morning");
        System.out.println();
        System.out.println("I haven't slept at all and I'm fucking hungry");
        System.out.println("I hope this lil thing will keep you entertained for a good few moments while I rot in my corner.");
        System.out.println("Pls if u wanna stop using this thing just say bye cuz this thing needs that keyword to like shut down.");
        System.out.println("Anyway, yeah, have fun ig babai");
    }

    /**
     * Print a good-bye message to the screen.
     */
    private void printGoodbye()
    {
        System.out.println("that was nice while it lasted byeeeee <33");
    }
}
