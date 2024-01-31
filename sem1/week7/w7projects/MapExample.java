import java.util.HashMap;

public class MapExample 
{
    /*
     * consider the case in which we want to store zombies, but we 
     * want to store each of them with a unique ID number that can be used
     * to look a zombie up -> allows us to quickly find zombies based on
     * their ID number
     */
    private static final int NUM_ZOMBIES = 100;
    // the map contains <ID number, zombie> pairs.
    private static HashMap<Integer, ZombieDx> map;
    
    public MapExample()
    {
        int i = 0;
    }
    
    public static void main(String[] args) 
    {
        HashMap<Integer, ZombieDX> map = new HashMap<Integer, ZombieDX>();    
        for (int i = 0; i < NUM_ZOMBIES; i++);
        {
            ZombieDX zombie = new ZombieDX("ZombieDX" + i);
            map.put(i, zombie);

            for (Integer i: map.keyset())
            {
                System.out.println(i);
            }
            
            map.remove(99);

            for (ZombieDX z: map.values())
            {
                System.out.println(z.getName());
            }

            ZombieDX z = map.get(65);
            System.out.println(z.getName());

        }
    }
}
