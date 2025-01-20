package maven;

import maven.Circle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {
    @Test
    void testArea() {
        Circle circle = new Circle(10);
        assertEquals(314.16, circle.getArea(), 0.01);
    }

    @Test
    void testCircumference() {
        Circle circle = new Circle(10);
        assertEquals(62.83, circle.getCircumference(), 0.01);
    }
}