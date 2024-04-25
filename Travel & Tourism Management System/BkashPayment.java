package tanvirfinalproject;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class BkashPayment extends JFrame implements ActionListener{
    
    public BkashPayment(){
       
        setLayout(null);
        this.setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setBounds(350, 100, 1200, 725);
        setBounds(600, 220, 800, 590);
        
        JLabel label=new JLabel("Pay using Bkash");
        label.setFont(new Font("SERIF", Font.BOLD, 40));
        label.setBounds(50, 20, 350, 45);
        add(label);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("tanvirfinalproject/icons/Bkashpay.png"));
        Image i2 = i1.getImage().getScaledInstance(800, 410, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel i4 = new JLabel(i3);
        i4.setBounds(0, 150, 800, 410);
        add(i4);
        
        JButton pay = new JButton("Go Payment");
        pay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new BkashPaymentForm().setVisible(true);
            }
        });
        pay.setBounds(420, 30, 120, 30);
        pay.setBackground(Color.BLACK);
        pay.setForeground(Color.WHITE);
        pay.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(pay);
    
        JButton back=new JButton("Back");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Dashboard().setVisible(true);
                        
            }
        });
        back.setBounds(590, 30, 80, 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(back);
        
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.setVisible(false);
        new Dashboard().setVisible(true);
    }
    
    public static void main(String[] args){
        new BkashPayment().setVisible(true);
    }
}