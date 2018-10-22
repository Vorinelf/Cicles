import java.util.Arrays;

public class cicles {
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50, 60, 70};
        for (int index = 0; index < data.length / 2; index++) {

            swap(data, index, data.length - index - 1);
        }
        System.out.println(Arrays.toString(data));
    }

    private static void swap(int[] array, int first, int second) {
        int tmp = array[first];
        array[first] = array[second];
        array[second] = tmp;
    }
}