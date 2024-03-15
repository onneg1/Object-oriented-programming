import java.util.Scanner;

 
public class Main
{
  
public static void main (String[] args)
  {
	
Scanner scanner = new Scanner (System.in);
	
 
	  // Entrada de dados
	  System.out.println ("Digite o número de unidades vendidas por dia:");
	
int unidadesVendidasPorDia = scanner.nextInt ();
	
 
System.out.println ("Digite o número de dias considerados:");
	
int diasConsiderados = scanner.nextInt ();
	
 
System.out.println ("Digite o estoque atual:");
	
int estoqueAtual = scanner.nextInt ();
	
 
System.out.println ("Digite o estoque mínimo desejado:");
	
int estoqueMinimo = scanner.nextInt ();
	
 
System.out.println ("Digite o estoque máximo desejado:");
	
int estoqueMaximo = scanner.nextInt ();
	
 
	  // CC!lculos
	double vendaMediaDiaria =
	  (double) unidadesVendidasPorDia * diasConsiderados / diasConsiderados;
	
 
	  // Tomada de decisao
	  if (estoqueAtual < estoqueMinimo)
	  {
		
System.out.
		  println ("O estoque atual está abaixo do estoque mínimo.");
		
System.out.println ("É necessário repor o estoque.");
	  
}
	else if (estoqueAtual > estoqueMaximo)
	  {
		
System.out.
		  println ("O estoque atual está acima do estoque máximo.");
		
System.out.println ("É possível reduzir o estoque.");
	  
}
	else
	  {
		
System.out.
		  println ("O estoque atual está dentro dos limites desejados.");
		
System.out.
		  println ("Não é necessário tomar nenhuma ação no momento.");
	  
}
	
 
	  // SaC-da de dados
	  System.out.println ("Venda média diária: " + vendaMediaDiaria);
	
System.out.println ("Estoque mínimo desejado: " + estoqueMinimo);
	
System.out.println ("Estoque míximo desejado: " + estoqueMaximo);
	
 
scanner.close ();	// Fechar o scanner após a utilização.
  }

}
