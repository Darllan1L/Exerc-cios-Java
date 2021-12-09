package br.com.generation.lista1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double A,B,C,D,R,S;
						
		System.out.println("Digite valor de A: ");
		A = leia.nextInt();

		System.out.println("Digite valor de B: ");
		B = leia.nextInt();

		System.out.println("Digite valor de C: ");
		C = leia.nextInt();

		 //calculo de potencia
		R = Math.pow((A+B), 2);
		S = Math.pow((B+C), 2);
		D = (R+S) / 2;
		 System.out.println("D=" + D);
		
		leia.close();
		

	}

}
