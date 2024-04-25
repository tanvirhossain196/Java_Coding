package tanvirfinalproject;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;

public class ViewCustomers extends JFrame {

    JPanel p;
    JTable table;
    JLabel l2, l3, l4, l5, l6,l7,l8,l9,l10,l11,l12,lblId;
    
    public ViewCustomers() {

        this.setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1700, 700);

        p = new JPanel();
        p.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(p);
        p.setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("tanvirfinalproject/icons/viewall.jpg"));
        Image i3 = i1.getImage().getScaledInstance(626, 200, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l1 = new JLabel(i2);
        l1.setBounds(0, 490, 626, 201);
        p.add(l1);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("tanvirfinalproject/icons/viewall.jpg"));
        Image i5 = i4.getImage().getScaledInstance(626, 201, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l2 = new JLabel(i6);
        l2.setBounds(615, 490, 626, 201);
        add(l2);

        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("tanvirfinalproject/icons/viewall.jpg"));
        Image i8 = i7.getImage().getScaledInstance(626, 201, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel l7 = new JLabel(i6);
        l7.setBounds(1100, 490, 626, 201);
        add(l7);

        table = new JTable();
        table.setBounds(0, 40, 1700, 340);
        p.add(table);

        try {
            BufferedReader br = new BufferedReader(new FileReader("C:/Users/User/Documents/NetBeansProjects/CSE110_Project/AddCustomers.txt"));
            String line;
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Username");
            model.addColumn("Id Type");
            model.addColumn("Number");
            model.addColumn("Name");
            model.addColumn("Gender");
            model.addColumn("Country");
            model.addColumn("Address");
            model.addColumn("Phone");
            model.addColumn("Email");

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                model.addRow(data);
            }

            table.setModel(model);
            br.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        JButton back = new JButton("Back");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Dashboard().setVisible(true);
            }
        });
        back.setBounds(800, 420, 87, 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        p.add(back);

        l8 = new JLabel("Username");
        l8.setFont(new Font("SERIF", Font.BOLD, 20));
        l8.setBounds(50, 15, 150, 20);
        p.add(l8);

        l9 = new JLabel("Id Type");
        l9.setFont(new Font("SERIF", Font.BOLD, 20));
        l9.setBounds(250, 15, 76, 20);
        p.add(l9);

        l10 = new JLabel("Number");
        l10.setFont(new Font("SERIF", Font.BOLD, 20));
        l10.setBounds(450, 15, 80, 20);
        p.add(l10);

        l11 = new JLabel("Name");
        l11.setFont(new Font("SERIF", Font.BOLD, 20));
        l11.setBounds(650, 15, 76, 20);
        p.add(l11);

        l12 = new JLabel("Gender");
        l12.setFont(new Font("SERIF", Font.BOLD, 20));
        l12.setBounds(830, 15, 90, 20);
        p.add(l12);

        l3 = new JLabel("Country");
        l3.setFont(new Font("SERIF", Font.BOLD, 20));
        l3.setBounds(1000, 15, 90, 20);
        p.add(l3);

        l4 = new JLabel("Address");
        l4.setFont(new Font("SERIF", Font.BOLD, 20));
        l4.setBounds(1200, 15, 90, 20);
        p.add(l4);

        l5 = new JLabel("Phone");
        l5.setFont(new Font("SERIF", Font.BOLD, 20));
        l5.setBounds(1400, 15, 90, 20);
        p.add(l5);

        l6 = new JLabel("Email");
        l6.setFont(new Font("SERIF", Font.BOLD, 20));
        l6.setBounds(1590, 15, 90, 20);
        p.add(l6);
    }

    public static void main(String[] args) {
       new ViewCustomers().setVisible(true);
   }
}

