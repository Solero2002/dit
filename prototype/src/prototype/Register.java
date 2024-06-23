/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;

public class Register extends JFrame implements ActionListener{
    
    private JLabel lblRegis, lblLname, lblFname, lblEmail, lblUser, lblPass, lblConfirmPass, lblAcc;
    private JButton btnCreate, btnLogin;
    private JTextArea txaLname, txaFname, txaEmail, txaUser, txaPass, txaConfirmPass;
    
    
    Register() {
        setTitle("Registration Form");
        setSize(400, 500);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lblRegis = new JLabel("REGISTRATION FORM", SwingConstants.CENTER);
        lblRegis.setBounds(0, 10, 200, 100);
        lblRegis.setFont(new Font("Arial", Font.BOLD, 15));
        add(lblRegis);
        
        lblLname = new JLabel("Last Name: ");
        lblLname.setBounds(40, 70, 100, 100);
        txaLname = new JTextArea();
        txaLname.setBounds(170, 110, 150, 25);
        add(lblLname);
        add(txaLname);
        
        lblFname = new JLabel("First Name: ");
        lblFname.setBounds(40, 110, 100, 100);
        txaFname = new JTextArea();
        txaFname.setBounds(170, 150, 150, 25);      
        add(lblFname);
        add(txaFname);
        
        lblEmail = new JLabel("Email Address: ");
        lblEmail.setBounds(40, 150, 100, 100);
        txaEmail = new JTextArea();
        txaFname.setBounds(170, 190, 150, 25);
        add(lblEmail);
        add(txaEmail);
        
        lblUser = new JLabel("Username: ");
        lblUser.setBounds(40, 190, 100, 100);
        txaUser = new JTextArea();
        txaFname.setBounds(170, 230, 150, 25);
        add(lblUser);
        add(txaUser);
        
        lblPass = new JLabel("Password: ");
        lblPass.setBounds(40, 230, 100, 100);
        txaPass = new JTextArea();
        txaFname.setBounds(170, 270, 150, 25);
        add(lblPass);
        add(txaPass);
        
        lblConfirmPass = new JLabel("Confirm Password: ");
        lblConfirmPass.setBounds(40, 270, 150, 100);
        txaConfirmPass = new JTextArea();
        txaFname.setBounds(170, 310, 150, 25);
        add(lblConfirmPass);
        add(txaConfirmPass);
        
        btnCreate = new JButton("Create Account");
        btnCreate.setBounds(40, 350, 300, 25);
        add(btnCreate);
        
        lblAcc = new JLabel("Already have account?");
        lblAcc.setBounds(120, 350, 200, 100);
        add(lblAcc);
        
        btnLogin = new JButton("Login");
        btnLogin.setBounds(260, 390, 80, 25);
        add(btnLogin);
        
        btnCreate.addActionListener(this);
        btnLogin.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        
        if(e.getSource() == btnLogin){
            Login li = new Login();
            li.setVisible(true);
                    
           {
                
           }

        }
    }
}
    
