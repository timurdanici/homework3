import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner in =new Scanner(System.in);
//        int i=0,n;
//        n = in.nextInt();
//
//        while(i<=n){
//            System.out.println(i);
//            i+=2;
//        }
        int[] mas = new int[50];
        for (int i = 0, n=1; i < mas.length; n+=2, i++) {
                mas[i]=n;
        }
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
