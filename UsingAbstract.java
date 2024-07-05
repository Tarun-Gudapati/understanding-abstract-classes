
interface car {
    public abstract void start();

    public abstract void playMusic();

    public abstract void fly();

}

class WagonR implements car {
    public void start() {
        System.out.println("wroom wroom");
    }

    public void playMusic() {
        System.out.println("tada tada");

    }

    public void fly() {

        System.out.println("the car  flying");

    }

}

class AdvancedWagonR extends WagonR {

    public void fly() {

        System.out.println("the car is flying");

    }
}

// abstract class Outerr {
// public abstract void pr();

// class innerr {

// public void pr1() {
// System.err.println("inside the inner class");
// }
// }
// }

public class UsingAbstract {

    public static void main(String[] args) {
        // AdvancedWagonR r = new AdvancedWagonR();

        AdvancedWagonR r = (AdvancedWagonR) new WagonR();
        r.fly();

    }
}