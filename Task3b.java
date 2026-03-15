// TASK : 3b
import java.util.Scanner;
public class Task3b 
{
    public static void main(String [] args) 
    {
        Scanner sc = new Scanner(System.in);
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String key = "qwertyuiopasdfghjklzxcvbnm";

        // for enc
        StringBuilder enc = new StringBuilder();
        // for dec
        StringBuilder dec = new StringBuilder();

        System.out.println("Enter the plain text(Lower Case only) : ");
        String plainText = sc.nextLine();

        // ENCRYPTION
        for(int i = 0; i < plainText.length(); i++)
        {
            char ch = plainText.charAt(i);
            enc.append(String.valueOf(key.charAt(ch - 'a')));
        }
        System.out.println("Encrypted Message : " + enc);

        // DECRYPTION 
        for(int i = 0; i < enc.length(); i++)
        {
            char ch = enc.charAt(i);
            dec.append(String.valueOf(alphabet.charAt(key.indexOf(ch))));
        }
        System.out.println("Decrypted Message : " + dec);
        
        sc.close();
    }   
}

/*
Output :
========
Enter the plain text : 
you should wait    
Enter the Key value : 
8
Encrypted Message : gwc apwctl eiqb
Decrypted Message : you should wait

*/