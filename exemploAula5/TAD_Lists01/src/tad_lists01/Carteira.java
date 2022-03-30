package tad_lists01;

import CreditCards.CreditCardTop;
import CreditCards.S028_aula01_creditcard_v02;
import net.datastructures.DoublyLinkedList;

public class Carteira {

	DoublyLinkedList<S028_aula01_creditcard_v02> contas;

	public Carteira() {
		super();
		this.contas = new DoublyLinkedList<S028_aula01_creditcard_v02>();
	}

	public void AdicionarCliente(String nome, String banco, String conta) {
		contas.addFirst(new CreditCardTop(nome, banco, conta));
	}
	
}
