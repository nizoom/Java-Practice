package Intro;
import java.util.Scanner;

public class JavaLessonFour{

    static Scanner userinput = new Scanner(System.in);

    public static void main(String[] args)
    {

       String contYorN = "Y";

       int h = 1;

        // while(contYorN.equalsIgnoreCase("y"))
        // {
        //     System.out.println(h);

        //     System.out.print("Countinue? y or n");

        //     contYorN = userinput.nextLine();

        //     h++;
        // }


    int k = 10000;

    do {
        System.out.println(k);
        k++;
    } while( k < 20);
        
    }

}