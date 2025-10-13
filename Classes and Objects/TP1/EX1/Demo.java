public class Demo {
    public static void main(String[] args) {
        Segment s = new Segment(24, 12); 
        s.ordonne();                      
        s.Affiche();  
        System.out.println(s.Affiche());                    
        System.out.println("Longueur = " + s.Getlongueur());
        System.out.println("Appartient(15)? " + s.appartient(15));
        s.setExtr1(25);
        s.setExtr2(16);
        System.out.println(s.Affiche());
        System.out.println("Longueur = " + s.Getlongueur());
        System.out.println("Appartient(100)? = " + s.appartient(100));

    }
}