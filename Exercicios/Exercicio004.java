package Exercicios;
import java.util.Scanner;


public class Exercicio004 {
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		System.out.println("Digite a temperatura em °C:");
		double celsius = sc.nextDouble();
		System.out.println("A temperatura de °C para °F é :" + ((9 * celsius + 160) / 5));

	}

}
