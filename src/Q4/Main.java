package Q4;

import java.util.Scanner;

public class Main
{
    public  static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.printf("Olá %s! Qual o valor desejado de empréstimo? \n ", nome);
        double emprestimo = input.nextDouble();
        input.nextLine();

        boolean parcelasValidas = true;
        short parcelas = 0;

        do
        {
             System.out.println("Escolha o número de parcelas (min 6 | max 48): ");
             String parcelasEntrada = input.nextLine();

             if(!parcelasEntrada.matches("\\d+"))
             {
                 System.out.println("Digite apenas números.");
                 parcelasValidas = false;
             }
             else
             {
                  parcelas = Short.parseShort(parcelasEntrada);

                 if (parcelas < 6 || parcelas > 48)
                 {
                     System.out.println("Ecolha um numero entre 6 e 48.");
                     parcelasValidas = false;
                 }

             }
        } while (!parcelasValidas);

        double taxaJuros = 0.03;


        double valorTotal = emprestimo * Math.pow(1 + taxaJuros, parcelas);

        double valorParcela = valorTotal / parcelas;


        System.out.println("Cliente: " + nome);
        System.out.printf("Valor do empréstimo: R$ %.2f\n", emprestimo);
        System.out.printf("Parcelas: %d\n", parcelas);
        System.out.printf("Valor total pago: R$ %.2f\n", valorTotal);
        System.out.printf("Valor da parcela mensal: R$ %.2f\n", valorParcela);

    }
}
