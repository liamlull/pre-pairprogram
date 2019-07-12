import oocl.pair.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void shoule_return_1_when_convert_given_1() {
        //given
        int num = 1;
        //when
        String result = new FizzBuzz().convert(num);
        //then
        assertEquals(result, 1 + "");
    }

    @Test
    public void should_return_2_when_convert_given_2() {
        //given
        int num = 2;
        //when
        String result = new FizzBuzz().convert(num);
        //then
        assertEquals(result, 2 + "");
    }

    @Test
    public void should_return_Fizz_when_convert_given_3() {
        //given
        int num = 3;
        //when
        String result = new FizzBuzz().convert(num);
        //then
        assertEquals(result, "Fizz");
    }

    @Test
    public void should_return_Fizz_when_convert_given_6() {
        //given
        int num = 6;
        //when
        String result = new FizzBuzz().convert(num);
        //then
        assertEquals(result, "Fizz");
    }

    @Test
    public void should_return_Fizz_when_convert_given_9() {
        //given
        int num = 9;
        //when
        String result = new FizzBuzz().convert(num);
        //then
        assertEquals(result, "Fizz");
    }
}
