/**
 * A classe Multiplicacao implementa a interface Operacao e representa a operação de multiplicação.
 * Ela realiza a multiplicação dos dois números.
 * 
 * Exemplo de uso:
 *   Multiplicacao multiplicacao = new Multiplicacao();
 *   int resultado = multiplicacao.executar(4, 5); // Resultado será 20
 * 
 * @author Marcus Takeyasu
 * @version 1.0
 * @since 17/11/2023
 */
package projeto_calc;

public class Multiplicacao implements Operacao {
    
    /**
     * Realiza a operação de multiplicação dos dois números.
     * 
     * @param num1 O primeiro número a ser multiplicado.
     * @param num2 O segundo número a ser multiplicado.
     * @return O resultado da multiplicação.
     */
    @Override
    public int executar(int num1, int num2) {
        return num1 * num2;
    }
}
