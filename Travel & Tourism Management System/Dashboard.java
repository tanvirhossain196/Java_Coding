package tanvirfinalproject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Dashboard extends JFrame implements ActionListener {

    String username;
    JButton addpd, vd, dpd, cp, bp, vp, bh, vbh, td, po, c, n, ap, lout;

    Dashboard() {

        setLayout(null);

        this.setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(350, 100, 1200, 725);

        setTitle("Travel & Tourism Management System");

        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.darkGray);
        p1.setBounds(0, 0, 1600, 65);
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("tanvirfinalproject/icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(5, 0, 70, 70);
        p1.add(image);

        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(80, 10, 300, 40);
        heading.setFont(new Font("SERIF", Font.BOLD, 25));
        heading.setForeground(Color.CYAN);
        p1.add(heading);
        
        
        JLabel heading1 = new JLabel("Created by Md. Tanvir Hossain");
        heading1.setBounds(950, 10, 300, 40);
        heading1.setFont(new Font("SERIF", Font.ITALIC, 18));
        heading1.setForeground(Color.WHITE);
        p1.add(heading1);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(Color.darkGray);
        p2.setBounds(0, 65, 200, 800);
        add(p2);

        addpd = new JButton("Add Personal Details");
        addpd.setBounds(0, 0, 200, 45);
        addpd.setBackground(Color.LIGHT_GRAY);
        addpd.setForeground(Color.BLACK);
        addpd.setFont(new Font("SERIF", Font.BOLD, 14));
        addpd.setMargin(new Insets(0, 0, 0, 50));
        addpd.addActionListener(this);
        p2.add(addpd);

        vd = new JButton("View Details");
        vd.setBounds(0, 45, 200, 45);
        vd.setBackground(Color.LIGHT_GRAY);
        vd.setForeground(Color.BLACK);
        vd.setFont(new Font("SERIF", Font.BOLD, 14));
        vd.setMargin(new Insets(0, 0, 0, 95));
        vd.addActionListener(this);
        p2.add(vd);

        dpd = new JButton("Delete Personal Details");
        dpd.setBounds(0, 90, 200, 45);
        dpd.setBackground(Color.LIGHT_GRAY);
        dpd.setForeground(Color.BLACK);
        dpd.setFont(new Font("SERIF", Font.BOLD, 14));
        dpd.setMargin(new Insets(0, 0, 0, 20));
        dpd.addActionListener(this);
        p2.add(dpd);

        cp = new JButton("Check Package");
        cp.setBounds(0, 135, 200, 45);
        cp.setBackground(Color.LIGHT_GRAY);
        cp.setForeground(Color.BLACK);
        cp.setFont(new Font("SERIF", Font.BOLD, 14));
        cp.setMargin(new Insets(0, 0, 0, 73));
        cp.addActionListener(this);
        p2.add(cp);

        bp = new JButton("Book Package");
        bp.setBounds(0, 180, 200, 45);
        bp.setBackground(Color.LIGHT_GRAY);
        bp.setForeground(Color.BLACK);
        bp.setFont(new Font("SERIF", Font.BOLD, 14));
        bp.setMargin(new Insets(0, 0, 0, 75));
        bp.addActionListener(this);
        p2.add(bp);

        vp = new JButton("View Package");
        vp.setBounds(0, 225, 200, 45);
        vp.setBackground(Color.LIGHT_GRAY);
        vp.setForeground(Color.BLACK);
        vp.setFont(new Font("SERIF", Font.BOLD, 14));
        vp.setMargin(new Insets(0, 0, 0, 80));
        vp.addActionListener(this);
        p2.add(vp);

        bh = new JButton("Book Hotels");
        bh.setBounds(0, 270, 200, 45);
        bh.setBackground(Color.LIGHT_GRAY);
        bh.setForeground(Color.BLACK);
        bh.setFont(new Font("SERIF", Font.BOLD, 14));
        bh.setMargin(new Insets(0, 0, 0, 90));
        bh.addActionListener(this);
        p2.add(bh);

        vbh = new JButton("View Booked Hotels");
        vbh.setBounds(0, 315, 200, 45);
        vbh.setBackground(Color.LIGHT_GRAY);
        vbh.setForeground(Color.BLACK);
        vbh.setFont(new Font("SERIF", Font.BOLD, 14));
        vbh.setMargin(new Insets(0, 0, 0, 43));
        vbh.addActionListener(this);
        p2.add(vbh);

        td = new JButton("Tour Destination");
        td.setBounds(0, 360, 200, 45);
        td.setBackground(Color.LIGHT_GRAY);
        td.setForeground(Color.BLACK);
        td.setFont(new Font("SERIF", Font.BOLD, 14));
        td.setMargin(new Insets(0, 0, 0, 63));
        td.addActionListener(this);
        p2.add(td);

        po = new JButton("Payment Option");
        po.setBounds(0, 405, 200, 45);
        po.setBackground(Color.LIGHT_GRAY);
        po.setForeground(Color.BLACK);
        po.setFont(new Font("SERIF", Font.BOLD, 14));
        po.setMargin(new Insets(0, 0, 0, 60));
        po.addActionListener(this);
        p2.add(po);

        c = new JButton("Calculator");
        c.setBounds(0, 450, 200, 45);
        c.setBackground(Color.LIGHT_GRAY);
        c.setForeground(Color.BLACK);
        c.setFont(new Font("SERIF", Font.BOLD, 14));
        c.setMargin(new Insets(0, 0, 0, 100));
        c.addActionListener(this);
        p2.add(c);

        n = new JButton("Notepad");
        n.setBounds(0, 495, 200, 45);
        n.setBackground(Color.LIGHT_GRAY);
        n.setForeground(Color.BLACK);
        n.setFont(new Font("SERIF", Font.BOLD, 14));
        n.setMargin(new Insets(0, 0, 0, 105));
        n.addActionListener(this);
        p2.add(n);

        ap = new JButton("About Project");
        ap.setBounds(0, 540, 200, 45);
        ap.setBackground(Color.LIGHT_GRAY);
        ap.setForeground(Color.BLACK);
        ap.setFont(new Font("SERIF", Font.BOLD, 14));
        ap.setMargin(new Insets(0, 0, 0, 80));
        ap.addActionListener(this);
        p2.add(ap);

        lout = new JButton("Logout");
        lout.setBounds(0, 585, 200, 45);
        lout.setBackground(Color.LIGHT_GRAY);
        lout.setForeground(Color.BLACK);
        lout.setFont(new Font("SERIF", Font.BOLD, 14));
        lout.setMargin(new Insets(0, 0, 0, 115));
        lout.addActionListener(this);
        p2.add(lout);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("tanvirfinalproject/icons/Dashboard.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1200, 770, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image1 = new JLabel(i6);
        image1.setBounds(0, 0, 1200, 770);
        add(image1);

        JLabel text = new JLabel("Travel and Tourism Management System");
        text.setBounds(320, 10, 1200, 180);
        text.setForeground(Color.BLACK);
        text.setFont(new Font("SERIF", Font.BOLD, 40));
        image1.add(text);
        setVisible(true);

      
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == addpd) {
                this.setVisible(false);
                new AddCustomer().setVisible(true);
            } else if (ae.getSource() == vd) {
                this.setVisible(false);
                new ViewCustomers().setVisible(true);
            } else if (ae.getSource() == dpd) {
                this.setVisible(false);
                new DeleteCustomer("","","","","","","","","").setVisible(true);
            } else if (ae.getSource() == cp) {
                this.setVisible(false);
                new CheckPackage().setVisible(true);
            } else if (ae.getSource() == bp) {
                this.setVisible(false);
                new BookingToAdd().setVisible(true);
            } else if (ae.getSource() == vp) {
                this.setVisible(false);
                new ViewPackage("", "", "", "", "", "", "").setVisible(true);
            } else if (ae.getSource() == bh) {
                this.setVisible(false);
                new BookHotel().setVisible(true);
            } else if (ae.getSource() == vbh) {
                this.setVisible(false);
                new ViewBookedHotel().setVisible(true);
            } else if (ae.getSource() == td) {
                this.setVisible(false);
                new Destination().setVisible(true);
            } else if (ae.getSource() == po) {
                this.setVisible(false);
                new BkashPayment().setVisible(true);
            } else if (ae.getSource() == c) {
                this.setVisible(false);
                new Calculator().setVisible(true);
            } else if (ae.getSource() == ap) {
                this.setVisible(false);
                new About().setVisible(true);
            } else if (ae.getSource() == n) {
                this.setVisible(false);
                new Notepad().setVisible(true);
            } else if (ae.getSource() == lout) {
                this.setVisible(false);
                new Login().setVisible(true);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Dashboard();
   }

}