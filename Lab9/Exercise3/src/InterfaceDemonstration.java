public class InterfaceDemonstration {
    public static void main(String[] args) {
        Penguin penguin = new Penguin();
        penguin.swim();
        penguin.swim();
        penguin.stopSwimming();
        penguin.live();

        Submarine submarine = new Submarine();
        submarine.swim();
        submarine.swim();
        submarine.stopSwimming();
        submarine.stopSwimming();

        Duck duck = new Duck();
        duck.fly();
        duck.swim();
        duck.stopFlying();
        duck.stopSwimming();
        duck.fly();
        duck.live();
    }
}
