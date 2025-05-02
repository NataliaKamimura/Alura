package Exercicio02Encapsulamento;

public class Principal {
    public static void main(String[] args) {

        IdadePessoa pessoa1 = new IdadePessoa();
        pessoa1.setNome("Olivia");
        pessoa1.setIdade(18);

        IdadePessoa pessoa2 = new IdadePessoa();
        pessoa2.setNome("Lorena");
        pessoa2.setIdade(11);

        System.out.println("Nome: " + pessoa1.getNome() + "\nIdade: " + pessoa1.getIdade());
        pessoa1.verificarIdade();

        System.out.println("Nome: " + pessoa2.getNome() + "\nIdade: " + pessoa2.getIdade());
        pessoa2.verificarIdade();


    }
}
