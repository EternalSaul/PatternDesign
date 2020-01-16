package visitorPattern;

public class VehicleVisitor {

    public void accept(Lamp lamp) {
        System.out.print("I am visiting Lamp");
    }

    public void accept(Wheel wheel) {
        System.out.print("I am visiting Wheel");
    }
}
