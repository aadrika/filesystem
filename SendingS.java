
package Login;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


public class SendingS extends JFrame implements ActionListener
{
    JPanel p1=new JPanel();
    JLabel l1=new JLabel("Sender: ");
    JLabel l2=new JLabel("Sender's Designation: ");
    JLabel l3=new JLabel("Receiving Senior: ");
    JLabel l4=new JLabel("Senior's Designation: ");
    JLabel l5=new JLabel("File No.: ");
    JLabel l6=new JLabel("File Name: ");
    JLabel l7=new JLabel("Subject: ");
    JLabel l8=new JLabel("Date: ");
    JLabel l9=new JLabel("Attachment: ");
    JButton forward=new JButton("Send");
    JButton back=new JButton("Back");
    JTextField t1=new JTextField();
    JTextField t2=new JTextField();
    JTextField t3=new JTextField();
    JTextField t4=new JTextField();
    JTextField t5=new JTextField();
    JTextField t6=new JTextField();
    JTextField t7=new JTextField();
    JTextField t8=new JTextField();
    JButton t9=new JButton("Attach");
    JScrollPane jsp;
    Container c;
    public SendingS()
    {
        c=getContentPane();
        c.setLayout(null);
        t1.setBounds(300,60,100,30);
        c.add(t1);
        t2.setBounds(300,100,100,30);
        c.add(t2);
        t3.setBounds(300,140,100,30);
        c.add(t3);
        t4.setBounds(300,180,100,30);
        c.add(t4);
        t5.setBounds(300,220,100,30);
        c.add(t5);
        t6.setBounds(300,260,100,30);
        c.add(t6);
        t7.setBounds(300,300,100,30);
        c.add(t7);
        t8.setBounds(300,340,100,30);
        c.add(t8);
        jsp=new JScrollPane(t9,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jsp.setBounds(300,380,100,40);
        c.add(jsp);
        l1.setBounds(50, 60,200,30);
        c.add(l1);                
        l2.setBounds(50, 100,200,30);
        c.add(l2);
        l3.setBounds(50, 140,200,30);
        c.add(l3);
        l4.setBounds(50, 180,200,30);
        c.add(l4);
        l5.setBounds(50, 220,200,30);
        c.add(l5);
        l6.setBounds(50, 260,200,30);
        c.add(l6);
        l7.setBounds(50, 300,200,30);
        c.add(l7);
        l8.setBounds(50, 340,200,30);
        c.add(l8);
        l9.setBounds(50, 380,200,30);
        c.add(l9);
        forward.setBounds(50, 440,100,50);
        forward.addActionListener(this);
        c.add(forward);
        back.setBounds(190, 440,100,50);
        back.addActionListener(this);
        c.add(back);
        t9.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==forward)
        {
            
        }
        
        if(ae.getSource()==back)
        {
            Receiver r=new Receiver();
            r.setSize(2000,1000);
            r.setVisible(true);
            r.setResizable(true);
        }
         else if(ae.getSource() == t9)
               { 
                  Attach at = new Attach();
                  at.setVisible(true);
                  at.setSize(2000,1000);
               }
    }
   public static void main(String arg[])
    {
        SendingS s=new SendingS();
        s.setVisible(true);
        s.setResizable(true);
        s.setSize(2000, 1000);
                
    }
    
}