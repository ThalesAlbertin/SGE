import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        String nome = "";
        String sobrenome = "";
        String senha = "";

        Scanner scanner = new Scanner(System.in);

        boolean i=false;
        while(!i) {

            System.out.println("Digite seu nome:");

            nome = scanner.nextLine();

            if (nome.matches("[A-Z][a-z]{3,20}")) {

                System.out.println("Ok");
                i=true;

            } else {
                System.out.println("Nome inválido!");

            }
        }
        i=false;
        while(!i) {

            System.out.println("Digite seu Sobrenome");

            sobrenome = scanner.nextLine();

            if (sobrenome.matches("[A-Z][a-z]{2,20}")) {

                System.out.println("Ok");
                i=true;

            } else {
                System.out.println("Sobrenome inválido!");
            }

        }

        String login = nome.charAt(0) + "_" + sobrenome;

        System.out.println("Seu login é: " + login);

        i=false;
        while(!i) {

            System.out.println("Digite uma senha");

            senha = scanner.nextLine();
            if (senha.matches("^(?=.*?[A-Z])(?=(.*[a-z]){1,})(?=(.*[\\d]){1,})(?=(.*[\\W]){1,})(?!.*\\s).{8,}$")) {

                System.out.println("Usuário "+login+" criado com sucesso!");
                i=true;

            }else{
                System.out.println("Senha Inválida!");

            }

        }

        i=false;

        System.out.println("Faça seu Login");

        while(!i) {

            System.out.println("Primeiro Insira seu Login:");

            String loginentrada = scanner.nextLine();

            System.out.println("Agora insira sua senha");

            String senhaentrada = scanner.nextLine();
            if(loginentrada.equals(login) && senhaentrada.equals(senha)){

                System.out.println("Acesso concedido");
                i=true;

            }else {
                System.out.println("Login e/ou Senha inválidos");
            }
        }
    }
}