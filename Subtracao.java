/**
 * A classe Subtracao implementa a interface Operacao e representa a operação de subtração.
 * Ela realiza a subtração do segundo número do primeiro.
 * 
 * Exemplo de uso:
 *   Subtracao subtracao = new Subtracao();
 *   int resultado = subtracao.executar(8, 3); // Resultado será 5
 * 
 * @author Marcus Takeyasu
 * @version 1.0
 * @since 17/11/2023
 */
package projeto_calc;

public class Subtracao implements Operacao {
    
    /**
     * Realiza a operação de subtração do segundo número do primeiro.
     * 
     * @param num1 O número do qual será subtraído.
     * @param num2 O número a ser subtraído do primeiro.
     * @return O resultado da subtração.
     */
    @Override
    public int executar(int num1, int num2) {
        return num1 - num2;
    }
}
