package Online_study;

import java.util.Arrays;

public class FirstLesson {
    public static void main(String[] args) {
        int[] array = {5, 2, 4, 6, 8, 1};
        int x = 3;
        System.out.println(Arrays.toString(sort(array, x)));
    }

    public static int[] sort(int[] nums, int n) {
        int[] result = new int[n*2];
        for (int i = 0; i <result.length; i++) {
            if (i % 2 == 0 && i<n) {
                result[i] = nums[i/2];
            } else if (i<n) {
                result[i] = nums[n++];
            } else {
                result[i] = nums[i];
            }
        }
            return result;
    }
}
