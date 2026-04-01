import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.nio.charset.StandardCharsets;

public class Task11
{
    public static void main(String [] args)
    {
        String text = "Hello World";
        String md5 = sha1Hash(text);
        System.out.println("Original Message : " + text);
        System.out.println("MD5 hash  : " + md5);
    }

    public static String sha1Hash(String input)
    {
        try
        {
            MessageDigest md = MessageDigest.getInstance("MD5");
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
        }catch(NoSuchAlgorithmException e)
        {
            throw new RuntimeException("MD5 algorithm is not found", e);
        }
    }
}

/*
Output :
=========
Original Message : Hello World
MD5 hash  : b10a8db164e0754105b7a99be72e3fe5

*/