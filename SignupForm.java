package login;
import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
public class SignupForm extends JFrame implements ActionListener,FocusListener,KeyListener
{
    Container c;
    JLabel la=new JLabel("   (DD/MM/YYYY)");
    JLabel l1=new JLabel("First Name*  : ");
    JLabel l2=new JLabel("Last Name  : ");
    JLabel l3=new JLabel("Gender*  : ");
    JLabel l4=new JLabel("Marital Status*  : ");
    JLabel l5=new JLabel("Date Of Birth*  : ");
    JLabel l6=new JLabel("Address*  : ");
    JLabel l7=new JLabel("Login Name*  : ");
    JLabel l8=new JLabel("Password*  : ");
    JLabel l9=new JLabel("Confirm Password*  : ");
    JLabel l10=new JLabel("Mobile No.*  : ");
    JLabel l11=new JLabel("Category* : ");
    JLabel l12=new JLabel("Department.*  : ");
    String Cat[]={"Select one","admin","emply"};
    String[] Dept={"Select one","CSE","IT","CIVIL"};
    JTextField t1=new JTextField(10);
    JTextField t2=new JTextField(10);
    JRadioButton r1=new JRadioButton("Female");
    JRadioButton r2=new JRadioButton("Male");
    ButtonGroup bg=new ButtonGroup();
    JTextField t4=new JTextField(10);
    JTextField t5=new JTextField(10); 
    JTextField t6=new JTextField(10);
    JTextField t7=new JTextField(10);
    JPasswordField t8=new JPasswordField(10);
    JPasswordField t9=new JPasswordField(10);
    JTextField t10=new JTextField(10);
    JButton submit=new JButton("Submit");
    JButton reset=new JButton("Reset");
    JComboBox c11=new JComboBox(Cat);
    JComboBox c12=new JComboBox(Dept);
    
