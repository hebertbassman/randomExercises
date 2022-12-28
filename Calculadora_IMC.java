// calculadora IMC simples

import java.util.Scanner;

public class calculadoraIMC {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu peso em kilos (ex. 60): ");
		double peso = sc.nextDouble();
		
		if (peso <= 0) {
			System.out.println("Valor inválido.");
			main(null);
		}
		
		System.out.println("Digite sua altura em metros (ex. 1,70): ");
		double altura = sc.nextDouble();
		
		if (altura <= 0) {
			System.out.println("Valor inválido.");
			main(null);
		}			
		
		double IMC = peso / (altura * altura);
				
		System.out.printf("Seu IMC é %.1f", IMC); 
		
		if (IMC <= 18.5) {
			System.out.print(". Você está abaixo do peso.");
		}
		
		else if (IMC > 18.5 & IMC <= 24.9) {
			System.out.print(". Você está no peso ideal.");
		}
		
		else if (IMC > 24.9 & IMC <= 29.9) {
			System.out.print(". Você está acima do peso.");
		}
		
		else if (IMC > 29.9 & IMC <= 39.9) {
			System.out.print(". Você está obeso");	
		}
		
		else if (IMC > 39.9) {
			System.out.print(". Você está gravemente obeso.");
		}
		
		sc.close();
		
	}
}
