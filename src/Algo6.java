import java.util.Arrays;

void main() {
    int[] nums = {10, 20, 30, 40, 50};
    System.out.println(Arrays.toString(nums));
    reverseArray(nums);
    System.out.println(Arrays.toString(nums));
}

void reverseArray(int[] nums) {
    int[] arrayClone = nums.clone();
    for (int i = 0; i < nums.length; i++) {
        arrayClone[i] = nums[nums.length - 1 - i];
    }

}