package visitorPattern;

public class Wheel implements VehicleComponent {
    public void accept(VehicleVisitor visitor) {
        visitor.accept(this);
    }
}
