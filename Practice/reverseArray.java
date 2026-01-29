import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int [] arr = {12, 43, 4, 32, 12};
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        // Print the reversed array inside main
        System.out.println(Arrays.toString(arr));
    }
}