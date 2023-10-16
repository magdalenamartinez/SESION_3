

public class Cuenta {
	double saldo = 0;
	
	public void Ingresar(double i) {
		saldo += i;
	}

	public double getSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}

	public void Retirar(double i) {
		// TODO Auto-generated method stub
		this.saldo -= i;
	}

}
