class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior class
class Warrior extends Fighter{

    @Override
    public boolean isVulnerable(){
        return false;
    }

    @Override
    public int getDamagePoints(Fighter fighter){
       if(fighter.isVulnerable()){
           return 10;
       }
        return 6;
        
    }

    @Override
    public String toString(){
        return "Fighter is a Warrior";
    }
}

// TODO: define the Wizard class
class Wizard extends Fighter{
    private boolean vulnerable;

    public Wizard(){
        this.vulnerable = true;
    }
    
    @Override
    public String toString(){
        return "Fighter is a Wizard";
    }

    public boolean isVulnerable(){
        return this.vulnerable;
    }

    private void prepareSpell(){
        if(this.vulnerable == true){
            this.vulnerable = false;
        }
    }

     @Override
    public int getDamagePoints(Fighter fighter){
       if(this.vulnerable == true){
           return 3;
       }
        return 12;
        
    }
}