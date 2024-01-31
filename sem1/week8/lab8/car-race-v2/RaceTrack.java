public class RaceTrack 
{
    /*
     * The number of seconds it takes for a car to complete a single lap
     * in this race, on average. Each race can have a different
     * averageLapTime, since races take place on different race tracks
     */
    private int averageLapTime;
    
    //this tracks information that can affect the time taken to complete
    //a single lap
    private boolean isRaining;

    public int getAverageLapTime()
    {
        return averageLapTime;
    }

    public void setAverageLapTime(int averageLapTime)
    {
        this.averageLapTime = averageLapTime;
    }
        
    public boolean getIsRaining()
    {
        return isRaining;
    }

    public void setIsRaining(boolean isRaining)
    {
        this.isRaining = isRaining;
    }
}