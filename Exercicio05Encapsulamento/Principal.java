package Exercicio05Encapsulamento;


public class Principal {
    public static void main(String[] args) {

        Livro livro1 = new Livro("O Assassinato No Expresso Oriente", "Agatha Christie");
        livro1.exibirDetalhes();

        Livro livro2 = new Livro("Harry Potter e o Prisioneiro de Azkaban", "J. K. Rowling");
        livro2.exibirDetalhes();
    }
}
