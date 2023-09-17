public class Reduce {
    public static void main(String[] args) {
        int i = 100;
        int steps = 0;

        while (i > 0){
            boolean iseven = i % 2 == 0;

            if (iseven){
                i/= 2;
            }
            else{
                i--;
            }
            steps++;
        }
        System.out.println("the number of steps is " + steps);
    }
}
