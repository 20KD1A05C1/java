package teja;
import java.io.*;
import java.util.List;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;

public class FirstFrame extends JFrame implements ActionListener{
	JFrame frame;
	private String dates[]
			= { "1", "2", "3", "4", "5",
				"6", "7", "8", "9", "10",
				"11", "12", "13", "14", "15",
				"16", "17", "18", "19", "20",
				"21", "22", "23", "24", "25",
				"26", "27", "28", "29", "30",
				"31" };
		private String months[]
			= { "Jan", "feb", "Mar", "Apr",
				"May", "Jun", "July", "Aug",
				"Sup", "Oct", "Nov", "Dec" };
		private String years[]
			= { "1995", "1996", "1997", "1998",
				"1999", "2000", "2001", "2002",
				"2003", "2004", "2005", "2006",
				"2007", "2008", "2009", "2010",
				"2011", "2012", "2013", "2014",
				"2015", "2016", "2017", "2018",
				"2019" };
	

	FirstFrame(){
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		JTabbedPane tab=new JTabbedPane();
		tab.add("register",p1);
		tab.add("login",p2);
		tab.add("search",p3);
		tab.setBounds(200,0,750,750);
		
		JLabel l=new JLabel("REGISTRATION FORM");
		l.setSize(300, 45);
		l.setLocation(307,5);
		l.setFont(new Font("Arial",Font.BOLD,20));
		p1.add(l);
		
		JLabel reg=new JLabel("RegisterNo:");
		reg.setSize(150, 20);
		reg.setLocation(80,100);
		reg.setFont(new Font("Arial",Font.BOLD,20));
		p1.add(reg);
		
		JTextField treg=new JTextField();
		treg.setSize(290, 20);
		treg.setLocation(210,100);
		p1.add(treg);
		
		JLabel name=new JLabel("NAME:");
		name.setSize(100, 20);
		name.setLocation(80,130);
		name.setFont(new Font("Arial",Font.BOLD,20));
		p1.add(name);
		
		JTextField tname=new JTextField();
		tname.setSize(290, 20);
		tname.setLocation(210,130);
		p1.add(tname);
		
		JLabel mobile=new JLabel("MOBILE:");
		mobile.setSize(100, 20);
		mobile.setLocation(80,160);
		mobile.setFont(new Font("Arial",Font.BOLD,20));
		p1.add(mobile);
		
		JTextField tmobile=new JTextField();
		tmobile.setSize(290, 20);
		tmobile.setLocation(210,160);
		p1.add(tmobile);
		
		JLabel email=new JLabel("EMAIL:");
		email.setSize(100, 20);
		email.setLocation(80,190);
		email.setFont(new Font("Arial",Font.BOLD,20));
		p1.add(email);
		
		JTextField temail=new JTextField();
		temail.setSize(290, 20);
		temail.setLocation(210,190);
		p1.add(temail);
		
		JLabel gen=new JLabel("GENDER:");
		gen.setSize(100, 20);
		gen.setLocation(80,230);
		gen.setFont(new Font("Arial",Font.BOLD,20));
		p1.add(gen);
		
		JRadioButton tmale=new JRadioButton("male");
		tmale.setSize(75, 20);
		tmale.setLocation(210,230);
		tmale.setSelected(true);
		tmale.setFont(new Font("Arial",Font.BOLD,20));
		p1.add(tmale);
		
		JRadioButton tfmale=new JRadioButton("female");
		tfmale.setSize(150, 20);
		tfmale.setLocation(300,230);
		tfmale.setSelected(false);
		tfmale.setFont(new Font("Arial",Font.BOLD,20));
		p1.add(tfmale);
		
		ButtonGroup gp=new ButtonGroup();
		gp.add(tmale);
		gp.add(tfmale);
		
		JLabel skl=new JLabel("SKILLS:");
		skl.setSize(100, 20);
		skl.setLocation(80,270);
		skl.setFont(new Font("Arial",Font.BOLD,20));
		p1.add(skl);
		
		JCheckBox tc=new JCheckBox("c");
		tc.setBounds(210,265,100,50);
		tc.setFont(new Font("Arial",Font.BOLD,20));
		p1.add(tc);
		
		JCheckBox tcc = new JCheckBox("C++");
		tcc.setFont(new Font("Arial", Font.BOLD, 15));
		tcc.setBounds(320,265,100,50);
		p1.add(tcc);
		
		JCheckBox tpy=new JCheckBox("python");
		tpy.setBounds(210,320,100,50);
		tpy.setFont(new Font("Arial",Font.BOLD,20));
		p1.add(tpy);
		
		JCheckBox tjava = new JCheckBox("java");
		tjava.setFont(new Font("Arial", Font.BOLD, 15));
		tjava.setBounds(320,320,100,50);
		p1.add(tjava); 
		
		JCheckBox tdb = new JCheckBox("dbms");
		tdb.setFont(new Font("Arial", Font.BOLD, 15));
		tdb.setBounds(430,265,100,50);
		p1.add(tdb);
		
		JCheckBox tht = new JCheckBox("html");
		tht.setFont(new Font("Arial", Font.BOLD, 15));
		tht.setBounds(430,320,300,50);
		p1.add(tht); 
		
		JLabel dob = new JLabel("DOB:");
		dob.setSize(100, 20);
		dob.setLocation(80,370);
		dob.setFont(new Font("Arial",Font.BOLD,20));
		p1.add(dob);

		JComboBox date = new JComboBox(dates);
		date.setSize(50, 20);
		date.setLocation(210, 370);
		p1.add(date);

		JComboBox month = new JComboBox(months);
		month.setSize(60, 20);
		month.setLocation(260, 370);
		p1.add(month);

		JComboBox year = new JComboBox(years);
		year.setSize(60, 20);
		year.setLocation(320, 370);
		p1.add(year);
		
		JLabel ad = new JLabel("Adress:");
		ad.setSize(100, 20);
		ad.setLocation(80,410);
		ad.setFont(new Font("Arial",Font.BOLD,20));
		p1.add(ad);
		
		JTextArea tad=new JTextArea();
		tad.setSize(300, 70);
		tad.setLocation(210,410);
		tad.setLineWrap(true);
		p1.add(tad);
		
		JButton sub = new JButton("Submit");
		sub.setSize(100, 20);
		sub.setLocation(320, 520);
		p1.add(sub);

		JButton reset = new JButton("Reset");
		reset.setSize(100, 20);
		reset.setLocation(120, 520);
		p1.add(reset);
		
		//login page
		JLabel l2=new JLabel("LOGIN PAGE");
		l2.setSize(300, 45);
		l2.setLocation(307,10);
		l2.setFont(new Font("Arial",Font.BOLD,20));
		p2.add(l2);
		
		JLabel user=new JLabel("UserName:");
		user.setSize(150, 20);
		user.setLocation(110,100);
		user.setFont(new Font("Arial",Font.BOLD,20));
		p2.add(user);
		
		JTextField tuser=new JTextField();
		tuser.setSize(250, 20);
		tuser.setLocation(230,100);
		p2.add(tuser);
		
		JLabel pwd=new JLabel("Password:");
		pwd.setSize(150, 20);
		pwd.setLocation(110,140);
		pwd.setFont(new Font("Arial",Font.BOLD,20));
		p2.add(pwd);
		
		JTextField tpwd=new JTextField();
		tpwd.setSize(250, 20);
		tpwd.setLocation(230,140);
		p2.add(tpwd);
		
		JButton log = new JButton("Login");
		log.setSize(100, 20);
		log.setLocation(250, 190);
		p2.add(log);
		
		JLabel dlable = new JLabel("user details");
		dlable.setSize(140, 20);
		dlable.setLocation(220,230);
		p2.add(dlable);
		
		JTextArea inf=new JTextArea();
		inf.setSize(400, 250);
		inf.setFont(new Font("Arial",Font.BOLD,15));
		inf.setLocation(210,250);
		inf.setLineWrap(true);
		inf.setVisible(true);
		inf.setEditable(false);
		p2.add(inf);
		
		//search page
		JLabel l3=new JLabel("SEARCH PAGE");
		l3.setSize(300, 45);
		l3.setLocation(307,10);
		l3.setFont(new Font("Arial",Font.BOLD,20));
		p3.add(l3);
		
		
		JLabel search=new JLabel("SearchName:");
		search.setSize(150, 20);
		search.setLocation(100,90);
		search.setFont(new Font("Arial",Font.BOLD,20));
		p3.add(search);
		
		
		JTextField tsearch=new JTextField(15);
		tsearch.setSize(250, 20);
		tsearch.setLocation(240,90);
		p3.add(tsearch);
		
		JButton ser = new JButton("Search");
		ser.setSize(100, 20);
		ser.setLocation(260, 130);
		p3.add(ser);
		
		JLabel rlable = new JLabel("Search results");
		rlable.setSize(140, 20);
		rlable.setLocation(220,210);
		p3.add(rlable);
		
		JTextArea res=new JTextArea();
		res.setSize(400, 250);
		res.setFont(new Font("Arial",Font.BOLD,15));
		res.setLocation(210,250);
		res.setLineWrap(true);
		res.setVisible(true);
		res.setEditable(false);
		p3.add(res);
		
		
		

		p1.setLayout(null);
		p2.setLayout(null);
		p3.setLayout(null);
		this.add(tab);
		this.setTitle("register");
		this.setSize(1100,650);
		this.setLayout(null);
		this.setVisible(true);
	
	
	
	//submit form action listener
    sub.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e)
    {

	    String data1;
	    String skill="";
        String s1 = treg.getText();
        String s2 = tname.getText();
        String s3 = tmobile.getText();
        String s4 = temail.getText();
        String s6 = date.getSelectedItem() + "";
        String s7 = month.getSelectedItem() + "";
        String s8 = year.getSelectedItem() + "";
        String s9 = tad.getText();
        
        Random random = new Random();
		  String upper = "LENDI";
		  String lower = "lendi";
		  String numbers = "0123456789";
		  String specialChars = "!@#*$";
		  String allChars = upper + lower + numbers + specialChars;
		  List<Character> letters = new ArrayList<Character> ();
		  for (char c: allChars.toCharArray())
		   letters.add(c);
		  Collections.shuffle(letters); // Inbuilt method to randomly shuffle a elements of a list
		  String password = "";
		  int maxLength = 10; // let consider max length is 20
		  int minLength = 8; // let consider min length is 9
		  for (int i = random.nextInt(maxLength - minLength) + minLength; i > 0; --i) {
		   password += letters.get(random.nextInt(letters.size()));
		  }
        
        
        String path ="C:\\java\\"+s1+".txt";
        
        if (tmale.isSelected())
			data1 = "Male"
					+ "\t";
		else
			data1 = "Female"
					+ "\t";
        int i=1;
        if(tc.isSelected()) {
        	skill=skill+ i+".cprogram";
        	i++;			
        }
        if(tcc.isSelected()) {
        	skill=skill+i+".c++";
        	i++;
        }
        if(tpy.isSelected()) {
        	skill=skill+i+ ".python";
        	i++;
        }
        if(tdb.isSelected()) {
        	skill=skill+i+ ".dbms";
        	i++;
        }
        if(tjava.isSelected()) {
        	skill=skill+i+ ".java";
        	i++;
        }
        if(tht.isSelected()) {
        	skill=skill+i+ ".html"+"\t";
        }
        
        
        
        if (e.getSource() == sub) {
            try {

      // Creating a file and writing the data into a Textfile.
                FileWriter w = new FileWriter(path, true);

                w.write("ID:"+s1+",");
                w.write("Name:"+s2+",");
                w.write("Phone:"+s3 + ",");
                w.write("Email:"+s4 + ",");
                w.write("Gender:"+data1 + ",");
                w.write("Skill:"+skill + ",");
                w.write("Dob:"+s6 + "-");
                w.write(s7 + "-");
                w.write(s8 + ",");
                w.write("Adres:"+s9 + ",");
                w.write(password + "\n");
                w.close();
            }
            catch (Exception ae) {
                System.out.println(ae);
            }
        }
     // Shows a Pop up Message when save button is clicked
        JOptionPane.showMessageDialog(p1,"Successfully submitted"+"\n"+ "pwd is:"+password);
    }
});
    //reset action listener
    reset.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
		{
			String def = "";
			treg.setText(def);
			tname.setText(def);
			tmobile.setText(def);
			temail.setText(def);
			tfmale.setSelected(false);
			tc.setSelected(false);
			tcc.setSelected(false);
			tpy.setSelected(false);
			tdb.setSelected(false);
			tjava.setSelected(false);
			tht.setSelected(false);
			date.setSelectedIndex(0);
			month.setSelectedIndex(0);
			year.setSelectedIndex(0);
			tad.setText(def);
			JOptionPane.showMessageDialog(p1,"Successfully reset"+ " The Details");
			
		}
	});
    //log action
    log.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
		{
			String id =tuser.getText();
			String path1 ="C:\\java\\"+id+".txt";
			String Epass=tpwd.getText();
			try {
				File obj=new File(path1);
				Scanner myreader =new Scanner(obj);
				while(myreader.hasNextLine()) {
					String data=myreader.nextLine();
					System.out.println(data);
					String [] res=data.split(",");
					String lpwd=res[res.length-1];
					System.out.println(lpwd);
					
					
					if(lpwd.equalsIgnoreCase(Epass)) {
						
						String detail="";
						StringTokenizer st = new StringTokenizer(data,",");    
					     while (st.hasMoreElements())   
					     {    
					    	 detail=detail+"\n"+st.nextToken();
					    	 //System.out.println(detail);
					         //System.out.println(st.nextToken());  
					    	 inf.setText(detail);
					     }    
					    // System.out.println(detail);
						
						JOptionPane.showMessageDialog(p2,"Successfully "+ " Login");
					}
					else {
						inf.setText(null);
						JOptionPane.showMessageDialog(p2,"Incorrect id"+ " or pwd");
					}
					
				}
			}
			catch (FileNotFoundException fe){
				inf.setText(null);
				JOptionPane.showMessageDialog(p2,"user not"+ " register");
			}
		}
	});
    
    //search action listener
    ser.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
		{
			String id1 =tsearch.getText();
			String path2 ="C:\\java\\"+id1+".txt";
			
			try {
				File obj=new File(path2);
				Scanner myreader =new Scanner(obj);
				while(myreader.hasNextLine()) {
					String data1=myreader.nextLine();
					System.out.println(data1);
					
						String detail1="";
						StringTokenizer st = new StringTokenizer(data1,",");    
					     while (st.hasMoreElements())   
					     {    
					    	 detail1=detail1+"\n"+st.nextToken();
					    	 //System.out.println(detail);
					         //System.out.println(st.nextToken());  
					    	 res.setText(detail1);
					     }    
						JOptionPane.showMessageDialog(p3,"searched result found");	
				}
			}
			catch (FileNotFoundException fe){
				res.setText(null);
				JOptionPane.showMessageDialog(p3,"user not"+ " register");
			}
		}
    });
	
	
	}
	public static void main(String[] args) {
		new FirstFrame();
		
	}

}
