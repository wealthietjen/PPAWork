/**
 * Maintain details of a mobile phone contract in terms of
 * the rate charged for phone calls.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2017.10.15
 */
public class PhoneContract
{
    // The number for this contract.
    private String phoneNumber;
    // How calls are charged.
    private PhoneRate tariff;
    // The billing amount (in cents) for this contract.
    private int bill;
    private int totalDuration;
    private PhoneRate cheapTariff;
    private int totalCalls;
    private int originalRate;
    private int cheaperRate;

    /**
     * Constructor for objects of class PhoneContract.
     * @param phoneNumber The number of this contract.
     */
    public PhoneContract(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
        tariff = new PhoneRate(5, 10);
        cheapTariff = new PhoneRate(4, 8);
        bill = 0;
        totalDuration = 0;
        totalCalls = 0;
        originalRate  = 0;
        cheaperRate = 0;
    }

    /**
     * Calculate the cost of a call of the given duration.
     * @param duration The length of the call in seconds.
     */
    public void makeCall(int duration)
    {
        int cost;
        totalDuration = totalDuration + duration;
        totalCalls = totalCalls + 1;
        if (duration == 0) 
        {
            cost = 0;
        }

        if (totalDuration >= 3600) 
        {
            cost = cheapTariff.calculateCost(duration);
            cheaperRate = cheaperRate + 1;
        }
        else 
        {
            cost = tariff.calculateCost(duration);
            originalRate = originalRate + 1;
        }
        bill = bill + cost;
        System.out.println(phoneNumber + ": The call lasting " +
                           duration + " seconds costs " + cost +
                           " cents.");
        
    }
    
    /**
     * Return the current bill, in cents.
     * @return The current bill.
     */
    public int getBill()
    {
        return bill;
    }

    public int getTotalDuration()
    {
        return totalDuration;
    }

    public void printBill()
    {
        System.out.println(phoneNumber + ", " + totalCalls + ", " + totalDuration + ", " + bill);
        System.out.println("average call duration: " + totalDuration / totalCalls);
        System.out.println("number of calls charged at original rate: " + originalRate);
        System.out.println("number of calls charged at cheaper rate: " + cheaperRate);
    }
}
