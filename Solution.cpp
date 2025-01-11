
#include <cmath>
using namespace std;

class Solution {

public:
    bool isArmstrong(int value) const {
        return value == calculateSumOfDigitsRaisedToThePowerOfNumberOfDigits(value);
    }

private:
    int calculateSumOfDigitsRaisedToThePowerOfNumberOfDigits(int value) const {
        // regarding 'log10(value)' it is guaranteed that 'value > 0'
        // or more exactly '1 <= value <= pow(10,8)'
        int numberOfDigits = ceil(log10(value));
        int sumOfDigits = 0;

        while (value > 0) {
            int digit = value % 10;
            sumOfDigits += pow(digit, numberOfDigits);
            value /= 10;
        }
        return sumOfDigits;
    }
};
