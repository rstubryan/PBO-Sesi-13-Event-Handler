/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S13;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Restu
 */
public class KuisSederhana extends JFrame{
    JLabel l1,lhasil;
    JTextField t1,t2,t3;
    JButton check;

    KuisSederhana () {
        super("Quiz Sederhana");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        l1 = new JLabel("=");
        t1 = new JTextField(60);
        t2 = new JTextField(60);
        t3 = new JTextField(60);
        lhasil = new JLabel("Selamat Menjawab! \n Penjumlahan");
        check = new JButton("Check");
        l1.setBounds(310,60,100,30); 
        t1.setBounds(50,60,120,30);
        t2.setBounds(180,60,120,30);
        t3.setBounds(330,60,100,30);
        check.setBounds(50,100,250,30);
        lhasil.setBounds(50,20,250,30);
        add(l1);
        add(t1);
        add(t2);
        add(t3);
        add(check);
        add(lhasil);
        t1.setEditable(false); t2.setEditable(false);
        
        check.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                int no1 = Integer.parseInt(t1.getText());
                int no2 = Integer.parseInt(t2.getText());
                int no3 = Integer.parseInt(t3.getText());
                int answerkey = no1+no2;
                lhasil.setText("");
                if (no3==answerkey){
                    lhasil = new JLabel("Selamat Jawaban Anda Benar!!!");
                    add(lhasil);
                    lhasil.setBounds(50,150,250,30); 
                    getContentPane().setBackground(Color.green);
                    
                } else {
                    lhasil = new JLabel("Maaf, Jawaban Anda Salah");
                    add(lhasil);
                    lhasil.setBounds(50,150,250,30);
                    getContentPane().setBackground(Color.red);
                }
            }
    }); 
        //panggil untuk tampilkan di GUI
        jtextfield1();jtextfield2();
    }
    //untuk memunculkan angka random 
    public void jtextfield1(){//method untuk menampilkan angka
     
    int angka = (int) (Math.random()*10);
        t1.setText(String.valueOf(angka));
        System.out.print(Math.ceil(angka));//untuk menampilkan angka pada console
        }
    
    public void jtextfield2(){//method untuk menampilkan angka
     
    int angka = (int) (Math.random()*10);
        t2.setText(String.valueOf(angka));
        System.out.print(Math.ceil(angka));//untuk menampilkan angka pada console
        }
    
    public static void main(String[] args) {
        KuisSederhana quiz = new KuisSederhana();
        quiz.setBounds(400,200,500,380);
        quiz.setVisible(true);
    }
}
