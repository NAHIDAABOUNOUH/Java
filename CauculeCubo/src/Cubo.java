import java.util.Scanner;

public class Cubo {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
double lado, volume;
System.out.println("o lado do cubo vale");
lado = teclado.nextDouble();
volume = lado * lado * lado;
System.out.println("o volume do cubo é" + volume);
}
}
