import java.util.Scanner;
public class Ass11 {
    public static void main(String[] args) {
        //Program to Write a program that receives an ASCII code and convert it

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        if ((x < 0) || (x > 127)){
            System.out.println("Invalid Inputs");
            System.exit(1);
            
        }
        char y = (char) (x); 
        System.out.println(y);
    }
}
