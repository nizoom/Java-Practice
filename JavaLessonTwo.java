import java.util.Scanner;

public class JavaLessonTwo {

    static Scanner userInput = new Scanner(System.in);

    public static void main (String[] args)

  
    {
        int numCeiling = (int) Math.ceil(6.777);

        System.out.println(numCeiling);
        
        System.out.print("Your favorite number: ");

        if(userInput.hasNextInt())
        {
            int numberEntered = userInput.nextInt();

            System.out.println("You entered " + numberEntered);

            int numEnteredTimes2 = numberEntered * 2;

            System.out.println(numberEntered + " " + "+" + " " + numberEntered + " " + "=" + " " + numEnteredTimes2);

            int numbersABS = Math.abs(numberEntered);

         


        } else {

            System.out.println("Enter an integer next time");


        }
    }

}
