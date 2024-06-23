/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import java.awt.EventQueue;

import java.awt.EventQueue;
public class Prototype {

    public static void main(String[] args) {
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                Register r = new Register();
                r.setVisible(true);
                    
                }
            });
            
    }
    
}