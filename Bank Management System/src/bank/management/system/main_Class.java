package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.LayoutManager;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class main_Class extends JFrame implements ActionListener {
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;
    JButton b7;
    String pin;

    main_Class(String pin) {
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, 1);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1550, 830);
        this.add(l3);
        JLabel label = new JLabel("Please Select Your Transaction");
        label.setBounds(430, 180, 700, 35);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("System", 1, 28));
        l3.add(label);
        this.b1 = new JButton("DEPOSIT");
        this.b1.setForeground(Color.WHITE);
        this.b1.setBackground(new Color(65, 125, 128));
        this.b1.setBounds(410, 274, 150, 35);
        this.b1.addActionListener(this);
        l3.add(this.b1);
        this.b2 = new JButton("CASH WITHDRAWL");
        this.b2.setForeground(Color.WHITE);
        this.b2.setBackground(new Color(65, 125, 128));
        this.b2.setBounds(700, 274, 150, 35);
        this.b2.addActionListener(this);
        l3.add(this.b2);
        this.b3 = new JButton("FAST CASH");
        this.b3.setForeground(Color.WHITE);
        this.b3.setBackground(new Color(65, 125, 128));
        this.b3.setBounds(410, 318, 150, 35);
        this.b3.addActionListener(this);
        l3.add(this.b3);
        this.b4 = new JButton("MINI STATEMENT");
        this.b4.setForeground(Color.WHITE);
        this.b4.setBackground(new Color(65, 125, 128));
        this.b4.setBounds(700, 318, 150, 35);
        this.b4.addActionListener(this);
        l3.add(this.b4);
        this.b5 = new JButton("PIN CHANGE");
        this.b5.setForeground(Color.WHITE);
        this.b5.setBackground(new Color(65, 125, 128));
        this.b5.setBounds(410, 362, 150, 35);
        this.b5.addActionListener(this);
        l3.add(this.b5);
        this.b6 = new JButton("BALANCE ENQUIRY");
        this.b6.setForeground(Color.WHITE);
        this.b6.setBackground(new Color(65, 125, 128));
        this.b6.setBounds(700, 362, 150, 35);
        this.b6.addActionListener(this);
        l3.add(this.b6);
        this.b7 = new JButton("EXIT");
        this.b7.setForeground(Color.WHITE);
        this.b7.setBackground(new Color(65, 125, 128));
        this.b7.setBounds(700, 406, 150, 35);
        this.b7.addActionListener(this);
        l3.add(this.b7);
        this.setLayout((LayoutManager)null);
        this.setSize(1550, 1080);
        this.setLocation(0, 0);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1) {
            new Deposit(pin);
            setVisible(false);
        }else if(e.getSource() == b7) {
            System.exit(0);
        } else if (e.getSource()==b2) {
            new Withdrawl(pin);
            setVisible(false);

        } else if (e.getSource()==b6) {
            new BalanceEnquiry(pin);
            setVisible(false);

        } else if (e.getSource()==b3) {
            new FastCash(pin);
            setVisible(false);

        } else if (e.getSource()==b5) {
            new Pin(pin);
            setVisible(false);
        } else if (e.getSource()==b4) {
            new mini(pin);
            setVisible(false);

        }


    }

    public static void main(String[] args) {
        new main_Class("");
    }
}
