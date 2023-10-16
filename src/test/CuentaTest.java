package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class CuentaTest {

	static Cuenta aux;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		aux = new Cuenta("Titular1", "12345", 50);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() {
		aux.ingresar(1000);
		assertEquals(1000, aux.getSaldo());
	}

	@Test
	void testRetirar() {
		aux.retirar(100);
		assertEquals(-100, aux.getSaldo());
	}
	
	@Test
	void testRetirarDescubierto() {
		double cant = -600;
		aux.retirar(cant);
		assertEquals(0,aux.getSaldo());
	}
	
	@Test
	void testSetSaldo() {
		aux.setSaldo(100);
		assertEquals(100, aux.getSaldo());
	}
	
	@Test
	void testSetTitular() {
		aux.setTitular("Juan");
		assertEquals("Juan", aux.getTitular());
	}
	
	@Test
	void testSetNumero() {
		aux.setNumero("123");
		assertEquals("123", aux.getNumero());
	}
	
	@Test
	void testGetTitular() {
		assertEquals("Manuel", aux.getTitular());
	}

	@Test
	void testGetNumero() {
		aux.setNumero("12345");
		assertEquals("12345", aux.getNumero());
	}
	
	@Test
	void testGetSaldo() {
		assertEquals(0, aux.getSaldo());
	}
	
}