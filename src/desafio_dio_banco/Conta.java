package desafio_dio_banco;

public class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    
    protected int agencia;
    protected int numero;
    protected double saldo;
    private Cliente cliente; 

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.setCliente(cliente); 
    }

    @Override
    public void sacar(double valor) {
    	saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
    	saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
    	this.sacar(valor);
    	contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }    public double getSaldo() {
        return saldo;
    }
    
    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular da conta: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }


	@Override
	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
