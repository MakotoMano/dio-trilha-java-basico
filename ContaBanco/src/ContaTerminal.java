import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o numero da Conta: ");
		int numero = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Informe a sua Agência: ");
		String agencia = sc.nextLine();
		
		System.out.print("Informe o seu nome completo: ");
		String nomeCliente = sc.nextLine();
		
		System.out.print("Informe o valor do saldo inicial: ");
		double saldo = sc.nextDouble();
		
		System.out.println();
		
		System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia
				 + ", " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");
		
	}

}
