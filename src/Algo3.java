import java.util.Arrays;

void main(){
    System.out.println(Arrays.toString(checkTwoSum(1225, 7)));       // [2,5]
    System.out.println(Arrays.toString(checkTwoSum(2508, 10)));      // [2,8]
    System.out.println(Arrays.toString(checkTwoSum(123,7)));        // null
    System.out.println(Arrays.toString(checkTwoSum(4582,13)));       // [5,8]
    System.out.println(Arrays.toString(checkTwoSum(7214,11)));       // [7,4]
    System.out.println(Arrays.toString(checkTwoSum(888,15)));        // null
}

int[] checkTwoSum(int number, int target){
    int power = 1;
    int count = 0;
    while ((number / (power *= 10)) != 0) count++;
    power /= 10;
    int[] digits = new int[count + 1];
    while (count-- >= 0) {
        digits[digits.length - 1 - (count + 1)] = number / power;
        number %= power;
        power /= 10;
    }

    for (int i = 0; i < digits.length; i++) {
        for (int j = i + 1; j < digits.length; j++) {
            if (digits[i] + digits[j] == target) return new int[]{digits[i], digits[j]};
        }
    }
    return null;
}