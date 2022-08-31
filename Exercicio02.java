/* Um algoritmo que lê e calcula 10% de desconto sobre o salário bruto, após,
5% sobre o restante. Ao final o programa imprime na tela o salário bruto, 
os descontos da previdencia e do imposto e o salário líquido. */

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Salário Bruto: ");
		double salarioBruto = sc.nextDouble();
		if (salarioBruto < 0) {
			System.out.println("Valor Inválido!");
			System.out.println();
			main(null);
		}
		
		double descontoPrevidencia = salarioBruto * 10 / 100;
		double descontoImposto = (salarioBruto - descontoPrevidencia) * 5 / 100;
		double salarioLiquido = salarioBruto - descontoPrevidencia - descontoImposto;

		System.out.printf("Salário Bruto: R$ %.2f %n", salarioBruto);
		System.out.printf("Desconto Previdência: R$ %.2f %n", descontoPrevidencia);
		System.out.printf("Desconto Imposto: R$ %.2f %n", descontoImposto);
		System.out.printf("Salário Líquido: R$ %.2f %n", salarioLiquido);

		sc.close();

	}
}
