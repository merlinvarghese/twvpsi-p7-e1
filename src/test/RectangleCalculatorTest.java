import com.tw.vapasi.RectangleCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RectangleCalculatorTest {

    @Test
    void expect20ForLength5AndWidth4() {
        RectangleCalculator calculator = new RectangleCalculator();
        Assertions.assertEquals(20, calculator.calculateArea(5, 4));
    }
}
