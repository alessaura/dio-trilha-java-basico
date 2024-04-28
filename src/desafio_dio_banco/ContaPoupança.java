package desafio_dio_banco;

public class ContaPoupança extends Conta {
	public ContaPoupança(Cliente cliente) {
		super(cliente);
	}

	public void imprimirExtrato() {
		System.out.println(" === Extrato conta poupança === ");	
		super.imprimirInfosComuns();
	}
}
