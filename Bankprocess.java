package project;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.event.*;
import java.sql.*;

public class Bankprocess extends JFrame {
    Container cont;
    ImageIcon img;
    JLabel back;
    JPanel panel;
    JPanel panel2;
    JLabel title;
    JLabel id;
    JTextField idfield;
    JLabel pin;
    JPasswordField pinfiled;
    JButton submit;
    JLabel printAccl;
    JLabel printnamel;
    JLabel printBalancel;
    JTextField printAc;
    JTextField printname;
    JTextField printBalance;
    JLabel amount;
    JTextField amountf;
    JButton withraw;
    JButton Deposit;
    double intial = 0;
    double famount = 0;
    String name = "";

    Bankprocess() {

        cont = getContentPane();
        cont.setLayout(null);

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
        f11.setFont(new Font("Times New Roman", Font.BOLD, 15));
        f11.setBounds(20, 2, 100, 30);
        panel1.add(f11);

        f11.setCursor(new Cursor(Cursor.HAND_CURSOR));
        f11.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                f11.setForeground(Color.RED);
                new homePage();
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

        img = new ImageIcon(getClass().getResource("poster3.jpg"));
        back = new JLabel(img);
        back.setBounds(0, 100, 1200, 600);
        add(back);

        // navbar panel in background
        JPanel nav = new JPanel();
        nav.setLayout(null);
        nav.setBackground(new Color(0, 100, 182, 100));
        nav.setLocation(0, 0);
        nav.setSize(1200, 40);
        back.add(nav);
        nav.setVisible(false);

        JLabel welcome = new JLabel("Welcome to Personal Internet Banking");
        welcome.setForeground(Color.WHITE.brighter());
        welcome.setBounds(400, 5, 300, 30);
        welcome.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 18));
        nav.add(welcome);

        JLabel loan = new JLabel("Apply Loan");
        loan.setForeground(Color.BLACK.darker());
        loan.setBounds(800, 5, 300, 30);
        loan.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 20));
        nav.add(loan);

        loan.setCursor(new Cursor(Cursor.HAND_CURSOR));
        loan.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                new Loanpage();
            }
        });
        panel = new JPanel();
        panel.setBackground(new Color(0, 100, 182, 100));
        panel.setLocation(800, 100);
        panel.setSize(300, 300);
        panel.setLayout(null);
        panel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.BLACK, Color.BLACK));
        back.add(panel);

        id = new JLabel("Account No : ");
        id.setForeground(Color.RED);
        id.setFont(new Font("Times New Roman", Font.BOLD, 20));
        id.setBounds(50, 50, 150, 30);
        panel.add(id);

        idfield = new JTextField();
        idfield.setBounds(50, 80, 150, 30);
        panel.add(idfield);

        pin = new JLabel("Enter pin : ");
        pin.setForeground(Color.RED);
        pin.setFont(new Font("Times New Roman", Font.BOLD, 20));
        pin.setBounds(50, 115, 150, 30);
        panel.add(pin);

        pinfiled = new JPasswordField();
        pinfiled.setBounds(50, 145, 150, 30);
        panel.add(pinfiled);

        panel2 = new JPanel();
        panel2.setBackground(new Color(0, 100, 182, 100));
        panel2.setLocation(780, 100);
        panel2.setSize(400, 400);
        panel2.setLayout(null);
        panel2.setBorder(BorderFactory.createEtchedBorder(Color.BLACK, Color.BLACK));
        back.add(panel2);
        panel2.setVisible(false);

        printAccl = new JLabel("Account No :");
        printAccl.setForeground(Color.RED);
        printAccl.setFont(new Font("Times New Roman", Font.BOLD, 15));
        printAccl.setBounds(70, 50, 100, 20);
        panel2.add(printAccl);

        printnamel = new JLabel("Name :");
        printnamel.setForeground(Color.RED);
        printnamel.setFont(new Font("Times New Roman", Font.BOLD, 15));
        printnamel.setBounds(230, 50, 100, 20);
        panel2.add(printnamel);

        printBalancel = new JLabel("Balance :");
        printBalancel.setForeground(Color.RED);
        printBalancel.setFont(new Font("Times New Roman", Font.BOLD, 15));
        printBalancel.setBounds(170, 100, 100, 20);
        panel2.add(printBalancel);

        amount = new JLabel("Enter Amount :");
        amount.setForeground(Color.RED);
        amount.setFont(new Font("Times New Roman", Font.BOLD, 15));
        amount.setBounds(140, 200, 200, 20);
        panel2.add(amount);

        submit = new JButton("Submit");
        submit.setBounds(50, 180, 100, 30);
        panel.add(submit);

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                long s1 = Long.parseLong(idfield.getText());
                int s = Integer.parseInt(pinfiled.getText());
                if (idfield.getText().equals("") || pinfiled.getText().equals("")) {
                    JOptionPane.showMessageDialog(panel, "Enter Email or password!");
                }
                try {
                    Connection con = (Connection) DriverManager
                            .getConnection("jdbc:mysql://localhost:3306/login", "root", "ranjan5044");
                    String query = "Select pin from bank where Adhar=?";
                    PreparedStatement x = (PreparedStatement) con.prepareStatement(query);
                    x.setLong(1, s1);
                    ResultSet rs = x.executeQuery();
                    while (rs.next()) {
                        int num = rs.getInt("pin");
                        if (s != num) {
                            JOptionPane.showMessageDialog(panel, "Wrong password!");
                        }
                        if (s == num) {
                            double i = 0;
                            String fname = "";
                            String lname = "";
                            try {
                                Connection con1 = (Connection) DriverManager
                                        .getConnection("jdbc:mysql://localhost:3306/login", "root",
                                                "ranjan5044");
                                String query1 = "Select Amount,fname,lname from bank where Adhar =?";
                                PreparedStatement st = (PreparedStatement) con1.prepareStatement(query1);
                                st.setLong(1, s1);
                                ResultSet result = st.executeQuery();
                                result.next();
                                i = result.getDouble("Amount");
                                fname = result.getString("fname");
                                lname = result.getString("lname");
                                System.out.println(i);
                                con1.close();
                            } catch (Exception exception) {
                                System.out.println(exception);
                            }
                            nav.setVisible(true);
                            panel.setVisible(false);
                            panel2.setVisible(true);

                            printAc = new JTextField(" " + s1 + "");
                            printAc.setBounds(50, 70, 145, 30);
                            panel2.add(printAc);

                            printname = new JTextField(" " + fname + " " + lname);
                            printname.setBounds(200, 70, 150, 30);
                            panel2.add(printname);

                            printBalance = new JTextField(" " + i + "");
                            printBalance.setBounds(130, 120, 150, 30);
                            panel2.add(printBalance);

                            amountf = new JTextField();
                            amountf.setBounds(130, 220, 150, 30);
                            panel2.add(amountf);

                            withraw = new JButton("Withdraw");
                            withraw.setBounds(100, 270, 100, 30);
                            panel2.add(withraw);
                            withraw.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent e) {
                                    int ch = JOptionPane.showConfirmDialog(null, "Are you sure ?");
                                    if (ch == 0) {
                                        double amount = Double.parseDouble(amountf.getText());
                                        double i = 0;
                                        double f = 0;
                                        String fname = "";
                                        String lname = "";
                                        try {
                                            Connection con1 = (Connection) DriverManager
                                                    .getConnection("jdbc:mysql://localhost:3306/login", "root",
                                                            "ranjan5044");
                                            String query1 = "Select Amount,fname,lname from bank where Adhar =?";
                                            PreparedStatement st = (PreparedStatement) con1.prepareStatement(query1);
                                            st.setLong(1, s1);
                                            ResultSet result = st.executeQuery();
                                            result.next();
                                            i = result.getDouble("Amount");
                                            fname = result.getString("fname");
                                            lname = result.getString("lname");

                                            con1.close();
                                        } catch (Exception exception) {
                                            System.out.println(exception);
                                        }
                                        try {
                                            Connection con2 = (Connection) DriverManager
                                                    .getConnection("jdbc:mysql://localhost:3306/login", "root",
                                                            "ranjan5044");
                                            String query2 = "update bank set Amount= ? where Adhar=?";
                                            PreparedStatement st2 = (PreparedStatement) con2.prepareStatement(query2);
                                            f = i - amount;
                                            printBalance.setText(" " + f + "");
                                            System.out.println(f);
                                            st2.setDouble(1, f);
                                            st2.setLong(2, s1);
                                            int x = st2.executeUpdate();
                                            if (x == 1) {
                                                String nname1 = "" + fname + " " + lname;
                                                new Bank2Process(1, nname1, s1, f);
                                            }
                                            con2.close();

                                        } catch (Exception exception) {
                                            System.out.println(exception);
                                        }
                                    }
                                }
                            });

                            Deposit = new JButton("Deposit");
                            Deposit.setBounds(205, 270, 100, 30);
                            panel2.add(Deposit);
                            Deposit.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent e) {
                                    int ch = JOptionPane.showConfirmDialog(null, "Are you sure ?");
                                    if (ch == 0) {
                                        double amount = Double.parseDouble(amountf.getText());
                                        double i = 0;
                                        double f = 0;
                                        String fname = "";
                                        String lname = "";
                                        try {
                                            Connection con1 = (Connection) DriverManager
                                                    .getConnection("jdbc:mysql://localhost:3306/login", "root",
                                                            "ranjan5044");
                                            String query1 = "Select Amount,fname,lname from bank where Adhar =?";
                                            PreparedStatement st = (PreparedStatement) con1.prepareStatement(query1);
                                            st.setLong(1, s1);
                                            ResultSet result = st.executeQuery();
                                            result.next();
                                            i = result.getDouble("Amount");
                                            fname = result.getString("fname");
                                            lname = result.getString("lname");
                                            System.out.println(i);
                                            con1.close();
                                        } catch (Exception exception) {
                                            System.out.println(exception);
                                        }
                                        try {
                                            Connection con2 = (Connection) DriverManager
                                                    .getConnection("jdbc:mysql://localhost:3306/login", "root",
                                                            "ranjan5044");
                                            String query2 = "update bank set Amount= ? where Adhar=?";
                                            PreparedStatement st2 = (PreparedStatement) con2.prepareStatement(query2);
                                            f = i + amount;
                                            printBalance.setText(" " + f + "");
                                            System.out.println(f);
                                            st2.setDouble(1, f);
                                            st2.setLong(2, s1);
                                            int x = st2.executeUpdate();
                                            if (x == 1) {
                                                String nname1 = "" + fname + " " + lname;
                                                new Bank2Process(2, nname1, s1, f);
                                            }
                                            con2.close();
                                            new homePage();

                                        } catch (Exception exception) {
                                            System.out.println(exception);
                                        }
                                    }
                                }
                            });
                        } else {
                            JOptionPane.showMessageDialog(panel, "Wrong Account Number or Pin number");
                        }
                    }
                    con.close();
                } catch (Exception exception) {
                    System.out.println(exception);
                }

            }
        });
        setTitle("BankProcess");
        setVisible(true);
        setLocation(100, 100);
        setSize(1200, 700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setBackground(Color.LIGHT_GRAY);
    }

    public static void main(String[] args) {
        new Bankprocess();
    }
}
