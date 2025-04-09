package entidades;

public class ContaBancaria {
	
	public String titular;
	public double saldo;
	
	
	public ContaBancaria(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	
	// getters - Aces the value
	
	public String getTitular() {
		return titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	//Setters - Alter the value
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Titular: " + titular + 
				"\nSaldo: " + saldo;
	}
	
	
	
	}


