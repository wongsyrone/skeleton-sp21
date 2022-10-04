/** Class that prints the Collatz sequence starting from a given number.
 *  @author Syrone Wong
 */
public class Collatz {

    /**
     * Get next number
     * @param n input
     * @return the next number in collatz seq
     */
    public static int nextNumber(int n) {
        if (n == 1) return 1;
        if (n % 2  == 0) {
            return n / 2;
        } else {
            return 3 * n + 1;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print(n + " ");
        while (n != 1) {
            n = nextNumber(n);
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

