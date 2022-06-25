package demo.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseDemoTest {

    @Test
    public void should_return_hello_world() {
        BaseDemo baseDemo = new BaseDemo();

        String expected = "Hello World";

        assertEquals(expected, baseDemo.print());
    }

    @Test
    public void should_return_number_three() {
        BaseDemo baseDemo = new BaseDemo();

        int first_number = 1;
        int second_number = 2;
        int expected_number = 3;

        assertEquals(expected_number, baseDemo.sum(first_number, second_number));
    }
}
