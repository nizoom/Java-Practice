import java.util.Scanner;

public class Maths {

    public static void main(String[] args) {

        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter an integer for side A of a triangle");

        String sideAStr = getInput.nextLine();

        System.out.println("Enter an integer for side B of a triangle");

        String sideBStr = getInput.nextLine(); 

        int sideA = Integer.parseInt(sideAStr);

        int sideB = Integer.parseInt(sideBStr);

        double hypotenuse = Math.pow(sideA, 2) +  Math.pow(sideB, 2);

        System.out.println("The hypotenuse of the triangle is " + Math.sqrt(hypotenuse));


      
    }
    

}
