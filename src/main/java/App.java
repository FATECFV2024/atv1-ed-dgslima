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
                scanner.nextLine(); // Limpa o buffer do scanner
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
       

        int[] N = new int[10];
        int value;

        // Entrada e validação do valor
        do {
            System.out.print("Digite um valor inteiro (<= 20): ");
            value = scanner.nextInt();
        } while (value > 20);

        // Armazenamento do valor na primeira posição do vetor
        N[0] = value;

        // Processamento para calcular os valores do vetor
        for (int i = 1; i < N.length; i++) {
            N[i] = N[i - 1] * 2;
        }

        // Saída dos valores do vetor
        System.out.println("Valores do vetor N:");
        for (int num : N) {
            System.out.print(num + " ");
        }

   
    }

    public static void Ex2(Scanner scanner) {

        

        int[] N = new int[10];
        int value;

        // Entrada e validação do valor
        do {
            System.out.print("Digite um valor inteiro (entre 2 e 99): ");
            value = scanner.nextInt();
        } while (value <= 1 || value >= 100);

        // Armazenamento do valor na primeira posição do vetor
        N[0] = value;

        // Processamento para preencher as posições subsequentes do vetor
        for (int i = 1; i < N.length; i++) {
            N[i] = N[i - 1] - 1;
        }

        // Saída dos valores do vetor
        System.out.println("Valores do vetor N:");
        for (int num : N) {
            System.out.print(num + " ");
        }


    }

    public static void Ex3(Scanner scanner) {
   

        int value;

        // Entrada e validação do valor
        do {
            System.out.print("Digite um valor inteiro (entre 2 e 1000): ");
            value = scanner.nextInt();
        } while (value <= 1 || value > 1000);

        // Criação e preenchimento do vetor
        int[] N = new int[value];
        for (int i = 0; i < N.length; i++) {
            N[i] = i + 1;
        }

        // Saída dos valores do vetor
        System.out.println("Valores do vetor N:");
        for (int num : N) {
            System.out.print(num + " ");
        }


    }

    public static void Ex4(Scanner scanner) {
       
        int[] N = new int[10];
        int value;

        // Entrada e validação do valor
        do {
            System.out.print("Digite um valor inteiro (entre 2 e 99): ");
            value = scanner.nextInt();
        } while (value <= 1 || value >= 100);

        // Armazenamento do valor na primeira posição do vetor
        N[0] = value;

        // Preenchimento das posições subsequentes do vetor e cálculo da somatória
        int soma = value;
        for (int i = 1; i < N.length; i++) {
            N[i] = N[i - 1] + 1;
            soma += N[i];
        }

        // Saída dos valores do vetor e da somatória
        System.out.println("Valores do vetor N:");
        for (int num : N) {
            System.out.print(num + " ");
        }
        System.out.println("\nTotal da somatória dos valores: " + soma);

    
    }

    public static void Ex5(Scanner scanner) {
       

        int value;

        // Entrada e validação do valor
        do {
            System.out.print("Digite um valor inteiro (entre 2 e 50): ");
            value = scanner.nextInt();
        } while (value <= 1 || value > 50);

        // Criação e preenchimento da matriz
        int[][] N = new int[value][value];
        for (int i = 0; i < N.length; i++) {
            for (int j = 0; j < N[i].length; j++) {
                N[i][j] = i + j;
            }
        }

        // Saída dos valores da matriz
        System.out.println("Valores da matriz N:");
        for (int i = 0; i < N.length; i++) {
            for (int j = 0; j < N[i].length; j++) {
                System.out.print(N[i][j] + " ");
            }
            System.out.println();
        }

    
    
    }

    public static void Ex6(Scanner scanner) {
   

        int value;

        // Entrada e validação do valor
        do {
            System.out.print("Digite um valor inteiro (entre 4 e 50): ");
            value = scanner.nextInt();
        } while (value <= 3 || value > 50);

        // Criação e preenchimento das matrizes N e Z
        int[][] N = new int[value][value];
        int[][] Z = new int[value][value];
        preencherMatriz(N);
        preencherMatriz(Z);

        // Criação e preenchimento da matriz de soma
        int[][] soma = somarMatrizes(N, Z);

        // Saída dos valores das matrizes
        System.out.println("Valores da matriz N:");
        exibirMatriz(N);
        System.out.println("Valores da matriz Z:");
        exibirMatriz(Z);
        System.out.println("Valores da matriz de soma:");
        exibirMatriz(soma);


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
