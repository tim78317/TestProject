
package TestProject;

import javax.swing.JOptionPane;
/**
 *
 * @author tim78317
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double age = 0;
       
        String input = JOptionPane.showInputDialog("How old are you?");
        age = Double.parseDouble(input);
        
        
        JOptionPane.showMessageDialog(null, "WOW you are OLD!!!" + "Your " + age + "Years old!!!");
        
        
    }
}
