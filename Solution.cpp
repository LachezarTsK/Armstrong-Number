
function isArmstrong(value: number): boolean {
    return value === calculateSumOfDigitsRaisedToThePowerOfNumberOfDigits(value);
};

function calculateSumOfDigitsRaisedToThePowerOfNumberOfDigits(value: number): number {
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
