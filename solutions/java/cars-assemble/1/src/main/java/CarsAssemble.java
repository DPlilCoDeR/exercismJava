public class CarsAssemble {
    final int STANDARD_PRODUCTION = 221;
    
    public double productionRatePerHour(int speed) {
        double production = STANDARD_PRODUCTION * speed;
        if (speed <= 4 && speed >= 1){
            return production;    
        } else if (speed <= 8 && speed >= 5){
            return production * 0.9;   
        } else if (speed == 9){
            return production * 0.8;
        } else {
            return production * 0.77;
        }
        
    }

    public int workingItemsPerMinute(int speed) {
        return (int) this.productionRatePerHour(speed)/60;
    }
}
