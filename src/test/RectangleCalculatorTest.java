import com.tw.vapasi.RectangleCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RectangleCalculatorTest {

    @Test
    void expect20ForLength5AndWidth4() {
        RectangleCalculator calculator = new RectangleCalculator(5, 4);
        Assertions.assertEquals(20, calculator.calculateArea());
    }

    @Test
    void expect12ForLength4AndWidth3() {
        RectangleCalculator calculator = new RectangleCalculator(4, 3 );
        Assertions.assertEquals(12, calculator.calculateArea());
    }

    @Test
    void expect12ForPerimeter4And5() {
        RectangleCalculator calculator = new RectangleCalculator(5, 4);
        Assertions.assertEquals(40, calculator.perimeter());
    }
}
