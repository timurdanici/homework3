import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = 0; i <= x; i+=2) {
            System.out.println(i);
        }

       int[] mas = new int[50];
            for (int i = 0; i < 50; i++) {
                mas[i]=i*2+1;
                System.out.print(mas[i]+" ");
            }
    }
}
