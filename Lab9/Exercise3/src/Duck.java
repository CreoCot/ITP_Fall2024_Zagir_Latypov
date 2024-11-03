class Duck implements ILiving, IFlyable, ISwimmable {
    boolean isFlying = false;
    boolean isSwimming = false;

    @Override
    public void fly() {
        if (isSwimming) {
            System.out.println("Duck swimming, it cannot fly");
            return;
        }
        else if (isFlying) {
            System.out.println("Duck already flying");
            return;
        }

        isFlying = true;
        System.out.println("Duck flies...");
    }

    @Override
    public void stopFlying() {
        if (isFlying) {
            isFlying = false;
            return;
        }

        System.out.println("Duck not flying already");
    }

    @Override
    public void live() {
        System.out.println("Duck lives");
    }

    @Override
    public void swim() {
        if (isFlying) {
            System.out.println("Duck flying, it cannot swim");
            return;
        }
        else if (isSwimming) {
            System.out.println("Duck already swimming");
            return;
        }

        isFlying = true;
        System.out.println("Duck swims...");
    }

    @Override
    public void stopSwimming() {
        if (!isSwimming) {
            System.out.println("Duck not swimming already");
            return;
        }

        isSwimming = false;
        System.out.println("Duck do not swim anymore");
    }
}
