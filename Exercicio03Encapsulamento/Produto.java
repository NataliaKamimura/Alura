/*Desenvolva uma classe Produto com os atributos privados nome e preco.
Utilize metodos getters e setters para acessar e modificar esses atributos.
Adicione um metodo aplicarDesconto que recebe um valor percentual e reduz o preço do produto.*/

package Exercicio03Encapsulamento;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(double percentual) {
        double desconto = preco * (percentual / 100);
        preco -= desconto;
    }


}
