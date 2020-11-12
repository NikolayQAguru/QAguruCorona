import org.junit.Test;

import java.math.BigDecimal;

public class MyFirstTest {
    private int globalVar = 10;

//    BigDecimal price = new BigDecimal("10.01");


    @Test
    public void firstTest() {
        System.out.println("Hello, corona!");
        int sum = sumTwoDigits(15, 20);
        System.out.println("And the sum is: " + sum);
        System.out.println(sumTwoDigits(3, 8));
    }

    private int sumTwoDigits(int a, int b) {
        int c = a + b;
        return c;
    }
}
