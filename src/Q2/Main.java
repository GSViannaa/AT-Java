package Q2;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);

       System.out.println("Digite seu nome de usuario para cadastro: ");
       String nome = input.nextLine();


        boolean senhaValida;

       do
       {

           System.out.println("Digite sua senha para cadastro: ");
           String senha = input.nextLine();

           senhaValida = true;


           if(senha.length() < 8)
           {
               System.out.println("A senha deve conter 8 caracteres!");
               senhaValida = false;
           }

           if (!senha.matches(".*[^a-zA-Z0-9].*"))
           {
                System.out.println("A senha deve conter  pelo menos um caracter especial!");
                senhaValida = false;
           }
           if (!senha.matches(".*[0-9].*"))
           {
               System.out.println("A senha deve conter um numero!");
               senhaValida = false;
           }
           if (!senha.matches(".*[A-Z].*"))
           {
               System.out.println("A senha deve conter pelo menos uma letra maiúscula!");
               senhaValida = false;
           }

           if (!senhaValida)
           {
               System.out.println("Tente novamente.");
           }


       }  while (!senhaValida);

        System.out.println("Cadastro efetuado com sucesso!");

    }


}