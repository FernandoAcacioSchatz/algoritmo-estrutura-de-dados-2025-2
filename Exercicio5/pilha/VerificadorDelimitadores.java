package pilha;

import java.util.Scanner;

public class VerificadorDelimitadores {

    public static boolean verificarDelimitadores(String expr) {
        PilhaVetor<Character> pilha = new PilhaVetor<>(expr.length());

        try {
            for (char c : expr.toCharArray()) {
                if (c == '(' || c == '[' || c == '{') {
                    pilha.push(c);
                } else if (c == ')' || c == ']' || c == '}') {
                    if (pilha.estaVazia()) {
                        return false;
                    }
                    char topo = pilha.pop();
                    if (!combina(topo, c)) {
                        return false;
                    }
                }
            }
        } catch (PilhaCheiaException | PilhaVaziaException e) {
            return false;
        }

        return pilha.estaVazia();
    }

    private static boolean combina(char abertura, char fechamento) {
        return (abertura == '(' && fechamento == ')') ||
               (abertura == '[' && fechamento == ']') ||
               (abertura == '{' && fechamento == '}');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Verificador de Delimitadores ===");
        System.out.println("Digite 'sair' para encerrar o programa.");

        while (true) {
            System.out.print("\nInforme a expressão aritmética: ");
            String expressao = sc.nextLine();

            if (expressao.equalsIgnoreCase("sair")) {
                System.out.println("Programa encerrado.");
                break;
            }

            if (verificarDelimitadores(expressao)) {
                System.out.println("O uso de delimitadores está correto.");
            } else {
                System.out.println("O uso de delimitadores está incorreto.");
            }
        }
    }
}
