package projeto_calc;

public class Divisao implements Operacao {
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

