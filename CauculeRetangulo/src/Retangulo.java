import java.util.Scanner;

public class Retangulo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int base, altura, area;
		System.out.println("Declare o valor da base");
		base = teclado.nextInt();
		System.out.println("declare o valor da altura");
		altura = teclado.nextInt();
area = base * altura;
System.out.println("A Área encontrada foi"+ area);
}
}
