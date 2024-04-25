package tanvirfinalproject;

import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.border.*;

public class Signup extends JFrame implements ActionListener {

    JPanel p1;
    JTextField textField;
    JTextField textField_1;
    JTextField textField_2;
    JTextField textField_3;
    JButton b1, b2;
    JComboBox<String> comboBox;

    public Signup() {
        setLayout(null);
        this.setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(600, 300, 705, 410);

        p1 = new JPanel();
        p1.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(p1);
        p1.setBackground(Color.WHITE);
        p1.setLayout(null);

        JLabel lblUsername = new JLabel("Username :");
        lblUsername.setForeground(Color.DARK_GRAY);
        lblUsername.setFont(new Font("SERIF", Font.BOLD, 20));
        lblUsername.setBounds(60, 60, 130, 26);
        p1.add(lblUsername);

        JLabel lblName = new JLabel("Name :");
        lblName.setForeground(Color.DARK_GRAY);
        lblName.setFont(new Font("SERIF", Font.BOLD, 20));
        lblName.setBounds(60, 105, 130, 26);
        p1.add(lblName);

        JLabel lblPassword = new JLabel("Password :");
        lblPassword.setForeground(Color.DARK_GRAY);
        lblPassword.setFont(new Font("SERIF", Font.BOLD, 20));
        lblPassword.setBounds(60, 150, 130, 26);
        p1.add(lblPassword);

        JLabel lblSecurityQuestion = new JLabel("Security Question :");
        lblSecurityQuestion.setForeground(Color.DARK_GRAY);
        lblSecurityQuestion.setFont(new Font("SERIF", Font.BOLD, 20));
        lblSecurityQuestion.setBounds(60, 195, 165, 26);
        p1.add(lblSecurityQuestion);

        comboBox = new JComboBox<>();
        comboBox.setModel(new DefaultComboBoxModel<>(new String[]{null, "Your NickName?", "Your Lucky Number?",
            "Your Favourite Teacher?", "Your childhood Name ?"}));
        comboBox.setBounds(275, 200, 148, 25);
        p1.add(comboBox);

        JLabel lblAnswer = new JLabel("Answer :");
        lblAnswer.setForeground(Color.DARK_GRAY);
        lblAnswer.setFont(new Font("SERIF", Font.BOLD, 20));
        lblAnswer.setBounds(60, 240, 130, 26);
        p1.add(lblAnswer);

        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("tanvirfinalproject/icons/Signup.jpg"));
        Image i1 = c1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);

        JLabel l6 = new JLabel(i2);
        l6.setBounds(440, 65, 220, 210);
        add(l6);

        textField = new JTextField();
        textField.setBounds(275, 65, 148, 25);
        p1.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(275, 115, 148, 25);
        p1.add(textField_1);

        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(275, 160, 148, 25);
        p1.add(textField_2);

        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(275, 250, 148, 25);
        p1.add(textField_3);

        b1 = new JButton("Create");
        b1.addActionListener(this);
        b1.setFont(new Font("Tahoma", Font.BOLD, 13));
        b1.setBounds(140, 295, 100, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        p1.add(b1);

        b2 = new JButton("Back");
        b2.addActionListener(this);
        b2.setFont(new Font("Tahoma", Font.BOLD, 13));
        b2.setBounds(300, 295, 100, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        p1.add(b2);

        JPanel panel = new JPanel();
        panel.setForeground(new Color(34, 139, 34));
        panel.setBorder(new TitledBorder(new LineBorder(new Color(128, 128, 0), 2), "Create-Account",
        TitledBorder.LEADING, TitledBorder.TOP, null, new Color(34, 139, 34)));
        panel.setBounds(31, 30, 640, 310);
        panel.setBackground(Color.WHITE);
        p1.add(panel);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == b1) {

                File file = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\signup.txt");
                FileWriter fw = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fw);

                File file2 = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\Login.txt");
                FileWriter fw2 = new FileWriter(file2, true);
                BufferedWriter bw2 = new BufferedWriter(fw2);

                String e1 = textField.getText();
                String e2 = textField_1.getText();
                String e3 = textField_2.getText();
                String e4 = textField_3.getText();
                String e5 = (String) comboBox.getSelectedItem();

                bw.write(textField.getText() + " " + textField_1.getText() + " " + textField_2.getText() + " " + comboBox.getSelectedItem() + " " + textField_3.getText());
                bw.newLine();

                bw.close();
                fw.close();

                bw2.write("\n" + textField.getText() + "\n" + textField_2.getText());
                bw2.newLine();

                bw2.close();
                fw2.close();

                if (e1 == null || e2 == null || e3 == null || e4 == null || e5 == null) {
                    JOptionPane.showMessageDialog(null, "Something is Wrong!!\n\tTry again!");

                } else {
                    JOptionPane.showMessageDialog(null, "Account Created Successfully");
                    setVisible(false);
                    new Login().setVisible(true);
                }

                //JOptionPane.showMessageDialog(null, "Account Created Successfully");
                textField.setText("");
                textField_1.setText("");
                textField_2.setText("");
                textField_3.setText("");
            }
            if (ae.getSource() == b2) {
                this.setVisible(false);
                new Login().setVisible(true);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new Signup().setVisible(true);
    }
}
