import java.util.Scanner;

public class Bimestral {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
double nota1, nota2, media;
System.out.println("Informe a nota do primeiro bimestre");
nota1 = teclado.nextDouble();
System.out.println("Informe a nota do segundo bimestre");
nota2 = teclado.nextDouble();
media = (nota1 + nota2) / 2;
System.out.println("A m�dia final obtida foi de" + media);
if(media >= 9 && media <= 10) {
System.out.println("Voc� fechou com m�dia A");
}else if(media >= 8 && media < 9) {
	System.out.println("Voc� fechou com m�dia B");
}else if(media >=6 && media < 8) {
	System.out.println("Voc� fechou com m�dia C");
}else if(media >= 3 && media < 6) {
System.out.println("Voc� est� de recupera��o");	
}else {
	System.out.println("Infelizmente, voc� foi reprovado");
}
}
}
