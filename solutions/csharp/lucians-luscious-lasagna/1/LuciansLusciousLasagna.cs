class Lasagna
{
    public int ExpectedMinutesInOven()
    {
        return 40;
    }

    public int RemainingMinutesInOven(int inTheOven)
    {
        return this.ExpectedMinutesInOven() - inTheOven;    
    }

    public int PreparationTimeInMinutes(int layers)
    {
        return layers * 2;
    }

    public int ElapsedTimeInMinutes(int layers, int minutesInOven){
        return this.PreparationTimeInMinutes(layers) + minutesInOven;
    }
}
