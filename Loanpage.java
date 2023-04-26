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

public class Loanpage extends JFrame {
    Loanpage() {
        Container cont = getContentPane();
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

        JPanel panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setLocation(0, 100);
        panel2.setSize(1200, 600);
        panel2.setBackground(new Color(102, 178, 255, 100));
        add(panel2);

        JPanel panel21 = new JPanel();
        panel21.setLayout(null);
        panel21.setLocation(120, 50);
        panel21.setSize(150, 150);
        panel21.setBackground(new Color(0, 100, 182, 100));
        panel2.add(panel21);

        JLabel loan1 = new JLabel("Home Loan");
        loan1.setBounds(0, 10, 150, 30);
        loan1.setHorizontalAlignment(0);
        loan1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        panel21.add(loan1);

        ImageIcon img1 = new ImageIcon(getClass().getResource("ic1.jpg"));
        JLabel icon1 = new JLabel(img1);
        icon1.setBounds(0, 40, 150, 70);
        panel21.add(icon1);

        JLabel apply1 = new JLabel("Apply Now >>");
        apply1.setBounds(0, 120, 150, 30);
        apply1.setHorizontalAlignment(0);
        apply1.setFont(new Font("Times New Roman", Font.BOLD, 15));
        apply1.setBorder(BorderFactory.createEtchedBorder(Color.BLACK, Color.BLACK));
        panel21.add(apply1);

        apply1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop()
                            .browse(new URI("https://homeloans.sbi/"));
                } catch (IOException | URISyntaxException e1) {
                    e1.printStackTrace();
                }

            }
        });

        JPanel panel22 = new JPanel();
        panel22.setLayout(null);
        panel22.setLocation(390, 50);
        panel22.setSize(150, 150);
        panel22.setBackground(new Color(0, 100, 182, 100));
        panel2.add(panel22);

        JLabel loan2 = new JLabel("Home Loan");
        loan2.setBounds(0, 10, 150, 30);
        loan2.setHorizontalAlignment(0);
        loan2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        panel22.add(loan2);

        ImageIcon img2 = new ImageIcon(getClass().getResource("icon2.jpg"));
        JLabel icon2 = new JLabel(img2);
        icon2.setBounds(0, 40, 150, 70);
        panel22.add(icon2);

        JLabel apply2 = new JLabel("Apply Now >>");
        apply2.setBounds(0, 120, 150, 30);
        apply2.setHorizontalAlignment(0);
        apply2.setFont(new Font("Times New Roman", Font.BOLD, 15));
        apply2.setBorder(BorderFactory.createEtchedBorder(Color.BLACK, Color.BLACK));
        panel22.add(apply2);

        JPanel panel23 = new JPanel();
        panel23.setLayout(null);
        panel23.setLocation(660, 50);
        panel23.setSize(150, 150);
        panel23.setBackground(new Color(0, 100, 182, 100));
        panel2.add(panel23);

        JLabel loan3 = new JLabel("Home Loan");
        loan3.setBounds(0, 10, 150, 30);
        loan3.setHorizontalAlignment(0);
        loan3.setFont(new Font("Times New Roman", Font.BOLD, 20));
        panel23.add(loan3);

        ImageIcon img3 = new ImageIcon(getClass().getResource("icon3.jpg"));
        JLabel icon3 = new JLabel(img3);
        icon3.setBounds(0, 40, 150, 70);
        panel23.add(icon3);

        JLabel apply3 = new JLabel("Apply Now >>");
        apply3.setBounds(0, 120, 150, 30);
        apply3.setHorizontalAlignment(0);
        apply3.setFont(new Font("Times New Roman", Font.BOLD, 15));
        apply3.setBorder(BorderFactory.createEtchedBorder(Color.BLACK, Color.BLACK));
        panel23.add(apply3);

        JPanel panel24 = new JPanel();
        panel24.setLayout(null);
        panel24.setLocation(930, 50);
        panel24.setSize(150, 150);
        panel24.setBackground(new Color(0, 100, 182, 100));
        panel2.add(panel24);

        JLabel loan4 = new JLabel("Home Loan");
        loan4.setBounds(0, 10, 150, 30);
        loan4.setHorizontalAlignment(0);
        loan4.setFont(new Font("Times New Roman", Font.BOLD, 20));
        panel24.add(loan4);

        ImageIcon img4 = new ImageIcon(getClass().getResource("icon4.jpg"));
        JLabel icon4 = new JLabel(img4);
        icon4.setBounds(0, 40, 150, 70);
        panel24.add(icon4);

        JLabel apply4 = new JLabel("Apply Now >>");
        apply4.setBounds(0, 120, 150, 30);
        apply4.setHorizontalAlignment(0);
        apply4.setFont(new Font("Times New Roman", Font.BOLD, 15));
        apply4.setBorder(BorderFactory.createEtchedBorder(Color.BLACK, Color.BLACK));
        panel24.add(apply4);

        JPanel panel25 = new JPanel();
        panel25.setLayout(null);
        panel25.setLocation(120, 250);
        panel25.setSize(960, 290);
        panel25.setBackground(Color.WHITE);
        panel2.add(panel25);

        JLabel features = new JLabel("Features");
        features.setFont(new Font("Times New Roman", Font.BOLD, 20));
        features.setHorizontalAlignment(0);
        features.setBounds(0, 0, 240, 30);
        features.setBackground(new Color(150, 0, 0, 30));
        features.setOpaque(true);
        panel25.add(features);

        JLabel featuresd = new JLabel(
                "<html>Low Interest Rates <br>Low Processing Fee <br>No Hidden Charges <br>No Pre Payment Penalty <br>Home Loan Available as Overdraft <br>Interest Concession for Women Borrowers <br>Interest charges on Daily Reducing Balance <br>Repayment up to 30 years<html>");
        featuresd.setFont(new Font("Times New Roman", Font.BOLD, 18));
        featuresd.setHorizontalAlignment(0);
        featuresd.setBounds(0, 35, 960, 220);
        featuresd.setBackground(new Color(150, 0, 0, 30));
        featuresd.setOpaque(true);
        panel25.add(featuresd);

        JLabel Eligibility = new JLabel("Eligibility");
        Eligibility.setFont(new Font("Times New Roman", Font.BOLD, 20));
        Eligibility.setHorizontalAlignment(0);
        Eligibility.setBounds(240, 0, 240, 30);
        Eligibility.setOpaque(false);
        Eligibility.setBackground(new Color(102, 178, 255, 100));
        panel25.add(Eligibility);

        JLabel Eligibilityd = new JLabel(
                "<html>Resident Type: Non Resident Indians (NRIs) or Persons of Indian Origin (PIOs) <br>Minimum Age: 18 year <br>Maximum Age: 60 years <br>Loan Tenure: up to 30 years. <br>Loan Amount: Click Here<html>");
        Eligibilityd.setFont(new Font("Times New Roman", Font.BOLD, 18));
        Eligibilityd.setHorizontalAlignment(0);
        Eligibilityd.setBounds(0, 35, 960, 220);
        Eligibilityd.setBackground(new Color(150, 0, 0, 30));
        Eligibilityd.setOpaque(true);
        Eligibilityd.setVisible(false);
        panel25.add(Eligibilityd);

        JLabel Interest = new JLabel("Interest Rates & Fees");
        Interest.setFont(new Font("Times New Roman", Font.BOLD, 20));
        Interest.setHorizontalAlignment(0);
        Interest.setBounds(480, 0, 240, 30);
        Interest.setOpaque(false);
        panel25.add(Interest);

        JLabel Interestd = new JLabel(
                "<html> Savings Bank interest rates for 10 years <br>Domestic term deposits (Below Rs. 2 crore) interest rates revised w.e.f. 15.02.2023 <br><html>");
        Interestd.setFont(new Font("Times New Roman", Font.BOLD, 18));
        Interestd.setHorizontalAlignment(0);
        Interestd.setBounds(0, 35, 960, 220);
        Interestd.setBackground(new Color(150, 0, 0, 30));
        Interestd.setOpaque(true);
        Interestd.setVisible(false);
        panel25.add(Interestd);

        JLabel Documents = new JLabel("Documents Required");
        Documents.setFont(new Font("Times New Roman", Font.BOLD, 20));
        Documents.setHorizontalAlignment(0);
        Documents.setBounds(720, 0, 240, 30);
        Documents.setOpaque(false);
        panel25.add(Documents);

        JLabel Documentsd = new JLabel(
                "<html>Employer Identity Card <br>Attested copy of valid Passport and visa. <br>Address proof mentioning the current overseas address <br><html>");
        Documentsd.setFont(new Font("Times New Roman", Font.BOLD, 18));
        Documentsd.setHorizontalAlignment(0);
        Documentsd.setBounds(0, 35, 960, 220);
        Documentsd.setBackground(new Color(150, 0, 0, 30));
        Documentsd.setOpaque(true);
        Documentsd.setVisible(false);
        panel25.add(Documentsd);

        features.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                featuresd.setVisible(true);
                Eligibilityd.setVisible(false);
                Interestd.setVisible(false);
                Documentsd.setVisible(false);

                features.setOpaque(true);
                Eligibility.setOpaque(false);
                Interest.setOpaque(false);
                Documents.setOpaque(false);
            }
        });

        Eligibility.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                featuresd.setVisible(false);
                Eligibilityd.setVisible(true);
                Interestd.setVisible(false);
                Documentsd.setVisible(false);

                features.setOpaque(false);
                Eligibility.setOpaque(true);
                Interest.setOpaque(false);
                Documents.setOpaque(false);
            }
        });

        Interest.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                featuresd.setVisible(false);
                Eligibilityd.setVisible(false);
                Interestd.setVisible(true);
                Documentsd.setVisible(false);

                features.setOpaque(false);
                Eligibility.setOpaque(false);
                Interest.setOpaque(true);
                Documents.setOpaque(false);
            }
        });

        Documents.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                featuresd.setVisible(false);
                Eligibilityd.setVisible(false);
                Interestd.setVisible(false);
                Documentsd.setVisible(true);

                features.setOpaque(false);
                Eligibility.setOpaque(false);
                Interest.setOpaque(false);
                Documents.setOpaque(true);
            }
        });
        setTitle("Loanpage");
        setVisible(true);
        setLocation(100, 100);
        setSize(1200, 700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
    }

    public static void main(String[] args) {
        new Loanpage();
    }
}
