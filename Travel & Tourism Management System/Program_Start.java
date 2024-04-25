package tanvirfinalproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Program_Start extends JFrame implements ActionListener {

    JLabel l1, l2;
    JButton b1, b2;
    JPanel p1;

    Program_Start() {
        this.setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Travel and Tourism Management System");
        setLayout(null);

        p1 = new JPanel();
        setContentPane(p1);
        p1.setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("tanvirfinalproject/icons/main.jpg"));
        Image i3 = i1.getImage().getScaledInstance(800, 380, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel la1 = new JLabel(i2);
        la1.setBounds(0, 70, 800, 270);
        add(la1);

        l1 = new JLabel("Welcome To Our Travel And Tourism Package");
        l1.setFont(new Font("SERIF", Font.BOLD, 35));
        l1.setBounds(45, 10, 740, 50);
        add(l1);

        l2 = new JLabel("Do you have an account?");
        l2.setFont(new Font("Osward", Font.BOLD, 25));
        l2.setBounds(230, 340, 650, 50);
        add(l2);

        b1 = new JButton("Yes");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b2 = new JButton("No");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        b1.setFont(new Font("Arial", Font.BOLD, 18));
        b1.setBounds(240, 400, 100, 30);
        add(b1);

        b2.setFont(new Font("Arial", Font.BOLD, 18));
        b2.setBounds(420, 400, 100, 30);
        add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        getContentPane().setBackground(Color.WHITE);
        setSize(800, 480);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == b1) {
                setVisible(false);
                new Login().setVisible(true);
            } else if (ae.getSource() == b2) {
                this.setVisible(false);
                new Signup().setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Program_Start().setVisible(true);
    }
}
