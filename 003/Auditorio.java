import java.util.Scanner;

public class Auditorio {
    final static int AUDITORIO_ALFA = 150;
    final static int AUDITORIO_BETA = 350;
    final static int CADEIRAS_EXTRAS = 70;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //LIMPAR A TELA
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.print("Digite o número de convidados: ");

        int convidados = scanner.nextInt();

        System.out.println("Convidados: " + convidados);

        if (convidados < 1)
        {
            System.out.println("Número de convidados inválido!");
        }
        else if (convidados <= (AUDITORIO_ALFA + CADEIRAS_EXTRAS))
        {
            System.out.println("Use o auditório Alfa");
            int cadeirasAdicionais = 0;
            if (convidados > AUDITORIO_ALFA)
            {
                cadeirasAdicionais = convidados - AUDITORIO_ALFA;
                System.out.println("Inclua mais " + cadeirasAdicionais + " cadeira(s).");
            }
        }
        else if (convidados <= AUDITORIO_BETA)
        {
            System.out.println("Use o auditório Beta");
        }
        else
        {
            System.out.println("Número de convidados acima do permitido!");
        }

        scanner.close();
    }
}
