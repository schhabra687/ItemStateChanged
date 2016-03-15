import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class myframe implements ActionListener,ItemListener
{
	int arr1[] = {1,2,3,4,5,6,7,8};
	//int arr2[] = {5,6,7,8};
	int i =0;
	int init = 0;
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
		b2 = new JRadioButton("Emma");
		b2.setBounds(30,10,80,20);
		b1= new JRadioButton("Shirley",true);
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
		a.addActionListener(this);
		b.addActionListener(this);
		c.addActionListener(this);
		d.addActionListener(this);
		b1.addItemListener(this);
		b2.addItemListener(this);
		j.setVisible(true);
	}
	public static void main(String arg[])
	{
		new myframe();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("First"))
		{
		System.out.println("hi i am in the actionPerformed loop first");
		Icon i1 = new ImageIcon(arr1[init]+".jpg");
		i = init;
		//l = new JLabel(i);
		//l.setBounds(100,50,700,500);
		l.setIcon(i1);
		}
		else if(e.getActionCommand().equals("Next"))
		{
		System.out.println("hi i am in the actionPerformed loop next");
		i++;
		if(i==4 && init==0)
		i=0;
		if(i==8 && init==4)
		i=4;	
		Icon i1 = new ImageIcon(arr1[i]+".jpg");
		l.setIcon(i1);
		}
		else if(e.getActionCommand().equals("Previous"))
		{
		System.out.println("hi i am in the actionPerformed loop previous");
		i--;
		if(i==-1 && init==0)
		i=3;
		if(i==3 && init==4)
		i=7;	
		Icon i1 = new ImageIcon(arr1[i]+".jpg");
		l.setIcon(i1);
		}
		else if(e.getActionCommand().equals("Last"))
		{
			if(init==4)
				i=7;
			else
				i=3;
		Icon i1 = new ImageIcon(arr1[i]+".jpg");
		l.setIcon(i1);	
		}	
	}
	public void itemStateChanged(ItemEvent e)
	{
		 if(e.getSource()==b1)
		{
			if(b2.isSelected())
			{
			System.out.println("Emma radio button clicked");
			init = 4;
			i=init;
			Icon i1 = new ImageIcon(arr1[init]+".jpg");
			l.setIcon(i1);
			}
			else
			{
			System.out.println("Shirley radio button"); 
			init = 0;
			i=init;
			Icon i1 = new ImageIcon(arr1[init]+".jpg");
			l.setIcon(i1);	
			}
		}
		else if(e.getSource()==b2)
		{
			if(b2.isSelected())
			{
			System.out.println("Emma radio button"); 
			init = 4;
			i=init;
			Icon i1 = new ImageIcon(arr1[init]+".jpg");
			l.setIcon(i1);	
			}
			else
			{
			System.out.println("Shirley radio button"); 
			init = 0;
			i=init;
			Icon i1 = new ImageIcon(arr1[init]+".jpg");
			l.setIcon(i1);	
			}
		}
	}
}