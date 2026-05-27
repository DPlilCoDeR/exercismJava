
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        return this.birdsPerDay[this.birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        int today = this.getToday();

        this.birdsPerDay[this.birdsPerDay.length - 1] = ++today;

    }

    public boolean hasDayWithoutBirds() {
        boolean dayNoBirds = false;

        for(int birds : this.birdsPerDay){
            if(birds == 0){
                dayNoBirds = true;
            }
        }
        
        return dayNoBirds;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        if(numberOfDays > this.birdsPerDay.length){
            for(int birds : this.birdsPerDay){
                count += birds;
            }
        } else {
            for(int i = 0; i < numberOfDays; i++){
                count += this.birdsPerDay[i];
            }
        }
        
        return count;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for(int i = 0; i < this.birdsPerDay.length; i++){
            if(this.birdsPerDay[i] >= 5){
                busyDays++;                
            }
        }
        return busyDays;
    }
}
