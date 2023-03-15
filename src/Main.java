import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        x = s.nextInt();
        System.out.println("Digite o segundo número");
        y = s.nextInt();
        System.out.println("O máximo divisor comum entre os números é " +mdc(x,y));
    }

    public static int mdc (int x, int y) {
        if (x==y) {
           return x;
        }
        else if (x>y) {
            return mdc(x-y, y);
        }
        else {
            return mdc(y-x, x);
        }
    }
}