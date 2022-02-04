public class FizzBuzz {
    public static void main(String[] args) {
        for (int num = 1; num <= 30; num++) {
            if (num % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (num % 5 == 0) {
                System.out.println("Buzz");
            } else if (num % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(num);
            }
        }
    }
}
