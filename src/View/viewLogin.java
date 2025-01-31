package View;

import java.util.Scanner;

public class viewLogin {

    public String inserirPassword(){
        Scanner ler = new Scanner(System.in);
        String password;

        do{
            System.out.println("Digite a password: ");
            password = ler.nextLine();
            if(password.isEmpty()){
                System.out.println("Digite a password outra vez: ");
            }

        }while(password.isEmpty());
        return password;
    }
}
