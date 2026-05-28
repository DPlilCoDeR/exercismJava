class NeedForSpeed {
    private int speed;
    private int battery;
    private int batteryDrain;
    private int distanceDriven;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.distanceDriven = 0;
        this.battery = 100;
    }

    public boolean batteryDrained() {
        boolean drained = (this.battery < this.batteryDrain) ? true : false;
        return drained;
    }

    public int distanceDriven() {
        return this.distanceDriven;
    }

    public void drive() {
        if(!this.batteryDrained()){
            this.distanceDriven += speed;   
            this.battery -= batteryDrain;
        }
        
    }

    public static NeedForSpeed nitro() {
        int speed = 50, drain = 4;
        NeedForSpeed nitro = new NeedForSpeed(speed, drain);
        return nitro;
    }
}

class RaceTrack {
    private int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        
        while(car.batteryDrained() == false){
            car.drive();
        }
        
        return car.distanceDriven() >= this.distance;
        
    }
    
}
