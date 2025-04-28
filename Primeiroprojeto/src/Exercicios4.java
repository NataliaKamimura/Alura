import java.util.Scanner;

public class Exercicios4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

/*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }
*/
/*

                System.out.print("Digite um número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite outro número: ");
        int numero2 = scanner.nextInt();


        if (numero1 == numero2) {
            System.out.println("Os números são iguais!");
        } else if (numero1 > numero2){
            System.out.println("O 1º número é maior");
        } else {
            System.out.println("O 2º número maior");
        }
*/
/*

        double lado, altura = 0;
        int opcao = 0;

        System.out.println("""
                                Digite
                    [1] Calcular área do quadrado
                    [2] Calcular área do círculo
                    [3] Sair
                    """);
        opcao = scanner.nextInt();
        if (opcao == 1) {
            System.out.println("Digite o tamanho lado para o calculo da área do quadrado");
            lado = scanner.nextDouble();
            System.out.println("Digite o tamanho da altura o calculo da área do quadrado");
            altura = scanner.nextDouble();
            double areaQuadrado = lado * altura;
            System.out.println("O calculo da área do quadrado mencionado é " + areaQuadrado);
        } else if (opcao == 2) {
            System.out.println("Digite o raio para o calculo da área do circulo");
            double raio = scanner.nextDouble();
            double areaCirculo = 3.14 * raio * raio;
            System.out.println("O calculo da área do circulo mencionado é " + areaCirculo);
        } else if (opcao == 3){
            System.out.println("Até a proxima! :)");
        } else {
            System.out.println("Valor inválido");
        }
*/
/*

        int numero, multiplicador = 0;
        System.out.println("Digite um numero para o calculo da tabuada ");
        numero = scanner.nextInt();
        while (multiplicador < 10) {
            multiplicador++;
            System.out.println(" " + numero + " * " + multiplicador + " = " + numero * multiplicador);
        }
*/
/*

        if (numero % 2 == 0) {
            System.out.println("O numero " + numero + " é par");
        } else {
            System.out.println("O numero " + numero + " é impar");
        }


*/
/*
                System.out.println("Digite um numero");
        int numero = scanner.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
*/
    }
}