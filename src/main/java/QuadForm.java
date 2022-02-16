import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuadForm {

    public QuadForm() {
        //1. Create the frame.
        JFrame frame = new JFrame("Quadratic Formula");
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        //2. Optional: What happens when the frame closes?
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //3. Create components and put them in the frame.
        JPanel panel1 = new LTPanel("a =", 10);
        frame.add(panel1);

        JPanel panel2 = new LTPanel("b =", 10);
        frame.add(panel2);

        JPanel panel3 = new LTPanel("C =", 10);
        frame.add(panel3);

        //4. Size the frame.
        // frame.setSize(400, 400);
        frame.pack();

        //5. Show it.
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        QuadForm qf = new QuadForm();
    }
}
