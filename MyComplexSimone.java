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
public class MyComplexSimone {
    private double RE;
    private double IM;

    // inizializza il numero complesso al valore 0 + i0 (zero complesso)
    public MyComplexSimone() {
        RE = 0;
        IM = 0;
    }

    // inizializza il numero complesso al valore re + i*im
    public MyComplexSimone(double realPart, double imagPart) {
        RE = realPart;
        IM = imagPart;
    }

    // Somma a questo numero complesso il numero complesso z
    // somma di due complessi: z = z1+z2 = (x1+x2) + i(y1+y2)
    public MyComplexSimone add(MyComplexSimone z2) {
        return eseguiOerazione("add", z2);
    }

    // Sottrae a questo numero complesso il numero complesso z
    // sottrazione di due complessi: z = z1-z2 = (x1-x2) +i(y1-y2)
    public MyComplexSimone sub(MyComplexSimone z2) {
        return eseguiOerazione("sub", z2);
    }

    // Moltiplica questo numero complesso per il numero complesso z
    // prodotto di due complessi: z = z1*z2 = (x1*x2 -y1*y2) + i*(x1*y2 + x2*y1)
    public MyComplexSimone mult(MyComplexSimone z2) {

        return eseguiOerazione("mult", z2);
    }

    // Divide questo numero complesso per il numero complesso z
    // divisione fra due complessi: z1/z2 = z1 *1/z2, per z2 != 0
    //
    public MyComplexSimone div(MyComplexSimone z2) {
        return eseguiOerazione("div", z2);
    }

    private MyComplexSimone eseguiOerazione(String operazione, MyComplexSimone z2) {
        MyComplexSimone z3 = new MyComplexSimone();
        switch (operazione) {
            case "add":
                z3.setRE(getRe() + z2.getRe());
                z3.setIM(getIm() + z2.getIm());
                break;
            case "sub":
                z3.setRE(getRe() - z2.getRe());
                z3.setIM(getIm() - z2.getIm());
                break;
            case "mult":
                z3.setRE((getRe() * z2.getRe()) - (getIm() * z2.getIm()));
                z3.setIM((getRe() * z2.getIm()) + (getIm() * z2.getRe()));
                break;
            case "div": // da correggere non è così la div
                z3.setRE((getRe() / z2.getRe()));
                z3.setIM((getRe() / z2.getRe()));
                break;
            default:
                System.err.println("operazione non consentita");
                break;
        }
        return z3;
    }

    // Calcola il coniugato di questo numero complesso
    // coniugato del complesso z: z^= x - i*y
    public MyComplexSimone conj() {
        MyComplexSimone c = new MyComplexSimone();
        c.setRE(RE);
        c.setIM(-IM);
        return c;
    }
    /*
     * //Calcola l'inverso rispetto al prodotto di un numero complesso
     * //inverso del complesso z: 1/z = x/(|z|*|z|) -i*y/(|z|*|z|), per z != 0
     * public MyComplex inv()
     * {
     * MyComplex c = new MyComplex();
     * c.setRE(1/(a.getRE*b.getRE));
     * c.setIM(-1/(a.getIM*b.getIM));
     * //if b != 0 then System.out.println("non si puo dividere per z2=0")
     * return c;
     * }
     * 
     * //Calcola il modulo di questo numero complesso
     * //modulo del complesso z: |z| = sqrt( x*x + y*y).
     * public double mod()
     * {
     * MyComplex c = new MyComplex();
     * 
     * 
     * 
     * return c;
     * }
     * 
     * //Confronta con tolleranza due numeri complessi.
     * public boolean approxEquals(MyComplex z)
     * {
     * return false; //completare
     * }
     */

    // Crea una stringa che rappresenta questo numero complesso
    // Formato stringa: parte reale + i*parte immaginaria
    public String toString() {
        return RE + " + I*" + IM;
    }

    // -------- metodi di accesso ----------

    // Restituisce la parte complessa di un numero complesso
    public double getIm() {
        return RE;
    }

    // Restituisce la parte reale di un numero complesso
    public double getRe() {
        return IM;
    }

    public void setIM(double immag) {
        IM = immag;
    }

    public void setRE(double real) {
        RE = real;
    }
}
