/*
    L'insieme C dei numeri complessi e' l'insieme delle coppie ordinate (x,y) 
    con x e y appartenenti a R (insieme dei numeri reali).
    Dato il numero complesso z = x + i *y,  i numeri reali x e y sono detti
    parte reale e parte immaginaria di z.
    Nei commenti che seguono, facciamo riferimento ai numeri complessi
        z = x + i*y, z1 = x1 + i*y1, z2 = x2 + i*y2
*/


// Attenzione: 
// 1) Ovviamente il file va rinominato nel file MyComplex1.java
// 2) notate che, sebbene i corpi dei metodi non siano ancora  
//    stati scritti, questo codice compila correttamente perche` 
//    abbiamo inserito degli enunciati di return. 


public class MyComplex1
{	
    private double RE;
    private double IM;
    
    // inizializza il numero complesso al valore 0 + i0 (zero complesso)
    public MyComplex1()
    {
    RE=0;
    IM=0;
    }

    // inizializza il numero complesso al valore re + i*im
    public MyComplex1(double realPart, double imagPart)
    {
    	RE=realPart;
    	IM=imagPart;
    }
    
    //Somma a questo numero complesso il numero complesso z
    //somma di due complessi: z = z1+z2 = (x1+x2) + i(y1+y2)
    public MyComplex1 add(MyComplex1 z)
    {
    	MyComplex1 c = new MyComplex1();
    	c.setRE(getRe() + z.getRe());
    	c.setIM(getIm() + z.getIm());
    	return c;  
    }

    //Sottrae a questo numero complesso il numero complesso z
    //sottrazione di due complessi: z = z1-z2 = (x1-x2) +i(y1-y2)
    public MyComplex1 sub(MyComplex1 z)
    {
        MyComplex1 c = new MyComplex1();
    	c.setRE(getRe() - z.getRe());
    	c.setIM(getIm() - z.getIm());
    	return c;
    }

    //Moltiplica questo numero complesso per il numero complesso z
    //prodotto di due complessi: z = z1*z2 = (x1*x2 -y1*y2) + i*(x1*y2 + x2*y1)
    public MyComplex1 mult(MyComplex1 z)
    {
        MyComplex1 c = new MyComplex1();
    	c.setRE((getRe()*z.getRe())-(getIm()*z.getIm()));
    	c.setIM((getRe()*z.getIm())+(getIm()*z.getRe()));
    	return c;
    }
    //CTRL + F + H replace set caratteri

    //Divide questo numero complesso per il numero complesso z
    //divisione fra due complessi: z1/z2 = z1 *1/z2, per z2 != 0
    public MyComplex1 div(MyComplex1 z)
    {
        MyComplex1 c = new MyComplex1();   //da scrivere meglio
    	c.setRE((getRe()*z.getRe())+(getIm()*z.getIm())/(((z.getRe()*z.getRe())+(z.getIm()*z.getIm()))));
    	c.setIM((getIm()*z.getRe())-(getRe()*z.getIm())/(((z.getRe()*z.getRe())+(z.getIm()*z.getIm()))));
        //if b != 0 then System.out.println("non si puo dividere per z2=0")
    	return c;
    }
          
    //Calcola il coniugato di questo numero complesso
    //coniugato del complesso z:  z^= x - i*y
    public MyComplex1 conj()
    {
        MyComplex1 c = new MyComplex1();
    	c.setRE(getRe());
    	c.setIM(-getIm());
    	return c;
    }
        
    //Calcola l'inverso rispetto al prodotto di un numero complesso
    //inverso del complesso z: 1/z = x/(|z|*|z|) -i*y/(|z|*|z|), per z != 0
    public MyComplex1 inv()
    {
        MyComplex1 c = new MyComplex1();
    	c.setRE(getRe()/(getRe()*getRe()+getIm()*getIm()));
    	c.setIM(getIm()/(getRe()*getRe()+getIm()*getIm()));
        //if b != 0 then System.out.println("non si puo dividere per z2=0")
    	return c;
    }
    

    
    //Calcola il modulo di questo numero complesso
    //modulo del complesso z: |z| = sqrt( x*x + y*y).
    public double mod()
    {
    	return Math.sqrt(getRe()*getRe()+getIm()*getIm());
    }
    

    //Confronta con tolleranza due numeri complessi.
    public boolean approxEquals(MyComplex1 z)
    {
        double tolleranza = 1e-10; // Tolleranza molto piccola
        return Math.abs(getRe() - z.getRe()) < tolleranza && Math.abs(getIm() - z.getIm()) < tolleranza; 
    }
    

    //Crea una stringa che rappresenta questo numero complesso
    //Formato stringa: parte reale + i*parte immaginaria
    public String toString()
    {
    return RE+" + I * "+IM;  
    }
    

    //-------- metodi di accesso ----------
          
    //Restituisce la parte complessa di un numero complesso
    public double getIm()
    {
        return IM;  
    }
    //Restituisce la parte reale di un numero complesso
    public double getRe()
    {
        return RE; 
    }

    public void setIM(double immag)
    {
	    IM = immag;
    }

    public void setRE(double real)
    {
	    RE = real;
    }
}

