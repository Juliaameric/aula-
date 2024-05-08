package aula.de.vetores;

import java.util.Scanner;

public class Atv01nomes {
	
	public static void main(String[] args) {
	String a[] = new String[5];
	
	Scanner ler = new Scanner(System.in);
	
	for (int i =0; i<5; i++) {
		System.out.println("informe o "+ i+ "nome:");
		a[i]=ler.next();
	}
	for (int i =0; i<5; i++) {
		System.out.println(a[i]);	
	}
	ler.close();
}
}

