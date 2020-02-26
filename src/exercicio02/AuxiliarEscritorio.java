package exercicio02;

public class AuxiliarEscritorio extends Funcionario {

    private Double bonusAnual;

    public AuxiliarEscritorio(String nome, Double salarioMensal, Double bonusAnual) {
        super(nome, salarioMensal);
        this.bonusAnual = bonusAnual;
    }

    @Override
    public Double salarioAnual() {
        return super.salarioAnual() + bonusAnual;
    }
}
