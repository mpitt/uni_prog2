package it.unitn._152549;

public class Countdown {
    public static void main(String args[]) {
        new Countdown();
    }
    
    Countdown() {
        doCountdownFrom(10);
    }
    
    public void doCountdownFrom(int n) {
        for (int i=n; i>0; i--) {
            System.out.println("Counting down: " + i);
        }
    }
} 
