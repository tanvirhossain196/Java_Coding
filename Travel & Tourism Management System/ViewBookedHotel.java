package tanvirfinalproject;

import java.awt.*;
import java.awt.EventQueue;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewBookedHotel extends JFrame {

    private JPanel p;
    Choice c1;

    public ViewBookedHotel() {

        this.setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(350, 100, 850, 550);
        p = new JPanel();
        setContentPane(p);
        p.setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("tanvirfinalproject/icons/ViewBookHotel.jpg"));
        Image i3 = i1.getImage().getScaledInstance(520, 400, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel la1 = new JLabel(i2);
        la1.setBounds(360, 70, 520, 400);
        add(la1);

        JLabel lblName = new JLabel("VIEW BOOKED HOTEL DETAILS");
        lblName.setFont(new Font("SERIF", Font.BOLD, 35));
        lblName.setBounds(88, 11, 600, 53);
        p.add(lblName);

        JLabel jl1 = new JLabel("Username :");
        jl1.setFont(new Font("SERIF", Font.BOLD, 20));
        jl1.setBounds(35, 70, 200, 28);
        p.add(jl1);

        JLabel l1 = new JLabel();
        l1.setBounds(271, 70, 200, 14);
        p.add(l1);

        JLabel jl2 = new JLabel("Name :");
        jl2.setFont(new Font("SERIF", Font.BOLD, 20));
        jl2.setBounds(35, 110, 200, 28);
        p.add(jl2);

        JLabel l2 = new JLabel();
        l2.setBounds(271, 110, 200, 14);
        p.add(l2);

        JLabel jl3 = new JLabel("Number of Persons :");
        jl3.setFont(new Font("SERIF", Font.BOLD, 20));
        jl3.setBounds(35, 150, 200, 28);
        p.add(jl3);

        JLabel l3 = new JLabel();
        l3.setBounds(271, 150, 200, 14);
        p.add(l3);

        JLabel jl4 = new JLabel("Number of Days :");
        jl4.setFont(new Font("SERIF", Font.BOLD, 20));
        jl4.setBounds(35, 190, 200, 28);
        p.add(jl4);

        JLabel l4 = new JLabel();
        l4.setBounds(271, 190, 200, 14);
        p.add(l4);

        JLabel jl5 = new JLabel("AC / Non-AC :");
        jl5.setFont(new Font("SERIF", Font.BOLD, 20));
        jl5.setBounds(35, 230, 200, 28);
        p.add(jl5);

        JLabel l5 = new JLabel();
        l5.setBounds(271, 230, 200, 14);
        p.add(l5);

        JLabel jl6 = new JLabel("Food Included (Yes/No) :");
        jl6.setFont(new Font("SERIF", Font.BOLD, 20));
        jl6.setBounds(35, 270, 300, 28);
        p.add(jl6);

        JLabel l6 = new JLabel();
        l6.setBounds(271, 270, 200, 14);
        p.add(l6);

        JLabel jl7 = new JLabel("ID Type :");
        jl7.setFont(new Font("SERIF", Font.BOLD, 20));
        jl7.setBounds(35, 310, 200, 28);
        p.add(jl7);

        JLabel l7 = new JLabel();
        l7.setBounds(271, 310, 200, 14);
        p.add(l7);

        JLabel jl8 = new JLabel("Number :");
        jl8.setFont(new Font("SERIF", Font.BOLD, 20));
        jl8.setBounds(35, 350, 200, 28);
        p.add(jl8);

        JLabel l8 = new JLabel();
        l8.setBounds(271, 350, 200, 14);
        p.add(l8);

        JLabel jl9 = new JLabel("Phone :");
        jl9.setFont(new Font("SERIF", Font.BOLD, 20));
        jl9.setBounds(35, 390, 200, 28);
        p.add(jl9);

        JLabel l9 = new JLabel();
        l9.setBounds(271, 390, 200, 14);
        p.add(l9);

        JLabel jl10 = new JLabel("Cost :");
        jl10.setFont(new Font("SERIF", Font.BOLD, 20));
        jl10.setBounds(35, 430, 200, 28);
        p.add(jl10);

        JLabel l10 = new JLabel();
        l10.setBounds(271, 430, 200, 14);
        p.add(l10);

        // Writing details to a text file
        try {
            FileWriter writer = new FileWriter("bookedHotelDetails.txt");
            String username = null;
            writer.write("Username: " + username + "\n");
            writer.write("Name: \n");
            writer.write("Number of Persons: \n");
            writer.write("Number of Days: \n");
            writer.write("AC / Non-AC: \n");
            writer.write("Food Included (Yes/No): \n");
            writer.write("ID: \n");
            writer.write("Number: \n");
            writer.write("Phone: \n");
            writer.write("Cost: \n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        JButton btnExit = new JButton("Back");
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Dashboard().setVisible(true);
            }
        });
        btnExit.setBounds(160, 470, 120, 30);
        btnExit.setBackground(Color.BLACK);
        btnExit.setForeground(Color.WHITE);
        p.add(btnExit);

        getContentPane().setBackground(Color.WHITE);
    }

    //public static void main(String[] args) {
       // new ViewBookedHotel().setVisible(true);
   // }
}
