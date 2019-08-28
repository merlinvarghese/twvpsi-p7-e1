import com.tw.vapasi.Rectangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RectangleTest {

    @Test
    void expectArea20ForLength5Width4() {
        Rectangle calculator = new Rectangle(5, 4);
        Assertions.assertEquals(20, calculator.area());
    }

    @Test
    void expectArea12ForLength4Width3() {
        Rectangle calculator = new Rectangle(4, 3);
        Assertions.assertEquals(12, calculator.area());
    }

    @Test
    void expectPerimeter18ForLenght5Width4() {
        Rectangle calculator = new Rectangle(5, 4);
        Assertions.assertEquals(18, calculator.perimeter());
    }

    @Test
    void expectPerimeter24ForLenght8Width4() {
        Rectangle calculator = new Rectangle(8, 4);
        Assertions.assertEquals(24, calculator.perimeter());
    }

}
