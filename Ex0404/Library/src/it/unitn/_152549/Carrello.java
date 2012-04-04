package it.unitn._152549;

import java.util.*;

public class Carrello {
    List libri = new LinkedList();
    
    public boolean aggiugiLibro(Libro libro) {
        return libri.add(libro);
    }
    
    public boolean togliLibro(Libro libro) {
       return libri.remove(libro);
    }
    
    public float getConto() {
        Iterator iter = libri.iterator();
        float conto = 0;
        while(iter.hasNext()) {
            conto += ((Libro) iter.next()).getPrezzo();
        }
        return conto;
    }
    
    @Override
    public boolean equals(Object obj) {
        return this == obj;
    }
    
    @Override
    public String toString() {
        Iterator iter = libri.iterator();
        String ret = "";
        while(iter.hasNext()) {
            ret += iter.next().toString();
            ret += "------------\n";
        }
        return ret;
    }
}
