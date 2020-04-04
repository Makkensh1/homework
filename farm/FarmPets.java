package farm;

public class FarmPets extends Stats implements CanEat {

    int maxHitPoints;
    int resPool;
    int currentHitPoints;
    boolean canBeEatenByFarmer;

    public int getMaxHitPoints() {
        return maxHitPoints;
    }

    public boolean isCanBeEatenByFarmer() {
        return canBeEatenByFarmer;
    }

    public int getResPool() {
        return resPool;
    }

    public int getCurrentHitPoints() {
        return currentHitPoints;
    }

    public void setMaxHitPoints(int maxHitPoints) {
        if (maxHitPoints > 0) {
            this.maxHitPoints = maxHitPoints;
        }
    }

    public void setResPool(int resPool) {
        if (resPool >= 0) {
            this.resPool = resPool;
        }
    }

    public void setCurrentHitPoints(int currentHitPoints) {
        this.currentHitPoints = currentHitPoints;
    }

    public void setCanBeEatenByFarmer(boolean canBeEatenByFarmer) {
        this.canBeEatenByFarmer = canBeEatenByFarmer;
    }

    public FarmPets(String name, int weight, int speed, int MaxHitPoints, int resPool, int currentHitPoints, boolean canBeEatenByFarmer) {
        super(name, weight, speed);
        this.maxHitPoints = MaxHitPoints;
        this.currentHitPoints = MaxHitPoints;
        this.resPool = resPool;
        this.canBeEatenByFarmer = canBeEatenByFarmer;
    }

    public static FarmPets[] getFarmPets() {
        FarmPets cow = new FarmPets("cow", 80, 20, 35, 10, 0, true);
        FarmPets cat = new FarmPets("cat", 10, 45, 15, 0, 0, false);
        FarmPets rabbit = new FarmPets("rabbit", 10, 30, 15, 0, 0, true);
        FarmPets chicken = new FarmPets("chicken", 5, 30, 5, 5, 0, true);

        FarmPets[] farmPets = new FarmPets[]{cow, cat, rabbit, chicken};
        return farmPets;
    }

    @Override
    public void rest() {
        if (currentHitPoints < maxHitPoints && currentHitPoints > 0) {
            currentHitPoints += 1;
        }
    }
}

