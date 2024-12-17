//08.2

/*          IL MIO CODICE NON VA

import java.util.Scanner;
import java.util.Arrays;

public class maxTester{
    public static void main(String [] args){

        System.out.println("Inserisci dei numeri separati da uno spazio: ");
        Scanner in = new Scanner (System.in);
        int vSize=0;
        Massimo.initialize(5); 

        while(in.hasNext()){
            try{
                if(vSize==Massimo.v.length){
                    Massimo.resize(v);
                }
                v[vSize]=Integer.parseInt(in.next());
                vSize++;
            }catch(NumberFormatException e){
                System.out.println("Non hai inserito un numero, riprovare");
            }
        }

        in.close();

        int i=0;
        while(i<vSize){
            Massimo.add(v[i]);
            i++;
        }

        System.out.println("il massimo e': "+Massimo.Max(vSize));
    }
}

class Massimo{

    private static int[] v;
    private static int vSize=0;

    public static void initialize(int size) {
        v = new int[size]; 
        vSize = 0; 
    }
    
    public static int[] resize(int[] v){
        return v=Arrays.copyOf(v,v.length*2);
    }

    public static void add(int num){
        v[vSize]=num;
        vSize++;        
    }

    public static int Max(int length){

       
        if (length == vSize) {
            return 1;  
        }

        // Chiamata ricorsiva per trovare il massimo nel resto dell'array
        int maxRestante = Max(length + 1);

        
        if (v[length] > maxRestante) {
            return v[length];  
        } else {
            return maxRestante;  
        }
        
    }
}
    */



    import java.util.Scanner; //codice di CHATGPT
    import java.util.Arrays;
    
    public class maxTester {
        public static void main(String[] args) {
            System.out.println("Inserisci dei numeri separati da uno spazio: ");
            Scanner in = new Scanner(System.in);
    
            Massimo.initialize(5); // Inizializzo l'array con una dimensione di 5
    
            while (in.hasNext()){
                try {
                    // Verifico se l'array è pieno e lo ridimensiono
                    if (Massimo.vSize == Massimo.v.length) {
                        Massimo.resize(); // Ridimensiono l'array quando è pieno
                    }
                    // Aggiungo il numero nell'array
                    Massimo.add(Integer.parseInt(in.next()));
                } catch (NumberFormatException e) {
                    System.out.println("Non hai inserito un numero, riprovare");
                }
            }
    
            in.close(); // Chiudo il scanner
    
            // Trovo e stampo il massimo usando la funzione ricorsiva
            System.out.println("Il massimo e': " + Massimo.Max(0));
        }
    }
    
    class Massimo {
    
        static int[] v;      // Array per memorizzare i numeri
        static int vSize = 0; // Dimensione dell'array
    
        // Inizializzo l'array con una dimensione specificata
        public static void initialize(int size) {
            v = new int[size];
            vSize = 0;
        }
    
        // Ridimensiono l'array raddoppiando la sua dimensione
        public static void resize() {
            v = Arrays.copyOf(v, v.length * 2);
        }
    
        // Aggiungo un numero nell'array
        public static void add(int num) {
            v[vSize] = num;
            vSize++;
        }
    
        // Trovo il massimo in modo ricorsivo
        public static int Max(int index) {
            // Caso base: se siamo oltre la fine dell'array, restituiamo il minimo possibile
            if (index == vSize) {
                return Integer.MIN_VALUE;
            }
    
            // Chiamata ricorsiva per trovare il massimo tra gli altri numeri
            int maxRestante = Max(index + 1);
    
            // Restituiamo il massimo tra l'elemento corrente e quello trovato ricorsivamente
            if (v[index] > maxRestante) {
                return v[index];
            } else {
                return maxRestante;
            }
        }
    }