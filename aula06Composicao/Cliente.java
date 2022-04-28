package aula06Composicao;

public class Cliente {

    // Atributos
	private String nome;
	private ContaBancaria conta;
	private Endereco endereco;
	
	// Construtor
	public Cliente(String nome) {
		this.nome = nome;
		this.conta = new ContaBancaria();
	}
	
	public Cliente(String nome, int agencia, int nroConta) {
		this.nome = nome;
		this.conta = new ContaBancaria(nroConta, agencia);
	}
	
	public Cliente(String nome, int agencia, int nroConta,
			       String nomeRua, int nroRua) {
		this.nome = nome;
		this.conta = new ContaBancaria(nroConta, agencia);
		this.endereco = new Endereco(nomeRua, nroRua); 
	}
	
	public void imprimirExtrato() {
		System.out.println("Cliente: " + nome);
		conta.imprimirExtrato();
	}
	
	public void imprimirExtratoCompleto() {
		System.out.println("Cliente: " + nome);
		conta.imprimirExtrato();
		endereco.imprimirEndereco();
	}
			
	@Override
	public String toString() {
		return "Nome=" + nome + 
				",\n conta=" + conta + 
				",\n endereco=" + endereco;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ContaBancaria getConta() {
		return conta;
	}
	public void setConta(ContaBancaria conta) {
		this.conta = conta;
	}
	
	
	
	
	
}
