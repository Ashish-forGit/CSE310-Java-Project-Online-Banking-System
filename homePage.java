//package project;

import java.awt.*;
import javax.swing.*;


import java.util.regex.Pattern;
import java.awt.Container;
import java.awt.event.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import java.sql.*;

public class homePage extends JFrame {
    ImageIcon img;
    JLabel background;
    JLabel mess;
    JPanel panel;
    JLabel login;
    Container container;
    JLabel username;
    JTextField userfield;
    JLabel Password;
    JTextField passfield;
    JButton submit;
    JButton clear;
    JButton Signup;
    String url = "jdbc:mysql://localhost:3306/login";
    String user = "root";
    String password = "ranjan5044";
    Connection con;
    ResultSet rs, rs1;
    Statement st, st1;

    homePage() {
        container = getContentPane();
        container.setLayout(null);

        ImageIcon i = new ImageIcon(getClass().getResource("menu.jpg"));
        JLabel header = new JLabel(i);
        header.setBounds(0, 0, 1200, 55);
        add(header);

        // navigation home
        JPanel panel1 = new JPanel();
        panel1.setBackground(new Color(0, 100, 250, 100));
        panel1.setLocation(0, 55);
        panel1.setSize(1200, 40);
        panel1.setLayout(null);
        panel1.setBorder(BorderFactory.createEtchedBorder(2, Color.BLACK, Color.BLACK));
        add(panel1);

        JLabel f11 = new JLabel("Home");
        f11.setForeground(Color.WHITE);
        f11.setFont(new Font("", Font.BOLD, 15));
        f11.setBounds(20, 2, 100, 30);
        panel1.add(f11);

        f11.setCursor(new Cursor(Cursor.HAND_CURSOR));
        f11.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://retail.onlinesbi.sbi/personal/"));
                } catch (IOException | URISyntaxException e1) {
                    e1.printStackTrace();
                }
            }
        });
        JLabel f12 = new JLabel("Products & Services");
        f12.setCursor(new Cursor(Cursor.HAND_CURSOR));
        f12.setForeground(Color.WHITE);
        f12.setFont(new Font("", Font.BOLD, 15));
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
        f13.setFont(new Font("", Font.BOLD, 15));
        f13.setForeground(Color.WHITE);
        f13.setBounds(330, 2, 100, 30);
        panel1.add(f13);

        JLabel f14 = new JLabel("Manage Debit Card E-Mandate");
        f14.setFont(new Font("", Font.BOLD, 15));
        f14.setForeground(Color.WHITE);
        f14.setBounds(430, 2, 250, 30);
        panel1.add(f14);

        JLabel f15 = new JLabel("Contact Us");
        f15.setFont(new Font("", Font.BOLD, 15));
        f15.setForeground(Color.WHITE);
        f15.setBounds(700, 2, 150, 30);
        panel1.add(f15);

        // navigation 2
        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(0, 100, 170, 100));
        panel2.setLocation(0, 95);
        panel2.setSize(1200, 40);
        panel2.setLayout(null);
        panel2.setBorder(BorderFactory.createEtchedBorder());
        add(panel2);

        JLabel f2 = new JLabel("Welcome to Personal Internet Banking");
        f2.setFont(new Font("", Font.BOLD, 15));
        f2.setBounds(10, 2, 300, 30);
        panel2.add(f2);

        JLabel f3 = new JLabel(
                "Dear Customer, Mandatory login and profile password change introduced for added security.");
        f3.setForeground(Color.RED);
        f3.setFont(new Font("", Font.BOLD, 15));
        f3.setBounds(400, 2, 800, 30);
        panel2.add(f3);

        // img = new ImageIcon(getClass().getResource("img3.jpg"));
        background = new JLabel();
        background.setBackground(new Color(0, 100, 182, 100));
        background.setBounds(0, 135, 1200, 565);
        add(background);

        JPanel instruction1 = new JPanel();
        instruction1.setBackground(new Color(0, 200, 50, 250));
        instruction1.setLocation(80, 10);
        instruction1.setSize(200, 80);
        instruction1.setLayout(null);
        instruction1.setBorder(BorderFactory.createEtchedBorder(50, Color.BLACK, Color.BLACK));
        background.add(instruction1);

        JLabel i11 = new JLabel("ALWAYS");
        i11.setForeground(Color.WHITE);
        i11.setHorizontalAlignment(0);
        i11.setBounds(0, 0, 150, 30);
        i11.setFont(new Font("Times New Roman", Font.BOLD, 20));
        instruction1.add(i11);

        JLabel i12 = new JLabel("<html>keep your computer <br> free of malware<html>");
        i12.setForeground(Color.WHITE);
        i12.setHorizontalAlignment(0);
        i12.setVerticalAlignment(1);
        i12.setBounds(0, 30, 150, 70);
        i12.setFont(new Font("Times New Roman", Font.BOLD, 15));
        instruction1.add(i12);

        JPanel instruction2 = new JPanel();
        instruction2.setBackground(new Color(0, 200, 50, 250));
        instruction2.setLocation(360, 10);
        instruction2.setSize(200, 80);
        instruction2.setLayout(null);
        instruction2.setBorder(BorderFactory.createEtchedBorder(50, Color.BLACK, Color.BLACK));
        background.add(instruction2);

        JLabel i21 = new JLabel("ALWAYS");
        i21.setForeground(Color.WHITE);
        i21.setHorizontalAlignment(0);
        i21.setBounds(0, 0, 200, 30);
        i21.setFont(new Font("Times New Roman", Font.BOLD, 20));
        instruction2.add(i21);

        JLabel i22 = new JLabel("<html>change your passwords <br> periodically<html>");
        i22.setForeground(Color.WHITE);
        i22.setHorizontalAlignment(0);
        i22.setVerticalAlignment(1);
        i22.setBounds(0, 30, 200, 70);
        i22.setFont(new Font("Times New Roman", Font.BOLD, 15));
        instruction2.add(i22);

        JPanel instruction3 = new JPanel();
        instruction3.setBackground(new Color(200, 0, 0, 150));
        instruction3.setLocation(640, 10);
        instruction3.setSize(200, 80);
        instruction3.setLayout(null);
        instruction3.setBorder(BorderFactory.createEtchedBorder(50, Color.BLACK, Color.BLACK));
        background.add(instruction3);

        JLabel i31 = new JLabel("NEVER");
        i31.setForeground(Color.WHITE);
        i31.setHorizontalAlignment(0);
        i31.setBounds(0, 0, 200, 30);
        i31.setFont(new Font("Times New Roman", Font.BOLD, 20));
        instruction3.add(i31);

        JLabel i32 = new JLabel("<html>respond to any communication <br> seeking your passwords<html>");
        i32.setForeground(Color.WHITE);
        i32.setHorizontalAlignment(0);
        i32.setVerticalAlignment(1);
        i32.setBounds(0, 30, 200, 70);
        i32.setFont(new Font("Times New Roman", Font.BOLD, 15));
        instruction3.add(i32);

        JPanel instruction4 = new JPanel();
        instruction4.setBackground(new Color(200, 0, 0, 150));
        instruction4.setLocation(920, 10);
        instruction4.setSize(200, 80);
        instruction4.setLayout(null);
        instruction4.setBorder(BorderFactory.createEtchedBorder(50, Color.BLACK, Color.BLACK));
        background.add(instruction4);

        JLabel i41 = new JLabel("NEVER");
        i41.setForeground(Color.WHITE);
        i41.setHorizontalAlignment(0);
        i41.setBounds(0, 0, 200, 30);
        i41.setFont(new Font("Times New Roman", Font.BOLD, 20));
        instruction4.add(i41);

        JLabel i42 = new JLabel("<html>reveal your passwords or <br>card details to anyone<html>");
        i42.setForeground(Color.WHITE);
        i42.setHorizontalAlignment(0);
        i42.setVerticalAlignment(1);
        i42.setBounds(0, 30, 200, 70);
        i42.setFont(new Font("Times New Roman", Font.BOLD, 15));
        instruction4.add(i42);

        panel = new JPanel();
        panel.setBackground(new Color(0, 100, 182, 100));
        panel.setLocation(50, 100);
        panel.setSize(400, 400);
        panel.setLayout(null);
        panel.setBorder(BorderFactory.createEtchedBorder(50, Color.BLACK, Color.BLACK));
        background.add(panel);

        login = new JLabel("Login System");
        login.setFont(new Font("Times New Roman", Font.BOLD, 20));
        login.setForeground(Color.BLACK);
        login.setBounds(50, 0, 600, 50);
        panel.add(login);

        username = new JLabel("Email :");
        username.setForeground(Color.BLACK);
        username.setFont(new Font("Times New Roman", Font.BOLD, 20));
        username.setBounds(100, 50, 200, 30);
        panel.add(username);

        userfield = new JTextField();
        userfield.setBounds(100, 80, 200, 30);
        panel.add(userfield);

        Password = new JLabel("Password :");
        Password.setForeground(Color.BLACK);
        Password.setFont(new Font("Times New Roman", Font.BOLD, 20));
        Password.setBounds(100, 110, 200, 30);
        panel.add(Password);

        JPasswordField passfield = new JPasswordField();
        passfield.setBounds(100, 140, 200, 30);
        panel.add(passfield);

        JLabel forgetpassword = new JLabel("Forget Password ?");
        forgetpassword.setForeground(Color.RED.darker());
        forgetpassword.setBounds(200, 170, 300, 15);
        forgetpassword.setFont(new Font("Times New Roman", Font.BOLD, 12));
        panel.add(forgetpassword);
        forgetpassword.setCursor(new Cursor(Cursor.HAND_CURSOR));
        forgetpassword.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                new changePassword();
            }
        });

        JLabel entercapcha = new JLabel("Enter Capcha");
        entercapcha.setBounds(100, 175, 200, 30);
        entercapcha.setFont(new Font("Times New Roman", Font.BOLD, 18));
        panel.add(entercapcha);

        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";
        StringBuilder st = new StringBuilder();
        for (int j = 0; j < 6; j++) {
            int p = (int) (str.length() * Math.random());
            st.append(str.charAt(p));
        }

        JLabel captcha = new JLabel(st.toString());
        captcha.setForeground(Color.RED);
        captcha.setFont(new Font("", Font.BOLD, 20));
        captcha.setBounds(100, 200, 200, 30);
        panel.add(captcha);

        JTextField capchafield = new JTextField();
        capchafield.setBounds(100, 230, 200, 30);
        panel.add(capchafield);

        JCheckBox term = new JCheckBox("I Agree with Terms and Conditions");
        term.setBounds(100, 265, 260, 20);
        term.setFont(new Font("Times New Roman", Font.BOLD, 15));
        panel.add(term);

        submit = new JButton();
        submit.setText("Login");
        submit.setForeground(Color.BLACK);
        submit.setBounds(100, 290, 200, 30);
        panel.add(submit);
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               // new Bankprocess();
                // String email = userfield.getText();
                // String pass = passfield.getText();

                // String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                // "[a-zA-Z0-9_+&*-]+)*@" +
                // "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                // "A-Z]{2,7}$";

                // Pattern pat = Pattern.compile(emailRegex);
                // if (pat.matcher(email).matches()) {
                // } else {
                // JOptionPane.showMessageDialog(login, "Invalid Email Id ! ");
                // System.exit(0);
                // }
                // try {
                // Connection con = (Connection) DriverManager
                // .getConnection("jdbc:mysql://localhost:3306/login", "root", "ranjan5044");
                // String query = "Select pass from bank where email=?";
                // PreparedStatement x = (PreparedStatement) con.prepareStatement(query);
                // x.setString(1, email);
                // ResultSet rs = x.executeQuery();
                // while (rs.next()) {
                // String name = rs.getString("pass");
                // if (pass.compareTo(name) == 0) {
                // String stt = capchafield.getText();
                // if (stt.compareTo(st.toString()) == 0) {
                // if (term.isSelected()) {
                // new Bankprocess();
                // } else {
                // JOptionPane.showMessageDialog(term, "Accept Terma and Condition");
                // }
                // } else {
                // JOptionPane.showMessageDialog(captcha, "Captcha Not matching");
                // }
                // } else {
                // JOptionPane.showMessageDialog(panel, "Username and password do not matched
                // !");
                // }
                // }
                // con.close();
                // } catch (Exception exception) {
                // System.out.println(exception);
                // }
            }
        });

        clear = new JButton();
        clear.setForeground(Color.BLACK);
        clear.setText("Clear");
        clear.setBounds(310, 140, 70, 30);
        panel.add(clear);
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                userfield.setText("");
                passfield.setText("");
            }
        });

        Signup = new JButton();
        Signup.setForeground(Color.BLACK);
        Signup.setText("Create New Account");
        Signup.setBounds(100, 325, 200, 30);
        panel.add(Signup);
        Signup.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Register();
            }
        });
        ImageIcon poster = new ImageIcon(getClass().getResource("poster.jpg"));
        JLabel post = new JLabel(poster);
        post.setBounds(480, 100, 690, 394);
        background.add(post);
    }

    public static void main(String[] args) {

        homePage frame = new homePage();
        frame.setTitle("Login page");
        frame.setBackground(Color.CYAN);
        frame.setVisible(true);
        frame.setLocation(100, 100);
        frame.setSize(1200, 700);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setBackground(Color.LIGHT_GRAY);

    }
}
