
public class Solution {

    public boolean isArmstrong(int value) {
        return value == calculateSumOfDigitsRaisedToThePowerOfNumberOfDigits(value);
    }

    private int calculateSumOfDigitsRaisedToThePowerOfNumberOfDigits(int value) {
        // regarding 'log10(value)' it is guaranteed that 'value > 0'
        // or more exactly '1 <= value <= pow(10,8)'
        int numberOfDigits = (int) Math.ceil(Math.log10(value));
        int sumOfDigits = 0;

        while (value > 0) {
            int digit = value % 10;
            sumOfDigits += Math.pow(digit, numberOfDigits);
            value /= 10;
        }
        return sumOfDigits;
    }
}
