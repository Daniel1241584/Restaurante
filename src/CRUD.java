import java.util.Scanner;

public class CRUD {
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            System.out.println("Escolha a opção que deseja ir: ");
            System.out.println("1. Mesas");
            System.out.println("2. Menus ");
            System.out.println("3. Reserva ");
            int opcao = ler.nextInt();
            do {
                System.out.println("Escolha a opção que deseja ir: ");
                System.out.println("1. Mesas");
                System.out.println("2. Menus ");
                System.out.println("3. Reserva ");
                opcao = ler.nextInt();
            } while (opcao != 1 || opcao != 2 || opcao != 3);

            String pessoas = "";
            String nomeMenu = "";
            String nomePrato = "";
            String categoriaPrato = "";
            String precoCusto = "";
            String precoVenda = "";
            String tempoPrep = "";
            String tempoCost = "";
            String estadoPrato = "";
            String nomeReserva = "";
            int numPessoasReversa;
            String tempoEntrada;

            if (opcao == 1) {
                System.out.println("Insira o número de pessoas na mesa");
                pessoas = ler.next();
                System.out.println("");
            } else if (opcao == 2) {
                System.out.println("Se desejar criar um menu clique 1, se desejar criar um prato no menu clique 2");
                int opcaoCriar = ler.nextInt();
                if (opcaoCriar == 1) {
                    System.out.println("Indique o nome do Menu: ");
                    nomeMenu = ler.next();
                    System.out.println("O Menu " + nomeMenu + " foi criado com sucesso!!");
                }
                else if (opcaoCriar != 2){
                    System.out.println("Se desejar criar um menu clique 1, se desejar criar um prato no menu clique 2");
                }
                else if(opcaoCriar == 2){
                    System.out.println("Indique o nome do prato: ");
                    nomePrato = ler.next();
                    System.out.println("Indique a categoria do prato: ");
                    categoriaPrato = ler.next();
                    System.out.println("Indique o preço de custo do prato: ");
                    precoCusto = ler.next();

                    System.out.println("Indique o preço de venda do prato: ");
                    precoVenda = ler.next();
                    System.out.println("Indique a unidade de tempo de preparação do prato: ");
                    tempoPrep = ler.next();
                    System.out.println("Indique a unidade de tempo de consumo do prato: ");
                    tempoCost = ler.next();
                    System.out.println("Indique o estado do prato (Disponível/Indisponível): ");
                    estadoPrato = ler.next();
                }

            }
            else if (opcao == 3) {
                System.out.println("Indique em que nome fica a reserva: ");
                nomeReserva = ler.next();
                System.out.println("Indique o número de pessoas da reserva: ");
                numPessoasReversa = ler.nextInt();
                System.out.println("Indique o tempo que o cliente demora a chegar ao restaurante");
                tempoEntrada = ler.next();
            }
        }
}
