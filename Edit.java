package form;

import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.*;


public class Edit extends JFrame implements ActionListener{
	JTextArea text = new JTextArea();
	JLabel label = new JLabel();
        JButton save = new JButton("SAVE");
        JButton undo = new JButton("UNDO");
        JButton back = new JButton("RETURN");
 
        Edit(){
             getContentPane().add(new JLabel("      EDIT FILE    "), BorderLayout.NORTH);
      label.setBounds(20, 20, 20, 20);
         text.setBounds(400,70,400,350);
               setLayout(null);
               text.setLineWrap(true);
	JScrollPane scroller = new JScrollPane(text);
	scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);    
   
          save.setBounds(500, 500, 200, 40);
          undo.setBounds(500, 550, 200, 40);
          back.setBounds(500, 600, 200, 40);
          add(label);
          add(text);
          add(save);
          add(undo);
          add(back);
          	save.addActionListener(this);
	undo.addActionListener(this);
	back.addActionListener(this);
        
        }
        
        public static void main(String[] args){
        Edit ed = new Edit();
        ed.setSize(2000,1000);
        ed.setVisible(true);
        ed.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
	}

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   /** public void actionPerformed(ActionEvent e, Object save) throws FileNotFoundException, IOException {
        if(e.getSource() == save)
            FileInputStream in = null;
            FileOutputStream out = null;

      try {
         in = new FileInputStream("input.txt");
         out = new FileOutputStream("output.txt");

         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
    }
}
      if(e.getSource() == undo){
           public boolean canUndo() { return true; }
      }

     if (e.getSource() == back )
    {       back b=new Update1();
            b.setVisible(true);
            b.setSize();
             
}

    }**/
}
