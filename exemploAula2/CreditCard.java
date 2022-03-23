package exemploAula2;

public class CreditCard {

	private String cliente;
	private String banco;
	private String conta;
	private int limite;
	private float saldo;
	
	public CreditCard(String cliente, String banco, String conta, 
			int limite, float saldo) {
		this.cliente = cliente;
		this.banco = banco;
		this.conta = conta;
		this.limite = limite;
		this.saldo = saldo;
	}
	
	public CreditCard(String cliente, String banco, String conta, 
			int limite) {
		this(cliente, banco, conta, limite, 0);
//		this.cliente = cliente;
//		this.banco = banco;
//		this.conta = conta;
//		this.limite = limite;
//		this.saldo = 0;
	}
	
//	public String getCliente() { return cliente; }
//	public String getBanco()   { return banco; }
//	public String getConta()   { return conta; }
//	public int getLimite()     { return limite; }
//	public float getSaldo()    { return saldo; }

	
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
	
	public void pagar (float valor) {
		saldo = saldo - valor;
		
//		if (saldo > 0) {
//			saldo = (float) (saldo*1.10);
//		}
	}
	
	public static void main(String[] args) {
		CreditCard[] carteira = new CreditCard[3];
		carteira[0] = new CreditCard("Joao", "Itau", "54765", 1000, 0);
		carteira[1] = new CreditCard("Maria", "BB", "55656", 2000, 0);
		carteira[2] = new CreditCard("Jose", "Santander", "5768", 3000, 0);
		
		for (CreditCard cartao : carteira) {
			cartao.imprimirCartao();
		}
		
//		CreditCard cartao1 = new CreditCard("Joao", "Itau", "54765", 1000, 0);
//		cartao1.imprimirCartao();
//		System.out.println();
//		
//		cartao1.comprar(100);
//		cartao1.imprimirCartao();
//		System.out.println();
//		
//		cartao1.comprar(500);
//		cartao1.imprimirCartao();		
//		System.out.println();
//		
//		cartao1.comprar(500);
//		cartao1.imprimirCartao();
		
	}
	

}
