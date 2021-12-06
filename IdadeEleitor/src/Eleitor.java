import java.util.Scanner;

public class Eleitor {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int idade;
		System.out.println("Informe a idade do eleitor");
		idade = teclado.nextInt();
		if (idade < 16) {
			System.out.println(" Não eleitor");
		} else if (idade >= 16 && idade < 18) {
			System.out.println("facultativo");
		} else if (idade >= 18 && idade <= 65) {
			System.out.println("obrigatório");
		}else {
			System.out.println("Facultativo");
		}
	}
}