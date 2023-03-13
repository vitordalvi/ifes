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
            int[][] contaMMC = new int[g - 1][4];
            for (int i = 1; i < g; i++) {
                int a = totalMMC;
                int b = num[i];
                while (b != 0) {
                    int res = a % b;
                    contaMMC[i - 1][0] = a;
                    contaMMC[i - 1][1] = b;
                    contaMMC[i - 1][2] = res;
                    a = b;
                    b = res;
                }
                totalMMC = (totalMMC * num[i]) / a;
                contaMMC[i - 1][3] = totalMMC;
            }

            System.out.println("O MMC total dos números é: " + totalMMC);
            System.out.println("Resultado das contas:");
            for (int i = 0; i < g - 1; i++) {
                System.out.printf("%d | %d | %d | %d\n", contaMMC[i][0], contaMMC[i][1], contaMMC[i][2], contaMMC[i][3]);
            }

            System.out.print("Você deseja calcular mais números? (S/N): ");
            opcao = Character.toLowerCase(sc.next().charAt(0));
        } while (opcao == 's');
    }
}
