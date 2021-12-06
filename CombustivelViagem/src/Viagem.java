import java.util.Scanner;

public class Viagem {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double velocidade, tempo, distancia, consumo;
		System.out.println("informe o km/H");
		velocidade = teclado.nextDouble();
		System.out.println("informe o tempo utilizado");
		tempo = teclado.nextDouble();
		distancia = velocidade * tempo;
		System.out.println("distancia percorrida foi de" + distancia);
		consumo = distancia / 12;
		System.out.println("o cunsumo total de combustível foi" + consumo);
	}
}
