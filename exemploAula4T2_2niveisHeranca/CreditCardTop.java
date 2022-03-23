package exemploAula4T2_2niveisHeranca;

public class CreditCardTop extends CreditCardPontos {
	
	public CreditCardTop(String cliente, String banco, 
			String conta) {
		
		super(cliente, banco, conta, 10000, 2, (float) 1.5);
	}

}
