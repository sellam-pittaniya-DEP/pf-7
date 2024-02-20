import java.util.Arrays;

void main() {
    int[] nums = {10, 20};
    System.out.println(Arrays.toString(nums));
    int[] reversedNums = reverseArray(nums);
    System.out.println(Arrays.toString(reversedNums));
    System.out.println(Arrays.toString(reverseArray(new int[]{10, 20, 30, 40, 50})));
}

int[] reverseArray(int[] nums) {
    int[] reversedArray = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
        reversedArray[i] = nums[nums.length - i - 1];

    }
    return reversedArray;
}