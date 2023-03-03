import java.util.Locale;
import java.util.Scanner;

public class MMC {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Você quer calcular o MMC de um número? Certo!");
        System.out.println();
        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        int mmc = calcularMMC(num1, num2);

        System.out.println("O MMC de " + num1 + " e " + num2 + " é: " + mmc);
    }

    private static int calcularMMC(int num1, int num2) {
        int a = num1;
        int b = num2;
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        int mmc = (num1 * num2) / a;

        return mmc;
    }
}