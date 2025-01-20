package maven;

import maven.Rectangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {
    @Test
    void testArea() {
        Rectangle rectangle = new Rectangle(5, 10);
        assertEquals(50, rectangle.getArea());
    }

    @Test
    void testPerimeter() {
        Rectangle rectangle = new Rectangle(5, 10);
        assertEquals(30, rectangle.getPerimeter());
    }
}