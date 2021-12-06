import java.util.Scanner;

public class Triangulo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
double base, altura, area;
System.out.println("a base vale");
base = teclado.nextDouble();
System.out.println("a altura vale");
altura = teclado.nextDouble();
area = base * altura / 2;
System.out.println("Encontramos área igual a" + area);
	}
}
