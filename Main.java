import java.util.ArrayList;

public class Main {
    // main di prova
    public static void main(String[] args) {
        /*
         * int[] numeri = { 2, 5, 7, -3, 12, 4 }; // un qualsiasi array di interi
         * 
         * int max = massRic(numeri, numeri.length);
         * System.out.println("Valore massimo = " + max);
         */
        // commentato il vecchio main

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(40);
        list.add(1);
        list.add(2);
        list.add(-2);
        list.add(45);
        list.add(10);
        list.add(20);
        list.add(-20);
        list.add(4);
        System.out.println(CalcolatoreSmart.getMaxValue(list));

    }
}
        
class CalcolatoreSmart {

    public static Integer getMaxValue(ArrayList<Integer> listaValori) {
      Integer primoElemento = listaValori.get(0);

        if (listaValori.size() == 1) {
            return listaValori.get(0);
        } 
        ArrayList<Integer> restoLista = new ArrayList<Integer>(listaValori.subList(1, listaValori.size()));
        Integer maxRestoLista = getMaxValue(restoLista);

        //massimo tra 2 elementi può essere ottimizzato
        if (primoElemento > maxRestoLista) {
            return primoElemento;
        } else {
            return maxRestoLista;
        }
    }
}
