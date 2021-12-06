import java.util.Scanner;

public class Trapesio {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
double base1, base2, altura, area;
System.out.println("Base1 vale");
base1 = teclado.nextDouble();
System.out.println("base2 vale");
base2 = teclado.nextDouble();
System.out.println("altura vale");
altura = teclado.nextDouble();
area = (base1 + base2) * altura / 2;
System.out.println("area do trapésio vale" + area);
}
}
