
package Login;

import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Edit extends JFrame implements ActionListener{
	JTextArea text = new JTextArea();
	JLabel label = new JLabel("edit your file");
        JButton save = new JButton("SAVE");
        JButton back = new JButton("RETURN");
 
        Edit(){
             getContentPane().add(new JLabel("      EDIT FILE    "), BorderLayout.NORTH);
      label.setBounds(550, 50, 300, 40);
         text.setBounds(400,70,400,350);
               setLayout(null);
               text.setLineWrap(true);
	JScrollPane scroller = new JScrollPane(text);
	scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);    
   
          save.setBounds(500, 500, 200, 40);
          back.setBounds(500, 600, 200, 40);
          add(label);
          add(text);
          add(save);
          add(back);
          	save.addActionListener(this);
	back.addActionListener(this);
        
        }
        
        public static void main(String[] args){
        Edit ed = new Edit();
        ed.setSize(2000,1000);
        ed.setVisible(true);
        ed.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
	}

    public void actionPerformed(ActionEvent e )
    {
        if(e.getSource() == save)
    try{
    File myFile = new File("foo.txt");
    FileReader fileReader = new FileReader(myFile);
    BufferedReader reader = new BufferedReader(fileReader);
    
    String line = null;
    while ((line = reader.readLine()) != null){
        System.out.println(line);
    }
       reader.close();
        }catch(Exception ex){
        ex.printStackTrace();
        } 
            try{
         FileWriter writer = new FileWriter("foo.txt");
         writer.write("hello foo!");
         writer.close();
     } 
     catch(IOException ex) {
     ex.printStackTrace();
     }

     if (e.getSource() == back )
    {     
        Update1 up=new Update1();
        up.setSize(2000,1000);
        up.setVisible(true);
    }

    }
}

