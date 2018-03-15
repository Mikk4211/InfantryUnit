public class HumanInfantryFactory {

    public InfantryUnit createUnit(int techLevel){
        if (techLevel == 1){
            return new Spearthrower();
        }
        if (techLevel == 2){
            return new Archer();
        }
        if (techLevel == 3) {
            return new CrossbowMan();
        }
        if (techLevel == 4) {
            return new Musketeer();
        }
        else {
            return new Rockhauler();
        }
    }
}
