package login;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener
{
    Container c;
    String[] dept={"Select department","CSE", "IT", "CIVIL" };
    String[] cate={"Select Category", "admin","employ"};
    JTextField tname=new JTextField();
    JPasswordField tpass=new JPasswordField();
    JLabel lname=new JLabel("enter Username");
    JLabel lpass=new JLabel("enter Password");
    JLabel ldept=new JLabel("Select Department");
    JLabel lcate=new JLabel("Select Category");
    JLabel heading=new JLabel("LOGIN INTO YOUR ACCOUNT");
    JButton signup=new JButton("Sign Up");
    JButton submit=new JButton("Submit");
    JComboBox<String> category=new JComboBox<String>(cate);
    JComboBox Cdept=new JComboBox(dept);
    JPanel jp=new JPanel();
    JPanel jp1=new JPanel();
    public Login()
    {
        c=getContentPane();
        c.setLayout(null);
        jp.setBounds(400, 90, 500, 550);
        jp.setLayout(null);
        jp.setBackground(Color.black);
        jp1.setBounds(20,20,460,510);
        jp1.setBackground(Color.GRAY);
        jp1.setLayout(null);
        heading.setBounds(600, 10, 200, 50);
        tname.setBounds(180, 29, 200, 30);
        tpass.setBounds(180, 69, 200, 30);
        Cdept.setBounds(180, 109, 200, 30);
        lname.setBounds(20, 20, 100, 70);
        lpass.setBounds(20, 60, 100, 70);
        ldept.setBounds(20, 100, 150, 70);
        submit.setBounds(230, 200,100,50);
        category.setBounds(180, 149,200,30);
        lcate.setBounds(20,140,150,70);
        signup.setBounds(100,200,100,50);
        jp1.add(category);
        c.add(heading);
        c.add(jp);
        jp.add(jp1);
        jp1.add(signup);
        jp1.add(tname);
        jp1.add(tpass);
        jp1.add(Cdept);
        jp1.add(lname);
        jp1.add(lpass);
        jp1.add(ldept);
        jp1.add(submit);
        jp1.add(lcate);
        submit.addActionListener(this);
        signup.addActionListener(this);
    }
    Connection con;
    Statement st;
    ResultSet rs;
    public void actionPerformed(ActionEvent ae)
    {
        try{
            
        DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
        con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Xe","system","mugdha");
        st=con.createStatement();    
        }
        catch(Exception ex)
        {
            System.out.println(ex+"   ");
        }
        if(ae.getSource()==submit)
        {
            try{
            String name=tname.getText();
            String pass=(tpass.getText()).toString();
            String dept=(Cdept.getSelectedItem()).toString();
            String cat=(category.getSelectedItem()).toString();
            rs=st.executeQuery("select * from signupdb where Login_Name='"+name+"' and Password='"+pass+"' and Dept='"+dept+"' and Category='"+cat+"' ");
            if(rs.next())  
            {
               JOptionPane.showMessageDialog(this,"access authenticated");
               if(cat=="admin")
               {
                  adminDashBoard n=new adminDashBoard();
                  n.setVisible(true);
                 n.setSize(2000, 1000);
               }
            }
            else
            {   
                JOptionPane.showMessageDialog(this,"unauthenticated access");
                tname.setText("");       
                tpass.setText("");
                Cdept.setSelectedIndex(0);
            }
            }
            catch(Exception ex)
            {
                System.out.println(ex+"");
            }
        }
        if(ae.getSource()==signup)
        {
            SignupForm sf=new SignupForm();
            sf.setVisible(true);
            sf.setSize(2000,1000);
        }
    }
    public static void main(String[] args)
    {
        Login l1=new Login(); 
        l1.setSize(2000,1000);
        l1.setVisible(true);
        l1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
