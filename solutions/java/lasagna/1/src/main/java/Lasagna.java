public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        int minutes = 40;   
        return minutes;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minutesRemaining){
        return this.expectedMinutesInOven() - minutesRemaining;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers){
        int prepTime = 2;
        return layers * prepTime;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int time){
        return time + this.preparationTimeInMinutes(layers);
    }
}
