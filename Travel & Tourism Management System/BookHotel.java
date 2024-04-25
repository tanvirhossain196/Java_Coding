package tanvirfinalproject;

import java.awt.*;
import java.awt.Font;
import java.awt.Image;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;

public class BookHotel extends JFrame {
    private JPanel p1;
    JTextField t1, t2, t3, t4, t5, t6, t7, t8;
    Choice c1, c2, c3;

    public BookHotel() {
        
        setTitle("Travel and Tourism Management System");
        setBounds(420, 220, 1100, 600);
        this.setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p1 = new JPanel();
        setContentPane(p1);
        p1.setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("tanvirfinalproject/icons/book.jpg"));
        Image i3 = i1.getImage().getScaledInstance(700, 440, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel la1 = new JLabel(i2);
        la1.setBounds(445, 80, 700, 440);
        add(la1);

        JLabel lblName = new JLabel("ADD DETAILS FOR BOOK HOTEL");
         lblName.setFont(new Font("SERIF", Font.BOLD, 40));
        lblName.setBounds(118, 7, 800, 53);
        p1.add(lblName);

        JLabel uName = new JLabel("Username :");
        uName.setFont(new Font("SERIF", Font.BOLD, 18));
        uName.setBounds(35, 70, 200, 14);
        p1.add(uName);

        JLabel l1 = new JLabel();
        l1.setBounds(271, 70, 200, 14);
        p1.add(l1);

        JLabel hotel = new JLabel("Select Hotel :");
        hotel.setFont(new Font("SERIF", Font.BOLD, 18));
        hotel.setBounds(35, 110, 200, 14);
        p1.add(hotel);

        c1 = new Choice();
        c1.add("Hotel A");
        c1.add("Hotel B");
        c1.add("Hotel C");
        c1.setBounds(271, 110, 150, 30);
        add(c1);

        JLabel person = new JLabel("Total Persons");
        person.setFont(new Font("SERIF", Font.BOLD, 18));
        person.setBounds(35, 150, 200, 14);
        p1.add(person);

        t1 = new JTextField();
        t1.setText("0");
        t1.setBounds(271, 150, 150, 20);
        p1.add(t1);
        t1.setColumns(10);

        JLabel nDays = new JLabel("Number of Days");
        nDays.setFont(new Font("SERIF", Font.BOLD, 18));
        nDays.setBounds(35, 190, 200, 14);
        p1.add(nDays);

        t2 = new JTextField();
        t2.setText("0");
        t2.setBounds(271, 190, 150, 20);
        p1.add(t2);
        t2.setColumns(10);

        JLabel ac = new JLabel("AC / Non-AC");
        ac.setFont(new Font("SERIF", Font.BOLD, 18));
        ac.setBounds(35, 230, 200, 14);
        p1.add(ac);

        c2 = new Choice();
        c2.add("AC");
        c2.add("Non-AC");
        c2.setBounds(271, 230, 150, 30);
        add(c2);

      JLabel food = new JLabel("Food Included? :");
      food.setFont(new Font("SERIF", Font.BOLD, 18));
        food.setBounds(35, 270, 200, 14);
        p1.add(food);

        c3 = new Choice();
        c3.add("Yes");
        c3.add("No");
        c3.setBounds(271, 310, 150, 20);
        add(c3);

        JLabel id = new JLabel("ID :");
        food.setFont(new Font("SERIF", Font.BOLD, 18));
        food.setBounds(35, 310, 200, 14);
        p1.add(food);


        JLabel num = new JLabel("Number :");
        num.setFont(new Font("SERIF", Font.BOLD, 18));
        num.setBounds(35, 350, 200, 14);
        p1.add(num);

        t4 = new JTextField();
        t4.setBounds(271, 350, 150, 20);
        p1.add(t4);
        t4.setColumns(10);

        JLabel phone = new JLabel("Phone :");
        phone.setFont(new Font("SERIF", Font.BOLD, 18));
        phone.setBounds(35, 390, 200, 14);
        p1.add(phone);

        t5 = new JTextField();
        t5.setBounds(271, 390, 150, 20);
        p1.add(t5);
        t5.setColumns(10);

        JLabel price = new JLabel("Total Price :");
        price.setFont(new Font("SERIF", Font.BOLD, 18));
        price.setBounds(35, 430, 200, 14);
        p1.add(price);

        t6 = new JTextField();
        t6.setBounds(271, 430, 150, 20);
        p1.add(t6);
        t6.setColumns(10);

        JButton b1 = new JButton("Check Price");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedHotel = c1.getSelectedItem();
                int costPerDay = 0;
                int foodCharges = 0;
                int acCharges = 0;

                if (selectedHotel.equals("Hotel A")) {
                    costPerDay = 100;
                    foodCharges = 20;
                    acCharges = 30;
                } else if (selectedHotel.equals("Hotel B")) {
                    costPerDay = 80;
                    foodCharges = 15;
                    acCharges = 25;
                } else if (selectedHotel.equals("Hotel C")) {
                    costPerDay = 120;
                    foodCharges = 25;
                    acCharges = 35;
                }

                int persons = Integer.parseInt(t1.getText());
                int days = Integer.parseInt(t2.getText());
                String acPrice = c2.getSelectedItem();
                String foodPrice = c3.getSelectedItem();

                int total = 0;
                total += acPrice.equals("AC") ? acCharges : 0;
                total += foodPrice.equals("Yes") ? foodCharges : 0;
                total += costPerDay;
                total = total * persons * days;

                t6.setText(String.valueOf(total));

                // Fetching customer details from AddCustomer.txt
                String id = t3.getText();
                String number = t4.getText();
                String phone = t5.getText();

                try (BufferedReader br = new BufferedReader(new FileReader("AddCustomers.txt"))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        String[] customerData = line.split(",");
                        if (customerData[1].equals(id) && customerData[2].equals(number) && customerData[7].equals(phone)) {
                            t7.setText(customerData[0]); // Set username
                            break;
                        }
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        b1.setBounds(35, 490, 110, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        p1.add(b1);

        JButton btnNewButton = new JButton("Book");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedHotel = c1.getSelectedItem();
                int costPerDay = 0;
                int foodCharges = 0;
                int acCharges = 0;

                if (selectedHotel.equals("Hotel A")) {
                    costPerDay = 100;
                    foodCharges = 20;
                    acCharges = 30;
                } else if (selectedHotel.equals("Hotel B")) {
                    costPerDay = 80;
                    foodCharges = 15;
                    acCharges = 25;
                } else if (selectedHotel.equals("Hotel C")) {
                    costPerDay = 120;
                    foodCharges = 25;
                    acCharges = 35;
                }

                int persons = Integer.parseInt(t1.getText());
                int days = Integer.parseInt(t2.getText());
                String acPrice = c2.getSelectedItem();
                String foodPrice = c3.getSelectedItem();

                int total = 0;
                total += acPrice.equals("AC") ? acCharges : 0;
                total += foodPrice.equals("Yes") ? foodCharges : 0;
                total += costPerDay;
                total = total * persons * days;

                String username = t7.getText();
                String id = t3.getText();
                String number = t4.getText();
                String phone = t5.getText();
                String totalPrice = t6.getText();

                try (BufferedWriter writer = new BufferedWriter(new FileWriter("booked_hotel.txt"))) {
                    writer.write("Username: " + username + "\n");
                    writer.write("Hotel: " + selectedHotel + "\n");
                    writer.write("Total Persons: " + persons + "\n");
                    writer.write("Number of Days: " + days + "\n");
                    writer.write("AC / Non-AC: " + acPrice + "\n");
                    writer.write("Food Included: " + foodPrice + "\n");
                    writer.write("ID: " + id + "\n");
                    writer.write("Number: " + number + "\n");
                    writer.write("Phone: " + phone + "\n");
                    writer.write("Total Price: Rs " + totalPrice);
                    writer.newLine();
                    writer.flush();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                JOptionPane.showMessageDialog(null, "Hotel Booked Successfully");
                setVisible(false);
            }
        });
        btnNewButton.setBounds(199, 490, 80, 30);
        btnNewButton.setBackground(Color.BLACK);
        btnNewButton.setForeground(Color.WHITE);
        p1.add(btnNewButton);

        JButton btnExit = new JButton("Back");
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Dashboard().setVisible(true);
            }
        });
        btnExit.setBounds(340, 490, 80, 30);
        btnExit.setBackground(Color.BLACK);
        btnExit.setForeground(Color.WHITE);
        p1.add(btnExit);

        getContentPane().setBackground(Color.WHITE);
    }

    //public static void main(String[] args) {
      //  new BookHotel().setVisible(true);
   // }
}