/* Crie uma classe IdadePessoa com os atributos privados nome e idade.
Utilize métodos getters e setters para acessar e modificar esses atributos.
Adicione um metodo verificarIdade que imprime se a pessoa é maior de idade ou não. */

package Exercicio02Encapsulamento;

public class IdadePessoa {
    private String nome;
    public int idade = 0;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificarIdade(){
        if (idade <= 17) {
            System.out.println("Você é menor de idade >:(");
        } else {
            System.out.println("Você é maior de idade :)");}
    }
}
