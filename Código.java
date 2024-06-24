import java.util.Scanner;

public class CalculadoraPotencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o número base ao usuário
        System.out.print("Digite o número base: ");
        double base = scanner.nextDouble();

        // Solicitar o expoente ao usuário
        System.out.print("Digite o expoente: ");
        double expoente = scanner.nextDouble();

        // Calcular a potência usando o método pow da classe Math
        double resultado = Math.pow(base, expoente);

        // Exibir o resultado da potência
        System.out.println("O resultado de " + base + " elevado a " + expoente + " é: " + resultado);

        scanner.close();
    }
}
