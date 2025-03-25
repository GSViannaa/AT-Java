package Q9;

public class ContaBancaria
{
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo)
    {
        this.saldo = saldo;
        this.titular = titular;
    }


    public void depositar(double valor)
    {
        saldo += valor;
    }

    public void sacar(double valor)
    {
        if (saldo >= valor)
        {
            saldo -= valor;
        }
        else
        {
            System.out.println("Saldo insuficiente");
        }

    }
    public void exibirSaldo()
    {
        System.out.printf("Saldo atual: %.2f%n", saldo);
    }

}
