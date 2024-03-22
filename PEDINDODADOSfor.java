import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        
        Scanner kb = new Scanner (System.in);
        
        double somanotas = 0;
        
        for (int i = 0 ; i < 4 ; i++){
            System.out.printf ("Digite sua %d nota:", i+1);
            double nota = kb.nextFloat();
            somanotas += nota;
        }
        
        double media = somanotas / 4;
        
        System.out.println ("A média das suas notas é: " + media);
    }
}   
