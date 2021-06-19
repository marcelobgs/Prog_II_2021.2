package Exercicios;
import java.util.Scanner;


public class Exercicio002 {
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {

		
		System.out.println("Digite o valor de a: ");
		float a = sc.nextFloat();
		System.out.println("Digite o valor de b: ");
		float b = sc.nextFloat();
		System.out.println("Digite o valor de c: ");
		float c = sc.nextFloat();
		float d = (b*b) - (4*(a * c));
		System.out.println("O valor de Delta é: " + d);
	}

}
