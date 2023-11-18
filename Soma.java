/**
 * A classe Soma implementa a interface Operacao e representa a operação de adição.
 * Ela realiza a soma de dois números inteiros.
 * 
 * Exemplo de uso:
 *   Soma soma = new Soma();
 *   int resultado = soma.executar(5, 3); // Resultado será 8
 * 
 * @author Marcus Takeyasu
 * @version 1.0
 * @since 17/11/2023
 */
package projeto_calc;

public class Soma implements Operacao {
    
    /**
     * Realiza a operação de adição sobre dois números inteiros.
     * 
     * @param num1 O primeiro número a ser somado.
     * @param num2 O segundo número a ser somado.
     * @return O resultado da adição dos dois números.
     */
    @Override
    public int executar(int num1, int num2) {
        return num1 + num2;
    }
}
