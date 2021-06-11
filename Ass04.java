
public class Ass04{
    public static void main(String[] args){
        //Write a code that generate a random lowercase letter
        double ransnum = 97 + Math.random() * 26;
        int i = (int) ransnum;
        System.out.println(i);
        char ch = (char) i;
        System.out.println(ch);

        //Show the output
        System.out.println('a' < 'b');
        System.out.println('a' <= 'A');
        System.out.println('a' > 'b');
        System.out.println('a' >= 'A');
        System.out.println('a' == 'a');
        System.out.println('a' != 'b');



        String si = "I am a boy";
        System.out.println(si.contains("o"));
    }
}






















