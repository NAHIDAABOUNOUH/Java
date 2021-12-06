import java.util.Scanner;

public class Silindro {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
double pi, raio, altura, volume;
System.out.println("Informe pi");
pi = teclado.nextDouble();
System.out.println("Informe o valor do raio");
raio = teclado.nextDouble();
System.out.println("informe a altura");
altura = teclado.nextDouble();
volume = pi * raio * raio * altura;
System.out.println("o valor do volume é" + volume);
}
}
