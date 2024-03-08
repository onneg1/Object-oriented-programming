
public class Main
{
	public static void main(String[] args) {
		float resultado[] = new float[4];
		float x = -2;
		int i;
		
		resultado[0] = (2 * x) + (5 * x) - (10 * x) - (-x - 20) + (40 * x);
		resultado[1] = (8 * x) + 5 + (30 / x) - (20 * x) - ( x - 5 * x - 10 * x);
		resultado[2] = 100 * x + 5 * x + x + x / 8 - 85 * x - 22 * x ;
		resultado[3] = (2 * x) + (5 * x) - (10 * x) - (-x - 20) + (40 * x);
		
		for ( i = 0 ; i < 3 ; i ++){
		    System.out.println ("O resultado da equação %d é: %.2f ", i+1, resultado[]);
		}
	}
}
