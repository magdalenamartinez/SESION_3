package pkg;

import java.util.ArrayList;
import java.util.List;

import pkg.Movimientos.Signo;



public class Cuenta {
	
	double saldo = 0;
	String titular;
	String numero;
	List<Movimientos> mMovimientos;
	
	public Cuenta(String titular, String numero, double saldo) {
		this.saldo = saldo;
		this.titular = titular;
		this.numero = numero;
		this.mMovimientos = new ArrayList<>();
	}

	public void ingresar(double i) {
		this.saldo += i;
		Movimientos mov = new Movimientos(this.saldo, Signo.D, "Detalle");
		mMovimientos.add(mov);
	}

	public void setSaldo(double i) {
		this.saldo = i;
	}
	
	public double getSaldo() {
		return this.saldo;
	}

	public void retirar(double i) {
		double resto = 0;
		if (i < 0) {
			resto = i + this.saldo;
		} else {
			resto = this.saldo - i;
		}
		double s = -500;
		if (resto >= s) {
			this.saldo -= i;	
			Movimientos mov = new Movimientos(this.saldo, Signo.H, "Detalle");
			mMovimientos.add(mov);
		} else {
			System.out.print("Fondos insuficientes (saldo " + this.saldo + ")");
			System.out.println(" en la cuenta " + this.numero + " para el reintegro de " + i);
		}
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getTitular() {
		return this.titular;
	}

	public void setNumero(String num) {
		this.numero = num;
	}

	public String getNumero() {
		return this.numero;
	}

	

}
