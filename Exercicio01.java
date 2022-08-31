/* Um algoritmo que calcula a quantidade de litros de combustível gastos por um veículo que 
consome 1 litro a cada 12 km, no final o programa imprime na tela o tempo gasto na viagem 
e a velocidade média informados pelo usuário, bem como quantos km foram percorridos e quantos 
litros de combustível o veículo consumiu no trajeto. */

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Tempo gasto na viagem: ");
		double tempo = sc.nextDouble();

		System.out.print("Velocidade média: ");
		double velocidadeMedia = sc.nextDouble();

		double distancia = tempo * velocidadeMedia;
		double litros = distancia / 12;

		System.out.println();
		System.out.print("Em " + tempo + " hora(s) de viagem," + " a uma velocidade média de " + velocidadeMedia + " km/h,"
				+ " foram percorridos " + distancia + " km. " + "O automóvel gastou " + litros + " litros de combustível.");

		sc.close();

	}
}
