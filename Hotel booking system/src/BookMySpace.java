
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class BookMySpace implements ActionListener
{
	JFrame jf;
	JPanel panel;
	JButton startbooking,cancel;
	
	JLabel label,l2;	
	
    public void MainMenu()
	{
		jf = new JFrame();
		panel = new JPanel();
		label = new JLabel("Welcome to Book My Space");
		l2 = new JLabel("Give your details");
		startbooking =new JButton("Book");
		cancel = new JButton("Cancel");
		
		panel.setLayout(null);
		
		
		label.setFont(new Font("Monospaced",Font.PLAIN, 34));
		label.setBounds(300,100,600,50);
		
		l2.setBounds(380,300,200,20);
		l2.setFont(new Font("Algerian",Font.PLAIN,20));
		
		startbooking.setBounds(280,400,200,50);
		cancel.setBounds(580,400,200,50);
		
		
		panel.add(label);
		panel.add(l2);
		panel.add(startbooking);
		panel.add(cancel);
		
		jf.add(panel);
		jf.setTitle("Book My Space");
		jf.setVisible(true);
		jf.setSize(800,800);
		
		startbooking.addActionListener(this);
		cancel.addActionListener(this);
	}
	
	JButton login,cancel2;
	JLabel label1,label2,label3;
	JTextField text1,text2;
	JPanel p1;
	JFrame f2;
	
	
	public void loginPanel()
	{
		login = new JButton("Login");
		login.setFont(new Font("Algerian",Font.PLAIN,15));
		cancel2 = new JButton("Cancel");
		cancel2.setFont(new Font("Algerian",Font.PLAIN,15));
		
		p1 = new JPanel();
		f2 = new JFrame();
		
		label1 = new JLabel("Login Page");
		label1.setFont(new Font("Algerian",Font.PLAIN,30));
		
		label2 = new JLabel("email");
		label2.setFont(new Font("Algerian",Font.PLAIN,30));
		
		label3 = new JLabel("password");
		label3.setFont(new Font("Algerian",Font.PLAIN,30));
		
		text1 = new JTextField();
		text1.setFont(new Font("Algerian",Font.PLAIN,30));
		
		text2 = new JTextField();
		text2.setFont(new Font("Algerian",Font.PLAIN,30));
		
		p1.setLayout(null);
		
		label1.setBounds(350,100,500,50);
		label2.setBounds(50,150,400,30);
		label3.setBounds(50,300,400,30);
		text1.setBounds(350,150,400,60);
		text2.setBounds(350,300,400,60);
		login.setBounds(350,400,100,40);
		cancel2.setBounds(550,400,100,40);
		
		p1.add(label1);
		p1.add(label2);
		p1.add(label3);
		p1.add(text1);
		p1.add(text2);
		p1.add(login);
		p1.add(cancel2);
		
		f2.add(p1);
		f2.setVisible(true);
		f2.setSize(800,800);
		f2.setTitle("Login Page");
		
		
		login.addActionListener(this);
		cancel2.addActionListener(this);
		
	}
	
	
	
	JLabel header,cust_name,cust_id,state,city,address,mobile_no,gender,date_entry,date_exit,time_entry;
	JTextField name,id,State,City,Address,mob,entry,exit,time;
	
	JButton submit,cancelabel3;
	
	public void Booking()
	{
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		submit = new JButton("Submit");
		cancelabel3 = new JButton("Cancel");
		JRadioButton male =new JRadioButton("Male");
		JRadioButton female = new JRadioButton("Female");
		
	
		
		header =new JLabel("Would You like to book?");
		header.setFont(new Font("Algerian",Font.PLAIN,30));
		
		cust_name = new JLabel("Customer name");
		cust_name.setFont(new Font("Algerian",Font.PLAIN,25));
		
		cust_id = new JLabel("Customer ID");
		cust_id.setFont(new Font("Algerian",Font.PLAIN,25));
		
		state = new JLabel("State");
		state.setFont(new Font("Algerian",Font.PLAIN,25));
		
		city = new JLabel("City");
		city.setFont(new Font("Algerian",Font.PLAIN,25));
		
		address = new JLabel("Address");
		address.setFont(new Font("Algerian",Font.PLAIN,25));
		
		mobile_no= new JLabel("Mobile");
		mobile_no.setFont(new Font("Algerian",Font.PLAIN,25));
		
		gender = new JLabel("Gender");
		gender.setFont(new Font("Algerian",Font.PLAIN,25));
		
		date_entry = new JLabel("Date of Entry");
		date_entry.setFont(new Font("Algerian",Font.PLAIN,25));
		
		date_exit = new JLabel("Date of Exit");
		date_exit.setFont(new Font("Algerian",Font.PLAIN,25));
		
		time_entry= new JLabel("Time");
		time_entry.setFont(new Font("Algerian",Font.PLAIN,25));
		
		
		name = new JTextField();
		name.setFont(new Font("Algerian",Font.PLAIN,25));
		
		id = new JTextField();
		id.setFont(new Font("Algerian",Font.PLAIN,25));
		
		State = new JTextField();
		State.setFont(new Font("Algerian",Font.PLAIN,25));
		
		City = new JTextField();
		City.setFont(new Font("Algerian",Font.PLAIN,25));
		
		Address = new JTextField();
		Address.setFont(new Font("Algerian",Font.PLAIN,25));
		
		mob = new JTextField();
		mob.setFont(new Font("Algerian",Font.PLAIN,25));
		
		male.setFont(new Font("Algerian",Font.PLAIN,25));
		female.setFont(new Font("Algerian",Font.PLAIN,25));
		
		entry = new JTextField();
		entry.setFont(new Font("Algerian",Font.PLAIN,25));
		
		exit = new JTextField();
		exit.setFont(new Font("Algerian",Font.PLAIN,25));
		
		time = new JTextField();
		time.setFont(new Font("Algerian",Font.PLAIN,25));
		
		panel.setLayout(new GridBagLayout());
		
		GridBagConstraints c = new GridBagConstraints();
		
		c.ipady = 30;
		c.weightx=1;
		c.weighty=1;
		
		c.gridx=0;						
		c.gridy=0;
		panel.add(header,c);
		
		
		c.gridx=0;
		c.gridy=1;
		panel.add(cust_name,c);
		
		c.gridx=0;
		c.gridy=2;
		panel.add(cust_id,c);
		
		c.gridx=0;
		c.gridy=3;
		panel.add(state,c);
		
		c.gridx=0;
		c.gridy=4;
		panel.add(city,c);
		
		c.gridx=0;
		c.gridy=5;
		panel.add(address,c);
		
		c.gridx=0;
		c.gridy=6;
		panel.add(mobile_no,c);
		
		c.gridx=0;
		c.gridy=7;
		panel.add(gender,c);
		
		
		c.gridx=0;
		c.gridy=8;
		panel.add(date_entry,c);
		
		c.gridx=0;
		c.gridy=9;
		panel.add(date_exit,c);
		
		c.gridx=0;
		c.gridy=10;
		panel.add(time_entry,c);
		
		
		
		
		
		
		
		c.gridx=1;
		c.gridy=1;
		c.fill=c.HORIZONTAL;
		panel.add(name,c);
		
		c.gridx=1;
		c.gridy=2;
		c.fill=c.HORIZONTAL;
		panel.add(id,c);
		
		c.gridx=1;
		c.gridy=3;
		c.fill=c.HORIZONTAL;
		panel.add(State,c);
		
		c.gridx=1;
		c.gridy=4;
		c.fill=c.HORIZONTAL;
		panel.add(City,c);
		
		c.gridx=1;
		c.gridy=5;
		c.fill=c.HORIZONTAL;
		panel.add(Address,c);
		
		c.gridx=1;
		c.gridy=6;
		c.fill=c.HORIZONTAL;
		panel.add(mob,c);
		
		c.gridx=1;
		c.gridy=7;
		panel.add(male,c);
		
		c.gridx=2;
		c.gridy=7;
		panel.add(female,c);
		
		
		c.gridx=1;
		c.gridy=8;
		c.fill=c.HORIZONTAL;
		panel.add(entry,c);
		
		c.gridx=1;
		c.gridy=9;
		c.fill=c.HORIZONTAL;
		panel.add(exit,c);
		
		
		c.gridx=1;
		c.gridy=10;
		c.fill=c.HORIZONTAL;
		panel.add(time,c);
		
		
		c.gridx=1;
		c.gridy=12;
		panel.add(submit,c);
		
		c.gridx=2;
		c.gridy=12;
		panel.add(cancelabel3,c);
	

		
		frame.add(panel);
		frame.setTitle("Book My Space");
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setSize(2000,1000);
		
		submit.addActionListener(this);
		cancelabel3.addActionListener(this);
		
		
	
	
	}
	
		public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()== startbooking)
		{
			BookMySpace bms = new BookMySpace();
			bms.Booking();
		}
		if(ae.getSource()==cancel)
		{
			System.exit(0);
			
		}
		if(ae.getSource()==submit)
		{
			BookMySpace o = new BookMySpace();
			o.showData();
			
		}
		if(ae.getSource()==cancelabel3)
		{
			System.exit(0);
		}
		if(ae.getSource()==login)
		{
			BookMySpace o = new BookMySpace();
			o.MainMenu();
		}
		
		
	}
	
	
	
	public void showData()				
	{
		JFrame f = new JFrame();
		JPanel p = new JPanel();
		JLabel n,i,s,c,a,m,en,ex,t;
		
		
		n = new JLabel(name.getText().toString());
		i = new JLabel();
		s = new JLabel();
		c = new JLabel();
		a = new JLabel(); 
		m = new JLabel();
		en = new JLabel();
		ex = new JLabel();
		t =new JLabel();
		
		p.setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		
		gc.gridx=0;						
		gc.gridy=0;
		p.add(n,gc);
		
		gc.gridx=0;						
		gc.gridy=1;
		p.add(i,gc);
		
		gc.gridx=0;						
		gc.gridy=2;
		p.add(s,gc);
		
		gc.gridx=0;						
		gc.gridy=3;
		p.add(c,gc);
		
		gc.gridx=0;						
		gc.gridy=4;
		p.add(c,gc);
		
		gc.gridx=0;						
		gc.gridy=5;
		p.add(a,gc);
		
		gc.gridx=0;						
		gc.gridy=6;
		p.add(m,gc);
		
		gc.gridx=0;						
		gc.gridy=7;
		p.add(en,gc);
		
		gc.gridx=0;						
		gc.gridy=8;
		p.add(ex,gc);
		
		gc.gridx=0;						
		gc.gridy=9;
		p.add(t,gc);
		
		
		f.add(p);
		f.setVisible(true);
		f.setSize(2000,1000);
		f.setTitle("Booking Info");
		
	}
	

	
	public static void main(String []args)
	{
		BookMySpace o = new BookMySpace();
		o.loginPanel();
	}
	
}
