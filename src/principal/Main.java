package principal;

import entidades.ContaBancaria;

public class Main {

	public static void main(String[] args) {
		
		ContaBancaria joao = new ContaBancaria("João", 1000);
		
		//Aces
		System.out.println(joao.saldo);
		//Alter
		joao.saldo = 30000;
		
		System.out.println("Titular: " + joao.getTitular());
		System.out.println("Saldo: " + joao.getSaldo());
		
		joao.setTitular("João Kleber");
		joao.depositar(500);
		joao.depositar(1000);
		joao.depositar(-50);
		joao.sacar(3000);
		joao.sacar(200);
		joao.sacar(100);
		
		System.out.println(joao.toString());
		
		
		
	}

}
