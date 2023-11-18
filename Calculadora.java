/**
 * A classe Calculadora representa uma calculadora simples que realiza operações matemáticas
 * utilizando objetos que implementam a interface Operacao.
 * 
 * @author Marcus Takeyasu
 * @version 1.01
 * @since 17/11/2023
 */
package projeto_calc;

public class Calculadora {
    
    /**
     * Método para realizar uma operação matemática utilizando um objeto que implementa a interface Operacao.
     * 
     * @param operacao Um objeto que implementa a interface Operacao (por exemplo, Soma, Subtracao, etc.).
     * @param num1 O primeiro número da operação.
     * @param num2 O segundo número da operação.
     * @return O resultado da operação matemática.
     */
    public int calcular(Operacao operacao, int num1, int num2) {
        return operacao.executar(num1, num2);
    }
}
