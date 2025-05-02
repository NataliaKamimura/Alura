/* Desenvolva uma classe Aluno com os atributos privados nome e notas.
Utilize métodos getters e setters para acessar e modificar esses atributos.
Adicione um metodo calcularMedia que retorna a média das notas do aluno. */

package Exercicio04Encapsulamento;

public class Aluno {
    private String nome;
    private double notas;
    double somaNotas = 0;
    double quantidadeNotas = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return notas;
    }

    public void setNota(double nota) {
        this.notas = nota;
    }

    void notas (double novaNota){
        somaNotas += novaNota;
        quantidadeNotas++;
    }

    double calculoMedia(){
        return somaNotas / quantidadeNotas;
    }
}
