package Day03;

import java.util.Arrays;
import java.util.Random;

public class OddArray {
    private final Random rnd = new Random();
    private final int[] arr = new int[5];

    public static void main(String[] args) {
        OddArray odd = new OddArray();

        System.out.println(Arrays.toString(odd.createArray()));
    }

    public int[] createArray() {
        int num;
        for (int i = 0; i < 5; i++) {
            do {
                num = rnd.nextInt();
            }
            while (num % 2 == 0);
            arr[i] = num;
        }
        return arr;
    }
}