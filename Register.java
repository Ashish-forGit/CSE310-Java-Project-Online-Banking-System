//package project;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.event.*;
import java.sql.*;

public class Register extends JFrame {
    Container cont;
    ImageIcon img;
    JLabel back;
    JPanel panel;
    JLabel title;
    JLabel namelabel;
    JTextField fnamefield;
    JTextField lnamefield;
    JLabel email;
    JTextField emailfield;
    JLabel phone;
    JTextField phonef;
    JLabel dob;
    JTextField dobfield;
    JLabel address;
    JTextField addressfield;
    JTextField city;
    static JComboBox state;
    JTextField code;
    static JComboBox country;
    JLabel occupation;
    JTextField occfield;
    JLabel adhar;
    JTextField adharf;
    JLabel pass;
    JTextField passf;
    JLabel pin;
    JTextField pinf;
    JButton submit;

    Register() {

        cont = getContentPane();
        cont.setLayout(null);

        ImageIcon i = new ImageIcon(getClass().getResource("menu.jpg"));
        JLabel header = new JLabel(i);
        header.setBounds(0, 0, 1200, 55);
        add(header);

        JPanel panel1 = new JPanel();
        panel1.setBackground(new Color(0, 100, 250, 100));
        panel1.setLocation(0, 55);
        panel1.setSize(1200, 40);
        panel1.setLayout(null);
        panel1.setBorder(BorderFactory.createEtchedBorder(2, Color.BLACK, Color.BLACK));
        add(panel1);

        JLabel f11 = new JLabel("Home");
        f11.setForeground(Color.WHITE);
        f11.setFont(new Font("Times New Roman", Font.BOLD, 15));
        f11.setBounds(20, 2, 100, 30);
        panel1.add(f11);

        f11.setCursor(new Cursor(Cursor.HAND_CURSOR));
        f11.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                f11.setForeground(Color.RED);
            }
        });

        JLabel f12 = new JLabel("Products & Services");
        f12.setCursor(new Cursor(Cursor.HAND_CURSOR));
        f12.setForeground(Color.WHITE);
        f12.setFont(new Font("Times New Roman", Font.BOLD, 15));
        f12.setBounds(120, 2, 200, 30);
        panel1.add(f12);
        f12.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop()
                            .browse(new URI("https://retail.onlinesbi.sbi/personal/productandservices.html"));
                } catch (IOException | URISyntaxException e1) {
                    e1.printStackTrace();
                }

            }
        });

        JLabel f13 = new JLabel("How Do I");
        f13.setFont(new Font("Times New Roman", Font.BOLD, 15));
        f13.setForeground(Color.WHITE);
        f13.setBounds(330, 2, 100, 30);
        panel1.add(f13);

        JLabel f14 = new JLabel("Manage Debit Card E-Mandate");
        f14.setFont(new Font("Times New Roman", Font.BOLD, 15));
        f14.setForeground(Color.WHITE);
        f14.setBounds(430, 2, 250, 30);
        panel1.add(f14);

        JLabel f15 = new JLabel("Contact Us");
        f15.setFont(new Font("Times New Roman", Font.BOLD, 15));
        f15.setForeground(Color.WHITE);
        f15.setBounds(700, 2, 150, 30);
        panel1.add(f15);

        back = new JLabel();
        back.setBounds(0, 100, 1200, 700);
        back.setBackground(new Color(102, 178, 255, 100));
        back.setOpaque(true);
        add(back);

        panel = new JPanel();
        panel.setBackground(new Color(0, 0, 0, 50));
        panel.setLocation(400, 10);
        panel.setSize(420, 500);
        panel.setLayout(null);
        panel.setBorder(BorderFactory.createEtchedBorder(Color.BLACK, Color.BLACK));
        back.add(panel);

        title = new JLabel();
        title.setText("Registration for new Account");
        title.setForeground(Color.RED);
        title.setFont(new Font("", Font.BOLD, 25));
        title.setFont(new Font("Courier", Font.BOLD, 20));
        title.setBounds(50, 0, 400, 30);
        panel.add(title);

        namelabel = new JLabel();
        namelabel.setText("Enter Name :");
        namelabel.setForeground(Color.RED);
        namelabel.setFont(new Font("", Font.BOLD, 15));
        namelabel.setBounds(10, 50, 100, 30);
        panel.add(namelabel);

        fnamefield = new JTextField("First");
        fnamefield.setBounds(110, 50, 145, 30);
        panel.add(fnamefield);

        lnamefield = new JTextField("Last");
        lnamefield.setBounds(260, 50, 150, 30);
        panel.add(lnamefield);

        email = new JLabel("Email :");
        email.setForeground(Color.RED);
        email.setFont(new Font("", Font.BOLD, 15));
        email.setBounds(10, 90, 100, 30);
        panel.add(email);

        emailfield = new JTextField();
        emailfield.setBounds(110, 90, 200, 30);
        panel.add(emailfield);

        phone = new JLabel("Phone :");
        phone.setForeground(Color.RED);
        phone.setFont(new Font("", Font.BOLD, 15));
        phone.setBounds(10, 130, 100, 30);
        panel.add(phone);

        phonef = new JTextField();
        phonef.setBounds(110, 130, 200, 30);
        panel.add(phonef);

        dob = new JLabel("Date of birth :");
        dob.setForeground(Color.RED);
        dob.setFont(new Font("", Font.BOLD, 15));
        dob.setBounds(10, 170, 100, 30);
        panel.add(dob);

        dobfield = new JTextField();
        dobfield.setBounds(110, 170, 200, 30);
        panel.add(dobfield);

        address = new JLabel("Address :");
        address.setForeground(Color.RED);
        address.setFont(new Font("", Font.BOLD, 15));
        address.setBounds(10, 210, 100, 30);
        panel.add(address);

        addressfield = new JTextField("street");
        addressfield.setBounds(110, 210, 200, 30);
        panel.add(addressfield);

        city = new JTextField("city");
        city.setBounds(110, 250, 145, 30);
        panel.add(city);

        String str[] = { "Select State", "Bihar", "Uttar Pradesh", "Orissa", "Gujarat", "Kerala", "Uttaranchal" };
        JComboBox state = new JComboBox(str);
        state.setBounds(260, 250, 150, 30);
        panel.add(state);

        code = new JTextField("Code");
        code.setBounds(110, 290, 145, 30);
        panel.add(code);

        String ctry[] = { "Select Country", "India", "Nepal", "Russia", "SriLanka", "US", "UK" };
        country = new JComboBox(ctry);
        country.setBounds(260, 290, 150, 30);
        panel.add(country);

        occupation = new JLabel("Occupation :");
        occupation.setForeground(Color.RED);
        occupation.setFont(new Font("", Font.BOLD, 15));
        occupation.setBounds(10, 330, 100, 30);
        panel.add(occupation);

        occfield = new JTextField("");
        occfield.setBounds(110, 330, 200, 30);
        panel.add(occfield);

        adhar = new JLabel("Adhar Card :");
        adhar.setForeground(Color.RED);
        adhar.setFont(new Font("", Font.BOLD, 15));
        adhar.setBounds(10, 365, 100, 30);
        panel.add(adhar);

        adharf = new JTextField("");
        adharf.setBounds(110, 365, 200, 30);
        panel.add(adharf);

        pass = new JLabel("Set Password:");
        pass.setForeground(Color.RED);
        pass.setFont(new Font("", Font.BOLD, 15));
        pass.setBounds(10, 400, 100, 30);
        panel.add(pass);

        passf = new JTextField("");
        passf.setBounds(110, 400, 200, 30);
        panel.add(passf);

        pin = new JLabel("Set Pin :");
        pin.setForeground(Color.RED);
        pin.setFont(new Font("", Font.BOLD, 15));
        pin.setBounds(10, 435, 100, 30);
        panel.add(pin);

        pinf = new JTextField("");
        pinf.setBounds(110, 435, 200, 30);
        panel.add(pinf);

        submit = new JButton("Submit");
        submit.setBounds(160, 470, 100, 30);
        panel.add(submit);
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String fname = fnamefield.getText();
                String lname = lnamefield.getText();
                String email = emailfield.getText();
                long phone = Long.parseLong(phonef.getText());
                String occ = occfield.getText();
                long adhar = Long.parseLong(adharf.getText());
                String pass = passf.getText();
                int pin = Integer.parseInt(pinf.getText());
                System.out.println(fname);
                System.out.println(lname);
                System.out.println(email);
                System.out.println(phone);
                System.out.println(occ);
                System.out.println(adhar);
                System.out.println(pass);
                System.out.println(pin);

                try {
                    Connection con = (Connection) DriverManager
                            .getConnection("jdbc:mysql://localhost:3306/login", "root", "ranjan5044");
                    String query = "INSERT INTO bank(fname,lname,email,phone,Occ,Adhar,pass,pin)"
                            + " values('"
                            + fname + "','" + lname + "','" +
                            email + "','" +
                            phone + "','" + occ + "','" + adhar + "','" + pass + "','" + pin + "')";

                    Statement sta = con.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 1) {
                        JOptionPane.showMessageDialog(panel, "Account is created ");
                    }
                    con.close();
                } catch (Exception exception) {
                    System.out.println(exception);
                }
            }
        });
        setTitle("Register page");
        setVisible(true);
        setLocation(100, 100);
        setSize(1200, 700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setBackground(Color.LIGHT_GRAY);
    }

    public static void main(String[] args) {
        new Register();
    }
}
