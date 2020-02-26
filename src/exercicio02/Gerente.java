package exercicio02;

public class Gerente extends Funcionario {

    private Double insalubridade;

    public Gerente(String nome, Double salarioMensal, float insalubridade) {
        super(nome, salarioMensal);
        this.insalubridade = salarioMensal * insalubridade;
    }
}
