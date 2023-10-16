package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class MovimientosTest {
	static Cuenta cuenta1;
	static Cuenta cuenta2;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cuenta1 = new Cuenta("Titular1", "12345", 50);
		cuenta2 = new Cuenta("Titular2", "67890", 0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}


	@Test
	void test_Cuenta_1() {
		cuenta1.retirar(200);
		cuenta1.ingresar(100); 
		cuenta1.retirar(200); 
		assertEquals(-250, cuenta1.getSaldo());
		System.out.println("Saldo Cuenta 1: " + cuenta1.getSaldo());
	}

	@Test
	void test_Cuenta_2() {
		cuenta2.retirar(350); //-350
		cuenta2.retirar(200); //ERROR SALDO -350
		cuenta2.retirar(150); //-500
		cuenta2.ingresar(50);//-450
		cuenta2.retirar(100);//ERROR SALDO INSUFICNETE -450
		assertEquals(-450, cuenta2.getSaldo());
		System.out.println("Saldo Cuenta 2: " + cuenta2.getSaldo());
	}
	
	@Test
	void test_Instrucciones() {
		cuenta1.retirar(200);
		cuenta2.retirar(350);
		cuenta1.ingresar(100);
		cuenta2.retirar(200);
		cuenta2.retirar(150);
		cuenta1.retirar(200);
		cuenta2.ingresar(50);
		cuenta2.retirar(100);
		System.out.println("Saldo Cuenta 1: " + cuenta1.getSaldo());
		System.out.println("Saldo Cuenta 2: " + cuenta2.getSaldo());
	}
}
