/**
 * A interface Operacao define um contrato para classes que representam operações matemáticas.
 * Classes que implementam esta interface devem fornecer uma implementação para o método executar,
 * que realiza a operação sobre dois números inteiros.
 * 
 * Exemplo de implementação: Soma, Subtracao, Multiplicacao, Divisao, etc.
 * 
 * @author Marcus Takeyasu
 * @version 1.0
 * @since 17/11/2023
 */
package projeto_calc;

public interface Operacao {
    
    /**
     * Realiza a operação matemática sobre dois números inteiros.
     * 
     * @param num1 O primeiro número da operação.
     * @param num2 O segundo número da operação.
     * @return O resultado da operação.
     */
    int executar(int num1, int num2);
}
