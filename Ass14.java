import java.util.Scanner;
public class Ass14 {
    public static void main(String[] args){
        //Program to determine if a letter is a vowel or consonant  
        System.out.println("Input any letter and lets determine if its a vowel or consonant ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.length() > 1){
            System.out.println(str + " Cannot be determined if its a vowel or consonant");
            System.exit(1);
            
        }
        else{
            String message;
        switch(str) {
            
            case "a":
            message = "i am vowel";
            break;
            case "e":
            message = "i am vowel";
            case "i":
            message = "i am vowel";
            break;
            case "o":
            message = "i am vowel";
            break;
            case "u":
            message = "i am vowel";
            break;
            default:
            message = "I am consonant";
            break;
           
        }
        System.out.println(message);
        }
    }
}
