package tanvirfinalproject;

import java.awt.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BookingToAdd extends JFrame {

    private JPanel panel;
    private JTextField t1, t2, t3, t4, t5, t6, t7, t8;
    JComboBox<String> comboBox;
    JRadioButton r1, r2;

    public BookingToAdd() {
        setTitle("Travel and Tourism Management System");
        this.setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(580, 220, 850, 550);

        panel = new JPanel();
        setContentPane(panel);
        panel.setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("tanvirfinalproject/icons/BookingToAdd.png"));
        Image i3 = i1.getImage().getScaledInstance(450, 430, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l1 = new JLabel(i2);
        l1.setBounds(420, 60, 450, 420);
        panel.add(l1);

        JLabel lblName = new JLabel("Add Details for Book Package");
        lblName.setFont(new Font("SERIF", Font.BOLD, 38));
        lblName.setBounds(118, 11, 500, 53);
        panel.add(lblName);

        JLabel luname = new JLabel("Username :");
        luname.setFont(new Font("SERIF", Font.BOLD, 18));
        luname.setBounds(35, 70, 200, 16);
        panel.add(luname);

        t7 = new JTextField();
        t7.setBounds(271, 70, 150, 20);
        panel.add(t7);
        t7.setColumns(10);

        JLabel lid = new JLabel("ID :");
        lid.setFont(new Font("SERIF", Font.BOLD, 18));
        lid.setBounds(35, 110, 200, 14);
        panel.add(lid);

        comboBox = new JComboBox<>(new String[]{"Passport", "Aadhar Card", "Voter Id", "Driving license"});
        comboBox.setBounds(271, 110, 150, 20);
        panel.add(comboBox);

        JLabel lnum = new JLabel("Number :");
        lnum.setFont(new Font("SERIF", Font.BOLD, 18));
        lnum.setBounds(35, 150, 200, 14);
        panel.add(lnum);

        t1 = new JTextField();
        t1.setBounds(271, 150, 150, 20);
        panel.add(t1);
        t1.setColumns(10);

        JLabel lname = new JLabel("Name :");
        lname.setFont(new Font("SERIF", Font.BOLD, 18));
        lname.setBounds(35, 190, 200, 14);
        panel.add(lname);

        t2 = new JTextField();
        t2.setBounds(271, 190, 150, 20);
        panel.add(t2);
        t2.setColumns(10);

        JLabel lgender = new JLabel("Gender :");
        lgender.setFont(new Font("SERIF", Font.BOLD, 18));
        lgender.setBounds(35, 230, 200, 14);
        panel.add(lgender);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("SERIF", Font.BOLD, 15));
        r1.setBackground(Color.WHITE);
        r1.setBounds(271, 230, 80, 12);
        add(r1);

        r2 = new JRadioButton("Female");
       r2.setFont(new Font("SERIF", Font.BOLD, 15));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350, 230, 100, 12);
        add(r2);

        JLabel lcountry = new JLabel("Country :");
        lcountry.setFont(new Font("SERIF", Font.BOLD, 18));
        lcountry.setBounds(35, 270, 200, 14);
        panel.add(lcountry);

        t3 = new JTextField();
        t3.setBounds(271, 270, 150, 20);
        panel.add(t3);

        JLabel ladress = new JLabel("Permanent Address :");
        ladress.setFont(new Font("SERIF", Font.BOLD, 18));
        ladress.setBounds(35, 310, 200, 14);
        panel.add(ladress);

        t5 = new JTextField();
        t5.setBounds(271, 310, 150, 20);
        panel.add(t5);

        JLabel lphone = new JLabel("Phone :");
        lphone.setFont(new Font("SERIF", Font.BOLD, 18));
        lphone.setBounds(35, 350, 200, 14);
        panel.add(lphone);

        t6 = new JTextField();
        t6.setBounds(271, 350, 150, 20);
        panel.add(t6);

        JLabel lemail = new JLabel("Email :");
        lemail.setFont(new Font("SERIF", Font.BOLD, 18));
        lemail.setBounds(35, 390, 200, 14);
        panel.add(lemail);

        t8 = new JTextField();
        t8.setBounds(271, 390, 150, 20);
        panel.add(t8);

        JButton btnNewButton = new JButton("Add");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String radio = null;

                    if (r1.isSelected()) {
                        radio = "Male";
                    } else if (r2.isSelected()) {
                        radio = "Female";
                    }

                    String s9 = t7.getText(); // username
                    String s1 = (String) comboBox.getSelectedItem(); // ID type
                    String s2 = t1.getText(); // number
                    String s3 = t2.getText(); // name
                    String s4 = radio; // gender
                    String s5 = t3.getText(); // country
                    String s7 = t5.getText(); // permanent address
                    String s8 = t6.getText(); // phone
                    String s10 = t8.getText(); // email

                    File file = new File("C:/Users/User/Documents/NetBeansProjects/CSE110_Project/AddCustomers.txt");
                    FileWriter fw = new FileWriter(file, true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    PrintWriter pw = new PrintWriter(bw);

                    String customerData = s9 + "," + s1 + "," + s2 + "," + s3 + "," + s4 + "," + s5 + "," + s7 + "," + s8 + "," + s10;
                    pw.println(customerData);
                    pw.close();

                    if (radio == null || s9.isEmpty() || s1.isEmpty() || s2.isEmpty() || s3.isEmpty() || s4.isEmpty() || s5.isEmpty() || s7.isEmpty() || s8.isEmpty() || s10.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Something is wrong!!\n\tCustomer cannot be added");
                    } else {
                        JOptionPane.showMessageDialog(null, "Customer added successfully");
                        setVisible(false);
                        new BookPackage(s9, s1, s2, s8).setVisible(true);
                       
                    }

                    // Clear fields after adding customer
                    t7.setText("");
                    comboBox.setSelectedIndex(0);
                    t1.setText("");
                    t2.setText("");
                    r1.setSelected(false);
                    r2.setSelected(false);
                    t3.setText("");
                    t5.setText("");
                    t6.setText("");
                    t8.setText("");
                } catch (Exception e1) {
                    System.out.println(e1.getMessage());
                }
            }
        });
        btnNewButton.setBounds(100, 430, 120, 30);
        btnNewButton.setBackground(Color.BLACK);
        btnNewButton.setForeground(Color.WHITE);
        panel.add(btnNewButton);

        JButton btnExit = new JButton("Back");
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Dashboard().setVisible(true);
            }
        });
        btnExit.setBounds(260, 430, 120, 30);
        btnExit.setBackground(Color.BLACK);
        btnExit.setForeground(Color.WHITE);
        panel.add(btnExit);

        getContentPane().setBackground(Color.WHITE);
    }

    public static void main(String[] args) {
        new BookingToAdd().setVisible(true);
   }
}