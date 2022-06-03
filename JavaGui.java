import javax.swing.JOptionPane;

public class JavaGui {
    
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog("Enter Your Name");
        JOptionPane.showMessageDialog(null, "Hello " +  name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));

        JOptionPane.showMessageDialog(null, "Your age is " + age); 

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your age"));

        JOptionPane.showMessageDialog(null, "You are " + height + " inches tall"); 
        
    }
}
