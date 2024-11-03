import java.util.ArrayList;

public class AbstractClassDemonstration {
    public static void main(String[] args) {
        ArrayList<Creature> creatures = new ArrayList<>();
        String[] names = {"Thomas", "Mark", "Clark"};
        creatures.add(new Dog());
        creatures.add(new Human());
        creatures.add(new Alien());

        for (int index = 0; index < creatures.size(); index++) {
            Creature currentCreature = creatures.get(index);

            if (index == 1)
                currentCreature.die();

            currentCreature.bear(names[index]);
            currentCreature.die();

            System.out.println();
        }
    }
}
