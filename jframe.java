import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class myframe
{
	int arr1[] = {1,2,3,4};
	int arr2[] = {5,6,7,8};
	JFrame j;
	JLabel l;
	JRadioButton b1,b2;
	JButton a,b,c,d;
	myframe()
	{
		j = new JFrame("New Frame");
		j.setSize(850,750);
		j.setLayout(null);
		Icon i = new ImageIcon(arr1[0]+".jpg");
		l = new JLabel(i);
		l.setBounds(100,50,700,500);
		b2 = new JRadioButton("Emma",true);
		b2.setBounds(30,10,80,20);
		b1= new JRadioButton("Shirley");
		b1.setBounds(30,30,80,40);
		ButtonGroup group = new ButtonGroup();
        		group.add(b1);
        		group.add(b2);
        		a = new JButton("First");
        		b = new JButton("Next");
        		c = new JButton("Previous");
        		d = new JButton("Last");
        		a.setBounds(100,610,80,20);
        		b.setBounds(300,610,80,20);
        		c.setBounds(500,610,90,20);
        		d.setBounds(700,610,80,20);
       		j.add(l);
		j.add(b1);
		j.add(b2);
		j.add(a);
		j.add(b);
		j.add(c);
		j.add(d);
		j.setVisible(true);
	}
	public static void main(String arg[])
	{
		new myframe();
	}
}