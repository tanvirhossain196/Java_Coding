package tanvirfinalproject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CheckPackage extends JFrame implements ActionListener {

    JButton b1, b2, b3;

    CheckPackage() {
        
        this.setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(350, 100, 1200, 725);
        
        setTitle("Travel & Tourism Management System");
        //setBounds(550, 220, 900, 600);
        setVisible(true);
        
        String[] package1 = new String[]{"package1.jpg", "GOLD PACKAGE", "6 days and 7 Nights", "Airport Assistance at Aiport", "Half Day City Tour", "Welcome drinks on Arrival", "Daily Buffet", "Full Day 3 Island Cruise", "English Speaking Guide", "BOOK NOW", "Summer Special", "Rs 12000 only"};
        String[] package2 = new String[]{"package2.jpg", "SILVER PACKAGE", "4 days and 3 Nights", "Toll Free and Entrance Free Tickets", "Meet and Greet at Aiport", "Welcome drinks on Arrival", "Night Safari", "Full Day 3 Island Cruise", "Cruise with Dinner", "BOOK NOW", "Winter Special", "Rs 25000 only"};
        String[] package3 = new String[]{"package3.jpg", "BRONZE PACKAGE", "6 days and 5 Nights", "Return Airfare", "Clubbing, Any Riding & other Games", "Welcome drinks on Arrival", "Daily Buffet", "Stay in 5 Star Hotel", "BBQ Dinner", "BOOK NOW", "Winter Special", "Rs 32000 only"};

        JTabbedPane tabbedPane = new JTabbedPane();
        JPanel p1 = createPackage(package1);
        tabbedPane.addTab("Package 1", null, p1);

        JPanel p2 = createPackage(package2);
        tabbedPane.addTab("Package 2", null, p2);

        JPanel p3 = createPackage(package3);
        tabbedPane.addTab("Package 3", null, p3);

        add(tabbedPane, BorderLayout.CENTER);

        b1 = new JButton("Back");
        b1.setBounds(25, 620, 80, 25);
        b1.setBackground(Color.LIGHT_GRAY);
        b1.setForeground(Color.BLACK);
        b1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        b1.addActionListener(this);
        p1.add(b1);

        b2 = new JButton("Back");
        b2.setBounds(25, 620, 80, 25);
        b2.setBackground(Color.LIGHT_GRAY);
        b2.setForeground(Color.BLACK);
        b2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        b2.addActionListener(this);
        p2.add(b2);

        b3 = new JButton("Back");
        b3.setBounds(25, 620, 80, 25);
        b3.setBackground(Color.LIGHT_GRAY);
        b3.setForeground(Color.BLACK);
        b3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        b3.addActionListener(this);
        p3.add(b3);
        
        
      
    }

    public JPanel createPackage(String[] pack) {
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("tanvirfinalproject/icons/" + pack[0]));
        Image i3 = i1.getImage().getScaledInstance(650, 530, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l1 = new JLabel(i2);
        l1.setBounds(550, 35, 650, 530);
        p1.add(l1);

        JLabel jl1 = new JLabel(pack[1]);
        jl1.setFont(new Font("SERIF", Font.BOLD, 38));
        jl1.setBounds(50, 15, 400, 53);
        p1.add(jl1);

        JLabel jl2 = new JLabel(pack[2]);
        jl2.setFont(new Font("SERIF", Font.BOLD, 30));
        jl2.setForeground(Color.RED);
        jl2.setBounds(25, 110, 250, 35);
        p1.add(jl2);

        JLabel jl3 = new JLabel(pack[3]);
        jl3.setFont(new Font("SERIF", Font.BOLD, 30));
        jl3.setForeground(Color.BLUE);
        jl3.setBounds(25, 165, 480, 35);
        p1.add(jl3);

        JLabel jl4 = new JLabel(pack[4]);
        jl4.setFont(new Font("SERIF", Font.BOLD, 30));
        jl4.setForeground(Color.RED);
        jl4.setBounds(25, 220, 500, 35);
        p1.add(jl4);

        JLabel jl5 = new JLabel(pack[5]);
        jl5.setFont(new Font("SERIF", Font.BOLD, 30));
        jl5.setForeground(Color.BLUE);
        jl5.setBounds(25, 275, 350, 35);
        p1.add(jl5);

        JLabel jl6 = new JLabel(pack[6]);
        jl6.setFont(new Font("SERIF", Font.BOLD, 30));
        jl6.setForeground(Color.RED);
        jl6.setBounds(25, 330, 200, 35);
        p1.add(jl6);

        JLabel jl7 = new JLabel(pack[7]);
        jl7.setFont(new Font("SERIF", Font.BOLD, 30));
        jl7.setForeground(Color.BLUE);
        jl7.setBounds(25, 385, 350, 35);
        p1.add(jl7);

        JLabel jl8 = new JLabel(pack[8]);
        jl8.setFont(new Font("SERIF", Font.BOLD, 30));
        jl8.setForeground(Color.RED);
        jl8.setBounds(25, 440, 350, 35);
        p1.add(jl8);

        JLabel jl9 = new JLabel(pack[9]);
        jl9.setForeground(Color.BLUE);
       jl9.setFont(new Font("SERIF", Font.BOLD, 30));
        jl9.setBounds(25, 495, 200, 30);
        p1.add(jl9);

        JLabel jl10 = new JLabel(pack[10]);
        jl10.setFont(new Font("SERIF", Font.BOLD, 30));
        jl10.setBounds(25, 550, 400, 40);
        p1.add(jl10);

        JLabel jl11 = new JLabel(pack[11]);
        jl11.setForeground(Color.RED);
        jl11.setFont(new Font("SERIF", Font.BOLD, 40));
        jl11.setBounds(650, 600, 400, 40);
        p1.add(jl11);

        return p1;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        b1.setVisible(false);
        b2.setVisible(false);
        b3.setVisible(false);
        new Dashboard().setVisible(true);
    }
    
   public static void main(String[] args) {
        new CheckPackage().setVisible(true);
    }
}
