package exemploAula4T2_2niveisHeranca;

public class CreditCardGratuito extends CreditCard {

	public CreditCardGratuito(String cliente, String banco, 
			String conta) {
		
		super(cliente, banco, conta, 500, 10, 1);
	}	

}
