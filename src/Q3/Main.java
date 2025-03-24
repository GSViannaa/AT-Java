package Q3;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite seu sálario mensal: ");
        double salario = sc.nextDouble();
        sc.nextLine();

        double salarioAnual = salario * 12;
        double imposto = 0;
        double salarioLiquido = 0;

        if (salarioAnual <= 22.847)
        {
            System.out.println("Nome: " + nome);
            System.out.printf("Saláraio líquido: %.2f \n", salarioAnual );
            System.out.println("Imposto: Isento");

        }
        else if (salarioAnual <= 33.920)
        {
            imposto = salarioAnual * 0.075;

            salarioLiquido = salarioAnual - imposto;

            System.out.println("Nome: " + nome);
            System.out.printf("Saláraio líquido: %.2f \n", salarioAnual );
            System.out.printf("Imposto: R$ %.2f\n", imposto);
            System.out.printf("Salário Líquido Anual: R$ %.2f\n", salarioLiquido);

        }
        else if (salarioAnual <= 45012.60)
        {
            imposto = salarioAnual * 0.15;

            salarioLiquido = salarioAnual - imposto;

            System.out.println("Nome: " + nome);
            System.out.printf("Saláraio líquido: %.2f \n", salarioAnual );
            System.out.printf("Imposto: R$ %.2f\n", imposto);
            System.out.printf("Salário Líquido Anual: R$ %.2f\n", salarioLiquido);

        }
        else
        {
            imposto = salarioAnual * 0.275;

            salarioLiquido = salarioAnual - imposto;

            System.out.println("Nome: " + nome);
            System.out.printf("Saláraio líquido: %.2f \n", salarioAnual );
            System.out.printf("Imposto: R$ %.2f\n", imposto);
            System.out.printf("Salário Líquido Anual: R$ %.2f\n", salarioLiquido);
        }


    }
}
