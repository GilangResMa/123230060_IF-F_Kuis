/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123230060_if.f_kuis;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Lab Informatika
 */
public class PurchasePage extends JFrame{
    JLabel daftp, subttl, diskon, total, topen, topulp, tobukt;
    JButton kembali;
    final double Diskon20 = 0.20;
    final double Diskon10 = 0.10;
    double hargaPcs;
    String username;

    PurchasePage() {
        setVisible(true);
        setAlwaysOnTop(true);
        setLocationRelativeTo(null);
        setLayout(null);
        setSize(600, 320);
        setTitle("Halaman Pembelian");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Component
        daftp = new JLabel("Daftar Pembelian: ");
        subttl = new JLabel("Subtotal: ");
        diskon = new JLabel("Diskon: ");
        total = new JLabel("Total Harga: ");
        kembali = new JButton("Kembali");
        topen = new JLabel("Pensil: ");
        topulp = new JLabel("Pulpen: ");
        tobukt = new JLabel("Buku Tulis: ");
        
        
        add(daftp);
        add(subttl);
        add(total);
        add(kembali);
        add(diskon);
        add(topen);
        add(topulp);
        add(tobukt);
        kembali.addActionListener(e -> backtoHomePage());
        
        //bounds
        daftp.setBounds(30, 50, 200, 20);
        topen.setBounds(30, 75, 250,20);
        topulp.setBounds(30, 100, 250,20);
        tobukt.setBounds(30, 125, 250,20);
        subttl.setBounds(30, 150, 200, 20);
        diskon.setBounds(30,175, 200, 20);
        total.setBounds(30, 200, 200, 20);
        kembali.setBounds(30, 250, 150, 20);

    }
    public void backtoHomePage(){
        this.setVisible(false);
        new HomePage(username).setVisible(true);
    }
}
