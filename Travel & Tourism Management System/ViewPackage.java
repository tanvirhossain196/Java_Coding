package tanvirfinalproject;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ViewPackage extends JFrame {
    private JPanel p1;
    private JLabel l1, l2, l3, l4, l5, l6, l7;

    public ViewPackage(String username,String Package,String NumberofPerson, String id, String number, String phone,String Price) {
        
        setTitle("Travel & Tourism Management System");
       this.setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 250, 850, 460);
        p1 = new JPanel();
        setContentPane(p1);
        p1.setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("tanvirfinalproject/icons/ViewPackage.jpg"));
        Image i3 = i1.getImage().getScaledInstance(500, 350, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel la1 = new JLabel(i2);
        la1.setBounds(400, 60, 420, 340);
        add(la1);

        JLabel jl1 = new JLabel("VIEW PACKAGE DETAILS");
        jl1.setFont(new Font("SERIF", Font.BOLD, 35));
        jl1.setBounds(88, 2, 500, 53);
        p1.add(jl1);

        JLabel jl2 = new JLabel("Username :");
        jl2.setFont(new Font("SERIF", Font.BOLD, 20));
        jl2.setBounds(35, 70, 200, 28);
        p1.add(jl2);

        l1 = new JLabel();
        l1.setBounds(271, 70, 200, 14);
        p1.add(l1);

        JLabel jl3 = new JLabel("Package :");
        jl3.setFont(new Font("SERIF", Font.BOLD, 20));
        jl3.setBounds(35, 110, 200, 28);
        p1.add(jl3);

        l2 = new JLabel();
        l2.setBounds(271, 110, 200, 14);
        p1.add(l2);

        JLabel jl4 = new JLabel("Number of Persons :");
        jl4.setFont(new Font("SERIF", Font.BOLD, 20));
        jl4.setBounds(35, 150, 200, 28);
        p1.add(jl4);

        l3 = new JLabel();
        l3.setBounds(271, 150, 200, 14);
        p1.add(l3);

        JLabel jl5 = new JLabel("ID :");
        jl5.setFont(new Font("SERIF", Font.BOLD, 20));
        jl5.setBounds(35, 190, 200, 28);
        p1.add(jl5);

        l4 = new JLabel();
        l4.setBounds(271, 190, 200, 14);
        p1.add(l4);

        JLabel jl6 = new JLabel("Number :");
        jl6.setFont(new Font("SERIF", Font.BOLD, 20));
        jl6.setBounds(35, 230, 200, 28);
        p1.add(jl6);

        l5 = new JLabel();
        l5.setBounds(271, 230, 200, 14);
        p1.add(l5);

        JLabel jl7 = new JLabel("Phone :");
        jl7.setFont(new Font("SERIF", Font.BOLD, 20));
        jl7.setBounds(35, 270, 200, 28);
        p1.add(jl7);

        l6 = new JLabel();
        l6.setBounds(271, 270, 200, 14);
        p1.add(l6);

        JLabel jl8 = new JLabel("Price :");
        jl8.setFont(new Font("SERIF", Font.BOLD, 20));
        jl8.setBounds(35, 310, 200, 28);
        p1.add(jl8);

        l7 = new JLabel();
        l7.setBounds(271, 310, 200, 14);
        p1.add(l7);

        JButton btnExit = new JButton("Back");
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Dashboard().setVisible(true);
            }
        });
        btnExit.setBounds(160, 380, 90, 30);
        btnExit.setBackground(Color.BLACK);
        btnExit.setForeground(Color.WHITE);
        p1.add(btnExit);

        getContentPane().setBackground(Color.WHITE);
    }
    
   // public static void main(String[] args) {
       // new ViewPackage("","","","","","","").setVisible(true);
    //}
}
