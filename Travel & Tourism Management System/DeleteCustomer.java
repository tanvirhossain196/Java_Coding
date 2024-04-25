package tanvirfinalproject;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class DeleteCustomer extends JFrame {

    private JPanel p1;
    private static JComboBox<String> c1;
    private JLabel l2, l3, l4, l5, l6, l7, l8, l9;
    private static final String FILE_PATH = "AddCustomers.txt";

    public DeleteCustomer(String username , String id , String number,String name , String gender,String country,String adress,String phone,String email) {

        this.setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(580, 220, 850, 550);
        p1 = new JPanel();
        setContentPane(p1);
        p1.setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("tanvirfinalproject/icons/DeleteCustomer.jpg"));
        Image i3 = i1.getImage().getScaledInstance(450, 435, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l1 = new JLabel(i2);
        l1.setBounds(450, 65, 450, 430);
        add(l1);

        JLabel jl1 = new JLabel("DELETE CUSTOMER DETAILS");
        jl1.setFont(new Font("SERIF", Font.BOLD, 30));
        jl1.setBounds(118, 3, 500, 53);
        p1.add(jl1);

        JLabel jl2 = new JLabel("Username :");
        jl2.setFont(new Font("SERIF", Font.BOLD, 18));
        jl2.setBounds(35, 70, 200, 22);
        p1.add(jl2);

        c1 = new JComboBox<>();
        c1.setBounds(271, 70, 150, 30);
        add(c1);

        JLabel jl3 = new JLabel("ID Type :");
        jl3.setFont(new Font("SERIF", Font.BOLD, 18));
        jl3.setBounds(35, 110, 200, 25);
        p1.add(jl3);

        l2 = new JLabel();
        l2.setBounds(271, 110, 200, 14);
        p1.add(l2);

        JLabel jl4 = new JLabel("Number :");
        jl4.setFont(new Font("SERIF", Font.BOLD, 18));
        jl4.setBounds(35, 150, 200, 22);
        p1.add(jl4);

        l3 = new JLabel();
        l3.setBounds(271, 150, 200, 14);
        p1.add(l3);

        JLabel jl5 = new JLabel("Name :");
        jl5.setFont(new Font("SERIF", Font.BOLD, 18));
        jl5.setBounds(35, 190, 200, 22);
        p1.add(jl5);

        l4 = new JLabel();
        l4.setBounds(271, 190, 200, 14);
        p1.add(l4);

        JLabel jl6 = new JLabel("Gender :");
        jl6.setFont(new Font("SERIF", Font.BOLD, 18));
        jl6.setBounds(35, 230, 200, 22);
        p1.add(jl6);

        l5 = new JLabel();
        l5.setBounds(271, 230, 200, 14);
        p1.add(l5);

        JLabel jl7 = new JLabel("Country :");
        jl7.setFont(new Font("SERIF", Font.BOLD, 18));
        jl7.setBounds(35, 270, 200, 22);
        p1.add(jl7);

        l6 = new JLabel();
        l6.setBounds(271, 270, 200, 14);
        p1.add(l6);

        JLabel jl8 = new JLabel("Permanent Address :");
        jl8.setFont(new Font("SERIF", Font.BOLD, 18));
        jl8.setBounds(35, 310, 200, 22);
        p1.add(jl8);

        l7 = new JLabel();
        l7.setBounds(271, 310, 200, 14);
        p1.add(l7);

        JLabel jl9 = new JLabel("Phone :");
        jl9.setFont(new Font("SERIF", Font.BOLD, 18));
        jl9.setBounds(35, 350, 200, 22);
        p1.add(jl9);

        l8 = new JLabel();
        l8.setBounds(271, 350, 200, 14);
        p1.add(l8);

        JLabel jl10 = new JLabel("Email :");
        jl10.setFont(new Font("SERIF", Font.BOLD, 18));
        jl10.setBounds(35, 390, 200, 22);
        p1.add(jl10);

        l9 = new JLabel();
        l9.setBounds(271, 390, 200, 14);
        p1.add(l9);

        JButton b1 = new JButton("Check");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedUsername = (String) c1.getSelectedItem();
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH));
                    String line;
                    while ((line = reader.readLine()) != null) {
                        String[] data = line.split(",");
                        if (data[0].equals(selectedUsername)) {
                            l2.setText(data[1]);
                            l3.setText(data[2]);
                            l4.setText(data[3]);
                            l5.setText(data[4]);
                            l6.setText(data[5]);
                            l7.setText(data[6]);
                            l8.setText(data[7]);
                            l9.setText(data[8]);
                            break;
                        }
                    }
                    reader.close();
                } catch (IOException ee) {
                    ee.printStackTrace();
                }
            }
        });
        b1.setBounds(150, 470, 80, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        p1.add(b1);

        JButton btnNewButton = new JButton("Delete");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedUsername = (String) c1.getSelectedItem();
                try {
                    File inputFile = new File(FILE_PATH);
                    File tempFile = new File("temp.txt");

                    BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                    BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

                    String line;
                    boolean found = false;
                    while ((line = reader.readLine()) != null) {
                        String[] data = line.split(",");
                        if (data[0].equals(selectedUsername)) {
                            found = true;
                        } else {
                            writer.write(line);
                            writer.newLine();
                        }
                    }
                    reader.close();
                    writer.close();

                    if (found) {
                        inputFile.delete();
                        tempFile.renameTo(inputFile);
                        JOptionPane.showMessageDialog(null, "Customer Detail Deleted Successfully");
                    } else {
                        JOptionPane.showMessageDialog(null, "Unable to delete customer details");
                    }

                    setVisible(false);
                    new Dashboard().setVisible(true);
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (NumberFormatException s) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid Number");
                }
            }
        });
        btnNewButton.setBounds(35, 470, 80, 30);
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
        btnExit.setBounds(260, 470, 80, 30);
        btnExit.setBackground(Color.BLACK);
        btnExit.setForeground(Color.WHITE);
        p1.add(btnExit);

        getContentPane().setBackground(Color.WHITE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    DeleteCustomer frame = new DeleteCustomer("","","","","","","","","");
                    frame.setVisible(true);

                    // Load usernames from AddCustomers.txt file
                    File file = new File("AddCustomers.txt");
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    String line;
                    while ((line = reader.readLine()) != null) {
                        String[] data = line.split(",");
                        c1.addItem(data[0]);
                    }
                    reader.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
