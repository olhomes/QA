
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticsTest{

    @Test
    public void tests() {
        int[] speed = { 0, 2, 3, 5, 8 };
       int actual = GameClass.first(speed);
       int expected = 4;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void second(){
        int[] speed = { 0, 2, 3, 5, 8 };
        int[] actual = GameClass.second(speed);
        int[] expected = {2,3,5,8};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void three(){
        int[] speed = { 0, 2, 3, 5, 8 };
        int[] actual = GameClass.three(speed);
        int[] expected = {0};
        Assertions.assertArrayEquals(expected, actual);
    }
}
