package exemploAula4T2;

public class teste {

	static void testeCreditCardGratuito() {
		CreditCard cartao1 = new CreditCardGratuito(
				"Joao", "Itau", "54765");

		cartao1.imprimirCartao();
		System.out.println();
		
		cartao1.comprar(100);
		cartao1.imprimirCartao();
		System.out.println();
		
		cartao1.comprar(300);
		cartao1.imprimirCartao();		
		System.out.println();
				
		cartao1.pagar(300, 1);		
		cartao1.imprimirCartao();
	}

	static void testeCreditCardRewards() {
		CreditCard cartao1 = new CreditCardRewards(
				"Joao", "Itau", "54765");

		cartao1.imprimirCartao();
		System.out.println();
		
		cartao1.comprar(100);
		cartao1.imprimirCartao();
		System.out.println();
		
		cartao1.comprar(300);
		cartao1.imprimirCartao();		
		System.out.println();
				
		cartao1.pagar(300, 1);		
		cartao1.imprimirCartao();
	}

	static void testeCreditCardPlatinum() {
		CreditCard cartao1 = new CreditCardPlatinum(
				"Joao", "Itau", "54765");

		cartao1.imprimirCartao();
		System.out.println();
		
		cartao1.comprar(100);
		cartao1.imprimirCartao();
		System.out.println();
		
		cartao1.comprar(300);
		cartao1.imprimirCartao();		
		System.out.println();
				
		cartao1.pagar(300, 1);		
		cartao1.imprimirCartao();
	}

	static void testeCreditCardTop() {
		CreditCard cartao1 = new CreditCardTop(
				"Joao", "Itau", "54765");

		cartao1.imprimirCartao();
		System.out.println();
		
		cartao1.comprar(100);
		cartao1.imprimirCartao();
		System.out.println();
		
		cartao1.comprar(300);
		cartao1.imprimirCartao();		
		System.out.println();
				
		cartao1.pagar(300, 1);		
		cartao1.imprimirCartao();
	}

	public static void main(String[] args) {
	
		// testeCreditCardGratuito();
		// testeCreditCardRewards();
		// testeCreditCardPlatinum();
		testeCreditCardTop();
		
	}

}
