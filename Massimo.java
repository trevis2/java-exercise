/** Calcolo del massimo tra   dim   numeri interi con algoritmo ricorsivo;
     la classe Massimo contiene il metodo ricorsivo massRic.
	Costruire una classe di prova */

	public class Massimo {

		public static int massRic (int a[],int dim)
		{	
			int m;
			if(dim==1)
				return a[0];
			m=max (massRic (a,dim-1),a[dim-1]);
			return m;
			} 
		
		//calcola il massimo tra due numeri
		private static int max (int num1, int num2) 
		{
			if(num1 > num2)
				return num1;
			return num2;
			}
		
		//main di prova
		public static void main (String[] args)
		{
			int [] numeri = {2, 5, 7, -3, 12, 4}; //un qualsiasi array di interi
				
				int max = massRic (numeri, numeri.length);
				System.out.println ("Valore massimo = " + max);
		}	
		
		
		
			
			
		}
		