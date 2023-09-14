public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int count = 0;

        while (n > 0) {
            if (n % 2 == 0) {
                // If the number is even, divide it by 2
                n /= 2;
            } else {
                // If the number is odd, subtract 1
                n -= 1;
            }
            count++;
        }

        System.out.println(count);
    }
}

