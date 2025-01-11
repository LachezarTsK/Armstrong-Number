
package main

import (
    "fmt"
    "math"
)

func isArmstrong(value int) bool {
    return value == calculateSumOfDigitsRaisedToThePowerOfNumberOfDigits(value)
}

func calculateSumOfDigitsRaisedToThePowerOfNumberOfDigits(value int) int {
    // regarding 'log10(value)' it is guaranteed that 'value > 0'
    // or more exactly '1 <= value <= pow(10,8)'
    numberOfDigits := math.Ceil(math.Log10(float64(value)))
    sumOfDigits := 0

    for value > 0 {
        digit := value % 10
        sumOfDigits += int(math.Pow(float64(digit), numberOfDigits))
        value /= 10
    }
    return sumOfDigits
}
