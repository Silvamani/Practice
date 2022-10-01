public class Fibonacci{
    public static void main(String[] args) {
        int i = 0;
        int j = 1;
        int k = 0;
        for (int k2 = 0; k2 < 10; k2++) {
            k = i + j;
            System.out.println(k);
            i = j;
            j = k;
        }
    }
}