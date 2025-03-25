package Q8;

public class Estagiario extends Funcionario
{
    private double desconto = salario * 0.1;

    public Estagiario(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularSalarioFinal() {
        return salario - desconto;
    }
}
