/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123230060_if.f_kuis;

import javax.swing.*;

/**
 *
 * @author Lab Informatika
 */
public class HomePage extends JFrame{
    JLabel welcome, pen, pulp, bukt;
    JButton beli, logout;
    JTextField pensilQty, pulpenQty, bukuQty;

    HomePage(String username) {
        setVisible(true);
        setAlwaysOnTop(true);
        setLocationRelativeTo(null);
        setLayout(null);
        setSize(450, 320);
        setTitle("Halaman Utama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Component
        welcome = new JLabel("Selamat Datang, " + username);
        pen = new JLabel("Pensil(Rp2.000):");
        pulp = new JLabel("Pulpen(Rp5.000):");
        bukt = new JLabel("Buku Tulis(Rp10.000):");
        beli = new JButton("Beli");
        logout = new JButton("Logout");
        pensilQty = new JTextField();
        pulpenQty = new JTextField();
        bukuQty = new JTextField();
        
        //add compt
        
        add(welcome);
        add(pen);
        add(pensilQty);
        add(pulp);
        add(pulpenQty);
        add(bukt);
        add(bukuQty);
        add(beli);
        add(logout);
        beli.addActionListener(e -> openPurchasePage());
        logout.addActionListener(e -> openLoginPage());
        
        //bounds
        welcome.setBounds(20, 20, 150, 20);
        pen.setBounds(20, 50, 180, 20);
        pensilQty.setBounds(150, 50, 50, 20);
        pulp.setBounds(20, 80, 180, 20);
        pulpenQty.setBounds(150, 80, 50, 20);
        bukt.setBounds(20, 110, 180, 20);
        bukuQty.setBounds(150, 110, 50, 20);
        beli.setBounds(40, 150, 100, 30);
        logout.setBounds(40, 190, 100, 30);
    }
    private void openPurchasePage(){
        this.setVisible(false);
        new PurchasePage().setVisible(true);
    }
    private void openLoginPage(){
        this.setVisible(false);
        new LoginPage().setVisible(true);
    }
}
