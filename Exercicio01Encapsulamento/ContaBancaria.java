/* Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular (publico).
Implemente métodos getters e setters para os atributos privados. */

package Exercicio01Encapsulamento;

public class ContaBancaria {
    public String titular;
    private int numeroConta;
    private double saldo;

    // Metodo GET: pega o valor
    public int getNumeroConta(){
        return numeroConta;
    }

    // Metodo SET: muda o valor
    public void setNumeroConta(int novoNumeroConta){
        numeroConta = novoNumeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double novoSaldo) {
        saldo = novoSaldo;
    }
}

