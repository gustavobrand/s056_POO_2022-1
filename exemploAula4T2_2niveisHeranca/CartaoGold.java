package exemploAula4T2_2niveisHeranca;

public class CartaoGold extends CreditCard {

	private int limiteExtra;
	
	public CartaoGold(String cliente, String banco, 
			String conta, int limite, int limiteExtra) {
		super(cliente, banco, conta, limite);
		this.limiteExtra = limiteExtra;
	}


	public boolean comprar (float valor) {
		if ((valor + saldo) > (limite+limiteExtra)) {
			System.out.println("Operacao nao autorizada!");
			return false;
		} else if ((valor + saldo) > limite) {
			System.out.println("Atencao: limite extra esta sendo usado!");			
		}
		
		saldo = saldo + valor;
		System.out.println("Operacao autorizada!");
		return true;
	}
	
}
