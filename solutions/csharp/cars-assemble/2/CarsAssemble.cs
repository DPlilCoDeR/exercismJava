static class AssemblyLine
{
    public static double SuccessRate(int speed)
    {
        if(speed >= 10)
        {
            return 0.77;
        } else if(speed == 9)
        {
            return 0.8;
        } else if(speed <= 8 && speed >= 5)
        {
            return 0.9; 
        } else if(speed <= 4 && speed >= 1)
        {
            return 1;
        } else
        {
            return 0;
        }
    }
    
    public static double ProductionRatePerHour(int speed) => (221 * speed) * SuccessRate(speed);
    

    public static int WorkingItemsPerMinute(int speed) => (int)ProductionRatePerHour(speed) / 60;
    
}
