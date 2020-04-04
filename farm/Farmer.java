package farm;

public class Farmer implements CanFeed {

    int farmerResPool;

    public boolean driveOff() {
        int trueFalse = (int) (Math.random() * 2);
        boolean farmerLuck;
        if (trueFalse == 1) {
            farmerLuck = true;
        } else farmerLuck = false;
        return farmerLuck;
    }

    public Farmer(int farmerResPool) {
        this.farmerResPool = farmerResPool;
    }

    public Farmer getFarmer() {
        Farmer ivan = new Farmer(5);
        return ivan;
    }

    @Override
    public void feed(CanEat eat) {
        eat.rest();
    }
}

