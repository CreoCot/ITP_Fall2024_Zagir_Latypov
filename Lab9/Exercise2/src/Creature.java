import java.util.Objects;

abstract class Creature {
    String name = null;
    boolean isAlive = false;

    abstract void bear(String name);

    abstract void die();

    void shoutName() {
        if (isName())
            System.out.println(this.name);
    }

    boolean isName() {
        if (this.name == null) {
            System.out.println("ERROR: creature wasn't born");
            return false;
        }

        return true;
    }
}
