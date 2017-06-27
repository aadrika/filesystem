package login;
import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
public class adminDashBoard extends JFrame
{
       JLabel l=new JLabel("welcome To Admin's DashBoard");
    Container c;
    JTable t=new JTable();
    Connection con;
    Statement st;
    int rowcount;
    ResultSet rs;
    boolean tablestatus=false;
    JScrollPane jsp;
    
    adminDashBoard()
    {
        c=getContentPane();
        c.setLayout(null);
        l.setBounds(550, 50, 200, 40);
        c.add(l);
        drawtable();
        

    }
void drawtable()
{
    try
        {
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","mugdha");
            st=con.createStatement();
            rs=st.executeQuery("select count(*) from adashboard where status='pending'");
             if(rs.next())
            {    
                rowcount=rs.getInt(1);            
            }
            JOptionPane.showMessageDialog(this,"No. of pending files ="+rowcount);
            rs=st.executeQuery("select count(*) from adashboard");
            if(rs.next())
            {    
                rowcount=rs.getInt(1);            
            }
            if(rowcount!=0)
            {    
                rs=st.executeQuery("select * from adashboard");
                ResultSetMetaData rsmd= rs.getMetaData();               
                String head[]=new String[rsmd.getColumnCount()];
                int i;
                for(i=0;i<rsmd.getColumnCount();i++)
                {
                    head[i]=rsmd.getColumnName(i+1);
                }
                String data[][]= new String[rowcount][rsmd.getColumnCount()];
                int j=0;
                while(rs.next())
                {
                    for(i=0;i<rsmd.getColumnCount();i++)
                    {
                        data[j][i]=rs.getString(i+1);
                    }
                        j++;
                }
                if(tablestatus)
                {
                    c.remove(jsp);
                }
                t=new JTable(data,head);
                jsp=new JScrollPane(t, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                jsp.setBounds(430, 100, 500, 140);
                c.add(jsp);
                tablestatus=true;
             }
            else
            {
                if(tablestatus)
                {
                    c.remove(jsp);
                    tablestatus=false;
                }
            }
            c.repaint();
            c.validate();
        }
        catch(Exception e)
        {
            System.out.println(e+"");
        }
    }
  public static void main(String[] args)
  {
      adminDashBoard adb=new adminDashBoard();
      adb.setVisible(true);
      adb.setSize(2000,1000);
  }
}