    static Dimension d;
    SignupForm()
    {
        c=getContentPane();
        c.setLayout(null);
        Font f1=new Font("Baskerville Old Face",Font.BOLD,20);
        la.setFont(f1);
        la.setBounds(550,250,200,30); c.add(la);
        l1.setBounds(100,90,200,30); c.add(l1);
        l2.setBounds(100,130,200,30); c.add(l2);
        l3.setBounds(100,170,200,30); c.add(l3);
        l4.setBounds(100,210,200,30); c.add(l4);
        l5.setBounds(100,250,200,30); c.add(l5);
        l6.setBounds(100,290,200,30); c.add(l6);
        l7.setBounds(100,330,200,30); c.add(l7);
        l8.setBounds(100,370,200,30); c.add(l8);
        l9.setBounds(100,410,250,30); c.add(l9);
        l10.setBounds(100,450,200,30);c.add(l10);
        l11.setBounds(100,490,200,30);c.add(l11);
        l12.setBounds(100,530,200,30);c.add(l12);
        t1.setBounds(350,90,200,30); c.add(t1); t1.addFocusListener(this);t1.addKeyListener(this);
        t2.setBounds(350,130,200,30);c.add(t2); t2.addKeyListener(this);
        r1.setBounds(350, 170, 90, 30);c.add(r1); r1.addKeyListener(this); bg.add(r1); r1.addActionListener(this);
        r2.setBounds(450, 170, 90, 30);c.add(r2); r2.addKeyListener(this); bg.add(r2); r2.addActionListener(this);
        t4.setBounds(350,210,200,30);c.add(t4); t4.addFocusListener(this); t4.addKeyListener(this);
        t5.setBounds(350,250,200,30);c.add(t5); t5.addFocusListener(this); t5.addKeyListener(this);
        t6.setBounds(350,290,200,30);c.add(t6); t6.addFocusListener(this); t6.addKeyListener(this);
        t7.setBounds(350,330,200,30);c.add(t7); t7.addFocusListener(this); t7.addKeyListener(this);
        t8.setBounds(350,370,200,30);c.add(t8); t8.addFocusListener(this); t8.addKeyListener(this);
        t9.setBounds(350,410,200,30);c.add(t9); t9.addFocusListener(this); t9.addKeyListener(this);
        t10.setBounds(350,450,200,30);c.add(t10);t10.addFocusListener(this); t10.addKeyListener(this);
        c11.setBounds(350,490,200,30);c.add(c11);c11.addFocusListener(this); c11.addKeyListener(this);
        c12.setBounds(350,530,200,30);c.add(c12);c12.addFocusListener(this); c12.addKeyListener(this);
        submit.setBounds( 200, 610,100,50);  c.add(submit); submit.addActionListener(this);
        reset.setBounds(350,610,100,50);c.add(reset); reset.addActionListener(this);

    }
    String s;
    int k=0,l=0,m=0,i=0,j;
    Boolean tf8=false,tf10=true;
    public void focusGained(FocusEvent fe)
    {
    }
    public void focusLost(FocusEvent fe)
    {
        //to be applied in the submit button
        if(fe.getSource()==t8)
        { 
          if((t8.getText()).isEmpty()!=true)
          {
           s=t8.getText();
           j=s.length();
          if(j<8)
              {
                i=1;
              }
            j--;
          while(j>=0)
             {
                if(((s.charAt(j)>=33&&s.charAt(j)<=47) || (s.charAt(j)>=58&&s.charAt(j)<=64)))
                 {
                      // CHECKING SPECIAL SYMBOL
                       k=1;
                 }
                if((s.charAt(j)>=48&&s.charAt(j)<=57))
                 {
                      // CHECKING DIGIT
                       l=1;
                 }
                if((s.charAt(j)>=65&&s.charAt(j)<=90))
                 {
                     // CHECKING CAPITAL LETTER
                      m=1;
                 }
               j--;
               }
          /*i==1 means length less than 8
           k==0 means no special symbol
           m==0 means no digit 
           l==0 means no capital letter */
             if((i==1||k==0||m==0||l==0))
              {
                   tf8=true;
                   i=0; k=0; m=0; l=0;
              }
             else
                 tf8=false;
          }
       } 
       
    }
    public void keyPressed(KeyEvent ke)
    {
        
    }
    public void keyReleased(KeyEvent ke)
    {
        
            if(ke.getSource()==t1)
        {
             if(ke.getKeyCode()==KeyEvent.VK_ENTER)
        {
            t2.requestFocus();
        }
        }
            if(ke.getSource()==t2)
        {
             if(ke.getKeyCode()==KeyEvent.VK_ENTER)
        {
            r1.setSelected(true);
            r1.requestFocus();
        }
        }
            if(ke.getSource()==r1)
        {
            if(ke.getKeyCode()==KeyEvent.VK_RIGHT)
            {
                r2.setSelected(true);
                r2.requestFocus();
            }
             if(ke.getKeyCode()==KeyEvent.VK_ENTER)
        {
            t4.requestFocus();
        }
        }
            if(ke.getSource()==r2)
        {
              if(ke.getKeyCode()==KeyEvent.VK_LEFT)
            {
                r1.setSelected(true);
                r1.requestFocus();
            }
             if(ke.getKeyCode()==KeyEvent.VK_ENTER)
        {
            t4.requestFocus();
        }
        }
            if(ke.getSource()==t4)
        {
             if(ke.getKeyCode()==KeyEvent.VK_ENTER)
        {
            t5.requestFocus();
        }
        }
            if(ke.getSource()==t5)
        {
             if(ke.getKeyCode()==KeyEvent.VK_ENTER)
        {
            t6.requestFocus();
        }
        }
            if(ke.getSource()==t6)
        {
             if(ke.getKeyCode()==KeyEvent.VK_ENTER)
        {
            t7.requestFocus();
        }
        }
            if(ke.getSource()==t7)
        {
             if(ke.getKeyCode()==KeyEvent.VK_ENTER)
        {
            t8.requestFocus();
        }
        }
            if(ke.getSource()==t8)
        {
             if(ke.getKeyCode()==KeyEvent.VK_ENTER)
        {
            t9.requestFocus();
        }
        }
            if(ke.getSource()==t9)
        {
             if(ke.getKeyCode()==KeyEvent.VK_ENTER)
        {
            t10.requestFocus();
        }
        }
            if(ke.getSource()==t10)
        {
           if(ke.getKeyCode()==KeyEvent.VK_ENTER)
        {
            c11.requestFocus();
            c11.setSelectedIndex(0);
        }
        }
             if(ke.getSource()==c11)
        {
           if(ke.getKeyCode()==KeyEvent.VK_ENTER)
        {
            c12.requestFocus();
            c12.setSelectedIndex(0);
        }
        }
            if(ke.getSource()==c12)
            {
                if(ke.getKeyCode()==KeyEvent.VK_ENTER)
            {
                submit.doClick();
            }
        }
           
    }
    
