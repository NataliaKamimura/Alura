package Exercicio04Encapsulamento;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();

        aluno1.setNome("Luiza");
        aluno1.notas(9.1);
        aluno1.notas(6.2);
        aluno1.notas(8.3);
        System.out.println(aluno1.somaNotas);
        System.out.println(aluno1.quantidadeNotas);

        System.out.println("A sua média é: " + aluno1.calculoMedia());
    }
}
