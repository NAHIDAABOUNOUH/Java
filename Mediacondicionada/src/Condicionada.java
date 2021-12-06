import java.util.Scanner;

public class Condicionada {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double nota1, nota2, media;
		System.out.println("Informe a nota do 1º bimestre");
		nota1 = teclado.nextDouble();
		System.out.println("Informe a nota do 2º bimestre");
		nota2 = teclado.nextDouble();
		media = (nota1 + nota2) / 2;
		System.out.println("A sua média final foi" + media);
		if (media >= 8 && media <= 10) {
			System.out.println("Você foi aprovado com louvor");
		} else if (media >= 6 && media < 8) {
			System.out.println("Você foi aprovado");
		}else if(media >= 5 && media < 6) {
			System.out.println("Você está de recuperação");
		
		}else { 
			System.out.println("Infelizmente você foi reprovado");

		}
	}
}
