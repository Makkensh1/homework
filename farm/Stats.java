package farm;

public class Stats {
    protected String name;
    protected int weight;
    protected int speed;

    public String getName() {
        return name;
    }


    public int getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public void setWeight(int weight) {
        if (weight != 0) {
            this.weight = weight;
        }
    }

    public void setSpeed(int speed) {
        if (speed != 0) {
            this.speed = speed;
        }
    }

    public Stats(String name, int weight, int speed) {
        this.name = name;
        this.weight = weight;
        this.speed = speed;
            }
}

