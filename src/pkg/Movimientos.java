package pkg;

public class Movimientos {
	
	Double importe;
	enum Signo{D, H};
	Signo signo;
	String detalle;
	
	public Movimientos(double saldo, Signo c, String detalle) {
		this.importe = saldo;
		this.signo = c;
		this.detalle = detalle;
		
	}
}
