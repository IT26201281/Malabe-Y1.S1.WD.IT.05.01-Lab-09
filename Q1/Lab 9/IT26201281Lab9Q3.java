public class IT26201281Lab9Q3 {

    // add() - add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // multiply() - multiply two integers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // square() - multiply number by itself
    public static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        // i. (3 * 4 + 5 * 7)^2
        int part1 = multiply(3, 4); // 12
        int part2 = multiply(5, 7); // 35
        int sum1 = add(part1, part2); // 47
        int result1 = square(sum1); // 2209

        // ii. (4 + 7)^2 + (8 + 3)^2
        int sum2 = add(4, 7); // 11
        int sq1 = square(sum2); // 121
        
        int sum3 = add(8, 3); // 11
        int sq2 = square(sum3); // 121
        
        int result2 = add(sq1, sq2); // 242

        System.out.println("Result of (3 * 4 + 5 * 7)^2     : " + result1);
        System.out.println("Result of (4 + 7)^2 + (8 + 3)^2   : " + result2);
    }
}