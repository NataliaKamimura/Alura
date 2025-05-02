/* Desenvolva uma classe Livro com os atributos privados titulo e autor.
 Utilize métodos getters e setters para acessar e modificar esses atributos.
 Adicione um metodo exibirDetalhes que imprime o título e o autor do livro. */

package Exercicio05Encapsulamento;

public class Livro {
    String titulo;
    String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirDetalhes (){
        System.out.println("Titulo da musica: " + titulo);
        System.out.println("Nome do autor : " + autor);
    }
}
