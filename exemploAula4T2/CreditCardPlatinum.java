package exemploAula4T2;

public class CreditCardPlatinum extends CreditCard {

	private float taxaDePontos;
	private float pontos;
	
	public CreditCardPlatinum(String cliente, String banco, 
			String conta) {
		
		super(cliente, banco, conta, 5000, 5, 1);
		this.taxaDePontos = (float) 0.7;
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
