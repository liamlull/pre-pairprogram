package oocl.pair;

public class FizzBuzz {
    public String convert(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        } else if (number == 5) {
            return "Buzz";
        }
        return String.valueOf(number);
    }
}
