package Q12;

public class Mensagem
{
    String[] mensangens;
    String  user1;
    String  user2;

    public void exibirHistorico()
    {
        for(String mensangen : mensangens)
        {
            System.out.printf("%s: %s\n", user1, mensangen);
            System.out.printf("%s: %s\n", user2, mensangen);
            System.out.printf("%s: %s\n", user1, mensangen);
            System.out.printf("%s: %s\n", user2, mensangen);
            System.out.printf("%s: %s\n", user1, mensangen);
            System.out.printf("%s: %s\n", user2, mensangen);
            System.out.printf("%s: %s\n", user1, mensangen);
            System.out.printf("%s: %s\n", user2, mensangen);
            System.out.printf("%s: %s\n", user1, mensangen);
            System.out.printf("%s: %s\n", user2, mensangen);
        }
    }
}
