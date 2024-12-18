/**
 * Calcolo del massimo tra dim numeri interi con algoritmo ricorsivo;
 * la classe Massimo contiene il metodo ricorsivo massRic.
 * Costruire una classe di prova
 */

// programma PROF

public class Massimo {

	public static int massRic(int a[], int dim) {
		int m;
		if (dim == 1)
			return a[0];
		m = max(massRic(a, dim - 1), a[dim - 1]);
		return m;
	}

	// calcola il massimo tra due numeri
	private static int max(int num1, int num2) {
		if (num1 > num2)
			return num1;
		return num2;
	}

	// main di prova
	public static void main(String[] args) {
		int[] numeri = { 2, 5, 7, -3, 12, 4 }; // un qualsiasi array di interi

		int max = massRic(numeri, numeri.length);
		System.out.println("Valore massimo = " + max);
	}

}

/*
 * Scrivere nella classe Massimo (contenitore di metodi statici) un algoritmo
 * ricorsivo per calcolare il massimo di n numeri interi.
 * 
 * Suggerimento. Analogamente a quanto fatto per la realizzazione dell'algoritmo
 * ricorsivo per il calcolo del fattoriale, si pensi di conoscere il massimo di
 * n-1 elementi e di eseguire successivamente l'operazione di massimo tra due
 * numeri, cioè il massimo degli n-1 elementi e an:
 * massimo(a1,a2,..,an) = max(massimo(a1,a2,..a(n-1)), an) dove max(x,y) e' un
 * metodo che restituisce il massimo tra due elementi.
 * 
 * Inserire poi nella classe Massimo un metodo main per verificare il
 * funzionamento del metodo realizzato.
 */
