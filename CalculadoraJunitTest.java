/* package projeto_calc;

import static org.junit.jupiter.api.Assertions.*;

import junit.framework.Assert;

import org.junit.jupiter.api.Test;

class CalculadoraJunitTest {
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void SomarDoisNumerosPositivos() {
		
		// Cria uma instância da Calculadora
		Calculadora calc = new Calculadora();
		
		//Cria isntâncias das operações desejadas
		Soma soma = new Soma();
		Subtracao subtracao = new Subtracao();
		Divisao divisao = new Divisao();
		Multiplicacao multiplicacao = new Multiplicacao();
		
		//SOMA
		
		//Cenário 1: Soma de dois valores
		int resultSoma = calc.calcular(soma, 5, 3);
		Assert.assertEquals(8, resultSoma);
		
		//Cenário de teste 2: Soma de dois valores sendo um zero
		resultSoma = soma.executar(3, 0);
		Assert.assertEquals(5, resultSoma);
		
		//Cenário de teste 3: Soma de dois valores sendo que ambos são zero
		resultSoma = soma.executar(0, 0);
		Assert.assertEquals(0, resultSoma);
		
		//Cenário de teste 4: Soma de dois valores sendo 1 negativo
		resultSoma = soma.executar(5, -1);
		Assert.assertEquals(4, resultSoma);
		
		//SUBTRAÇÃO
		
		//Cenário de teste 1: Subtração de dois valores
		int resultSub = subtracao.executar(8, 3);
		Assert.assertEquals(4, resultSub);
		
		//Cenário de teste 2: Subtração de dois valores sendo um zero
		resultSub = subtracao.executar(3, 0);
		Assert.assertEquals(3, resultSub);
		
		//Cenário de teste 3: Subtração de dois valores sendo que ambos são zero
        resultSub = subtracao.executar(0, 0);
        Assert.assertEquals(0, resultSub);
        
        //Cenário de teste 4: Subtração de dois valores sendo 1 negativo
        resultSub = subtracao.executar(5, -1);
        Assert.assertEquals(6, resultSub);
        
        //DIVISÃO
        
        //Cenário de teste 1: Divisão de dois valores
        int resultDiv = divisao.executar(24, 8);
        Assert.assertEquals(3, resultDiv);
        
        //Cenário de teste 2: Divisão de dois valores sendo um zero
        resultDiv = divisao.executar(3, 0);
        Assert.assertEquals(1, resultDiv);
        
        //Cenário de teste 3: Divisão de dois valores sendo que ambos são zero
        resultDiv = divisao.executar(0, 0);
        Assert.assertEquals(0, resultDiv);
        
        //Cenário de teste 4: Divisão de dois valores sendo 1 negativo
        resultDiv = divisao.executar(5, -1);
        Assert.assertEquals(-5, resultDiv);
        
        //MULTIPLICAÇÃO
        
        //Cenário de teste 1: Multiplacação de dois valores
        int resultMulti = multiplicacao.executar(4, 5);
        Assert.assertEquals(20, resultMulti);
        
        //Cenário de teste 2: Multiplicação de dois valores sendo um zero
        resultMulti = multiplicacao.executar(3, 0);
        Assert.assertEquals(0, resultMulti);
        
        //Cenário de teste 3: Multiplicação de dois valores sendo que ambos são zero
        resultMulti = multiplicacao.executar(0, 0);
        Assert.assertEquals(0, resultMulti);
        
        //Cenário de teste 4: Multiplicação de dois valores sendo 1 negativo
        resultMulti = multiplicacao.executar(5, -1);
        Assert.assertEquals(5, resultMulti);
	}

} */	
