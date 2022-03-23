package exemploAula3Heranca;

public class teste {

	public static void main(String[] args) {
		
		CreditCard cartao1 = new CartaoBasico(
				"Joao", "Itau", "54765", 6);
		
		cartao1.imprimirCartao();
		System.out.println();
		
		cartao1.comprar(100);
		cartao1.imprimirCartao();
		System.out.println();
		
		cartao1.comprar(500);
		cartao1.imprimirCartao();		
		System.out.println();
		
		cartao1.comprar(500);
		cartao1.imprimirCartao();
		System.out.println();
		
		cartao1.pagar(500, 10);		
		cartao1.imprimirCartao();

	}

}
