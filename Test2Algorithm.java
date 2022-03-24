// Algorithm for caluclating sum of all the digits of an integer by Nathan Adcock 24/03/2022
public class Test2Algorithm {
    public static void main (String[]Args){
        
       int a = 0;

       // catch any invalid numbers
        try {
             a = Integer.valueOf(Args[0]);
        }
        catch(NumberFormatException Er) {
            System.out.println("Error: Invalid Number");
        }
        // converts negative integers to positive
        if (a < 0){
            a = -a;
        }

        int sum = 0;
        
        while (a > 0) 
        {
            sum = sum + (a % 10);

            a = a / 10;
        }
         System.out.println(sum);
    } 
}
