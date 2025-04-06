package Q12;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do primeiro usuário: ");
        String usuario1 = sc.nextLine();


        System.out.println("Digite o nome do segundo usuário: ");
        String usuario2 = sc.nextLine();

        String[] mensagens = new String[10];

        for (int i = 0; i < 10; i++)
        {

            String remetente = (i % 2 == 0) ? usuario1 : usuario2;

            System.out.println(remetente + ", digite sua mensagem: ");
            String mensagem = sc.nextLine();
            mensagens[i] = remetente + ": " + mensagem;


        }

        System.out.printf("Adeus %s e %s! Obrigado por usar o programa!", usuario1, usuario2);

        System.out.println("\n===== Histórico de Mensagens =====");
        for (String msg : mensagens)
        {
            System.out.println(msg);
        }
    }
}
