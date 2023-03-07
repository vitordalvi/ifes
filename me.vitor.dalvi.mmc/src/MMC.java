import java.util.Scanner;

public class MMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char opcao = 's';

            System.out.println();
            System.out.println("Para calcular o MMC dos números\nselecionados, digite qualquer letra ou número.");
            String a = sc.nextLine();
        while (opcao == 's') {
            System.out.println();
            System.out.print("Digite o primeiro número: ");
            int num1 = sc.nextInt();
            System.out.print("Digite o segundo número: ");
            int num2 = sc.nextInt();

            int mmc = calcularMMC(num1, num2);

            System.out.println("O MMC de " + num1 + " e " + num2 + " é: " + mmc);
            System.out.println("");
            System.out.print("Você deseja calcular mais números? (S/N): ");
            opcao = Character.toLowerCase(sc.next().charAt(0));
        }
    }

    private static int calcularMMC(int num1, int num2) {
        int a = num1;
        int b = num2;
        while (b != 0) {
            int res = a % b;
            a = b;
            b = res;
        }
        int mmc = (num1 * num2) / a;

        return mmc;
    }
}
