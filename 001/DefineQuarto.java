public class DefineQuarto {
    final static int QUARTO_A = 0;
    final static int QUARTO_B = 1;
    final static int TOTAL_QUARTOS = 2;

    private static Integer[] idades = new Integer[TOTAL_QUARTOS];
    private static String[] nomes = new String[TOTAL_QUARTOS];

    public static void main(String[] args) throws Exception {

        for (int i = 0; i < TOTAL_QUARTOS; i++) {
            limparTela();
            reservarQuarto(i);
        }
        limparTela();
        alocarQuartos();
    }

    private static void reservarQuarto(int i) {
        System.out.println("Nome do cliente: ");
        addNome(i, System.console().readLine());
        System.out.println("Idade do cliente: ");
        addIdade(i, Integer.parseInt(System.console().readLine()));
    }

    private static void limparTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static void alocarQuartos() {
        String nomeQuartoA, nomeQuartoB;
        boolean desconto = false;

        if (idades[QUARTO_A] >= idades[QUARTO_B]) {
            nomeQuartoA = nomes[QUARTO_A];
            nomeQuartoB = nomes[QUARTO_B];
            if (idades[QUARTO_A] >= 60) {
                desconto = true;
            }
        } else {
            nomeQuartoA = nomes[QUARTO_B];
            nomeQuartoB = nomes[QUARTO_A];
            if (idades[QUARTO_B] >= 60) {
                desconto = true;
            }
        }

        // Exibir os resultados
        System.out.print("Quarto A: " + nomeQuartoA);
        if (desconto) {
            System.out.print(" com desconto de 40%");
        }
        System.out.println("; Quarto B: " + nomeQuartoB);
    }

    public static Integer[] getIdades() {
        return idades;
    }

    public static void addIdade(Integer index, Integer idade) {
        idades[index] = idade;
    }

    public String[] getNomes() {
        return nomes;
    }

    public static void addNome(Integer index, String nome) {
        nomes[index] = nome;
    }
}