import java.util.ArrayList;

/*
 * all of the primitive types in java have an equivalent reference type.
 * the program below demonstrates thie with the Integer class
 * 
 * despite the elements of the ArrayList being ref types, they behave exactly
 * like primitive types 
 * + also have a lot of additional functionality
 */

public class ArrayListPrimitiveInt 
{
    private static final int NUM_VALUES = 10;
    private static ArrayList<Integer> values = new ArrayList<Integer>();   
    
    public static void main(String[] args) 
    {
        for (int i = 0; i < NUM_VALUES; i++)
        {
            values.add(i+1);
        }    
        int sum = 0;
        for (Integer i: values)
        {
            sum += i;
        }

        System.out.println(sum);
        int temp = values.get(2) + values.get(5);
        System.out.println(temp);
    } 
}