    public void keyTyped(KeyEvent ke)
    {
                   
    }
    public void actionPerformed(ActionEvent ae)
    {
        try
        {
           DriverManager.registerDriver(new oracle.jdbc.OracleDriver()); 
           Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","mugdha");
           Statement st=con.createStatement();
           if(ae.getSource()==submit)
           {
               if(t10.getText().toString().isEmpty()==false)
               {
               if(t1.getText().toString().isEmpty()==true||t4.getText().toString().isEmpty()==true||t5.getText().toString().isEmpty()==true||t6.getText().toString().isEmpty()==true||t7.getText().toString().isEmpty()==true||t8.getText().toString().isEmpty()==true||t9.getText().toString().isEmpty()==true||c11.getSelectedItem().toString()=="Select one"||c12.getSelectedItem().toString()=="Select one")
               {
                   JOptionPane.showMessageDialog(this, " Fill all the required fields ");
               }
               else if(tf8==true)
               {
                  t8.setText("");
                  t8.requestFocus();
                  JOptionPane.showMessageDialog(this," Incorrect Password ! Password must be of atleast 8 characters with atleast one special symbol and capital letter  ");
               }
               else if(tf8==false)
               {
                   if(t8.getText().toString().equals(t9.getText().toString())==true)
                   {
                       
                   }
                   else
                   {
                                         t9.setText("");
                                         t9.requestFocus();
                                         JOptionPane.showMessageDialog(this, " password should match confirm password ");
                                         
                   }
               }
               if(tf10==true)
               {
                                       System.out.println("heee 1");

                   s=t10.getText();
                   i=s.length();
                    if(i<10||i>10)
                    {
                        tf10=true;
                       // t10.setText("");
                    }
                    else
                    {  tf10=false;
                     s=t10.getText();
                    i=s.length();
                    i--;
                    int k=0;
                    while(i>=0)
                    {
                        if(s.charAt(i)>=48&&s.charAt(i)<=57)
                        {
                        }
                        else
                        {
                            //t10.setText("");
                            k=1;
                            break;
                        }
                        i--;
                    }
                    if(k==1)
                    {
                        tf10=true;
                    //    JOptionPane.showMessageDialog(this,"mobile no. must be of digits only");
                    }
                    else
                        tf10=false;
                   }
                    System.out.println("heee");
                    if(tf10==true)
                    {
                  t10.setText("");
                  t10.requestFocus();
                  JOptionPane.showMessageDialog(this,"mobile no. must be of 10 in length and shculd contain only digits");
                   }
                    else
                  {
                   if(r1.isSelected()==true)
                {
                 int r=st.executeUpdate("insert into signupdb values('"+t1.getText()+t2.getText()+"','"+t5.getText()+"','Female','"+t4.getText()+"','"+t8.getText()+"','"+t6.getText()+"','"+t7.getText()+"','"+t10.getText()+"','"+c12.getSelectedItem()+"','"+c11.getSelectedItem()+"')");
                 JOptionPane.showMessageDialog(this, " record saved ");
                }
                else if(r2.isSelected()==true)
                {
                int r=st.executeUpdate("insert into signupdb values('"+t1.getText()+t2.getText()+"','"+t5.getText()+"','Male','"+t4.getText()+"','"+t8.getText()+"','"+t6.getText()+"','"+t7.getText()+"','"+t10.getText()+"','"+c12.getSelectedItem()+"','"+c11.getSelectedItem()+"')");
                 JOptionPane.showMessageDialog(this, " record saved ");
                }
              }
               }
            }
               else
               {
                                  JOptionPane.showMessageDialog(this, " fill all the required fields ");  
               }
           }
            if(ae.getSource()==reset)
            {
                t1.setText("");
                t2.setText("");
                t4.setText("");
                t5.setText("");
                t6.setText("");
                t7.setText("");
                t8.setText("");
                t9.setText("");
                t10.setText("");
                c11.setSelectedIndex(0);
                c12.setSelectedIndex(0);
                bg.clearSelection();
                bg.clearSelection();
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this,ex);
        }
    }
   public static void main(String[] args) 
    {
        SignupForm f=new SignupForm();
        f.setSize(2000,1000);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
}
   
}
