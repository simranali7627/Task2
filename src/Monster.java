import java.lang.reflect.Field;
import java.util.Random;

enum EYECOLOR{
    RED,
    GREEN,
    BLUE
}

//enum FEATHERTYPE{
//
//}

public class Monster {
    String eyeColor;
    String featherType;
    String size;
    String strength;
    String aggressionLevel;

    Monster(){
        this.eyeColor = String.valueOf(EYECOLOR.RED);
        this.featherType = "";
        this.size = "";
        this.strength = "";
        this.aggressionLevel = "";

    }
    public void print(){
        System.out.println("Traits of the monster are : ");;


        System.out.println("Eye Color " + this.eyeColor);
        System.out.println("Feather Type " + this.featherType);
        System.out.println("Size " + this.size);
        System.out.println("Strength  " + this.strength);
        System.out.println("Aggression Level " + this.aggressionLevel);

    }

    public static Monster makeBabyMonster(Monster parent1, Monster parent2) throws IllegalAccessException {
        Monster baby = new Monster();
        Field[] fields = Monster.class.getDeclaredFields();
        Random rand = new Random();
        for(Field f : fields){
            f.setAccessible(true);
            if(rand.nextBoolean()){
                f.set(baby, f.get(parent1));
            }
            else{
                f.set(baby, f.get(parent2));
            }

        }
        return baby;
    }
}
