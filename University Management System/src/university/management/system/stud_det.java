/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.management.system;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class stud_det extends JFrame implements ActionListener{
 
    JLabel l1,l2,l3;
    JTable t1;
    JButton b1,b2,b3;
    JTextField t2;
    String x[] = {"Name","Surname","Age","Date of Birth","Address","Phone","Email","Class X(%)", "Class XII(%)", "Aadhar No","Roll No","Course","Branch"};
    String y[][] = new String[20][13];
    int i=0, j=0;
    stud_det(){
        super("Student Details");
        setSize(1260,650);
        setLocation(200,200);
        setLayout(null);
        
       
        
        try{
            conn c1  = new conn();
            String s1 = "select * from student";
            ResultSet rs  = c1.s.executeQuery(s1);
            while(rs.next()){
                y[i][j++]=rs.getString("name");
                y[i][j++]=rs.getString("fathers_name");
                y[i][j++]=rs.getString("age");
                y[i][j++]=rs.getString("dob");
                y[i][j++]=rs.getString("address");
                y[i][j++]=rs.getString("phone");
                y[i][j++]=rs.getString("email");
                y[i][j++]=rs.getString("class_x");
                y[i][j++]=rs.getString("class_xii");
                y[i][j++]=rs.getString("aadhar");
                y[i][j++]=rs.getString("rollno");
                y[i][j++]=rs.getString("course");
                y[i][j++]=rs.getString("branch");
                i++;
                j=0;
            }
            t1 = new JTable(y,x);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        JScrollPane sp = new JScrollPane(t1);
        sp.setBounds(20,20,1200,330);
        add(sp);
        
        getContentPane().setBackground(Color.WHITE);
        
       // b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        
        conn c1 = new conn();
    
    
    }
    public static void main(String[] args){
        new stud_det().setVisible(true);
    }
    
}
