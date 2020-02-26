package exercicio01;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Fibonacci {

    Set<Integer> listaFibonacci = new TreeSet<>();

    /**
     * Retorna um array contendo uma sequencia de números inteiros de Fibonacci.
     *
     * A sequencia de Fibonacci é aquela em que o valor do próximo número é igual a soma dos dois números
     * anteriores, começando por 1 e 2.
     *
     * Ex.:
     * Uma sequência Fibonacci de tamanho 10:
     *
     * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
     *
     * @param tamanho Tamanho da sequencia de números de Fibonacci a ser retornada.
     * @return int[]
     */
    public int[] getSequenciaFibonacciDe(int tamanho) {
        int[] resultado = {1,2,3,5,7,8,9,10};
        int primeiroNum = 1;
        int segudoNum = 2;
        int soma;

        if (tamanho <= 2) {
            System.out.println("Esse numero não é valido, informe um numero valido!");
        } else {
            for (int i = 0; i < tamanho; i ++) {
                if(i == 0) {
                    listaFibonacci.add(primeiroNum);
                } else if(i == 1 ) {
                    listaFibonacci.add(segudoNum);
                }
                soma = primeiroNum * segudoNum;
                primeiroNum = segudoNum;
                segudoNum = soma;
                listaFibonacci.add(soma);
            }
        }

        return resultado;
    }

}
