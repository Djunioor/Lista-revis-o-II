import java.util.Scanner;

public class ExercicioR8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " número par.");
        } else {
            System.out.println(numero + " número ímpar.");
        }

        input.close();
    }
}