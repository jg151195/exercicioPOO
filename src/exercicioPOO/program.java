package exercicioPOO;
import java.util.Locale;
import java.util.Scanner;
import entities.ContaBancaria;

public class program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaBancaria cb;
		System.out.printf("Enter account number: ");
		int account = sc.nextInt();
		System.out.printf("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.printf("Is there an initial deposit (y/n) ? ");
		String answer = sc.nextLine();
		if (answer == "y") {
			System.out.printf("Enter initial deposit value: ");
			double valor = sc.nextDouble();
			cb = new ContaBancaria(account, name,valor);
			cb.deposit(valor);
		}
		else {
			cb = new ContaBancaria(account, name);
		}
		System.out.printf("Account data: " + cb.toString());
		System.out.printf("%nEnter a deposit value: ");
		double valor1 = sc.nextDouble();
		System.out.printf("Updated account data: ");
		cb.deposit(valor1);
		System.out.printf(cb.toString());
		
		System.out.printf("%nEnter a withdraw value: ");
		double valor2 = sc.nextDouble();
		System.out.printf("Updated account data: ");
		cb.withdraw(valor2);
		System.out.printf(cb.toString());
		
		sc.close();

	}

}
