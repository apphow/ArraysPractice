import java.util.Random;


public interface StarWarsInterfacePractice {
    public static Character summonCharacter() {
        Random rand = new Random();
        if(Math.abs(rand.nextInt()) % 2 == 0) {
    return new Enemy();
        } else{
    return new Hero();
        }

    }

    public static void main(String[] args) {

        Enemy darthVader = new Enemy();
        Hero lukeSkyWalker = new Hero();
        darthVader.attack();
        lukeSkyWalker.attack();
        darthVader.heal();
        lukeSkyWalker.heal();
        System.out.println("Enemy weapon: " +darthVader.getWeapon());
        System.out.println("Hero weapon: " + lukeSkyWalker.getWeapon());
        Character spy = summonCharacter();
        spy.attack();
        spy.heal();
    }
}
