import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int respostasS = 0;
        int respostasN = 0;
        String resposta;

        String[] perguntas = {
            "Telefonou para a vítima?",
            "Esteve no local do crime?",
            "Mora perto da vítima?",
            "Devia para a vítima?",
            "Já trabalhou com a vítima?",
            "Foi vista nas proximidades no dia do crime?",
            "Possui algum objeto da vítima?",
            "Tentou fugir após o crime?"
        };

        System.out.println("Responda apenas com 's' para SIM ou 'n' para NÃO.\n");

        for (String pergunta : perguntas) {
            do {
                System.out.print(pergunta + " ");
                resposta = entrada.next().toLowerCase();

                if (!resposta.equals("s") && !resposta.equals("n")) {
                    System.out.println(" Resposta inválida! Digite apenas 's' ou 'n'.");
                }
            } while (!resposta.equals("s") && !resposta.equals("n"));

            if (resposta.equals("s")) {
                respostasS++;
            } else {
                respostasN++;
            }
        }

        System.out.println("\n--- Resultado ---");
        System.out.println("Respostas 's': " + respostasS);
        System.out.println("Respostas 'n': " + respostasN);

        if (respostasS == 2) {
            System.out.println("Classificação: SUSPEITA");
        } else if (respostasS >= 3 && respostasS <= 4) {
            System.out.println("Classificação: CÚMPLICE");
        } else if (respostasS >= 5) {
            System.out.println("Classificação: ASSASSINO");
        } else {
            System.out.println("Classificação: INOCENTE");
        }

        entrada.close();
    }
}
