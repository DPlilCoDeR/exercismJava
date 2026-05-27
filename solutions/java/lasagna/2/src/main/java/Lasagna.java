public class Lasagna {
    
    public int expectedMinutesInOven(){
        int minutes = 40;   
        return minutes;
    }

    public int remainingMinutesInOven(int minutesRemaining){
        return this.expectedMinutesInOven() - minutesRemaining;
    }

    public int preparationTimeInMinutes(int layers){
        int prepTime = 2;
        return layers * prepTime;
    }

    public int totalTimeInMinutes(int layers, int time){
        return time + this.preparationTimeInMinutes(layers);
    }
}
