import java.util.Scanner;

public class MMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char opcao = 's';

        do {
            System.out.println();
            System.out.print("Escolha a quantidade de números que você deseja calcular: ");
            int g = sc.nextInt();
            int[] num = new int[g];

            for (int i = 0; i < g; i++) {
                System.out.print("Digite o #" + (i + 1) + " número: ");
                num[i] = sc.nextInt();
            }

            int totalMMC = num[0];
            for (int i = 1; i < g; i++) {
                totalMMC = calcularMMC(totalMMC, num[i]);
            }

            System.out.println("O MMC total dos números é: " + totalMMC);
            System.out.print("Você deseja calcular mais números? (S/N): ");
            opcao = Character.toLowerCase(sc.next().charAt(0));
        } while (opcao == 's');
    }

    private static int calcularMMC(int num1, int num2) {
        int a = num1;
        int b = num2;

        while (b != 0) {
            int res = a % b;
            a = b;
            b = res;
        }

        int mmc = 0;
        if (a != 0) {
            mmc = (num1 * num2) / a;
        }

        return mmc;
    }
}
