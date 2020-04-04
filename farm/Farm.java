package farm;

public class Farm {

    public void passDay() {
        Farmer farmer = new Farmer(0);
        farmer = farmer.getFarmer();
        FarmPets[] pets = FarmPets.getFarmPets();
        WildPet[] wildPet1 = WildPet.getWildPet();
        while (farmer.farmerResPool > 0) {
            farmer.farmerResPool -= 2;
            int curretFarmerResPool = farmer.farmerResPool;
            int wildPetPos = (int) (Math.random() * 3);
            int farmPetPos = (int) (Math.random() * 4);
            if (wildPet1[wildPetPos].getSpeed() > pets[farmPetPos].getSpeed()) {
                pets[farmPetPos].currentHitPoints -= wildPet1[wildPetPos].getDamage();
                if (true == farmer.driveOff()) {
                    pets[farmPetPos].currentHitPoints += (wildPet1[wildPetPos].getDamage() / 2);
                }
            }
            for (FarmPets a : pets) {
                farmer.feed(a);
            }
            for (FarmPets b : pets) {
                if (b.resPool > 0 && b.currentHitPoints > 0 ) {
                    farmer.farmerResPool += 2;
                } else if (farmer.farmerResPool == curretFarmerResPool &&b.currentHitPoints > 0 && b.canBeEatenByFarmer == true) {
                    farmer.farmerResPool += b.weight;
                    b.currentHitPoints = 0;
                    break;
                }
            }
            System.out.println(farmer.farmerResPool);
        }
        if (farmer.farmerResPool < 0) System.out.println("Game over");

    }
}





