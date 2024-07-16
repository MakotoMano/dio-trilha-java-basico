

public class Main {

	public static void main(String[] args) {
		Cliente makoto = new Cliente();
		makoto.setNome("Venilton");
		
		Conta cc = new ContaCorrente(makoto);
		Conta poupanca = new ContaPoupanca(makoto);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}