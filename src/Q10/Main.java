package Q10;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String path = "C:\\Users\\gabri\\OneDrive\\Área de Trabalho\\Trabalhos_Java\\AT-Java\\src\\Q10\\temp\\compras.txt";
        Path pasta = Paths.get(path);


        try (OutputStream outputStream = Files.newOutputStream(pasta, StandardOpenOption.CREATE, StandardOpenOption.APPEND))
        {

            int comprasCadastradas = 0;
            System.out.println("Cadastre três compras");

            while (comprasCadastradas < 3) {
                System.out.printf("Digite o nome do %d produto: \n",  comprasCadastradas + 1);
                String nome = input.nextLine();

                System.out.println("Digite a quantidade de produto: ");
                int quantidade = input.nextInt();

                System.out.println("Digite o preço do produto: ");
                double preco = input.nextDouble();
                input.nextLine();

                Produtos produto = new Produtos(nome, quantidade, preco);
                outputStream.write((produto.toFileString() + System.lineSeparator()).getBytes());

                comprasCadastradas++;
            }

        }
        catch (IOException e)
        {
            System.out.println("Erro ao acessar o arquivo: " + e.getMessage());
        }

        try
        {
            List<String> linhas = Files.readAllLines(pasta);

            for(String linha : linhas)
            {
                Produtos produto = Produtos.fromFileString(linha);
                System.out.println(produto);
            }
        }
        catch (IOException e)
        {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        input.close();
    }
}
