//linha para importar a classe Scanner do pacote java.util,usada para obter entrada do usuário a partir do teclado.
import java.util.Scanner;

//Isso define uma classe chamada Main. Em Java, o nome da classe deve coincidir
//com o nome do arquivo que contém o código-fonte e uma classe pública deve ser definida no arquivo.
public class CalculoBasico
{
    
    //Este é o método main, que é o ponto de entrada para a execução do programa em Java. 
    //Ele espera um array de strings como argumento, que são os argumentos da linha de comando. 
    //Dentro deste método, o código principal do programa é escrito.
  public static void main(String[]args)
  {
      //declarando variáveis
	double n1, n2;
	double soma;
	double subtracao;
	double multiplicacao;
	double divisao;
    
    //criando um objeto Scanner chamado kb, que será usado para receber entrada do teclado.
    Scanner kb = new Scanner (System.in);
    //solicitando dados ao usuário
    System.out.println ("Digite o primeiro número:");
    //lendo o dado digitado pelo usuário usando o objeto Scanner criado anteriormente
    n1 = kb.nextDouble();
    System.out.println ("Digite o segundo número:");
    n2 = kb.nextDouble();
    
    //determinando valor as variáveis dos cálculos matemáticos
    soma = n1 + n2;
    subtracao = n1 - n2;
    multiplicacao = n1 * n2;
    divisao = n1 / n2;
    
    //apresentando os resultados ao usuário
    System.out.println ("A soma dos números é: " + soma);
    System.out.println ("A subtração dos números é: " + subtracao);
    System.out.println ("A multiplicação dos números é: " + multiplicacao);
    System.out.println ("A divisão dos números é: " + divisao);
  }
}
