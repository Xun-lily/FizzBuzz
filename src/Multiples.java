public class Multiples {
    public static int main(int n, int a, int b) {
        int count = 0;

        for (int i = 1; i < n; i++){
            if (i % a == 0 || i % b == 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int result = main(1000, 3, 5);
        System.out.println(result);
    }

}
