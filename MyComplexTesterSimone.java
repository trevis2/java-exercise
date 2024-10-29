import java.util.Scanner;
import java.util.Locale;

public class MyComplexTesterSimone {
    public static void main(String[] args) {
        // acquisizione da standard input
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);

        System.out.println("Inserire parte reale e immaginaria nella");
        System.out.println("stessa riga, separandoli con uno spazio\n");

        // creazione del primo numero complesso
        System.out.print("numero complesso a = ");
        double aRe = in.nextDouble();
        double aIm = in.nextDouble();
        MyComplexSimone a = new MyComplexSimone(aRe, aIm);

        // creazione del secondo numero complesso
        System.out.print("numero complesso b = ");
        double bRe = in.nextDouble();
        double bIm = in.nextDouble();
        MyComplexSimone b = new MyComplexSimone(bRe, bIm);

        // test dei metodi di MyComplex e stampe a standard output
        System.out.println("a = " + a + " , b = " + b);
        System.out.println("a + b = " + a.add(b).toString());
        System.out.println("a - b = " + a.sub(b).toString());
        System.out.println("a * b = " + a.mult(b).toString());
        System.out.println("a / b = " + a.div(b).toString());
        System.out.println("1 / a = " + a.inv().tostring());
        System.out.println("1 / b = " + b.inv().tostring());
        System.out.println("a^ = " + a.conj().tostring());
        System.out.println("b^ = " + b.conj().tostring());
        System.out.println("|a| = " + a.mod().tostring());
        System.out.println("|b| = " + b.mod().tostring());
        System.out.println("re(a) = " + a.getRe());
        System.out.println("re(b) = " + b.getRe());
        System.out.println("im(a) = " + a.getIm());
        System.out.println("im(b) = " + b.getIm());

        // chiusura del flusso
        in.close();
    }
}
