import java.util.Scanner;
public class Ass06 {
    public static void main(String[] args){
        //Guessing Birthday

        String set1 =   "1 3 5 7"    +"\n"+
                        "9 11 13 15" +"\n"+
                        "17 19 21 23"+"\n"+
                        "25 27 29 31";

        
        String set2 =   "2 3 6 7"    +"\n"+
                        "10 11 14 15" +"\n"+
                        "18 19 22 23"+"\n"+
                        "26 27 30 31";


        String set3 =   "4 5 6 7"    +"\n"+
                        "12 13 14 15" +"\n"+
                        "20 21 22 23"+"\n"+
                        "28 29 30 31";       


        String set4 =   "8 9 10 11"    +"\n"+
                        "12 13 14 15" +"\n"+
                        "24 25 26 27"+"\n"+
                        "28 29 30 31";


        String set5 =   "16 17 18 19"    +"\n"+
                        "20 21 22 23" +"\n"+
                        "24 25 26 27"+"\n"+
                        "28 29 30 31";
            Scanner sc = new Scanner(System.in);
            int sum = 0;
            System.out.println("Enter 0 for No and 1 for Yes");
            System.out.println("Is your birthday Date here??");
            System.out.println(set1);

            int ans1 = sc.nextInt(); 
                        
            if(ans1 == 1)
            sum += 1;
            else
            System.out.println("OK!! were progressing check the next one");
            
            //Second date range
            System.out.println("Is your birthday Date here??");
            System.out.println(set2);
            int ans2 = sc.nextInt(); 
            
            if(ans2 == 1)
            sum += 2;
            else
            System.out.println("OK!! were progressing check the next one");


            //Third date range
            System.out.println("Is your birthday Date here??");
            System.out.println(set3);
            int ans3 = sc.nextInt(); 
            
            if(ans3 == 1)
            sum += 4;
            else
            System.out.println("OK!! were progressing check the next one");


            //fourth case
            System.out.println("Is your birthday Date here??");
            System.out.println(set4);
            int ans4 = sc.nextInt(); 
            
            if(ans4 == 1)
            sum += 8;
            else
            System.out.println("OK!! were progressing check the next one");

            //Fifth case
            System.out.println("Is your birthday Date here??");
            System.out.println(set5);
            int ans5 = sc.nextInt(); 
            
            if(ans5 == 1)
            sum += 16;
            else
            System.out.println("OK!! were progressing check the next one");



            System.out.println("Your birthday date is on the date: " + sum);



            
    }     
}
