/**
 * A classe Divisao implementa a interface Operacao e representa a operação de divisão.
 * Ela realiza a divisão do primeiro número pelo segundo, tratando casos de divisão por zero.
 * 
 * Exemplo de uso:
 *   Divisao divisao = new Divisao();
 *   int resultado = divisao.executar(8, 2); // Resultado será 4
 * 
 * @author Marcus Takeyasu
 * @version 1.0
 * @since 17/11/2023
 */
package projeto_calc;

public class Divisao implements Operacao {
    
    /**
     * Realiza a operação de divisão do primeiro número pelo segundo.
     * 
     * @param num1 O número a ser dividido.
     * @param num2 O número pelo qual será feita a divisão.
     * @return O resultado da divisão, ou 0 se a divisão por zero for detectada.
     */
    @Override
    public int executar(int num1, int num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Não é possível dividir por zero.");
            return 0;
        }
    }
}
