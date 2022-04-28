package aula06Composicao;

public class Endereco {
	
	private String Rua, CEP, Complemento;
	private int Numero;
	
	public Endereco(String rua, int numero) {		
		this.Rua = rua;
		this.Numero = numero;
	}

	public Endereco(String rua, int numero, 
			 String complemento, String CEP) {
		this.Rua = rua;
		this.CEP = CEP;
		this.Complemento = complemento;
		this.Numero = numero;
	}
	
	public void imprimirEndereco ( ) {
		System.out.println("Endereço: " + getRua() + ", " + getNumero());
	}

	public String getRua() {
		return Rua;
	}

	public void setRua(String rua) {
		Rua = rua;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public String getComplemento() {
		return Complemento;
	}

	public void setComplemento(String complemento) {
		Complemento = complemento;
	}

	public int getNumero() {
		return Numero;
	}

	public void setNumero(int numero) {
		Numero = numero;
	}

	@Override
	public String toString() {
		return "Rua=" + Rua + 
				", Numero=" + Numero +				 
				", Complemento=" + Complemento + 
				",\n CEP=" + CEP;				
	}
	
}
