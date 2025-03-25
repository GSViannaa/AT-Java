package Q7;

public class Aluno
{
    private String nome;
    private short matricula;
    private double[] notas;

    private double media = 0;

    public Aluno(String nome, short matricula, double[] notas)
    {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    public double calcularMedia()
    {
        for (double nota : notas)
        {
            media += nota;
        }

       return media / notas.length;
    }

    public String verificarAprovado()
    {

        if(calcularMedia() >= 7)
        {
            return "Aprovado";
        }
        else
        {
            return "Reprovado";
        }
    }

    public void exibirInformacoes()
    {
        System.out.println("Nome: " + nome);
        System.out.printf("Media: %.1f \n", calcularMedia());
        System.out.println("Situação:  "+ verificarAprovado().toString());
    }

}
