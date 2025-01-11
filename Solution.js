
/**
 * @param {number} value
 * @return {boolean}
 */
var isArmstrong = function (value) {
    return value === calculateSumOfDigitsRaisedToThePowerOfNumberOfDigits(value);
};

/**
 * @param {number} value
 * @return {number}
 */
function calculateSumOfDigitsRaisedToThePowerOfNumberOfDigits(value) {
    // regarding 'log10(value)' it is guaranteed that 'value > 0'
    // or more exactly '1 <= value <= pow(10,8)'
    const numberOfDigits = Math.ceil(Math.log10(value));
    let sumOfDigits = 0;

    while (value > 0) {
        let digit = value % 10;
        sumOfDigits += Math.pow(digit, numberOfDigits);
        value = Math.floor(value / 10);
    }
    return sumOfDigits;
}
