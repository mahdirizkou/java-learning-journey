import java.util.Scanner;

class Point {
    private double x;
    private double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // méthode pour calculer la distance entre deux points
    public double distance(Point P) {
        return Math.sqrt(Math.pow(this.x - P.x, 2) + Math.pow(this.y - P.y, 2));
    }
}

class Triangle {
    private Point A;
    private Point B;
    private Point C;

    Triangle(Point A, Point B, Point C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    // méthode pour calculer le périmètre
    public double perimetre() {
        double AB = A.distance(B);
        double BC = B.distance(C);
        double CA = C.distance(A);
        return AB + BC + CA;
    }

    // méthode pour vérifier si le triangle est isocèle
    public boolean isIsocele() {
        double AB = A.distance(B);
        double BC = B.distance(C);
        double CA = C.distance(A);

        
        if (AB == BC || BC == CA || CA == AB) {
            return true;
        } else {
            return false;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Construction d'un nouveau point");
        System.out.print("Veuillez entrer x : ");
        double x1 = sc.nextDouble();
        System.out.print("Veuillez entrer y : ");
        double y1 = sc.nextDouble();

        System.out.println("Construction d'un nouveau point");
        System.out.print("Veuillez entrer x : ");
        double x2 = sc.nextDouble();
        System.out.print("Veuillez entrer y : ");
        double y2 = sc.nextDouble();

        System.out.println("Construction d'un nouveau point");
        System.out.print("Veuillez entrer x : ");
        double x3 = sc.nextDouble();
        System.out.print("Veuillez entrer y : ");
        double y3 = sc.nextDouble();

        // Création des points
        Point A = new Point(x1, y1);
        Point B = new Point(x2, y2);
        Point C = new Point(x3, y3);

        // Création du triangle
        Triangle T = new Triangle(A, B, C);

        // Affichage des résultats
        System.out.println("Périmètre : " + T.perimetre());
        if (T.isIsocele()) {
            System.out.println("Le triangle est isocèle");
        } else {
            System.out.println("Le triangle n'est pas isocèle");
        }
    }
}
