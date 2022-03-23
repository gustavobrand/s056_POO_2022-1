package exemploAula4T2_2niveisHeranca;

public class CreditCardPontos extends CreditCard {

	private float taxaDePontos;
	private float pontos;
	
	public CreditCardPontos(String cliente, String banco, 
			String conta, int limite, float juros, 
			float taxaPtos) {
		
		super(cliente, banco, conta, limite, juros, 1);
		this.taxaDePontos = (float) taxaPtos;
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
