package projeto_calc;

public class TesteSoma {
    public static void main(String[] args) {
        Soma soma = new Soma();
        int resultado = soma.executar(3, 7);
        System.out.println("Resultado da soma: " + resultado);
    }
}

