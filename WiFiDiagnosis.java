/*
 * Class: CMSC203 
 * Instructor: Khandan Vahabzadeh Monshi
 * Description: the WiFiDiagnosis class use to run the main program
 * Due: 2/02/2021
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Kevin Nguyen
*/


import java.util.Scanner;

public class WiFiDiagnosis
{
    public static void main(String[] args)
    {
        //These variables contain prompts that could ask the user to diagnostic wifi
        String a = "\nAre you able to connect with the internet? (yes or no)\n";
        String[] b ={"First step: reboot your computer", 
                    "Second step: reboot your router",
                    "Third step: make sure the cables to your router are plugged in firmly and your router is getting power",
                    "Forth step: Move the computer closer to the router and try to reconnect",
                    "Try to contact your ISP"};

        Scanner reader = new Scanner(System.in);
        System.out.println("This is a Wifi diagnostic program, this program might help with your wifi problem");

        int i =0;
        for (; i<=3 ; i++)
        {
            System.out.print(b[i]+a);
            String input = reader.nextLine();
            if (input.equals("yes"))
            {
                System.out.print(b[i]+" seems to work");
                break;
            }
        }
        //This is when the internet is still not working after tries many steps
        if (i ==4)
        {
            System.out.print(b[i]);
        }
        reader.close();
    }
}