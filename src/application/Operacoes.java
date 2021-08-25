package application;

public class Operacoes {
	
	
	public int n1;
	public int n2;
	public int total;
	
	
	public Operacoes(int n1, int n2, int total) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.total = total;
	}

	public Operacoes() {
		// TODO Auto-generated constructor stub
	}
	
	public int Adicao() {
		return n1 + n2;
	}
	
	public int Subtracao() {
		return n1 - n2;
	}
	
	public int Multiplacacao() {
		return n1 * n2;
	}
	
	public int Divisao() {
		return n1 / n2;
	}

	@Override
	public String toString() {
		return "Resultado das Operações é de: Soma: " + Adicao() +
				" , " + "Subtração: " + Subtracao() + " , " +
				"Multiplicação: " + Multiplacacao() + " , " +
				"Divisão: " + Divisao();
				
	}
	
	
	
	
	
	
	
	
	

	
	
}

