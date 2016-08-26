import java.math.*;
public class Sum {

    public static void main(String[] args) {

        System.out.println(sumOfTheDigitsInTheNumber(factorial(5)));
    }

    public static BigInteger factorial(int n)
    {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }

    public static int sumOfTheDigitsInTheNumber(BigInteger number)
    {
        String s = String.valueOf(number);
        char[] strings = s.toCharArray();
        int result = 0;
        for (int i = 0; i < strings.length ; i++) {
            result = result + Integer.parseInt(String.valueOf(strings[i]));
        }
        return result;
    }

	}
