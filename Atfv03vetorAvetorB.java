package aula.de.vetores;

import java.util.Scanner;

public class Atfv03vetorAvetorB {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int a[]=new int [5], b[] = new int [5], c[] = new int [10];
		
		System.out.println();
		for (int i=0; i <5; i++) {
			System.out.println("Informe um valor A para "+i+": ");
			a[i] = ler.nextInt();
		}
		System.out.println("vetor B");
		for (int i =0; i<5; i++) {
			System.out.println("Informe um valor B para "+i+": ");
			b[i] = ler.nextInt();
			
		}
		System.out.println("vetor C");
		for (int i =0; i<5; i++) {
			c[i] = a[i];
			System.out.println(c[i]);
	}
		for (int i=0; i<5; i++) {
			c[i]=b[i];
			System.out.println(c[i]);
		}
		ler.close();
	}
}
