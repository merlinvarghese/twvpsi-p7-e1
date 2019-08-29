import com.tw.vapasi.Rectangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTest {
    @Test
    void expectArea25forSide5() {
        Rectangle rectangle = Rectangle.createSquare(5);
        Assertions.assertEquals(25, rectangle.area());
    }

    @Test
    void expectPerimeter24forSide6() {
        Rectangle calculator = Rectangle.createSquare(6);
        Assertions.assertEquals(24, calculator.perimeter());
    }
}
