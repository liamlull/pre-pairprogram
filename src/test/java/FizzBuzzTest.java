import oocl.pair.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void shoule_return_1_when_convert_given_1(){
        //given
        int num = 1;
        //when
        String result = new FizzBuzz().convert(num);
        //then
        assertEquals(result,1+"");
    }

    @Test
    public void should_return_2_when_convert_given_2(){
        //given
        int num = 2;
        //when
        String result = new FizzBuzz().convert(num);
        //then
        assertEquals(result,2+"");
    }
}
