/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;

public class Login extends JFrame{
    
    private JLabel lblLogin, lblUser, lblPass, lblNoAcc;
    private JButton btnSignIn, btnCreate;
    private JTextArea txaUser, txaPass;

    Login() {
        setTitle("Login Page");
        setSize(300, 350);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lblLogin = new JLabel("Login", SwingConstants.CENTER);
        lblLogin.setBounds(0, 0, 100, 100);
        lblLogin.setFont(new Font("Arial", Font.BOLD, 15));
        add(lblLogin);
       
        lblUser = new JLabel("Username: ");
        lblUser.setBounds(40, 70, 100, 100);
        txaUser = new JTextArea();
        txaUser.setBounds(170, 110, 150, 25);
        add(lblUser);
        add(txaUser);
        
        lblPass = new JLabel("Password: ");
        lblPass.setBounds(40, 110, 100, 100);
        txaPass = new JTextArea();
        txaPass.setBounds(170, 150, 150, 25);      
        add(lblPass);
        add(txaPass);
       
               
        
    }
    
    
}

