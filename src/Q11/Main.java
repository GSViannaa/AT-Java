package Q11;

import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        Random gerador = new Random();


        int[] numerosSorteados = new int[6];
        int[] chutes = new int[6];
        int pontos = 0;


        for(int i = 0; i < numerosSorteados.length; i++)
        {
            int numero = gerador.nextInt(60) + 1;
            numerosSorteados[i] = numero;
        }

        try
        {
            for(int i = 0; i < chutes.length; i++)
          {

            System.out.println("Digite seu " + (i + 1) + " chutes entre 1 e 60: ");
            String chuteString = entrada.nextLine();
            int chuteEntrada = Integer.parseInt(chuteString);
            chutes[i] = chuteEntrada;

          }


        }
        catch(Exception e)
        {
            System.out.println("Erro: Digite um numero " );
            return;
        }


        for(int i = 0; i < numerosSorteados.length; i++)
        {
            for(int num : numerosSorteados)
            {
                if(num == chutes[i])
                {
                    pontos++;
                }
            }

        }

        System.out.printf("Você teve %d acertos!\n", pontos);



    }
}
