public class Reduce {
    public static int main(int n) {
        int i = n;
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
        return n;
    }
    public static void main(String[] args){
        int steps = main(100);
        System.out.println(steps);
    }
}
