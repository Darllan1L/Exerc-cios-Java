package br.com.generation.lista1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		//Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
		//dias e mostre-a expressa apenas em dias.
		
		int idade, anos, meses, dias;
		
			Scanner leia = new Scanner(System.in);
			System.out.println("Informe sua idade?: ");
			anos = leia.nextInt();
			
			System.out.println("Infome os meses?: ");
			meses = leia.nextInt();
			
			System.out.println("Informe os dias?: ");
			dias = leia.nextInt();
			
			idade = (anos * 365) + (meses * 30) + dias;
			
			//anos = 30 * 365 + 4 meses * 30 + 20 dias
			System.out.println("A idade em dias é!: " + idade);
			
			
			
			
			
			
			
			
			
			
			
		
			

	}

}
