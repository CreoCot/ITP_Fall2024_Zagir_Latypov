class Alien extends Creature {
    @Override
    void bear(String name) {
        this.name = name;
        System.out.printf("The alien %s was born\n", name);
    }

    @Override
    void die() {
        if (isName())
            System.out.printf("The alien %s has died\n", name);
    }
}
