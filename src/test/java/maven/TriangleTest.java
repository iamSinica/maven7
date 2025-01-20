package maven;

import maven.Triangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {
    @Test
    void testPerimeter() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(12, triangle.getPerimeter());
    }

    @Test
    void testArea() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(6, triangle.getArea(), 0.01);
    }
}
