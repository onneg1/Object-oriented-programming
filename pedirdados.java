import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println ("Cadastre um produto");
		String produto = teclado.next();
		System.out.println ("Digite a quantidade");
		int quantidade = teclado.nextInt();
		System.out.println ("Digite o preço");
		float preco = teclado.nextFloat();
		teclado.close();
	}
}
