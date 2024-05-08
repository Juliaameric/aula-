package aula.de.vetores;

import java.util.Scanner;

public class Atv02soma {

	public static void main(String[] args) {
		int a[] = new int[5];
		int soma = 0; 
		
		Scanner ler = new Scanner(System.in);
		
		for (int i =0; i<5; i++) {
			System.out.println("informe o valor"+ i+ ":");
			a[i]= ler.nextInt();
			soma = soma+a[i];
			System.out.println("a soma dos numeros é: "+soma);
			
		}
		
		if (soma>15) {
			System.out.println("o valor da soma é"+soma);	
		}
		ler.close();
	}

	}

