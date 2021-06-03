package br.com.alura.tdd;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

// Sempre será nomeado o nome da class + Test;
public class CalculadoraTest {
	// n usa o método main

	@SuppressWarnings("deprecation")
	@Test
	public void deveriaSomarDoisNumerosPositivos() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(3, 7);
		
		Assert.assertEquals(10, soma);
	}

}
