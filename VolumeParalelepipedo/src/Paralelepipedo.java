import java.util.Scanner;

public class Paralelepipedo {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int altura, largura, profundidade, volume;
	System.out.println("Informe a altura");
	altura = teclado.nextInt();
	System.out.println("Informe a largura");
	largura = teclado.nextInt();
	System.out.println("Informe a profundidade");
	profundidade = teclado.nextInt();
	volume = altura * largura * profundidade;
	System.out.println("O volume do paralelepípedo é" + volume);
}
}
