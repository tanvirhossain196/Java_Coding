package tanvirfinalproject;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ForgotPassword extends JFrame implements ActionListener {

    JLabel l1, l2, l3;
    JTextField te,te1;
    JButton b,bb1;

    ForgotPassword() {

        setTitle("Forget Password");

        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("tanvirfinalproject/icons/Forgat.jpg"));
        Image i3 = i1.getImage().getScaledInstance(450, 380, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel la1 = new JLabel(i2);
        la1.setBounds(400, 70, 380, 320);
        add(la1);

        l1 = new JLabel("Put your user name and Password");
        l1.setFont(new Font("SERIF", Font.BOLD, 35));
        l1.setBounds(120, 10, 600, 55);
        add(l1);
        
        l2 = new JLabel("Put UserName :");
        l2.setFont(new Font("SERIF", Font.BOLD, 21));
        l2.setBounds(30,130, 350, 50);
        add(l2);
        l3 = new JLabel("Put New Password :");
        l3.setFont(new Font("SERIF", Font.BOLD, 21));
        l3.setBounds(30,210, 350, 50);
        add(l3);
            
        te = new JTextField();
        te.setFont(new Font("Raleway", Font.BOLD, 14));
        te.setBounds(230,141, 150, 30);
        add(te);
        
        te1 = new JTextField();
        te1.setFont(new Font("Raleway", Font.BOLD, 14));
        te1.setBounds(230,220, 150, 30);
        add(te1);
                     
        b = new JButton("BACK");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setFont(new Font("Arial", Font.BOLD, 14));
        b.setBounds(150, 350, 75, 25);
        add(b);
        
        bb1 = new JButton("Reset Password");
        bb1.setBackground(Color.BLACK);
        bb1.setForeground(Color.WHITE);
        bb1.setFont(new Font("Arial", Font.BOLD, 20));
        bb1.setBounds(90, 300, 218, 25);
        add(bb1);     
        b.addActionListener(this);
        bb1.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);

        setSize(800, 480);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == bb1) {
                File f = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\Login.txt");
                File tmp = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\tmp.txt");
                Scanner input = new Scanner(f);

                String userID = te.getText();
                String pass = te1.getText();
                int count = 0;
                while (input.hasNext()) {
                    String user = input.next();
                    String pin = input.next();
                    if (userID.equals(user) && !pass.equals(pin)) {
                        BufferedWriter wr1 = new BufferedWriter(new FileWriter(tmp, true));
                        wr1.write(user + "\n"+pass+"\n");
                        wr1.close();
                        count++;
                    }
                }
                input.close();
                f.delete();
                tmp.renameTo(f);
                if (count == 0) {
                    JOptionPane.showMessageDialog(null, "Something Wrong\nTry Again");
                } else {
                    JOptionPane.showMessageDialog(null, "Reset Successfully");
                    setVisible(false);
                   new Login().setVisible(true);
                }
            } else if (ae.getSource() == b) {
                setVisible(false);
                new Login().setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
       public static void main(String[] args) {
       new ForgotPassword().setVisible(true);
  }
}

