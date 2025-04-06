package Q10;

import java.util.Scanner;

public class Produtos
{
    String nome;
    int quantidade;
    double preco;

    public Produtos(String nome, int quantidade, double preco)
    {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    @Override
    public String toString()
    {
        return String.format("Produto: %s | Quantidade: %d | Preço unitário: R$ %.2f",
                nome, quantidade, preco);
    }
    public String toFileString()
    {
        return nome + "," + quantidade + "," + preco;
    }
    public static Produtos fromFileString(String linha)
    {
        String[] partes = linha.split(",");
        String nome = partes[0];
        int quantidade = Integer.parseInt(partes[1]);
        double preco = Double.parseDouble(partes[2]);

        return new Produtos(nome, quantidade, preco);
    }

}
