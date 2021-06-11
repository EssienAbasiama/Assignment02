import java.util.Scanner;
    public class Ass15 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //phone Key pad
            System.out.println("Input any letter and see it's value on the keypad phone");
            String str = sc.nextLine();
            str.toLowerCase();
            String message;
            //System.out.println("Input any letter and see it's value on the keypad phone");
            if (str.equals("-") || str.equals("+") || str.equals(".") || str.equals(",")){
                message ="1";
                System.out.println(message);
            }
            else if(str.equals("a") || str.equals("b") || str.equals("c")){
                message = "2";
                System.out.println(message);
            }
            else if(str.equals("d") || str.equals("e") || str.equals("f")){
                message = "3";
                System.out.println(message);
            }
            else if(str.equals("g") || str.equals("h") || str.equals("i")){
                message = "4";
                System.out.println(message);
            }
            else if(str.equals("j") || str.equals("k") || str.equals("l")){
                message = "5";
                System.out.println(message);
            }
            else if(str.equals("m") || str.equals("n") || str.equals("o")){
                message = "6";
                System.out.println(message);
            }
            else if(str.equals("p") || str.equals("q") || str.equals("r")|| str.equals("s")){
                message = "7";
                System.out.println(message);
            }
            else if(str.equals("t") || str.equals("u") || str.equals("v")){
                message = "8";
                System.out.println(message);
            }
            else if(str.equals("w") || str.equals("x") || str.equals("y")|| str.equals("z")){
                message = "9";
                System.out.println(message);
            }
            
    }
}
