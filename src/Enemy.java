public class Enemy implements Character{

    public String weapon = "lightsaber";

    public Enemy(){

    }

    public String getWeapon() {
        return weapon;
    }

    @Override
    public void attack() {
        System.out.println("The enemy attacks YOU");

    }

    @Override
    public void heal() {
        System.out.println("The enemy heal's himself");

    }
}
