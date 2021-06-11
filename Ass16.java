import java.util.Scanner;
//iomport java.util.Random;
public class Ass16 {
    public static void main(String[] args){
        //program to generate a plate number
        int rans1 = (int) (65 + Math.random() * 25);
        char a = (char) rans1;

        int rans2 = (int) (65 + Math.random() * 25);
        char b = (char) rans2;

        int rans3 = (int) (65 + Math.random() * 25);
        char c = (char) rans3;

        int num1 =(int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        int num3 = (int) ( Math.random() * 10);
        int num4 = (int) (Math.random() * 10);

        System.out.println("Your vehicle plate number is :::" + a + b + c + " " + num1 + num2 + num3 + num4 );

       

    }
}