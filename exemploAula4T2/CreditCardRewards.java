package exemploAula4T2;

public class CreditCardRewards extends CreditCard {

	private float percentCashback;
	
	public CreditCardRewards(String cliente, String banco, 
			String conta) {
		
		super(cliente, banco, conta, 1000, 8, 1);
		this.percentCashback = (float) 1.5;	
	}

	public boolean comprar (float valor) {
		if ((valor + saldo) > limite) {
			System.out.println("Operacao nao autorizada!");
			return false;
		}
		float cashback = valor*(this.percentCashback/100);
		saldo = saldo + valor - cashback;
		System.out.println("Operacao autorizada!");
		System.out.println("Voce ganhou R$"+ cashback + " de cashback!");
		return true;
	}

}
