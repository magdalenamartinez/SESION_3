package pkg;


public class Cuenta {
	
	double saldo = 0;
	
	public Cuenta(String string, String string2, double i) {
		saldo = i;
	}

	public void ingresar(double i) {
		saldo = i;
	}

	public double getSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}

	public void retirar(double i) {
		// TODO Auto-generated method stub
		this.saldo -= i;
	}

	public void setSaldo(double i) {
		this.saldo = i;
	}

}
