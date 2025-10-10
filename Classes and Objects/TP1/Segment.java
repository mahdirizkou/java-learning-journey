public class Segment {
    private int ex1 ;
    private int ex2 ;

    public Segment(int x1 , int x2) {
       ex1 = x1;
       ex2 = x2;
    }
    public void ordonne() {
        if (ex1 > ex2) {
            int temp = ex1;
            ex1 = ex2;
            ex2 = temp;
        }
        }
    public int Getlongueur() {
            return Math.abs(ex2 - ex1);
    }
    public boolean appartient(int x) {
        return (x >= ex1 && x <= ex2);
    }
    public String Affiche() {
        return "SEGMENT[" + ex1 + "," + ex2 + "]";
    }
     public void setExtr1(int m1) {
        ex1 = m1;
    }

    public void setExtr2(int m2) {
        ex2 = m2;
    }
}