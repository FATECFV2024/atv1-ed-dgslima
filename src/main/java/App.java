package main;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        boolean sair = false;

        while (!sair) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Exercício 1");
            System.out.println("2. Exercício 2");
            System.out.println("3. Exercício 3");
            System.out.println("4. Exercício 4");
            System.out.println("5. Exercício 5");
            System.out.println("6. Exercício 6");
   
            System.out.println("7. Sair");

    
            int opcao = 0;
            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
            } else {
                System.out.println("Por favor, insira um número válido.");
                scanner.nextLine(); 
                continue;
            }
    
            switch (opcao) {
                case 1:
                    Ex1(scanner);
                    break;
                case 2:
                    Ex2(scanner);
                    break;
                case 3:
                    Ex3(scanner);
                    break;
                case 4:
                    Ex4(scanner);
                    break;
                case 5:
                    Ex5(scanner);
                    break;
                case 6:
                    Ex6(scanner);
                    break;
           
                case 7:
                    sair = true;
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        }
    
        scanner.close();
    

    }

    public static void Ex1(Scanner scanner) {
       

        

   
    }

    public static void Ex2(Scanner scanner) {

        

        


    }

    public static void Ex3(Scanner scanner) {
   

       

    }

    public static void Ex4(Scanner scanner) {
       
        
    
    }

    public static void Ex5(Scanner scanner) {
       

       

    
    
    }

    public static void Ex6(Scanner scanner) {
   

       


    }

    private static void preencherMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i + j;
            }
        }
    }


    private static int[][] somarMatrizes(int[][] matriz1, int[][] matriz2) {
        int[][] soma = new int[matriz1.length][matriz1[0].length];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                soma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return soma;
    }

    private static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

}
