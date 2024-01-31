
/**
 * This class provides the ability to simulate a number of
 * car objects racing around a race track. In particular,
 * it can determine which car is leading the race after
 * every lap.
 * 
 * @author King's College London
 * @version 1.0
 */
public class Race
{
    //the cars participating in the race
    private Car car1;
    private Car car2;
    private Car car3;
    private Car raceLeader;
    
    //the total amount of laps the race will last for
    private int numberOfLaps;

    /*
     * The number of seconds it takes for a car to complete a single lap
     * in this race, on average. Each race can have a different
     * averageLapTime, since races take place on different race tracks
     */
    private int averageLapTime;

    //this tracks information that can affect the time taken to complete
    //a single lap
    private boolean isRaining;

    /**
     * Constructor for objects of class Race
     */
    public Race(Car car1, Car car2, Car car3, int numberOfLaps,
    int averageLapTime, boolean isRaining)
    {
        this.car1 = car1;
        this.car2 = car2;
        this.car3 = car3;
        this.numberOfLaps = numberOfLaps;
        this.averageLapTime = averageLapTime;
        this.isRaining = isRaining;
    }

    public static void main(String[] args) 
    {
        Car car1 = new Car("Car1", 5, 50);
        Car car2 = new Car("Car2", 4, 90);
        Car car3 = new Car("Car3", 6, 80);
        
        Race race1 = new Race(car1, car2, car3, 4, 5, false);

        car1.setCurrentRace(race1);
        car2.setCurrentRace(race1);
        car3.setCurrentRace(race1);

        race1.simulateRace();


    }
    
    /**
     * Identifies which of the cars is leading the race,
     * which is the one with the lowest total time
     * taken in the race so far.
     * 
     * @return the car that is leading the race
     */
    public Car getRaceLeader()
    {
        //TASK: determine which car, out of the three
        //in the race, is the leader

        if (car1.getTotalTime() < (car2.getTotalTime() & car3.getTotalTime())) 
        {
            raceLeader = car1;
        }
        else if (car2.getTotalTime() < (car1.getTotalTime() & car3.getTotalTime())) 
        {
            raceLeader = car2;
        }
        else if (car3.getTotalTime() < (car1.getTotalTime() & car2.getTotalTime())) 
        {
            raceLeader = car3;
        }

        return raceLeader;
    }
    
    /**
     * Simulates the race by making each car complete
     * laps around the track for the amount of laps
     * specified in numberOfLaps.
     */
    public void simulateRace()
    {
        //TASK: look at the following line of code. Explain
        //what is wrong with it, but why the program compiles
        //successfully with this left in.
        //Now remove it, as it is not needed in this method
        //anyway, and make changes in the other classes 
        //to prevent the program from compiling if it was left in.
        
        
        //TASK: make the cars race numberOfLaps amount of times
        //After each lap, print:
        //-the single lap time of each car
        //-the total time of each car
        //-name of the car that is leading the race

        for (int i = 0; i < numberOfLaps; i++) 
        {
            int lap1 = car1.completeLap();
            int lap2 = car2.completeLap();
            int lap3 = car3.completeLap();

            System.out.println(car1.getName() + " lap time: " + lap1 + " | Total time: " + car1.getTotalTime());
            System.out.println(car2.getName() + " lap time: " + lap2 + " | Total time: " + car2.getTotalTime());
            System.out.println(car3.getName() + " lap time: " + lap3 + " | Total time: " + car3.getTotalTime());
            System.out.println("Race Leader: " + getRaceLeader().getName());
            System.out.println();
            
        }

        
        
    }
    
    public int getAverageLapTime()
    {
        return averageLapTime;
    }
    
    public boolean getIsRaining()
    {
        return isRaining;
    }
}
