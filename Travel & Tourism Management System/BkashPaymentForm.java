package tanvirfinalproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BkashPaymentForm extends JFrame implements ActionListener {

    JTextField t1, t2, t3;
    JTextField phoneField;
    JButton back, pay;
    JPanel p1;

    public BkashPaymentForm() {
        setLayout(null);
        this.setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setBounds(500, 230, 900, 406);

        setTitle("Bkash Payment form");

        p1 = new JPanel();
        setContentPane(p1);
        p1.setBackground(Color.WHITE);
        p1.setLayout(null);

        JLabel label = new JLabel("Payment Process");
        label.setFont(new Font("SERIF", Font.BOLD, 40));
        label.setBounds(50, 10, 350, 45);
        p1.add(label);

        JLabel bnum = new JLabel("Bkash Num :");
        bnum.setForeground(Color.DARK_GRAY);
        bnum.setFont(new Font("SERIF", Font.BOLD, 20));
        bnum.setBounds(30, 70, 110, 26);
        p1.add(bnum);

        JLabel bpin = new JLabel("Bkash Pin :");
        bpin.setForeground(Color.DARK_GRAY);
        bpin.setFont(new Font("SERIF", Font.BOLD, 20));
        bpin.setBounds(30, 140, 110, 26);
        p1.add(bpin);

        JLabel anount = new JLabel("Amount :");
        anount.setForeground(Color.DARK_GRAY);
        anount.setFont(new Font("SERIF", Font.BOLD, 20));
        anount.setBounds(30, 210, 92, 26);
        p1.add(anount);

        t1 = new JTextField();
        t1.setBounds(200, 70, 148, 25);
        p1.add(t1);
        t1.setColumns(10);

        t2 = new JTextField();
        t2.setColumns(10);
        t2.setBounds(200, 140, 148, 25);
        p1.add(t2);

        t3 = new JTextField();
        t3.setColumns(10);
        t3.setBounds(200, 210, 148, 25);
        p1.add(t3);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("tanvirfinalproject/icons/bpayment.png"));
        Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel i4 = new JLabel(i3);
        i4.setBounds(230, 5, 800, 410);
        p1.add(i4);

        back = new JButton("Back");
        back.setBounds(267, 300, 80, 25);
        back.setBackground(Color.LIGHT_GRAY);
        back.setForeground(Color.BLACK);
        back.setFont(new Font("Tahoma", Font.PLAIN, 14));
        back.addActionListener(this);
        p1.add(back);

        pay = new JButton("Pay");
        pay.setBounds(50, 300, 80, 25);
        pay.setBackground(Color.LIGHT_GRAY);
        pay.setForeground(Color.BLACK);
        pay.setFont(new Font("Tahoma", Font.PLAIN, 14));

        pay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ee) {
                String e1 = t1.getText();
                String e2 = t2.getText();
                String e3 = t3.getText();

                if (ee.getSource() == pay) {
                    if (e1.isEmpty() || e2.isEmpty() || e3.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Something Wrong!!");
                        setVisible(false);
                        new BkashPaymentForm().setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Successfully paid");
                        setVisible(false);
                        new Dashboard().setVisible(true);
                    }
                }
            }
        });
        p1.add(pay);
    }

   @Override
    public void actionPerformed(ActionEvent e) {
        this.setVisible(false);
        new BkashPayment().setVisible(true);
    }
    
    public static void main(String[] args) {
        new BkashPaymentForm().setVisible(true);
    }
}
