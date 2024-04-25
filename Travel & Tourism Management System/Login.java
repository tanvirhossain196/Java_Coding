package tanvirfinalproject;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;

public class Login extends JFrame implements ActionListener {

    JLabel l1;

    JPanel panel;
    JTextField textField;
    JPasswordField passwordField;
    JButton b1, b2, b3,b4;

    public Login() {

        this.setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // setBounds(350, 100, 1200, 725);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("tanvirfinalproject/icons/splash.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        //setVisible(true);

        setTitle("Travel and Tourism Management System");

        setBackground(Color.GRAY);
        setBounds(550, 250, 800, 400);

        panel = new JPanel();
        panel.setBackground(Color.WHITE);
        setContentPane(panel);
        panel.setLayout(null);

        JLabel l1 = new JLabel("Username : ");
        l1.setFont(new Font("SERIF", Font.BOLD, 25));
        l1.setBounds(60, 65, 130, 30);
        panel.add(l1);

        JLabel l2 = new JLabel("Password : ");
        l2.setFont(new Font("SERIF", Font.BOLD, 25));
        l2.setBounds(60, 145, 130, 30);
        panel.add(l2);

        textField = new JTextField();
        textField.setBounds(220, 70, 165, 25);
        panel.add(textField);

        passwordField = new JPasswordField();
        passwordField.setBounds(220, 150, 165, 25);
        panel.add(passwordField);

        JLabel l3 = new JLabel("");
        l3.setBounds(377, 79, 46, 34);
        panel.add(l3);

        JLabel l4 = new JLabel("");
        l4.setBounds(377, 124, 46, 34);
        panel.add(l3);

        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("tanvirfinalproject/icons/Login.jpg"));
        Image i4 = c1.getImage().getScaledInstance(350, 300, Image.SCALE_DEFAULT);
        ImageIcon i5 = new ImageIcon(i4);

        JLabel l6 = new JLabel(i5);
        l6.setBounds(420, 45, 350, 300);
        add(l6);

        b1 = new JButton("Login");
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Arial", Font.BOLD, 18));
        b1.setBounds(80, 230, 87, 25);
        panel.add(b1);

        b2 = new JButton("Back");
        b2.addActionListener(this);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("Arial", Font.BOLD, 18));
        b2.setBounds(300, 280, 87, 25);
        panel.add(b2);

        b3 = new JButton("Forgot Password");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setFont(new Font("Arial", Font.BOLD, 18));
        b3.setBounds(80, 280, 187, 25);
        b3.addActionListener(this);
        panel.add(b3);

        b4 = new JButton("Clear");
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setFont(new Font("Arial", Font.BOLD, 18));
        b4.setBounds(300, 230, 87, 25);
        b4.addActionListener(this);
        panel.add(b4);
 

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.LIGHT_GRAY);
        panel2.setBounds(24, 45, 380, 300);
        panel.add(panel2);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == b1) {
                String ID, password;
                ID = textField.getText();
                password= passwordField.getText();
                File fi = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\Login.txt");
                int count;
                try (Scanner input = new Scanner(fi)) {
                    count = 0;
                    while(input.hasNext()){
                        String username = input.next();
                        String pin = input.next();
                        if (ID.equals(username) && password.equals(pin)) {
                            count++;
                            break;
                        }
                    }
                }
                if(count == 0){
                    JOptionPane.showMessageDialog(null, "Wrong Username or Password\nTry Again");
                }else{
                    JOptionPane.showMessageDialog(null, "Login Successfull");
                    setVisible(false);
                    new Dashboard().setVisible(true);                   
                }             
            } else if (ae.getSource() == b4) {
                textField.setText("");
                passwordField.setText("");
            } else if (ae.getSource() == b3) {
                setVisible(false);
                new ForgotPassword().setVisible(true);
            }else if(ae.getSource() == b2){
                 this.setVisible(false);
                 new Program_Start().setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
       new Login().setVisible(true);
   }
}