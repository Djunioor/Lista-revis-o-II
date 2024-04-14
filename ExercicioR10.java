import java.util.Scanner;

public class ExercicioR10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira o valor original do produto: ");
        double valorOriginal = input.nextDouble();

        System.out.print("Insira a porcentagem de desconto (%): ");
        double percentualDesconto = input.nextDouble();
        double desconto = valorOriginal * (percentualDesconto / 100);
        double valorComDesconto = valorOriginal - desconto;


        System.out.println("Valor do desconto: R$" + desconto);
        System.out.println("Novo valor com desconto: R$" + valorComDesconto);




        input.close();
    }
}
