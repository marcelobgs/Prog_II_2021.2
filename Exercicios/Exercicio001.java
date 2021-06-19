package Exercicios;

import java.util.Scanner;

public class Exercicio001 {
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
        
		
		System.out.println("Digite a nota 1: ");
		float nota1 = sc.nextFloat();
		System.out.println("Digite a nota 2: ");
		float nota2 = sc.nextFloat();
		System.out.println("Digite a nota 3: ");
		float nota3 = sc.nextFloat();
		System.out.println("A média é: " + (nota1 + nota2 + nota3)/ 3);
		
		}

}       
  