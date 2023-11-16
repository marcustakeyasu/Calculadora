package projeto_calc;

public class TesteSubtracao {
    public static void main(String[] args) {
        Subtracao subtracao = new Subtracao();
        int resultado = subtracao.executar(8, 3);
        System.out.println("Resultado da subtração: " + resultado);
    }
}

