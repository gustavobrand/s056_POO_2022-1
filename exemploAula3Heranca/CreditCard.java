package exemploAula3Heranca;

public class CreditCard {

	protected String cliente;
	protected String banco;
	protected String conta;
	protected int limite;
	protected float saldo;
	protected float juros;
	protected int diaVencimento;
	
	public CreditCard(String cliente, String banco, String conta, 
			int limite, float saldo, float juros, int dataVenc) {
		this.cliente = cliente;
		this.banco = banco;
		this.conta = conta;
		this.limite = limite;
		this.saldo = saldo;
		this.juros = juros;
		this.diaVencimento = dataVenc;
	}

	public CreditCard(String cliente, String banco, String conta, 
			int limite, float juros, int dataVenc) {
		this(cliente, banco, conta, limite, 0, juros, dataVenc);
	}

	public CreditCard(String cliente, String banco, String conta, 
			int limite) {
		// this(cliente, banco, conta, limite, 0, 10);
		this(cliente, banco, conta, limite, 10, 1);
	}
	
	public String getCliente() { return cliente; }
	public String getBanco()   { return banco; }
	public String getConta()   { return conta; }
	public int getLimite()     { return limite; }
	public float getSaldo()    { return saldo; }

	
	public void imprimirCartao() {
		System.out.println("Cliente: " + cliente);
		System.out.println("Banco: " + banco);
		System.out.println("Conta: " + conta);
		System.out.println("Limite: " + limite);
		System.out.println("Saldo: " + saldo);
	}
	
	public boolean comprar (float valor) {
		if ((valor + saldo) > limite) {
			System.out.println("Operacao nao autorizada!");
			return false;
		}
		saldo = saldo + valor;
		System.out.println("Operacao autorizada!");
		return true;
	}
	
	public void pagar (float valor, int diaPagamento) {
		saldo = saldo-valor;
		
		int diasAtraso = diaPagamento-diaVencimento;
		float jurosAjustados = juros*((float)diasAtraso/30);
		
		System.out.println("Voce pagou com "+ diasAtraso + 
				" dias de atraso.");
		
		if (saldo > 0) {
			saldo = (float) (saldo*(1+(jurosAjustados/100)));
		}
	}
	
	public static void main(String[] args) {
		
		CreditCard cartao1 = new CreditCard(
				"Joao", "Itau", "54765", 1000);
		cartao1.imprimirCartao();
		System.out.println();
		
		cartao1.comprar(100);
		cartao1.imprimirCartao();
		System.out.println();
		
		cartao1.comprar(500);
		cartao1.imprimirCartao();		
		System.out.println();
		
		cartao1.comprar(500);
		cartao1.imprimirCartao();
		System.out.println();
		
		cartao1.pagar(500, 30);		
		cartao1.imprimirCartao();
		
	}
	

}
