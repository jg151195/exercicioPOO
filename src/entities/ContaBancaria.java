package entities;

public class ContaBancaria {
	
	private int account;
	private String name;
	private double saldo;
	
	public ContaBancaria(int account, String name) {
		this.account = account;
		this.name = name;
	}
	
	public ContaBancaria(int account, String name,double saldo) {
		this.account = account;
		this.name = name;
		deposit(saldo);
	}
	
	public int getAccount() {
		return account;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void deposit(double valor) {
		
		saldo += valor;
		
	}
	
	public void withdraw(double valor) {
		
		saldo -= valor + 5.00;
		
	}
	
	public String toString() {
		
		return "Account "
				+account
				+", Holder: "
				+name
				+", Balance: $ "
				+saldo;
	}
}
