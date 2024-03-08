public class Main
{
	public static void main(String[] args) {
		double resultado[] = new double[4];
		double x = -2;
		int i;
		
		resultado[0] = (2 * x) + (5 * x) - (10 * x) - (-x - 20) + (40 * x);
		resultado[1] = (8 * x) + 5 + (30 / x) - (20 * x) - ( x - 5 * x - 10 * x);
		resultado[2] = (100*x) + (5*x) + x + (x/8) - (85*x) - (22*x);
		resultado[3] = (10 / x) + (8 * x) - (12 * x);
		
		for ( i = 0 ; i < 4 ; i ++){
		    System.out.printf ("O resultado da equação %d é: %.2f \n", i+1, resultado[i]);
		}
	}
}
