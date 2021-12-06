import java.util.Scanner;

public class Liquido {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
double horat, qtdhora, inss, liquido, bruto;
System.out.println(" informe o valor da hora trabalhada");
horat = teclado.nextDouble();
System.out.println("informe a quantidade de horas trabalhadas");
qtdhora = teclado.nextDouble();
System.out.println("informe a porcentagem de desconto do INSS");
inss = teclado.nextDouble();
bruto = horat * qtdhora;
liquido = bruto - bruto * inss/ 100;
System.out.println("liquido a receber igual a" + liquido);}
}
