final class Dog extends Animal {

    @Override
    void bear(String name) {
        this.name = name;
        System.out.printf("The dog %s was born\n", this.name);
    }

    @Override
    void die() {
        if (isName())
            System.out.printf("The dog %s has died\n", this.name);
    }

    void bark() {
        if (isName())
            System.out.printf("The dog %s barking...\n", this.name);
    }
}
