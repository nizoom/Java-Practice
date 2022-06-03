import javax.swing.text.StyledEditorKit;

public class JavaLessonThree{
    
    public static void main(String[] args)  
    {
        int randomNumber = (int) (Math.random() * 50);

        System.out.println(randomNumber);

        if (randomNumber < 25) 
        {
            System.out.println("The random number is less than 25");
   
        }
        else if (randomNumber > 40)
        {
            System.out.println("The random number is greater than 40");
        }

        if((true) ^ (false))
        {

        }

        System.out.println("The random number is " + randomNumber);

    
           

    }
}