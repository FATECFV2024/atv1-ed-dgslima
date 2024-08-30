package test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import main.App;

public class AppTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testEx1() {
        // Simula a entrada do usuário
        String input = "15\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    
        // Executa o método Ex1
        App.Ex1(new java.util.Scanner(System.in));
    
        // Espera que o vetor N tenha valores corretos
        String expectedOutput = "Digite um valor inteiro (<= 20): Valores do vetor N:\n15 30 60 120 240 480 960 1920 3840 7680 \n";
        String actualOutput = outContent.toString().trim();
    
        // Remove espaços em branco e quebras de linha desnecessárias
        expectedOutput = expectedOutput.replaceAll("\\s+", "");
        actualOutput = actualOutput.replaceAll("\\s+", "");
    
        // Verifica a saída no console
        assertEquals(expectedOutput, actualOutput);
    }
    
    @Test
    public void testEx2() {
        // Simula a entrada do usuário
        String input = "50\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Executa o método Ex2
        App.Ex2(new java.util.Scanner(System.in));

        // Espera que o vetor N tenha valores corretos
        String expectedOutput = "Digite um valor inteiro (entre 2 e 99): Valores do vetor N:\n50 49 48 47 46 45 44 43 42 41";
        String actualOutput = outContent.toString().trim();

        // Remove espaços em branco e quebras de linha desnecessárias
        expectedOutput = expectedOutput.replaceAll("\\s+", "");
        actualOutput = actualOutput.replaceAll("\\s+", "");

        // Verifica a saída no console
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testEx3() {
        // Simula a entrada do usuário
        String input = "10\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    
        // Executa o método Ex3
        App.Ex3(new java.util.Scanner(System.in));
    
        // Espera que o vetor N tenha valores corretos
        String expectedOutput = "Digite um valor inteiro (entre 2 e 1000): Valores do vetor N:\n1 2 3 4 5 6 7 8 9 10 \n";
        String actualOutput = outContent.toString().trim();
    
        // Remove espaços em branco e quebras de linha desnecessárias
        expectedOutput = expectedOutput.replaceAll("\\s+", "");
        actualOutput = actualOutput.replaceAll("\\s+", "");
    
        // Verifica a saída no console
        assertEquals(expectedOutput, actualOutput);
    }
    
    @Test
    public void testEx4() {
        // Simula a entrada do usuário
        String input = "10\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    
        // Executa o método Ex4
        App.Ex4(new java.util.Scanner(System.in));
    
        // Espera que o vetor N tenha valores corretos e a soma
        String expectedOutput = "Digite um valor inteiro (entre 2 e 99): Valores do vetor N:\n10 11 12 13 14 15 16 17 18 19 \nTotal da somatória dos valores: 145";
        String actualOutput = outContent.toString().trim();
    
        // Remove espaços em branco e quebras de linha desnecessárias
        expectedOutput = expectedOutput.replaceAll("\\s+", "");
        actualOutput = actualOutput.replaceAll("\\s+", "");
    
        // Verifica a saída no console
        assertEquals(expectedOutput, actualOutput);
    }
    
    @Test
    public void testEx5() {
        // Simula a entrada do usuário
        String input = "3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    
        // Executa o método Ex5
        App.Ex5(new java.util.Scanner(System.in));
    
        // Espera que a matriz N tenha os valores corretos
        String expectedOutput = "Digite um valor inteiro (entre 2 e 50): Valores da matriz N:\n0 1 2 \n1 2 3 \n2 3 4 \n";
        String actualOutput = outContent.toString().trim();
    
        // Remove espaços em branco e quebras de linha desnecessárias
        expectedOutput = expectedOutput.replaceAll("\\s+", "");
        actualOutput = actualOutput.replaceAll("\\s+", "");
    
        // Verifica a saída no console
        assertEquals(expectedOutput, actualOutput);
    }
    
    @Test
    public void testEx6() {
        // Simula a entrada do usuário
        String input = "4\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    
        // Executa o método Ex6
        App.Ex6(new java.util.Scanner(System.in));
    
        // Espera que as matrizes N, Z e soma tenham os valores corretos
        String expectedOutput = "Digite um valor inteiro (entre 4 e 50): Valores da matriz N:\n0 1 2 3 \n1 2 3 4 \n2 3 4 5 \n3 4 5 6 \nValores da matriz Z:\n0 1 2 3 \n1 2 3 4 \n2 3 4 5 \n3 4 5 6 \nValores da matriz de soma:\n0 2 4 6 \n2 4 6 8 \n4 6 8 10 \n6 8 10 12 \n";
        String actualOutput = outContent.toString().trim();
    
        // Remove espaços em branco e quebras de linha desnecessárias
        expectedOutput = expectedOutput.replaceAll("\\s+", "");
        actualOutput = actualOutput.replaceAll("\\s+", "");
    
        // Verifica a saída no console
        assertEquals(expectedOutput, actualOutput);
    }
    
}
