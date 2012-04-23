package it.unitn._152549.tombola;
import java.util.*;

public class Banco {
    Random generator;
    Set drawnNumbers;
    final int MAXN = 9;
    
    public Banco() {
        generator = new Random(System.currentTimeMillis()/101);
        drawnNumbers = new HashSet();
    }
    
    public int getNextNumber() {
        boolean isNew = false;
        int num = 0;
        do {
            num = generator.nextInt(MAXN) +1;
            isNew = drawnNumbers.add(new Integer(num));
            System.out.println(num+" "+isNew);
        } while(!isNew);
        return num;
    }
    
    private void test() {
        while (drawnNumbers.size() < MAXN) {
            this.getNextNumber();
        }
        Iterator iter = drawnNumbers.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
    
    public static void main (String[] args) {
        Banco b = new Banco();
        b.test();
    }
}
