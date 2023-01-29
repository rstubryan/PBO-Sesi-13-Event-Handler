/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S13;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Restu
 */
public class Kalkulator extends JFrame{
    JLabel l1, l2;
    JTextField t1,t2;
    JButton tambah,kurang,kali,bagi,modulus;
    Kalkulator(){
        super("Simple Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        
        t1 = new JTextField(60);
        t2 = new JTextField(60);
        tambah = new JButton("+");
        kurang = new JButton("-");
        kali = new JButton("*");
        bagi = new JButton("/");
        modulus = new JButton("Modulus");
        
        t1.setBounds(50,60,120,30);
        t2.setBounds(180,60,120,30);
        
        tambah.setBounds(50,100,250,30);
        kurang.setBounds(50,140,250,30);
        kali.setBounds(50,180,250,30);
        bagi.setBounds(50,220,250,30);
        modulus.setBounds(50,260,250,30);
        
        l1 = new JLabel("=");
        l2 = new JLabel("");
        l1.setBounds(320,60,100,30);
        l2.setBounds(350,60,200,30);
        add(l1);
        add(l2);
        
        tambah.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                int no1 = Integer.parseInt(t1.getText());
                int no2 = Integer.parseInt(t2.getText());
                l2.setText(""+ (no1 + no2));
            }
    });
       
        kurang.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                int no1 = Integer.parseInt(t1.getText());
                int no2 = Integer.parseInt(t2.getText());
                l2.setText(""+ (no1 - no2));
            }
    });
        
        kali.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                int no1 = Integer.parseInt(t1.getText());
                int no2 = Integer.parseInt(t2.getText());
                l2.setText(""+ (no1 * no2));
            }
    });
        
        bagi.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                int no1 = Integer.parseInt(t1.getText());
                int no2 = Integer.parseInt(t2.getText());
                l2.setText(""+ (no1 / no2));
            }
    });
        
        modulus.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                int no1 = Integer.parseInt(t1.getText());
                int no2 = Integer.parseInt(t2.getText());
                l2.setText(""+ (no1 % no2));
            }
    });
        
        add(t1);
        add(t2);
        add(tambah);
        add(kurang);
        add(kali);
        add(bagi);
        add(modulus);
    }
}

class SimpleCalculator {
    public static void main(String[] args) {
        Kalkulator c = new Kalkulator();
        c.setBounds(400,200,500,380);
        c.setVisible(true);
    }
}
