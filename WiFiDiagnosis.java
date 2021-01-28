/*
 * Class: CMSC203 
 * Instructor: Khandan Vahabzadeh Monshi
 * Description: Create a WiFiDiagnosis program to diagnosis wifi
 * Due: 2/02/2021
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Kevin Nguyen
*/

                                                //Should not use array in this assignment
import java.util.Scanner;

public class WiFiDiagnosis
{
    public static void main(String[] args)
    {
        //These variables contain prompts that could ask the user to diagnostic wifi
        String first = "First step: reboot your computer";
        String second = "Second step: reboot your router";
        String third = "Third step: make sure the cables to your router are plugged in firmly and your router is getting power";
        String forth = "Forth step: Move the computer closer to the router and try to reconnect";
        String last = "Try to contact your ISP";
        String check = "Are you able to connect with the internet? (yes or no)";
        String worked = " seems to work";
        String thanks = "Thanks for using!!!";

        Scanner reader = new Scanner(System.in);
        System.out.println("This is a Wifi diagnostic program, this program might help with your wifi problem");
        System.out.println(first);
        System.out.println(check);

        int i =0;
        for (; i<=3 ; i++)
        {
            String input = reader.nextLine();
            if (input.equals("yes") && i ==0)
            {   
                System.out.println(first + worked);
                System.out.println (thanks);
                break;
            }
            else if (input.equals("yes") && i ==1)
            {
                System.out.println(second + worked);
                System.out.println (thanks);
                break;
            }
            else if (input.equals("yes") && i ==2)
            {
                System.out.println(third + worked);
                System.out.println (thanks);
                break;
            }
            else if (input.equals("yes") && i ==3)
            {
                System.out.println(forth + worked);
                System.out.println (thanks);
                break;
            }
            else if(input.equals("no") && i==0)
            {
                System.out.println(second);
                System.out.println(check);
            }
            else if (input.equals("no") && i == 1)
            {
                System.out.println(third);
                System.out.println(check);
            }
            else if (input.equals("no") && i == 2)
            {
                System.out.println(forth);
                System.out.println(check);
            }
            else if (input.equals("no") && i ==3)     //This is when the internet is still not working after tries many steps
            {
                System.out.println(last);
                System.out.println (thanks);
            }
            else                                      //This is when user type in something weird
            {
                System.out.println("I don't understand please type again");
                i-=1;
            }
        }
        reader.close();
    }
}