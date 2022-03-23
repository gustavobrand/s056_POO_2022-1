package exemploAula4T2_2niveisHeranca;

public class CreditCardPlatinum extends CreditCardPontos {
	
	public CreditCardPlatinum(String cliente, String banco, 
			String conta) {
		
		super(cliente, banco, conta, 5000, 5, (float) 0.7);
	
	}

}
