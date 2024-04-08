package solutions;


//Bit manipulation -____-
public class sumOfTwoIntegers {
    public int getSum(int a, int b) {
        while ((a&b) != 0) {
            int a1 = a;
            a = a1^b;
            b = (a1&b) << 1;
        }
        return a|b;
    }
}
