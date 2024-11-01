/*
    L'insieme C dei numeri complessi e' l'insieme delle coppie ordinate (x,y) 
    con x e y appartenenti a R (insieme dei numeri reali).
    Dato il numero complesso z = x + i *y,  i numeri reali x e y sono detti
    parte reale e parte immaginaria di z.
    Nei commenti che seguono, facciamo riferimento ai numeri complessi
        z = x + i*y, z1 = x1 + i*y1, z2 = x2 + i*y2
*/

// Attenzione: 
// 1) Ovviamente il file va rinominato nel file MyComplex.java
// 2) notate che, sebbene i corpi dei metodi non siano ancora  
//    stati scritti, questo codice compila correttamente perche` 
//    abbiamo inserito degli enunciati di return. 
public class MyComplexProf {

    // inizializza il numero complesso al valore 0 + i0 (zero complesso)
    public MyComplexProf() {
        return; // completare
    }

    // inizializza il numero complesso al valore re + i*im
    public MyComplexProf(double realPart, double imagPart) {
        return; // completare
    }

    // Somma a questo numero complesso il numero complesso z
    // somma di due complessi: z = z1+z2 = (x1+x2) + i(y1+y2)
    public MyComplexProf add(MyComplexProf z) {
        return null; // completare
    }

    // Sottrae a questo numero complesso il numero complesso z
    // sottrazione di due complessi: z = z1-z2 = (x1-x2) +i(y1-y2)
    public MyComplexProf sub(MyComplexProf z) {
        return null; // completare
    }

    // Moltiplica questo numero complesso per il numero complesso z
    // prodotto di due complessi: z = z1*z2 = (x1*x2 -y1*y2) + i*(x1*y2 + x2*y1)
    public MyComplexProf mult(MyComplexProf z) {
        return null; // completare
    }

    // Divide questo numero complesso per il numero complesso z
    // divisione fra due complessi: z1/z2 = z1 *1/z2, per z2 != 0
    public MyComplexProf div(MyComplexProf z) {
        return null; // completare
    }

    // Calcola il coniugato di questo numero complesso
    // coniugato del complesso z: z^= x - i*y
    public MyComplexProf conj() {
        return null; // completare
    }

    // Calcola l'inverso rispetto al prodotto di un numero complesso
    // inverso del complesso z: 1/z = x/(|z|*|z|) -i*y/(|z|*|z|), per z != 0
    public MyComplexProf inv() {
        return null; // completare
    }

    // Calcola il modulo di questo numero complesso
    // modulo del complesso z: |z| = sqrt( x*x + y*y).
    public double mod() {
        return 0; // completare
    }

    // Confronta con tolleranza due numeri complessi.
    public boolean approxEquals(MyComplexProf z) {
        return false; // completare
    }

    // Crea una stringa che rappresenta questo numero complesso
    // Formato stringa: parte reale + i*parte immaginaria
    public String toString() {
        return null; // completare
    }

    // -------- metodi di accesso ----------

    // Restituisce la parte complessa di un numero complesso
    public double getIm() {
        return 0; // completare
    }

    // Restituisce la parte reale di un numero complesso
    public double getRe() {
        return 0; // completare
    }
}
