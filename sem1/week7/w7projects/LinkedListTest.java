import java.util.LinkedList;

public class LinkedListTest 
{
    public static LinkedList<String> beatles = new LinkedList<String>();

    public static void main(String[] args) 
    {
        LinkedListTest test1 = new LinkedListTest();
        test1.printList();
    }

    public LinkedListTest()
    {
        String s1 = "John Lennon";
        String s2 = "Paul McCartney";
        String s3 = "George Harrison";
        String s4 = "Pete Best";

        beatles.add(s1);
        beatles.add(s2);
        beatles.add(s3);
        beatles.add(s4);

        beatles.removeLast();
        beatles.addFirst("Ringo Starr");
    }

    public void printList()
    {
        for (String s: beatles)
        {
            System.out.println(s);
        }
    }


 

}
