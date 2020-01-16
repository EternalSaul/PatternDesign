package visitorPattern;

public class Lamp implements VehicleComponent {
    public void accept(VehicleVisitor visitor) {
        visitor.accept(this);
    }
}
