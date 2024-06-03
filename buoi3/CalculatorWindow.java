package buoi3;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorWindow extends JFrame {
    // filed
    private String title;
    private JPanel jPanel;
    private JLabel jLabelInput1, jLabelIntput2, jLabelOutPut;
    private JTextField jTextFieldInput1, jTextFieldInput2;
    private JButton addButton, mulButton, subButton, divButton;
    
    //Contructor
    CalculatorWindow(){
        builPanel();
        add(jPanel);
        title = "Frame Viewer";
        setSize(400, 400);
        setVisible(true);
    }

    public void builPanel(){
        jPanel = new JPanel();
        jLabelInput1 = new JLabel("input 1");
        jTextFieldInput1 = new JTextField(10);
        
        jLabelIntput2 = new JLabel("input 2");
        jTextFieldInput2 = new JTextField(10);

        jLabelOutPut = new JLabel("Output: ");

        addButton = new JButton("ADD");
        mulButton = new JButton("MUL");
        subButton = new JButton("SUB");
        divButton = new JButton("DIV");

        jPanel.add(jLabelInput1);
        jPanel.add(jTextFieldInput1);
        jPanel.add(jLabelIntput2);
        jPanel.add(jTextFieldInput2);
        jPanel.add(jLabelOutPut);
        jPanel.add(addButton);
        jPanel.add(mulButton);
        jPanel.add(subButton);
        jPanel.add(divButton);

    }
    // function hoac method
}
