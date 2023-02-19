import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int startIndex = 3, endIndex = 7;
        int[] aNew = test(a, startIndex, endIndex);
        for (int i = 0; i < aNew.length; i++) {
            if (aNew[i] % 2 == 0) {
                aNew[i] = aNew[i + 1];
            }
        }
        System.out.println(Arrays.toString(aNew));
    }
    public static int[] test (int[] a, int startIndex, int endIndex) {
        int[] array = new int [endIndex - startIndex];
        for (int i = 0; i < array.length; i++) {
            array[i] = a[startIndex + i];
        }
        return array;
    }
}
