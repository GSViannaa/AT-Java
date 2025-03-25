package Q8;

public class Gerente extends Funcionario
{
    private  double bonus = salario * 0.2;

    public Gerente(String nome, double salario)
    {
        super(nome, salario);
    }

    @Override
    public double calcularSalarioFinal() {
        return salario + bonus ;
    }
}
