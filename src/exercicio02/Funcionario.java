package exercicio02;

public abstract class Funcionario {

    private String nome;
    private Double salarioMensal;

    public Funcionario(String nome, Double salarioMensal) {
        this.nome = nome;
        this.salarioMensal = salarioMensal;
    }

    public Double salarioAnual() {
        double somaDoSalarioAnul;
        somaDoSalarioAnul = salarioMensal * 13;
        return somaDoSalarioAnul;
    }
}
