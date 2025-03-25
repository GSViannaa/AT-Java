package Q6;

public class Carro
{

   private String placa;
   private String modelo;
   private int anoDeFabricacao;
   private double quilometragem;

    public Carro(String placa, String modelo, int anoDeFabricacao, double quilometragem)
    {
        this.placa = placa;
        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
        this.quilometragem = quilometragem;
    }

    public void exibriDetalhes()
    {
        System.out.println("=== Carro ===");
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de fabricação: " + anoDeFabricacao);
        System.out.println("Quilometragem: " + quilometragem);
    }
    public void registrarViagem(double Km)
    {
        this.quilometragem += Km;
    }

}
