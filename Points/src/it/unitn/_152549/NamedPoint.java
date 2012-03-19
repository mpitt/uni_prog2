package it.unitn._152549;

public class NamedPoint extends Point {
    String name;
    public NamedPoint(int x, int y, String name) {
        super(x,y);
        this.name = name;
    }
    
    public String toString() {
        return name+" "+super.toString();
    }
}
