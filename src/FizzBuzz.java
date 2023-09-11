/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {

            // Find out which numbers divide i.
            BuzzFizz result = doBuzzFizz(i);

            // Print our appropriate result.
            if (result.divisibleBy3() && result.divisibleBy5()) {

                System.out.println("Fizz Buzz");

            } else if (result.divisibleBy3()) {

                System.out.println("Fizz");

            } else if (result.divisibleBy5()) {

                System.out.println("Buzz");

            } else {

                System.out.println(i);

            }
        }
    }

    private static BuzzFizz doBuzzFizz(int i) {
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;
        BuzzFizz result = new BuzzFizz(divisibleBy3, divisibleBy5);
        return result;
    }

    private record BuzzFizz(boolean divisibleBy3, boolean divisibleBy5) {
    }
}
