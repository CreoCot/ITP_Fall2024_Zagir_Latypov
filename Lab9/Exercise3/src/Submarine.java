class Submarine implements ISwimmable {
    boolean isSwimming = false;

    @Override
    public void swim() {
        if (!isSwimming) {
            this.isSwimming = true;
            System.out.println("Submarine swims...");
            return;
        }

        System.out.println("Submarine swimming already");
    }

    @Override
    public void stopSwimming() {
        if (isSwimming) {
            this.isSwimming = false;
            return;
        }

        System.out.println("Submarine not swimming already");
    }
}
