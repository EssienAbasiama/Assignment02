import java.util.Scanner;
import java.util.Arrays;
public class Ass17 {
    public static void main(String[] args){
        //order three cities
        System.out.println("Input any three cities and let me arrange them in ascending order");
        Scanner sc = new Scanner(System.in);


        String a = sc.nextLine();
       
       
        //System.out.println(a11);

        String b = sc.nextLine();
        
        
        //System.out.println(b11);

        String c = sc.nextLine();
        
        
        //System.out.println(c11);

        // String d = sc.nextLine();
        // char d1 = (char) (a.charAt(0));
        // char a1 = (char) (a.charAt(0));
        // int a11 = (int) a1;
        // char b1 = (char) (b.charAt(0));
        // int b11 = (int) b1;
        // char c1 = (char) (c.charAt(0));
        // int c11 = (int) c1;

        //int[] array1 = {a11,b11,c11};
        String[] array2 = {a , b , c};



        
        


        
        


        
        


        //  String[] arr = Arrays.sort(array2);
        // for (int i = 0; i < array2.length; i++){
            // System.out.println(array2[i]);
        // }
        String temp;
        for (int i = 0; i <= array2.length-1; i++){
            for (int j = 0 ; j < array2.length-1; j++){
                // char a1 = (char) (a.charAt(0));
                // int a11 = (int) a1;
                // char b1 = (char) (b.charAt(0));
                // int b11 = (int) b1;
                // char c1 = (char) (c.charAt(0));
                // int c11 = (int) c1;
                if ((int) (array2[j+1].charAt(0)) < (int) (array2[j].charAt(0))){
                    temp = array2[j + 1];
                    array2[j + 1] = array2[j];
                    array2[j] = temp;


                }
                
            }
            System.out.println(array2[i]);
        }
        
        


        // Arrays.sort(array1);
        // for (int i = 0; i < array1.length;i++){
        // System.out.println(array1[i]);
        }           
    }




