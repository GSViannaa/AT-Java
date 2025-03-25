package Q6;

public class Main {
    public static void main(String[] args)
    {
        Carro carro1 = new Carro("AAAA", "carroA", 2020, 10000);
        Carro carro2 = new Carro("BBBB", "carroB", 2023, 5000);

        carro1.exibriDetalhes();
        carro2.exibriDetalhes();

        carro1.registrarViagem(25000);
        carro2.registrarViagem(55000);

        carro1.exibriDetalhes();
        carro2.exibriDetalhes();

    }
}