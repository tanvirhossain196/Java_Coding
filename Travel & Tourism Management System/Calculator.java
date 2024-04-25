package tanvirfinalproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

    private JFrame frame;
    private JTextField textField;
    private JButton[] numberButtons;
    private JButton[] functionButtons;
    private JButton addButton, subtractButton, multiplyButton, divideButton;
    private JButton decimalButton, equalButton, deleteButton, clearButton, back, acButton, delButton;
    private JPanel panel;

    private double firstNumber, secondNumber, result;
    private String operator;

    public Calculator() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(750, 300, 320, 450);
        frame.setLayout(null);

        textField = new JTextField();
        textField.setBounds(30, 20, 240, 40);
        frame.add(textField);

        back = new JButton("Back");
        back.setBounds(30, 370, 70, 25);
        back.setBackground(Color.LIGHT_GRAY);
        back.setForeground(Color.BLACK);
        back.setFont(new Font("Tahoma", Font.PLAIN, 14));
        back.addActionListener(this);
        frame.add(back);

        acButton = new JButton("AC");
        acButton.setBounds(120, 370, 60, 25);
        acButton.setBackground(Color.LIGHT_GRAY);
        acButton.setForeground(Color.BLACK);
        acButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
        acButton.addActionListener(new ButtonClickListener());
        frame.add(acButton);

        delButton = new JButton("Del");
        delButton.setBounds(210, 370, 60, 25);
        delButton.setBackground(Color.LIGHT_GRAY);
        delButton.setForeground(Color.BLACK);
        delButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
        delButton.addActionListener(new ButtonClickListener());
        frame.add(delButton);

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
        }

        functionButtons = new JButton[9];
        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");
        decimalButton = new JButton(".");
        equalButton = new JButton("=");
        deleteButton = new JButton("Delete");
        clearButton = new JButton("Clear");

        functionButtons[0] = addButton;
        functionButtons[1] = subtractButton;
        functionButtons[2] = multiplyButton;
        functionButtons[3] = divideButton;
        functionButtons[4] = decimalButton;
        functionButtons[5] = equalButton;
        functionButtons[6] = deleteButton;
        functionButtons[7] = clearButton;

        for (int i = 0; i < 8; i++) {
            functionButtons[i].addActionListener(new ButtonClickListener());
            functionButtons[i].setFont(new Font("Arial", Font.BOLD, 16));
        }

        for (int i = 0; i < 10; i++) {
            numberButtons[i].addActionListener(new ButtonClickListener());
            numberButtons[i].setFont(new Font("Arial", Font.BOLD, 16));
        }

        panel = new JPanel();
        panel.setBounds(30, 80, 240, 260);
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(divideButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(multiplyButton);
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(subtractButton);
        panel.add(numberButtons[0]);
        panel.add(decimalButton);
        panel.add(equalButton);
        panel.add(addButton);

        frame.add(panel);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back) {
            frame.dispose(); // Close the calculator frame
            new Dashboard().setVisible(true); // Show the dashboard frame
        }
    }

    private class ButtonClickListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == clearButton || e.getSource() == acButton) {
                textField.setText("");
            } else if (e.getSource() == deleteButton || e.getSource() == delButton) {
                String currentText = textField.getText();
                textField.setText(currentText.substring(0, currentText.length() - 1));
            } else if (e.getSource() == equalButton) {
                secondNumber = Double.parseDouble(textField.getText());
                if (operator.equals("+")) {
                    result = firstNumber + secondNumber;
                } else if (operator.equals("-")) {
                    result = firstNumber - secondNumber;
                } else if (operator.equals("*")) {
                    result = firstNumber * secondNumber;
                } else if (operator.equals("/")) {
                    result = firstNumber / secondNumber;
                }
                textField.setText(String.valueOf(result));
            } else {
                for (int i = 0; i < 10; i++) {
                    if (e.getSource() == numberButtons[i]) {
                        textField.setText(textField.getText() + i);
                    }
                }
                for (int i = 0; i < 8; i++) {
                    if (e.getSource() == functionButtons[i]) {
                        firstNumber = Double.parseDouble(textField.getText());
                        operator = functionButtons[i].getText();
                        textField.setText("");
                    }
                }
            }
        }
    }

    //public static void main(String[] args) {
        //new Calculator();
    //}
}