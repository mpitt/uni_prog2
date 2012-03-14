public class Countdown {
    public static void main(String[] args) {
        new Countdown();
    }

    Countdown() {
        doCountdown(10);
    }

    public void doCountdown(int n) {
        for (int i=n; i>0; i--) {
            System.out.println(i);
        }
    }
}
