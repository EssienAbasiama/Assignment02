import java.util.Scanner;
public class Ass13 {
    public static void main(String[] args){
    //program to display the unicode of the number between 0 to 15 of what the user inputed
Scanner sc = new Scanner(System.in);
System.out.println("Input a number between 0 to 15");
int x = sc.nextInt();

if ( x < 0 || x > 15){
    
    System.exit(1);
}
else if(x >= 0 && x <=9 ){
    System.out.println(x);
}
else{
    int y = (x - 10) + 10;
    //char y = (char) v;
    if(Character.isDigit(y)){
        System.out.println(y);
    }
    else if(y >= 10){
    String message;


    switch(y) {
        case 10:
        message = "A";
        break;
        case 11:
        message = "B";
        break;
        case 12:
        message = "C";
        break;
        case 13:
        message = "D";
        break;
        case 14:
        message = "E";
        break;
        case 15:
        message = "F";
        break;
        default:
        message = "Invalid inputs";
        break;
    }
    System.out.println(message);
    //System.out.println(y);
}
}

//char y = (char) ();

}

    // private static boolean isDigit(int y) {
        // return false;
    // }

    // private static void Switch(int y) {
    // }
}