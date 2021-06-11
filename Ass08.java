import java.util.Scanner;
public class Ass08 {
    //Geometry great circle
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your latitude " + "(x1  , y1)");
            double x = sc.nextDouble();
            double x1 = Math.toRadians(x);

            double y = sc.nextDouble();
            double y1 = Math.toRadians(y);

        System.out.println("Input your longitude" + "(x , y)");
            double xx = sc.nextDouble();
            double x2 = Math.toRadians(xx);
            double yy = sc.nextDouble();
            double y2 = Math.toRadians(yy);
        

            double radius = 6371.01;




            //double a = radius * Math.acos(Math.sin(x1)) *   Math.sin(x2);
            //double b = Math.acos(Math.sin(x1)) *   Math.sin(x2)


            double d = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

            System.out.println("The dstance between two points (x1, y1) an d(x2, y2) is : " + d + "km");






    }
}
