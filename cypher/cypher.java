package cypher;

import javax.swing.JOptionPane;

public class cypher {

    public static void main(String[] args)
    {
        String ogMessage = JOptionPane.showInputDialog("Enter message for encryption").toLowerCase();
        
        String kValueStr = JOptionPane.showInputDialog("Enter value for shifting characters");

        int kValue = Integer.parseInt(kValueStr);

        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        // arr of OGmessage characters 

        char[] arrOfOgMessage = new char[ogMessage.length()];

        for(int i = 0 ; i < ogMessage.length() ; i++)
        {
            arrOfOgMessage[i] = ogMessage.charAt(i);
        }

        // create function to get kValue of letter 

        String encryptedStr = "";

        for (int j = 0 ; j < arrOfOgMessage.length; j ++)
        {
            char originalChar = arrOfOgMessage[j];

            char encryptedChar = encryptChar(originalChar, alphabet, kValue);

            encryptedStr += encryptedChar;

        }
    
        System.out.println("Your encrypted message is " + encryptedStr);

        // iterate through characters of OG message and add each encrypted character to an empty str 

    }

    public static char encryptChar(char originalChar, String alphabet, int kValue)

    {
        
        // make sure original char is a letter

        if(Character.isLetter(originalChar)){

                // find index of letter in alphabet and then add kvalue

            int originalPosition = alphabet.indexOf(originalChar);

            char encryptedChar = alphabet.charAt(originalPosition + kValue);
    
            return encryptedChar;

        } else {

            // otherwise the char is not a letter and should be returned as is

            return originalChar;
        }
    }   
}
