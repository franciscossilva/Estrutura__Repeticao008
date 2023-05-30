public class Main {

    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1; count < 50; i += 2) {
            sum += i;
            count++;
        }

        System.out.println("A soma dos 50 primeiros números ímpares é " + sum + ".");
    }
}