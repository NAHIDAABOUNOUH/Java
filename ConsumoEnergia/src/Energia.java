import java.util.Scanner;

public class Energia {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
double salario, unidade, consumidos, reais, desconto;
System.out.println("quanto vale o salário mínimo");
salario = teclado.nextDouble();
System.out.println("qual a quantidade de kw consumida");
consumidos = teclado.nextDouble();
unidade = salario / 700;
reais = unidade * consumidos;
desconto = reais * 0.9;
System.out.println("qual é o valor de cada unidade de kw" + unidade);
System.out.println("qual será o valor da conta" + reais);
System.out.println(" valor a ser pago aplicando-se 10% de desconto" + desconto);
}
}
