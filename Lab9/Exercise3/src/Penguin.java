public class Penguin implements ILiving, ISwimmable{
    boolean isSwimming = false;

    @Override
    public void swim() {
        if (!isSwimming) {
            this.isSwimming = true;
            System.out.println("Penguin swims...");
            return;
        }

        System.out.println("Penguin swimming already");
    }

    @Override
    public void stopSwimming() {
        if (isSwimming) {
            this.isSwimming = false;
            System.out.println("Penguin do not swim anymore");
            return;
        }

        System.out.println("Penguin not swimming already");
    }

    @Override
    public void live() {
        ILiving.super.live();
    }
}
