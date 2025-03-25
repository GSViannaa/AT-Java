package Q8;

public class Main
{
    public static void main(String[] args)
    {
        Gerente gerente = new Gerente("Gerente", 4000);
        Estagiario estagiario = new Estagiario("Estagiario", 1500);

        System.out.println(gerente.calcularSalarioFinal());
        System.out.println(estagiario.calcularSalarioFinal());
    }
}
