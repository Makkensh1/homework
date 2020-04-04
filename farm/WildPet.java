package farm;

public class WildPet extends Stats {
    int damage;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        if (damage > 0) {
            this.damage = damage;
        }
    }

    public WildPet(String name, int weight, int speed, int damage) {
        super(name, weight, speed);
        this.damage = damage;
    }

    public static WildPet[] getWildPet() {
        WildPet wolf = new WildPet("wolf", 40, 40, 15);
        WildPet bear = new WildPet("bear", 80, 25, 40);
        WildPet fox = new WildPet("fox", 25, 35, 10);

        WildPet[] wildPets = new WildPet[]{wolf, bear, fox};
        return wildPets;
    }
}
