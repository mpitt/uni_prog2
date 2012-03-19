package it.unitn._152549;

public class Point {
    int x;
    int y;
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public String toString() {
        return "("+x+","+y+")";
    }
    
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }
}
