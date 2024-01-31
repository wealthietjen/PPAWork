import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
public class Responder
{
    ArrayList<String> responses = new ArrayList<String>(); 
    HashMap<String, String> relatedResponse = new HashMap<String, String>();
    HashMap<String, Integer> keyCount = new HashMap<String, Integer>();
    

    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        responses.add("slay");
        responses.add("so true");
        responses.add("that's so haha funny of you");
        responses.add("smash");
        responses.add("me personally i would not take that");
    
        relatedResponse.put("cat", "dont you mean, the best pet ever");
        relatedResponse.put("mochi", "mango mochi it's been a longass while");
        relatedResponse.put("given", "oh so you're mentally ill");
        relatedResponse.put("hinge", "quite literally one of the biggest mistakes of ur life");
        relatedResponse.put("werk", "werkwerkwerkwerkwerkwerk");
        relatedResponse.put("slow", "bitch");

        for (String keyword : relatedResponse.keySet()) {
            keyCount.put(keyword, 0);
        }

        
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(String input)
    {

        for(String key : relatedResponse.keySet())
        {
            if(input.contentEquals(key)) 
            {
                int currentValue = keyCount.get(key);
                keyCount.put(key, currentValue+1);
                System.out.println(keyCount.get(key));
                return relatedResponse.get(key);
            
            }

        }

        Random rand = new Random();
        int randomResponse = rand.nextInt(responses.size());
        return responses.get(randomResponse);
    }
}
