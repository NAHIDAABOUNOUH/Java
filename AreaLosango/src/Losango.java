import java.util.Scanner;

public class Losango {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
int diagonal1, diagonal2, area;
System.out.println("diagonal1 equivale a");
diagonal1 = teclado.nextInt();
System.out.println("diagonal2 equivale a");
diagonal2 = teclado.nextInt();
area = diagonal1 * diagonal2;
System.out.println("A área do losango equivale a" + area);
	}
}
