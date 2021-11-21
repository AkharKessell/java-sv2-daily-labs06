package Day02.numbers;

public class PerfectNumbers {

    public boolean isPerfectNumber(int number) {
        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }

        return total == number;
    }
}