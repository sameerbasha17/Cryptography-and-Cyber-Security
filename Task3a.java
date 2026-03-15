// TASk : 3a
import java.util.Scanner;

public class Task3a
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the plain text : ");  // Original message
        String plainText = sc.nextLine();

        System.out.println("Enter the Key value : ");  // shift value
        short key = sc.nextShort();

        StringBuilder enc = new StringBuilder(); // For storing the encrypted(cipher) message.
        StringBuilder dec = new StringBuilder(); // For storing the decrypted(transformed plain text) message.

        for(int i = 0; i < plainText.length(); i++)
        {
            char ch = plainText.charAt(i);

            if(ch >= 'A' && ch <= 'Z')
            {
                enc.append(String.valueOf((char)((ch - 'A' + key) % 26 + 'A')));
            }
            else if(ch >= 'a' && ch <= 'z')
            {
                enc.append(String.valueOf((char)((ch - 'a' + key) % 26 + 'a')));
            }
            else
                enc.append(String.valueOf(ch));

        }

        System.out.println("Encrypted Message : " + enc.toString());

        // Decryption
        for(int i = 0; i < enc.length(); i++)
        {
            char ch = enc.charAt(i);
            if(ch >= 'A' && ch <= 'Z')
            {
                dec.append(String.valueOf((char)((ch - 'A' - key + 26) % 26 + 'A')));
            }
            else if(ch >= 'a' && ch <= 'z')
            {
                dec.append(String.valueOf((char)((ch - 'a' - key + 26) % 26 + 'a')));
            }
            else
                dec.append(String.valueOf(ch));
        }
        System.out.println("Decrypted Message : " + dec);
        sc.close();
    }
}

/*
Output :
========
Enter the plain text : 
Vishnu@TJs
Enter the Key value : 
3
Encrypted Message : Ylvkqx@WMv
Decrypted Message : Vishnu@TJs
*/