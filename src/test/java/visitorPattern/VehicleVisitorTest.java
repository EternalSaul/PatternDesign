package visitorPattern;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class VehicleVisitorTest {

    private static ByteArrayOutputStream out;

    @BeforeEach
    void setUp() {
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    void wheelHadBeenVisited() {
        VehicleVisitor vehicleVisitor = new VehicleVisitor();
        new Wheel().accept(vehicleVisitor);
        assertEquals("I am visiting Wheel", out.toString());
    }

    @Test
    void lampHadBeenVisited() {
        VehicleVisitor vehicleVisitor = new VehicleVisitor();
        new Lamp().accept(vehicleVisitor);
        assertEquals("I am visiting Lamp", out.toString());
    }

}
