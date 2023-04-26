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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

import java.sql.*;

public class Bank2Process extends JFrame {
    String name;

    Bank2Process(int flag, String name, long acc, double balance) {
        this.name = name;
        Container container = getContentPane();
        container.setLayout(null);

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

        JLabel background = new JLabel();
        background.setBounds(0, 100, 1200, 700);
        background.setBackground(new Color(102, 178, 255, 100));
        background.setOpaque(true);
        add(background);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(350, 50, 500, 400);
        panel.setBackground(Color.WHITE);
        panel.setBorder(BorderFactory.createEtchedBorder(50, Color.BLACK, Color.BLACK));
        background.add(panel);

        String t = "";
        if (flag == 1) {
            t = "Withdraw details";
        } else if (flag == 2) {
            t = "Deposit details";
        }
        JLabel title = new JLabel(t);
        title.setForeground(Color.RED);
        title.setFont(new Font("", Font.BOLD, 25));
        title.setBounds(125, 0, 200, 30);
        panel.add(title);

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-mm-yyyy                              hh:mm:ss");
        String date = now.format(df);

        JLabel dt = new JLabel(date);
        dt.setForeground(Color.BLACK);
        dt.setFont(new Font("Times New Roman", Font.BOLD, 15));
        dt.setBounds(100, 30, 350, 20);
        panel.add(dt);

        JLabel printAccl = new JLabel("Account No :");
        printAccl.setForeground(Color.BLACK);
        printAccl.setFont(new Font("Times New Roman", Font.BOLD, 15));
        printAccl.setBounds(50, 80, 100, 20);
        panel.add(printAccl);
        String accountno = "" + acc;

        JLabel printAcc = new JLabel(accountno);
        printAcc.setForeground(Color.BLACK);
        printAcc.setFont(new Font("Times New Roman", Font.BOLD, 15));
        printAcc.setBounds(150, 80, 150, 20);
        panel.add(printAcc);

        JLabel printnamel = new JLabel("Name :");
        printnamel.setForeground(Color.BLACK);
        printnamel.setFont(new Font("Times New Roman", Font.BOLD, 15));
        printnamel.setBounds(50, 120, 100, 20);
        panel.add(printnamel);

        JLabel printname = new JLabel(name);
        printname.setForeground(Color.BLACK);
        printname.setFont(new Font("Times New Roman", Font.BOLD, 15));
        printname.setBounds(150, 120, 100, 20);
        panel.add(printname);

        JLabel printBalancel = new JLabel("Balance :");
        printBalancel.setForeground(Color.BLACK);
        printBalancel.setFont(new Font("Times New Roman", Font.BOLD, 15));
        printBalancel.setBounds(50, 160, 100, 20);
        panel.add(printBalancel);

        String bal = "" + balance;
        JLabel printBalance = new JLabel(bal);
        printBalance.setForeground(Color.BLACK);
        printBalance.setFont(new Font("Times New Roman", Font.BOLD, 15));
        printBalance.setBounds(150, 160, 100, 20);
        panel.add(printBalance);

        setLocation(100, 100);
        setSize(1200, 700);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Bank2Process(ERROR, null, ALLBITS, ABORT);
    }
}
