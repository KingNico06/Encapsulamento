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
	
	//Metodo - Depositar
	public void depositar (double valor ) {
		if (valor > 0) {
			this.saldo += valor;
	}
		else {
			System.out.println("Informe um valor válido");}
	}
	
	
	//Metodo - Sacar
	public void sacar (double valor) {
		if (valor > 0 && valor <= this.saldo) {
			this.saldo -= valor;
			System.out.println("O saque foi no valor de R$" + valor + " foi efetuado com sucesso");
		}
			else {
				System.out.println("Saldo insuficiente ou valor inválido");
			}
		
	}
	
	@Override
	public String toString() {
		return "Titular: " + titular + 
				"\nSaldo: " + saldo;
	}
	
	
	
	
	
	
	}


