
package form;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

public class Update1 implements ActionListener {
    
    public static void main(String[] args){
        Update1 gui = new Update1();
        gui.go();
    }
    public void go(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
       /**
        * JPanel panel = new JPanel();
   
        panel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.weightx = 3;
        c.weighty = 2;
        c.insets = new Insets(7, 2, 7, 2);
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.fill = GridBagConstraints.BOTH;
         **/
        
        JButton button1 = new JButton("EDIT");
        JButton button2 = new JButton("ATTACH");
        JButton button3 = new JButton("SEND TO");
        JButton button4 = new JButton("RETURN");
        /**
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4); 
        **/
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        
        button1.setSize(50, 50);
        button2.setSize(50, 50);
        button3.setSize(50, 50);
        button4.setSize(50, 50);
        
        frame.getContentPane().add(BorderLayout.CENTER);
        frame.setSize(600, 650);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
