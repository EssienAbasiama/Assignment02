import java.util.Scanner;
public class Ass09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number of sides of the regular polygon");
        int n = sc.nextInt();


        System.out.println("Enter the length of the side of the polygon");
        Double s = sc.nextDouble();


//Geometry: area of a regular polygon




        //double b = Math.tan(3.1416/n) ;
        //double s = a * b ;
        //double n,s;
        double c = n * (s*s);
        double d = 4 * Math.tan(3.14159265358979/n);
        double area = c/ d;

        System.out.println("This is the area of your regular polygon " + area);

    }
}
