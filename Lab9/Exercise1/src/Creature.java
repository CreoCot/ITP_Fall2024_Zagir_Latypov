import java.util.Objects;

abstract class Creature {
    String name = null;
    boolean isAlive = false;

    void bear(String name) {
        this.name = name;
        System.out.println(getClass() + " " + name + " was b      orn");
    }

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
