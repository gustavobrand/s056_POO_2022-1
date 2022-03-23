package exemploAula1;

public class Counter {

	private int count;

	Counter (int c) {
		count = c;
	}
	
	Counter () {
		count = 0;
	}
	
	public int getCount() {
		return count;
	}
	
	public void incrementCount() {
		count++;
	}
	public void incrementCount(int c) {
		count = count + c;
	}
	
	public void decrementCount() {
		count--;
	}
	
	public static void main(String[] args) {
		Counter c1, c2;
		c1 = new Counter();
		c2 = new Counter(5);
		
		c1.incrementCount();
		c2.incrementCount();
		
		System.out.println(c1);
		System.out.println(c2);
		if (c1 == c2) {
			System.out.println("Referencias sao iguais");
		} else {
			System.out.println("Referencias nao sao iguais");
		}
		
		int i=10;
		
		do {
			System.out.println("Teste S028");
			i--;
		} while ((i>0 && i<10) || i == 5);
		
		

		// TODO: usar o metodo equals mais tarde
		if (c1.getCount() == c2.getCount()) {
			System.out.println("Conteudo é igual");
		} else {
			System.out.println("Conteudo é diferente");
		}
			
		System.out.println("Contador: "+ c1.getCount());
		
	}
}
