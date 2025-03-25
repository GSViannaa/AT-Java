package Q7;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double[] notasAluno = new double[3];

        System.out.println("Digite as informações do aluno");

        System.out.println("Digite o nome:");
        String nome = input.nextLine();

        System.out.println("Digite a matricula");
        short matricula = input.nextShort();
        input.nextLine();

        for (int i = 0; i < notasAluno.length; i++)
        {

            System.out.println("Digite a " + (i + 1) + " nota: ");
            notasAluno[i] = input.nextDouble();

            if(notasAluno[i] < 0  || notasAluno[i] > 10)
            {
                System.out.println("Nota invalida! tente novamente");
                i--;
            }


        }

        Aluno aluno = new Aluno(nome, matricula, notasAluno);

        aluno.exibirInformacoes();

    }
}
