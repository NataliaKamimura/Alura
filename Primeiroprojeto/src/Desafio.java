import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = "Natalia";
        String tipoConta = "Conta Corrente";
        double saldo = 0;
        double inserirSaldo = 0, transferirSaldo = 0;

        String frase = """
                                Operações
                    [1] Consultar saldos
                    [2] Receber valor
                    [3] Transferir valor
                    [4] Sair
                    """;
        System.out.println(frase);
        int opcao = scanner.nextInt();
        while (opcao != 4) {
            switch (opcao) {
                case 1:
                    System.out.println("---Consultar saldos---");
                    String frase1 = "Nome: " + nome + "\nTipo: " + tipoConta + "\nSaldo: " + saldo;
                    System.out.println(frase1);
                    System.out.println(frase);
                    opcao = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("---Receber valor---\n Insira o valor:");
                    inserirSaldo = scanner.nextDouble();
                    saldo += inserirSaldo;
                    System.out.println("Você recebeu o valor de " + inserirSaldo + "\nSeu saldo atual é: " + saldo);
                    System.out.println(frase);
                    opcao = scanner.nextInt();
                    break;
                case 3:
                    System.out.println("---Transferir valor---\n Insira o valor:");
                    transferirSaldo = scanner.nextDouble();
                    if (saldo < transferirSaldo) {
                        System.out.println("Saldo insuficiente \nSeu saldo atual é: " + saldo);
                        System.out.println(frase);
                        opcao = scanner.nextInt();
                    } else {
                        saldo -= transferirSaldo;
                        System.out.println("Você transferiu o valor de: " + transferirSaldo + "\nSeu saldo atual é: " + saldo);
                        System.out.println(frase);
                        opcao = scanner.nextInt();
                    }
                    opcao = scanner.nextInt();
                    break;
                default :
                    System.out.println("Opção inválida");
                    System.out.println(frase);
                    opcao = scanner.nextInt();
                    break;
            }
        }
        System.out.println("Fim do programa");

    }
}
