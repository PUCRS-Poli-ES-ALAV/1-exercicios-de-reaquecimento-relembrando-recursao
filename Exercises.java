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

        // System.out.print("Digite uma string para inverter: ");
        // String inputString = sc.nextLine();
        // String invertedString = inverteString(inputString);
        // System.out.println("A string invertida é: " + invertedString);
    
        // System.out.print("Digite o valor de N para a sequência: ");
        // int n = sc.nextInt();
        // int sequenceResult = geraSequencia(n);
        // System.out.println("O resultado da sequência é: " + sequenceResult);

        // System.out.print("Digite o valor de m para Ackerman: ");
        // int m = sc.nextInt();
        // System.out.print("Digite o valor de n para Ackerman: ");
        // int n = sc.nextInt();
        // int ackermanResult = geraAckerman(m, n);
        // System.out.println("O resultado da função de Ackerman é: " + ackermanResult);

        // System.out.print("Digite o tamanho do vetor: ");
        // int size = sc.nextInt();
        // int[] vetor = new int[size];
        // for (int i = 0; i < size; i++) {
        //     System.out.print("Digite o elemento " + (i + 1) + ": ");
        //     vetor[i] = sc.nextInt(); 
        // }
        // int sumVectorResult = somaVetor(vetor, 0);
        // int productVectorResult = produtoVetor(vetor, 0);
        // System.out.println("A soma dos elementos do vetor é: " + sumVectorResult);
        // System.out.println("O produto dos elementos do vetor é: " + productVectorResult);

        System.out.print("Digite uma palavra para verificar se é palíndromo: ");
        String word = sc.nextLine();
        boolean isPalindrome = verificaPalindromo(word);
        if (isPalindrome) {
            System.out.println("A palavra é um palíndromo.");
        } else {
            System.out.println("A palavra não é um palíndromo.");
        }

    }

    // ===== Desenvolva algoritmos recursivos para os seguintes problemas e implemente-os =====


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

    // Gerador da sequência dada por:
    // * F(1) = 1
    // * F(2) = 2
    // * F(n) = 2 ∗ F(n − 1) + 3 ∗ F(n − 2).
    public static int geraSequencia(int n) {
        // Validação
        if (n <= 0) {
            throw new IllegalArgumentException("N deve ser positivo");
        }
        
        // Casos base
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        
        // Passo recursivo
        return 2 * geraSequencia(n - 1) + 3 * geraSequencia(n - 2);
    }


    // Gerador de Sequência de Ackerman:
    // * A(m, n) = n + 1, se m = 0
    // * A(m, n) = A(m − 1, 1), se m != 0 e n = 0
    // * A(m, n) = A(m − 1, A(m, n − 1)), se m != 0 e n != 0.
    public static int geraAckerman(int m, int n) {
        // Validação
        if (m < 0 || n < 0) {
            throw new IllegalArgumentException("m e n devem ser não negativos");
        }
        
        // Caso base: A(0, n) = n + 1
        if (m == 0) {
            return n + 1;
        }
        
        // Caso recursivo: A(m, 0) = A(m - 1, 1)
        if (n == 0) {
            return geraAckerman(m - 1, 1);
        }
        
        // Caso recursivo: A(m, n) = A(m - 1, A(m, n - 1))
        return geraAckerman(m - 1, geraAckerman(m, n - 1)); 
    }


    // A partir de um vetor de números inteiros, calcule a soma e o produto dos elementos
    // do vetor.
    public static int somaVetor(int[] vetor, int index) {
        // Validação
        if (vetor == null || index < 0 || index >= vetor.length) {
            throw new IllegalArgumentException("Vetor inválido ou índice fora do intervalo");
        }
        
        // Caso base: se index for o último elemento, retorna o valor do elemento
        if (index == vetor.length - 1) {
            return vetor[index];
        }
        
        // Passo recursivo: soma o elemento atual com a soma dos elementos restantes
        return vetor[index] + somaVetor(vetor, index + 1);
    }
    public static int produtoVetor(int[] vetor, int index) {
        // Validação
        if (vetor == null || index < 0 || index >= vetor.length) {
            throw new IllegalArgumentException("Vetor inválido ou índice fora do intervalo");
        }
            
        // Caso base: se index for o último elemento, retorna o valor do elemento
        if (index == vetor.length - 1) {
            return vetor[index];
        }
            
        // Passo recursivo: multiplica o elemento atual com o produto dos elementos restantes
        return vetor[index] * produtoVetor(vetor, index + 1);
    }


    // Verifique se uma palavra é palíndromo (Ex. aba, abcba, xyzzyx)
    public static boolean verificaPalindromo(String palavra) {
        // Validação
        if (palavra == null) {
            throw new IllegalArgumentException("A palavra não pode ser null");
        }
        
        // Caso base: se a palavra tiver 0 ou 1 caracteres, é um palíndromo
        if (palavra.length() <= 1) {
            return true;
        }
        
        // Verifica se o primeiro e o último caracteres são iguais
        if (palavra.charAt(0) != palavra.charAt(palavra.length() - 1)) {
            return false;
        }
        
        // Passo recursivo: verifica o substring sem o primeiro e o último caracteres
        return verificaPalindromo(palavra.substring(1, palavra.length() - 1));
    }

}
