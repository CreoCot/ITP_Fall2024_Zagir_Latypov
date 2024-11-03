final class Human extends Animal {

    @Override
    void bear(String name) {
        this.name = name;
        System.out.printf("The human %s was born\n", this.name);
    }

    @Override
    void die() {
        if (isName())
            System.out.printf("The human %s has died\n", this.name);
    }
}
