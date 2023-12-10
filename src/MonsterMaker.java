import java.util.Scanner;

public class MonsterMaker {
    public static void main(String[] args) throws IllegalAccessException {
        Scanner input  = new Scanner(System.in);

        Monster parent1 = makeMonster(input, "Parent 1 : ");
        Monster parent2 = makeMonster(input, "Parent 2 : ");
        Monster baby = Monster.makeBabyMonster(parent1, parent2);
        System.out.println("Traits of monster 1 : ");
        parent1.print();
        System.out.println("Traits of monster 2 : ");
        parent2.print();
        System.out.println("Traits of baby monster");
        baby.print();
    }

    private static Monster makeMonster(Scanner input, String name) {
        System.out.println("Enter details for " + name );
        Monster monster = new Monster();
        System.out.println("Enter the eye color ");
        monster.eyeColor = input.nextLine();
        System.out.println("Enter the feather type ");
        monster.featherType = input.nextLine();
        System.out.println("Enter the size of monster : ");
        monster.size = input.nextLine();
        System.out.println("Enter the strenght :  ");
        monster.strength = input.nextLine();
        System.out.println("Enter the aggression Level :  ");
        monster.aggressionLevel = input.nextLine();
        return monster;

    }
}
