import com.tw.vapasi.RectangleCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RectangleCalculatorTest {

    @Test
    void expectArea20ForLength5AndWidth4() {
        RectangleCalculator calculator = new RectangleCalculator(5, 4);
        Assertions.assertEquals(20, calculator.calculateArea());
    }

    @Test
    void expect12ForLength4AndWidth3() {
        RectangleCalculator calculator = new RectangleCalculator(4, 3 );
        Assertions.assertEquals(12, calculator.calculateArea());
    }

    @Test
    void expect18ForPerimeter5And4() {
        RectangleCalculator calculator = new RectangleCalculator(5, 4);
        Assertions.assertEquals(18, calculator.perimeter());
    }

    @Test
    void expect24ForPerimeter8And4() {
        RectangleCalculator calculator = new RectangleCalculator(8, 4);
        Assertions.assertEquals(24, calculator.perimeter());
    }
}
