//client.java

import java.lang.*;
import java.rmi.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;


public class client extends JFrame {
	TextField t1 = new TextField(30);
	TextField t2 = new TextField(30);
	Label rs = new Label("SUM = 0");
	JButton b = new JButton("ADD");
	Panel p = new Panel(new GridLayout(4,1,5,5));
RemoteInterface s;

public client() {
super("Client Side");
setSize(250, 250);
setLocation(300, 300);
getContentPane().add(p, "North");
p.add(t1);
p.add(t2);
p.add(rs);
p.add(b);

try {
	String ipp = JOptionPane.showInputDialog("Please enter the Ip Address pf server");
	String ip = "rmi://" + ipp + "/RMIAPPLICATION";
s= (RemoteInterface) Naming.lookup(ip);
		} catch(Exception Exp)
	{ JOptionPane.showMessageDialog(null, Exp.getMessage());
}


b.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent evt) {
	int a = Integer.parseInt(t1.getText());
	int b = Integer.parseInt(t2.getText());
	try {
		int r = s.add(a,b);
rs.setText("Sum of two no= " + r);
} 	catch(Exception epx)
{}
}
});
}


public static void main(String args[])
{ 	client c = new client();
c.setDefaultCloseOperation(EXIT_ON_CLOSE);
c.setVisible(true);
}
}