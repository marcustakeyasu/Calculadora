package projeto_calc;

public class Soma implements Operacao {
    @Override
    public int executar(int num1, int num2) {
        return num1 + num2;
    }
}

