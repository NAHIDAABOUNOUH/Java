import java.util.Scanner;

public class Condicionada {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double nota1, nota2, media;
		System.out.println("Informe a nota do 1� bimestre");
		nota1 = teclado.nextDouble();
		System.out.println("Informe a nota do 2� bimestre");
		nota2 = teclado.nextDouble();
		media = (nota1 + nota2) / 2;
		System.out.println("A sua m�dia final foi" + media);
		if (media >= 8 && media <= 10) {
			System.out.println("Voc� foi aprovado com louvor");
		} else if (media >= 6 && media < 8) {
			System.out.println("Voc� foi aprovado");
		}else if(media >= 5 && media < 6) {
			System.out.println("Voc� est� de recupera��o");
		
		}else { 
			System.out.println("Infelizmente voc� foi reprovado");

		}
	}
}
