import java.util.Scanner;
// import java.util.Random;
public class Ass10 {

    public static void main(String[] args) {
        // Random rans = new Random();
        double radius = 40;
        
        double rans1 = 0 + Math.random() * (2 * 3.14159265358979);
        //Triangular points on the cicle
        double pointx1 = radius*Math.cos(rans1);
        double pointy1 = radius*Math.sin(rans1);

        double rans2 = 0 + Math.random() * (2 * 3.14159265358979);
        double pointx2 = radius*Math.cos(rans2);
        double pointy2 = radius*Math.sin(rans2);

        double rans3 = 0 + Math.random() * (2 * 3.14159265358979);
        double pointx3 = radius*Math.cos(rans3);
        double pointy3 = radius*Math.sin(rans3);


        System.out.println("The three points are :" + "(" + (pointx1*100)/100.0 +" "+ (pointy1*100)/100.0 + ")" +  "("  + (pointx2*100)/100.0  +" "+ (pointy2*100)/100.0 + ")" +  "(" + (pointx3*100)/100.0 + " "+(pointy3*100)/100.0 + ")" );
    };
}



