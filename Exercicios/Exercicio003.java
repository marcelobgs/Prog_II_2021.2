package Exercicios;
import java.util.Scanner;

public class Exercicio003 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Digite a distância entre o ponto A e o ponto B em km : ");
		float distancia = sc.nextFloat();
		System.out.println("Digite tempo percorrido em hora: ");
		float vel = sc.nextFloat();
		System.out.println("A velocidade média foi, em km/h:" + (distancia/vel));
	}

}
