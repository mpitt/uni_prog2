package it.unitn._152549;

public class Primes {
    public static void main(String args[]) {
        Primes p = new Primes();
    }
    
    Primes() {
        int count = 0;
        int n = 2;
        boolean prime;
        while(count < 20) {
            prime=true;
            for (int i=2; i<n; i++) {
                if ((n%i)==0) prime=false;
            }
            if (prime) {
                count++;
                if ((count%4)==0)
                    System.out.println(n);
            }
            n++;
        }
    }
}
