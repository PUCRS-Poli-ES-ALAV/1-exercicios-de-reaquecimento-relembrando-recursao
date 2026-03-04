import java.util.Scanner;

public class Exercises {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);

        // System.out.print("Digite o primeiro número: ");
        // int nro1 = sc.nextInt();
        // System.out.print("Digite o segundo número: ");
        // int nro2 = sc.nextInt();
        // int result = multiplicaNumeros(nro1, nro2);
        // System.out.println("O resultado da multiplicação é: " + result);

        // System.out.print("Digite o primeiro número para soma: ");
        // int num1 = sc.nextInt();
        // System.out.print("Digite o segundo número para soma: ");
        // int num2 = sc.nextInt();
        // int sumResult = somaNumeros(num1, num2);
        // System.out.println("O resultado da soma é: " + sumResult);

        // System.out.print("Digite o valor de N para o cálculo: ");
        // int n = sc.nextInt();
        // double calcResult = calculaSerie(n);
        // System.out.println("O resultado do cálculo é: " + calcResult);

        System.out.print("Digite uma string para inverter: ");
        String inputString = sc.nextLine();
        String invertedString = inverteString(inputString);
        System.out.println("A string invertida é: " + invertedString);
    

    }

    // Desenvolva algoritmos recursivos para os seguintes problemas e implemente-os


    // Multiplicação de dois números naturais, através de somas sucessivas (Ex.: 6 ∗ 4 = 4 + 4 + 4 + 4 + 4 + 4)
    public static int multiplicaNumeros(int nro1, int nro2) {
        // Caso base: se nro1 for 0, o resultado é 0
        if (nro1 == 0) {
            return 0;
        }
        
        // Caso base: se nro1 for 1, retorna o próprio nro2
        if (nro1 == 1) {
            return nro2;
        }
        
        // Passo recursivo: nro2 + multiplicaNumeros(nro1 - 1, nro2)
        // Exemplo: 4 * 3 = 3 + (3 * 3) = 3 + 9 = 12
        return nro2 + multiplicaNumeros(nro1 - 1, nro2);
    }


    // Soma de dois números naturais, através de incrementos sucessivos (Ex.: 3 + 2 = + + (+ + + 1))
    public static int somaNumeros(int nro1, int nro2) {
        // Caso base: se nro2 for 0, o resultado é nro1
        if (nro2 == 0) {
            return nro1;
        }
        
        // Passo recursivo: incrementa nro1 e decrementa nro2
        // Exemplo: 3 + 2 = incrementa 3 para 4 e decrementa 2 para 1, depois incrementa 4 para 5 e decrementa 1 para 0
        return somaNumeros(nro1 + 1, nro2 - 1);
    }


    // Cálculo de 1 + 1/2 + 1/3 + 1/4 + ... + 1/N
    public static double calculaSerie(int n) {
        // Validação
        if (n <= 0) {
            throw new IllegalArgumentException("N deve ser positivo");
        }
        
        // Caso base
        if (n == 1) {
            return 1.0;
        }
        
        // Passo recursivo
        return 1.0/n + calculaSerie(n - 1);
    }


    // Inversão de uma string
    public static String inverteString(String string) {

        // Caso 1: string é null
        if (string == null) {
            return null;
        }
        
        // Caso 2: string vazia (caso base da recursão)
        if (string.isEmpty()) {  // ou string.length() == 0
            return "";
        }
    
        return string.charAt(string.length()-1) + inverteString(string.substring(0, string.length()-1));
    }

}
