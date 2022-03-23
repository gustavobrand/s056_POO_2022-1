package exemploAula3Heranca;

public class CartaoBasico extends CreditCard {

	private int nroMesesAParcelar;
	
	public CartaoBasico(String cliente, String banco, 
			String conta, int nroMesesParcelar) {
		
		super(cliente, banco, conta, 1000);
		this.nroMesesAParcelar = nroMesesParcelar;
	}

//	public CartaoBasico(String cliente, String banco, 
//			String conta, int limite, float saldo, 
//			float juros, int dataVenc, int nroMesesAParcelar) {
//		
//		super(cliente, banco, conta, limite, saldo, juros, dataVenc);
//		this.nroMesesAParcelar = nroMesesAParcelar;
//	}
	
	
	

}
