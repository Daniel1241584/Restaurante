import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);
    boolean continuar = true;

    while(continuar){
        System.out.println("\n === MENU ===");
        System.out.println("1. Gerir Mesas");
        System.out.println("2. Gerir Menus");
        System.out.println("3. Gerir Dia-a-Dia");
        System.out.println("4. Consultar Estatísticas");
        System.out.println("5. Configurações");
        System.out.println("6. Sair");
        System.out.println("7. Alterar Password");
        System.out.println("8. Sair");
        System.out.println("Insira uma opção: ");

        int opcao = ler.nextInt();
        ler.nextLine();

        switch(opcao){
            case 1:
            break;

            case 2:
            break;

            case 3:
            break;

            case 4:
            break;

            case 5:
            break;

            case 6:
            break;

            case 7:
            break;

            case 8:
            break;

        default:
            System.out.println("Opção inválida.Tente novamente.");}
    }

    }
}