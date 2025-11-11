import java.util.Scanner;

public class Practica0 {
    public static void main ( String args[] )
    {
        String shortmsg = "Short Message";
        String longmsg = "Long Message";
        Boolean printShort = true; 
        Integer counter;

        if (printShort == true)
            System.out.print(shortmsg);
        else 
            System.out.print(longmsg);


        if ((printShort = true) || (printShort = false))
            System.out.print("This message is always printed");

        for (Integer i = 0; i <= 10; i++){
            System.out.print("Are we there yet");
        }

        int i = 0;

        while (i <= 7){
            System.out.print("I'm going to pass the course");
            i++;
        }
            
    


    }
    
}
