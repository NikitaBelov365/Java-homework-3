import java.util.Arrays;

public class Second {

    public static int[] Merge_Sort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int[] left = Arrays.copyOfRange(arr, 0, arr.length / 2);
        int[] right = Arrays.copyOfRange(arr, left.length, arr.length);

        return Merge(Merge_Sort(left), Merge_Sort(right));
    }

    public static int[] Merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int result_enter = 0;
        int left_enter = 0;
        int right_enter = 0;

        while (left_enter < left.length && right_enter < right.length) {
            if (left[left_enter] < right[right_enter]) {
                result[result_enter++] = left[left_enter++];
            } else {
                result[result_enter++] = right[right_enter++];
            }
        }

        while (result_enter < result.length) {
            if (left_enter != left.length) {
                result[result_enter++] = left[left_enter++];
            } else {
                result[result_enter++] = right[right_enter++];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 52, 64, 28, 5, 14, 9, 1, 126, 89, 65, 48, 132, 0, 3 };
        int[] result_arr = new int[arr.length];
        result_arr = Merge_Sort(arr);
        for (int i : result_arr) {
            System.out.println(i);
        }
    }
}
