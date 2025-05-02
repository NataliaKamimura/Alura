package Exercicio03Encapsulamento;

public class Principal {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Tv", 2000.0);
        System.out.println("Nome do produto: " + produto1.getNome());
        System.out.println("Valor: " + produto1.getPreco());

        produto1.aplicarDesconto(10);
        System.out.println("Preco com desconto: " + produto1.getPreco());
    }
}
