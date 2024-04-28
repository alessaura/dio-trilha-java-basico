package desafio_dio_banco;

public class Main {

	public static void main(String[] args) {
		Cliente alessandra = new Cliente ();
		alessandra.setNome("Alessandra");
		
		
		Conta cc = new ContaCorrente (alessandra);
		Conta poupanca = new ContaPoupança (alessandra);
		
		cc.depositar(100);
		poupanca.transferir(100, cc );
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}