package buoi3;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;;

public class CalculatorWindow extends JFrame implements ActionListener{
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
    // thiet ke giao dien cho nguoi dung
    public void builPanel(){
        jPanel = new JPanel();
        jLabelInput1 = new JLabel("input 1");
        jTextFieldInput1 = new JTextField(10);
        
        jLabelIntput2 = new JLabel("input 2");
        jTextFieldInput2 = new JTextField(10);

        jLabelOutPut = new JLabel("Output: ");

        addButton = new JButton("ADD");
        addButton.addActionListener(this); // this == remote cua calculatorWindow
        mulButton = new JButton("MUL");
        mulButton.addActionListener(this);
        subButton = new JButton("SUB");
        subButton.addActionListener(this);
        divButton = new JButton("DIV");
        divButton.addActionListener(this);

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
    @Override
    public void actionPerformed(ActionEvent e){
        double num1 = Double.parseDouble(jTextFieldInput1.getText());
        double num2 = Double.parseDouble(jTextFieldInput2.getText());

        String command = e.getActionCommand();
        if (command.equals("ADD")) {
            double outputNum = num1 + num2;
            jLabelOutPut.setText("" + outputNum);
        }
        else if(command.equals("MUL"))
        {
            double outputNum = num1 - num2;
            jLabelOutPut.setText("" + outputNum);
        }
        else if (command.equals("SUB")) {
            double outputNum = num1 * num2;
            jLabelOutPut.setText("" + outputNum);
        }
        else if (command.equals("DIV")) {
            double outputNum = num1 / num2;
            jLabelOutPut.setText("" + outputNum);
        }

    }
}
