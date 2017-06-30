package login;

import java.awt.Color;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Update1 extends JFrame implements ActionListener{
   // container c;
        
    JButton edit = new JButton("EDIT");
    JButton attach = new JButton("ATTACH");
    JButton send = new JButton("SEND TO");
    JButton ret = new JButton("RETURN");
    //JPanel jp = new JPanel();
    //JPanel jp1 = new JPanel();

    Update1(){
        setLayout(null);
     //   c.getContentPane();
       // c.setLayout(null);
      //   jp.setBounds(300, 90, 500, 550);
        // jp.setLayout(null);
         //jp.setBackground(Color.black);
         //jp1.setBounds(20,20,460,510);
         //jp1.setBackground(Color.GRAY);
         //jp1.setLayout(null);
          edit.setBounds(180, 29, 200, 50);
          attach.setBounds(180, 99, 200, 50);
          send.setBounds(180, 169, 200, 50);
          ret.setBounds(180, 239, 200, 50);
         // c.add(jp);
          //jp.add(jp1);
          add(edit);
          add(attach);
          add(send);
          add(ret);
          edit.addActionListener(this);
          attach.addActionListener(this);
          send.addActionListener(this);
          ret.addActionListener(this);
    }
   public static void main(String[] args){
        Update1 up=new Update1();
        up.setSize(2000,1000);
        up.setVisible(true);
        up.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
                }

 

          @Override
            public void actionPerformed(ActionEvent e){
                if(e.getsource == edit)
                {
                   Edit ed = new Edit();
                   ed.setVisible(true);
                   ed.setSize(300,300);
                   
                }
               else if(e.getsource == attach)
               { 
                  Attach at = new Attach();
                  at.setVisible(true);
                  at.setSize(300,300);
               }
               else (e.getsource == send)
               {
                  Send s = new Send();
                  s.setVisible(true);
                  s.setSize(300,300);
            }
     
        
    }
