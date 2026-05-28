class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar>{
    private int units;
    private int victories = 0;
    
    public void drive() {
        this.units += 10;
    }

    public int getDistanceTravelled() {
        return this.units;
    }

    public int getNumberOfVictories() {
        return this.victories;    
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.victories = numberOfVictories;
    }

    public int compareTo(ProductionRemoteControlCar car){
        return car.getNumberOfVictories() - this.getNumberOfVictories();
    }
}
