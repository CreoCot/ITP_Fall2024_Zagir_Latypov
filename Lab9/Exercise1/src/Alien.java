class Alien extends Creature {
    @Override
    void die() {
        if (isName())
            System.out.printf("The alien %s has died\n", name);
    }
}
