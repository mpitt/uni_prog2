package it.unitn._152549;

public class Point3D extends Point {
    int z;
    public Point3D(int x, int y, int z) {
        super(x,y);
        this.z = z;
    }
    
   public String toString() {
       return "("+x+","+y+","+z+")";
   }
   
   public void move(int dx, int dy, int dz) {
       super.move(dx, dy);
       z += dz;
   }
}
