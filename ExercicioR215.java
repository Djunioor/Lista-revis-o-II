import java.util.Scanner;

public class ExercicioR215 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o salário do funcionário: ");
    double salario = scanner.nextDouble();

    double impostoDeRenda = calculaImpostoRenda(salario);
    System.out.println("O imposto de renda a ser pago é: R$" + impostoDeRenda);

    scanner.close();
}
public static double calculaImpostoRenda(double salario) {
    double impostoDeRenda = 0.0;

    if (salario <= 1903.98) {
        impostoDeRenda = 0.0; // Isento
    } else if (salario <= 2826.65) {
        impostoDeRenda = (salario - 1903.98) * 0.075;
    } else if (salario <= 3751.05) {
        impostoDeRenda = (salario - 2826.65) * 0.15 + 69.18;
    } else if (salario <= 4664.68) {
        impostoDeRenda = (salario - 3751.05) * 0.225 + 138.66;
    } else {
        impostoDeRenda = (salario - 4664.68) * 0.275 + 205.43;
    }

    return impostoDeRenda;
    }
}