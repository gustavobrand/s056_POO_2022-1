package exemploAula4T2;

public class CreditCardTop extends CreditCard {

	private float taxaDePontos;
	private float pontos;
	
	public CreditCardTop(String cliente, String banco, 
			String conta) {
		
		super(cliente, banco, conta, 10000, 2, 1);
		this.taxaDePontos = (float) 1.5;
		this.pontos = 0;
	}

	public boolean comprar (float valor) {
		if ((valor + saldo) > limite) {
			System.out.println("Operacao nao autorizada!");
			return false;
		}
		
		pontos += valor*taxaDePontos;
		saldo = saldo + valor;
		
		System.out.println("Operacao autorizada!");
		System.out.println("Voce acumulou "+ valor*taxaDePontos + " nessa compra!");
		System.out.println("Total de pontos: " + pontos);
		return true;
	}

}
