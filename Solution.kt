
import kotlin.math.ceil
import kotlin.math.log10
import kotlin.math.pow

class Solution {
    
    fun isArmstrong(value: Int): Boolean {
        return value == calculateSumOfDigitsRaisedToThePowerOfNumberOfDigits(value)
    }

    private fun calculateSumOfDigitsRaisedToThePowerOfNumberOfDigits(value: Int): Int {
        // regarding 'log10(value)' it is guaranteed that 'value > 0'
        // or more exactly '1 <= value <= pow(10,8)'
        val numberOfDigits = ceil(log10(value.toDouble()))
        var sumOfDigits = 0
        var value = value

        while (value > 0) {
            val digit = value % 10
            sumOfDigits += digit.toDouble().pow(numberOfDigits).toInt()
            value /= 10
        }
        return sumOfDigits
    }
}
