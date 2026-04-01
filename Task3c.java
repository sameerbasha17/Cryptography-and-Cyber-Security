// TASK : 3c
import java.util.Scanner;
public class Task3c 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        // Read the plaintext message
        System.out.println("Enter the plain Text message : ");
        String plainText = sc.nextLine();

        // Convert plaintext to uppercase and remove spaces
        plainText = plainText.toUpperCase();
        plainText = plainText.replaceAll("\\s","");

        // If the length of plaintext is odd, append the letter 'X'
        if(plainText.length() % 2 != 0)
        {
            plainText += "X";
        }

        // Define a 2x2 key matrix
        int[][] key = new int[2][2];
        System.out.println("Enter the elements in 2x2 key matrix : ");
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                key[i][j] = sc.nextInt();
            }
        }

        int[][] ptMatrix = new int[plainText.length()/2][2];
        // Divide plaintext into pairs of letters
        // Convert each letter pair into numerical form (A = 0, B = 1, ... , Z= 25)
        for(int i = 0; i < plainText.length()/2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                ptMatrix[i][j] = (plainText.charAt(i+j) - 'A');
            }
        }

        // Multiply the key matrix with the plaintext matrix
        int[][] result = new int[2][1];
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 1; j++)
            {
                result[i][j] = 0;
                for(int k = 0; k < 2; k++)
                {
                    result[i][j] += key[i][k] * ptMatrix[j][k];
                }
            }
        }

        

        sc.close();
    }    
}
