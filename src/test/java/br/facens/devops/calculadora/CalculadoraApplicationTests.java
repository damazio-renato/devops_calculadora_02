package br.facens.devops.calculadora;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculadoraApplicationTests {

	@Test
	void contextLoads() {
	}

    @Autowired
    private CalculadoraController calculadoraController;

    @Test
    void testSomar() {
        int resultado = calculadoraController.somar(10, 5);
        assertEquals(15, resultado);
    }

    @Test
    void testSubtrair() {
        int resultado = calculadoraController.subtrair(10, 5);
        assertEquals(5, resultado);
    }
    
    @Test
    void testDividir() {
        int resultado = calculadoraController.dividir(10, 5);
        assertEquals(2, resultado);
    }
    
    @Test
    void testMultiplicar() {
        int resultado = calculadoraController.multiplicar(10, 5);
        assertEquals(50, resultado);
    }

}
