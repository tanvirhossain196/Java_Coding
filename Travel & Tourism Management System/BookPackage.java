package tanvirfinalproject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BookPackage extends JFrame {

     JPanel p1;
     JTextField t1;
     Choice c1;
     JLabel l1, l2, l3, l4, l5;

    private String username;
    private String id;
    private String number;
    private String phone;

    public BookPackage(String username, String id, String number, String phone) {

        setTitle("Travel and Tourism Management System");
        this.username = username;
        this.id = id;
        this.number = number;
        this.phone = phone;

        this.setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(420, 220, 1100, 450);
        p1 = new JPanel();
        setContentPane(p1);
        p1.setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("tanvirfinalproject/icons/bookpackage.jpg"));
        Image i3 = i1.getImage().getScaledInstance(600, 310, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel la1 = new JLabel(i2);
        la1.setBounds(450, 70, 700, 310);
        add(la1);

        JLabel lblName = new JLabel("BOOK PACKAGE DETAILS");
        lblName.setFont(new Font("SERIF", Font.BOLD, 40));
        lblName.setBounds(118, 7, 600, 53);
        p1.add(lblName);

        JLabel uName = new JLabel("Username :");
        uName.setFont(new Font("SERIF", Font.BOLD, 18));
        uName.setBounds(35, 70, 200, 14);
        p1.add(uName);

        l1 = new JLabel(username);
        l1.setBounds(271, 70, 200, 14);
        p1.add(l1);

        JLabel sPackage = new JLabel("Select Package :");
        sPackage.setFont(new Font("SERIF", Font.BOLD, 18));
        sPackage.setBounds(35, 110, 200, 14);
        p1.add(sPackage);

        c1 = new Choice();
        c1.add("Gold Package");
        c1.add("Silver Package");
        c1.add("Bronze Package");
        c1.setBounds(271, 110, 150, 30);
        add(c1);

        JLabel person = new JLabel("Total Persons :");
        person.setFont(new Font("SERIF", Font.BOLD, 18));
        person.setBounds(35, 150, 200, 14);
        p1.add(person);

        t1 = new JTextField();
        //t1.setText("0");
        t1.setBounds(271, 150, 150, 20);
        p1.add(t1);
        t1.setColumns(10);

        JLabel id1 = new JLabel("ID :");
        id1.setFont(new Font("SERIF", Font.BOLD, 18));
        id1.setBounds(35, 190, 200, 14);
        p1.add(id1);

        l2 = new JLabel(id);
        l2.setBounds(271, 190, 200, 14);
        p1.add(l2);

        JLabel num = new JLabel("Number :");
        num.setFont(new Font("SERIF", Font.BOLD, 18));
        num.setBounds(35, 230, 200, 14);
        p1.add(num);

        l3 = new JLabel(number);
        l3.setBounds(271, 230, 200, 14);
        p1.add(l3);

        JLabel phone1 = new JLabel("Phone :");
        phone1.setFont(new Font("SERIF", Font.BOLD, 18));
        phone1.setBounds(35, 270, 200, 14);
        p1.add(phone1);

        l4 = new JLabel(phone);
        l4.setBounds(271, 270, 200, 14);
        p1.add(l4);

        JLabel price = new JLabel("Total Price :");
        price.setFont(new Font("SERIF", Font.BOLD, 18));
        price.setBounds(35, 310, 200, 14);
        p1.add(price);

        l5 = new JLabel();
        l5.setBounds(271, 310, 200, 14);
        l5.setForeground(Color.RED);
        p1.add(l5);

        JButton b1 = new JButton("Check Price");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String p = c1.getSelectedItem();
                int cost = 0;
                if (p.equals("Gold Package")) {
                    cost += 12000;
                } else if (p.equals("Silver Package")) {
                    cost += 25000;
                } else if (p.equals("Bronze Package")) {
                    cost += 32000;
                }

                cost *= Integer.parseInt(t1.getText());
                l5.setText("Rs " + cost);
            }
        });
        b1.setBounds(50, 350, 120, 30);
         //b1.setFont(new Font("SERIF", Font.BOLD, 40));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        p1.add(b1);

        JButton book = new JButton("Book");
        book.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (t1.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Something is wrong!!\n\tEnter num of Person.");
                } else {
                    // Place your code here for booking the package
                    JOptionPane.showMessageDialog(null, "Package booked successfully");
                    setVisible(false);
                    new Dashboard().setVisible(true);
                }
            }
        });
        book.setBounds(200, 350, 120, 30);
         //book.setFont(new Font("SERIF", Font.BOLD, 40));
        book.setBackground(Color.BLACK);
        book.setForeground(Color.WHITE);
        p1.add(book);

        JButton back = new JButton("Back");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Dashboard().setVisible(true);
            }
        });
        back.setBounds(350, 350, 120, 30);
         //book.setFont(new Font("SERIF", Font.BOLD, 40));
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        p1.add(back);

        getContentPane().setBackground(Color.WHITE);
    }

    //public static void main(String[] args) {
       // new BookPackage("", "", "", "").setVisible(true);
   // }
}
