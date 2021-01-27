import java.util.Scanner;


public class WiFiDiagnosis
{
    public static void main(String[] args)
    {
        //These variables contain prompts that could ask the user to diagnostic wifi
        String a = "\nAre you able to  connect with the internet? (yes or no)\n";
        String[] b ={"First step: reboot your computer", 
                    "Second step: reboot your router",
                    "Third step: make sure the cables to your router are plugged in firmly and your router is getting power",
                    "Forth step: Move the computer closer to the router and try to reconnect",
                    "Try to contact your ISP"};

        Scanner reader = new Scanner(System.in);
        System.out.println("This is a Wifi diagnostic program, this program might help with your wifi problem");

        for (int i =0; i<4 ; i++)
        {
            System.out.print(b[i]+a);
            String input = reader.nextLine();
            if (input.equals("yes"))
            {
                System.out.print(b[i]+" seems to work");
                break;
            }
        }
        System.out.print(b[4]);
        reader.close();
    }
}