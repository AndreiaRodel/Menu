import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        System.out.println("Menu");

        int opcao;
        do {
            System.out.println("Opções");
            System.out.println("1- Opção 1 ");
            System.out.println("2- Opção 2 ");
            System.out.println("3- Sair ");
            System.out.print("Selecione uma opção:  ");

            Scanner menu = new Scanner(System.in);
            opcao = menu.nextInt();

            processar(opcao);
        }   while (opcao != 3);
    }

    public static void processar(int opcao) {
        switch (opcao) {
            case 1:
                System.out.println("opcao 1 selecionada");
                break;
            case 2:
                System.out.println("opcao 2 selecionada");
                break;
            case 3:
                System.out.println("Sair");
                break;
            default:
                System.out.println("Seleção Inválida");
                break;
        }
    }
}
        

      
         
           
     
    