//Solicite 3 notas para um usuário e elabore um algoritmo para calcular a média
//dessas notas. Maior ou igual a 7 = aprovado sem recuperação, de 4 a 7 = reprovado com direito a recuperação
//entre 0 e 4 reprovado sem direito a recuperação.

import java.util.Scanner;

public class Test1
{
	public static void Main(String[] args) {
		Scanner kb = new Scanner (System.in);
		System.out.println ("Digite sua primeira nota:");
		double n1 = kb.nextDouble();
		System.out.println("Digite sua segunda nota:");
		double n2 = kb.nextDouble();
		System.out.println ("Digite sua terceira nota:");
		double n3 = kb.nextDouble();
		
		double somaNotas = n1 + n2 + n3;
		double media = somaNotas/3;
		
		String resultado = (media >= 7) ? "Aprovado" : (media >= 4) ? "Aprovado com direito a recuperação" : "Reprovado";
		
		System.out.println ("A sua média foi:" + media);
		System.out.println ("O seu resultado:" + resultado);
		
		kb.close();
	}
}
