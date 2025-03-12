/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123230060_if.f_kuis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Lab Informatika
 */
public class LoginPage extends JFrame implements ActionListener{
    JLabel userl, passl;
    JTextField userfield;
    JPasswordField passfield;
    JButton login, reset;
    
    LoginPage(){
        setVisible(true);
        setAlwaysOnTop(true);
        setLocationRelativeTo(null);
        setLayout(null);
        setSize(600, 320);
        setTitle("Halaman Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Component
        userl = new JLabel("Username:");
        passl = new JLabel("Password:");
        userfield = new JTextField();
        passfield = new JPasswordField();
        login = new JButton("Login");
        reset = new JButton("Reset");
        
        add(userl);
        add(userfield);
        add(passl);
        add(passfield);
        add(login);
        add(reset);
        login.addActionListener(this);
        reset.addActionListener(this);
        
        //bounds
        userl.setBounds(50, 50, 150, 30);
        passl.setBounds(50, 100, 150, 30);
        userfield.setBounds(200, 50, 200, 30);
        passfield.setBounds(200, 100, 200, 30);
        login.setBounds(200, 150, 150, 30);
        reset.setBounds(200, 190, 150, 30);
        
    }
    //Event Handling
    @Override
    public void actionPerformed(ActionEvent e){
        try {
            if(e.getSource() == login){
                String username = userfield.getText();
                char[] passChar = passfield.getPassword();
                String password = new String(passChar);
                if(username.equals("Gilang") && password.equals("123230060")){
                    System.out.println("Selamat Datang, " + username);
                    new HomePage(username);
                    this.dispose();
                
                if(e.getSource() == reset){
                    userfield = new JTextField("");
                    passfield = new JPasswordField("");
                }
                } else { 
                    JOptionPane.showMessageDialog(this, "Who Are You?");
                }
            } 
        } catch (Exception err){
        }
    }
}