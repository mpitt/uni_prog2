package it.unitn._152549;

public class Libro {
    protected String titolo, isbn;
    protected float prezzo;
    
    public Libro(String titolo, String isbn, float prezzo) {
        this.titolo = titolo;
        this.isbn = isbn;
        this.prezzo = prezzo;
    }
    
    @Override
    public boolean equals(Object obj) {
       if (obj.getClass() != this.getClass()) {
           return false;
       } else {
           return isbn.equals(((Libro) obj).isbn);
       }
    }
    
    @Override
    public String toString() {
        return "Titolo: "+titolo+"\nISBN: "+isbn+"\nPrezzo: € "+prezzo+"\n";
    }
    
    public float getPrezzo() {
        return prezzo;
    }
}
