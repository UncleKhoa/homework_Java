/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author khoan
 */
public class Caculate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int soc;
        int sod;
        JFrame jframe = new JFrame("Tính toán");
        jframe.setSize(500, 300);
        jframe.setLayout(new GridLayout(3,1));
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Panel panel1 = new Panel();
        Panel panel2 = new Panel();
        Panel panel3 = new Panel();
        jframe.add(panel1);
        jframe.add(panel2);
        jframe.add(panel3);
        
        //Label
        TextField so1 = new TextField();
        so1.setColumns(10);
        Label soa = new Label();
        TextField so2 = new TextField();
        so2.setColumns(10);
        Label sob = new Label();
        soa.setText("Số a");
        sob.setText("Số b");
        panel1.add(soa);
        panel1.add(so1);
        panel1.add(sob);
        panel1.add(so2);
        
        //Button
        Button button1 = new Button("+");
        Button button2 = new Button("-");
        Button button3 = new Button("*");
        Button button4 = new Button("/");
        panel2.add(button1);
        panel2.add(button2);
        panel2.add(button3);
        panel2.add(button4);        
       
        
        //Textfeild total
        TextField total = new TextField();
        total.setColumns(20);
        panel3.add(total);
        
        button1.addActionListener(new ActionListener() {
           
        public void actionPerformed(ActionEvent e){
               int soc = Integer.parseInt(so1.getText());
               int sod = Integer.parseInt(so2.getText());
               int s = soc + sod;
               
               
               total.setText(""+s);
           }
        });
        
        button2.addActionListener(new ActionListener() {
           
        public void actionPerformed(ActionEvent e){
               int soc = Integer.parseInt(so1.getText());
               int sod = Integer.parseInt(so2.getText());
               int s = soc - sod;
               
               
               total.setText(""+s);
           }
        });
                
        button3.addActionListener(new ActionListener() {
           
        public void actionPerformed(ActionEvent e){
               int soc = Integer.parseInt(so1.getText());
               int sod = Integer.parseInt(so2.getText());
               int s = soc * sod;
               
               
               total.setText(""+s);
           }
        });
                        
        button4.addActionListener(new ActionListener() {
           
        public void actionPerformed(ActionEvent e){
               int soc = Integer.parseInt(so1.getText());
               int sod = Integer.parseInt(so2.getText());
               float s = (float)soc / sod;
               
               if(sod == 0){
                   JOptionPane.showMessageDialog(jframe,"Không chia 0 được","Lỗi",JOptionPane.ERROR_MESSAGE);
                   total.setText("null");
               }
               
               total.setText(""+s);
           }
        });
        
    
        
        //Show
        jframe.setVisible(true);
        jframe.setLocationRelativeTo(null);
    }
    
}
