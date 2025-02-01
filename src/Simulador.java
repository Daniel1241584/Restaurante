import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Simulador {
    public static ArrayList<Mesa> mesas = new ArrayList<Mesa>();
    public static ArrayList<Reserva> reservas = new ArrayList<Reserva>();
    public static ArrayList<Prato> pratos = new ArrayList<Prato>();

    public static void main(String[] args) {
        readFiles();
    }

    private static void readFiles()
    {
        readMesas();
        System.out.println("------------------------------------------------------------");
        readReservas();
        System.out.println("------------------------------------------------------------");
        readPratos();
    }

    private static void readMesas()
    {
        try (BufferedReader br = new BufferedReader(new FileReader("Mesas.txt"))) {
            String linha;

            while ((linha = br.readLine()) != null) {
                linha = linha.trim();

                if (linha.isEmpty()) continue;

                String[] dados = linha.split("[;:]");

                int id = Integer.parseInt(dados[0].trim());
                int lugares = Integer.parseInt(dados[1].trim());

                Mesa mesa = new Mesa(id, lugares);
                mesas.add(mesa);
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar as mesas: " + e.getMessage());
        }
        for (Mesa mesa : mesas) {
            System.out.println(mesa.getId() + ";" + mesa.getLugares());
        }
    }

    private static void readReservas()
    {
        try (BufferedReader br = new BufferedReader(new FileReader("Reservas.txt"))) {
            String linha;

            while ((linha = br.readLine()) != null) {
                linha = linha.trim();

                if (linha.isEmpty()) continue;

                String[] dados = linha.split("[;:]");

                String nome = dados[0].trim();
                int tempChegada = Integer.parseInt(dados[1].trim());
                int quantidade = Integer.parseInt(dados[2].trim());

                Reserva reserva = new Reserva(nome, tempChegada, quantidade);
                reservas.add(reserva);
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar as mesas: " + e.getMessage());
        }
        for (Reserva reserva : reservas) {
            System.out.println(reserva.getNome() + ";" + reserva.getTempChegada() + ";" + reserva.getQuantidade());
        }
    }

    private static void readPratos()
    {
        try (BufferedReader br = new BufferedReader(new FileReader("Reservas.txt"))) {
            String linha;

            while ((linha = br.readLine()) != null) {
                linha = linha.trim();

                if (linha.isEmpty()) continue;

                String[] dados = linha.split("[;:]");

                String nomePrato = dados[0].trim();
                double precoCusto = Integer.parseInt(dados[1].trim());
                double precoVenda = Integer.parseInt(dados[2].trim());
                int preparacaoTemp = Integer.parseInt(dados[2].trim());
                int tempConsumo = Integer.parseInt(dados[2].trim());
                boolean estado = Boolean.parseBoolean(dados[2].trim());

                Prato prato = new Prato(nomePrato, precoCusto, precoVenda, preparacaoTemp, tempConsumo, estado);
                pratos.add(prato);
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar as mesas: " + e.getMessage());
        }
        for (Prato prato : pratos) {
            System.out.println(prato.getNomePrato() + ";" + prato.getPrecoCusto() + ";" + prato.getPrecoVenda() + ";" + prato.getPreparacaoTemp() + ";" + prato.getTempConsumo() + ";" + prato.getEstado());
        }
    }
}
