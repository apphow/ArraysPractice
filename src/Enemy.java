public class Enemy implements Character{

    public String weapon = "lightsaber";

    public Enemy(){}

    @Override
    public void attack() {
        System.out.println("The enemy attacks YOU");

    }

    @Override
    public void heal() {
        System.out.println("The enemy heal's himself");

    }
}
