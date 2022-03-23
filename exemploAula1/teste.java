package exemploAula1;

public class teste {

	public static void main(String[] args) {
		Counter c1, c2;
		c1 = new Counter();
		c2 = new Counter(5);
		
		c1.count = 10;
		
		c1.incrementCount();
		c2.incrementCount();
		
		System.out.println(c1);
		System.out.println(c2);
		if (c1 == c2) {
			System.out.println("Referencias sao iguais");
		} else {
			System.out.println("Referencias nao sao iguais");
		}

		// TODO: usar o metodo equals mais tarde
		if (c1.getCount() == c2.getCount()) {
			System.out.println("Conteudo é igual");
		} else {
			System.out.println("Conteudo é diferente");
		}
			
		System.out.println("Contador: "+ c1.getCount());
		
	}

}
