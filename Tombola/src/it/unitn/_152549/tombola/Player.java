package it.unitn._152549.tombola;
import java.util.*;

public class Player {
    Collection cartella, cartellaOriginale;
    final int MAXN = 9;
    final int NCELLS = 3;
    String nome = null;
    
    public Player(String nome) {
        this.nome = nome;
    }
    
    void createNewCartella() {
        Random generator = new Random(System.currentTimeMillis()/27);
        cartella = new HashSet();
        for (int i=1; i<=NCELLS; i++) {
            boolean newNum = false;
            do {
                int num = generator.nextInt();
                newNum = cartella.add(new Integer(num));
            } while (!newNum);
        }
        cartellaOriginale = new HashSet();
        cartellaOriginale.addAll(cartella);
    }
    
    public boolean checkNumber(int x) {
        boolean check = cartella.remove(new Integer(x));
        if (check) {
            System.out.println(nome+" ha il numero "+x);
        }
        return check;
    }
    
    public boolean isWinner() {
        if (cartella.isEmpty()) {
            System.out.println(nome+" ha finito!");
            System.out.println("Aveva la seguente cartella: ");
            Iterator iter = cartellaOriginale.iterator();
            while (iter.hasNext()) {
                System.out.println(iter.next());
            }
            return true;
        }
        else
            return false;
    }
}
