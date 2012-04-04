package it.unitn._152549;

public class LibroScontato extends Libro {
    int scontoPercentuale;
    
    public LibroScontato(String titolo,
            String isbn,
            float prezzo,
            int sconto)
    {
        super(titolo, isbn, prezzo);
        this.scontoPercentuale = sconto;
    }
    
    @Override
    public float getPrezzo() {
        return prezzo*(100-scontoPercentuale)/100;
    }
    
    @Override
    public String toString() {
        return super.toString()+"Sconto: "+scontoPercentuale+"%";
    }
}
