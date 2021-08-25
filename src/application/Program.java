package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Operacoes op = new Operacoes();
		
		System.out.print("Digite um numero :");
		op.n1 = sc.nextInt();
		System.out.print("Digite o segundo numero :");
		op.n2 = sc.nextInt();			
		
		System.out.print("Resultado da soma : " + op);		
		
		sc.close();
	}

}
