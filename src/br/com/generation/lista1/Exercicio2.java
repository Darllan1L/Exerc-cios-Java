package br.com.generation.lista1;

import java.util.Scanner;

public class Exercicio2 {

	//Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
	//expressa em anos, meses e dias.
	public static void main(String[] args) {
		
		int dias, totalDias, anos, meses; 
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite sua idade em dias? ");
		totalDias = leia.nextInt();
		
		//totalDias = 11090 / 365 
		anos = totalDias / 365;
				
		meses = (totalDias % 365) / 30;
		
		dias = (totalDias % 365) % 30;
		
		System.out.println("Sua idade em anos �: " + anos);
		System.out.println("Sua idade em meses �: " + meses);
		System.out.println("Sua idade em dias �: " + dias);
		
		leia.close();
 		
		
		
		
		
		
		
		
	}

}
