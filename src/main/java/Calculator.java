import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator {
    public static void main(String[] args) {
        // 1. Create the frame (the window that will pop up)
        JFrame frame = new JFrame("Calculator");
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        // 2. Choose what happens when you click the exit button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 3. Create components and put them in the frame

        JTextField field1 = new JTextField(15);

        JPanel panel1 = new JPanel();
        JButton button7 = new JButton("7");
        panel1.add(button7);
        JButton button8 = new JButton("8");
        panel1.add(button8);
        JButton button9 = new JButton("9");
        panel1.add(button9);
        JButton buttonDivide = new JButton("/");
        panel1.add(buttonDivide);

        JPanel panel2 = new JPanel();
        JButton button4 = new JButton("4");
        panel2.add(button4);
        JButton button5 = new JButton("5");
        panel2.add(button5);
        JButton button6 = new JButton("6");
        panel2.add(button6);
        JButton buttonTimes = new JButton("*");
        panel2.add(buttonTimes);

        JPanel panel3 = new JPanel();
        JButton button1 = new JButton("1");
        panel3.add(button1);
        JButton button2 = new JButton("2");
        panel3.add(button2);
        JButton button3 = new JButton("3");
        panel3.add(button3);
        JButton buttonMinus = new JButton("-");
        panel3.add(buttonMinus);

        JPanel panel4 = new JPanel();
        JButton button0 = new JButton("0");
        panel4.add(button0);
        JButton buttonDot = new JButton(".");
        panel4.add(buttonDot);
        JButton buttonEquals = new JButton("=");
        panel4.add(buttonEquals);
        JButton buttonPlus = new JButton("+");
        panel4.add(buttonPlus);

        frame.add(field1);
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);

        // 4. Size the frame
        frame.pack();

        // 5. Show the frame
        frame.setVisible(true);
    }
}
