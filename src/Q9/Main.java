package Q9;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ContaBancaria conta = new ContaBancaria("Gabriel", 2000);

        conta.depositar(500);
        conta.sacar(1500);

        conta.exibirSaldo();
    }
}
