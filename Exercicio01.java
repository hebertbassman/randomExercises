import java.util.Scanner;

public class Exercicios01 {

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