import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double nota1, nota2, nota3, media;
		System.out.println("Por favor, informe nota 1");
		nota1 = teclado.nextDouble();
		System.out.println("Informe nota2");
		nota2 = teclado.nextDouble();
		System.out.println("por favor informe nota 3");
		nota3 = teclado.nextDouble();
		media = (nota1 + nota2 + nota3) / 3;
		System.out.println("A média final foi" + media);
		if(media >= 6) {
			System.out.println("parabés, você foi aprovado!"); 
		}
		else {
			System.out.println("infelizmente você não foi aprovado");
		}
	}
}
