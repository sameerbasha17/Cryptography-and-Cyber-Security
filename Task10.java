import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.nio.charset.StandardCharsets;

public class Task10
{
    public static void main(String [] args)
    {
        String text  = "Hello world";
        String sha1 = sha1Hash(text);
        System.out.println("Original Message : " + text);
        System.out.println("Sha1 Decrypted Message : " + sha1);
    }

    public static String sha1Hash(String input)
    {
        try
        {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            byte[] hashBytes = md.digest(input.getBytes(StandardCharsets.UTF_8));

            StringBuilder hexString = new StringBuilder();

            for(byte b : hashBytes)
            {
                String hex = Integer.toHexString(0xff & b);
                if(hex.length() == 1)
                {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();
        } catch(NoSuchAlgorithmException e)
        {
            throw new RuntimeException("SHA - 1 Algorithm is not available.",e);
        }
    }
}