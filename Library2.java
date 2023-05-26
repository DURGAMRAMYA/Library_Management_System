package net.javaguides.swing;

import java.awt.*;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;
import javax.swing.table.*;
import java.time.LocalDate;

public class Library2 extends JFrame {
	private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    JFrame f;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btn10;
    private JButton btn11;
    private JTextField id;
    private JTextField name;
    private JTextField uid1;
    private JTextField period1;
    private JTextField bid1;
    private JTextField date1;
    private JTextField bid2;
    private JTextField price2;
    private JTextField bname2;
    private JTextField qty2;
    private JPasswordField pass;
    private JLabel uid;
    private JLabel bid;
    private JLabel period;
    private JLabel date;
    private JLabel name1;
    private JLabel id1;
    private JLabel pass1;
    private JLabel bid3;
    private JLabel bname3;
    private JLabel price3;
    private JLabel qty3;
   
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Library2 frame = new Library2();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public Library2() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\STDM.jpg"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(20,20,800,400);
        setResizable(false);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        btn1 = new JButton("View Books");
        btn1.setFont(new Font("Tahoma", Font.PLAIN,20));
        btn1.setBounds(5,5,150,50);
        btn1.setVisible(true);
        contentPane.add(btn1);
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               ex ra=new ex();
               ra.main(null);
            }
        });
        
        btn2 = new JButton("View Users");
        btn2.setFont(new Font("Tahoma", Font.PLAIN,20));
        btn2.setBounds(5,55,150,50);
        btn2.setVisible(true);
        contentPane.add(btn2);
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               user ra1=new user();
               ra1.main(null);
            }
        });
        
        btn3 = new JButton("Issued Books");
        btn3.setFont(new Font("Tahoma", Font.PLAIN,18));
        btn3.setBounds(5,105,150,50);
        btn3.setVisible(true);
        contentPane.add(btn3);
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               issued ra2=new issued();
               ra2.main(null);
            }
        });
        
        btn4 = new JButton("Issue Book");
        btn4.setFont(new Font("Tahoma", Font.PLAIN,20));
        btn4.setBounds(5,155,150,50);
        btn4.setVisible(true);
        contentPane.add(btn4);
        
        uid1 = new JTextField();
        uid1.setFont(new Font("Tahoma", Font.PLAIN, 32));
        uid1.setBounds(300,110, 228,30);
        uid1.setColumns(10);
        uid1.setVisible(false);
        
        bid1 = new JTextField();
        bid1.setFont(new Font("Tahoma", Font.PLAIN, 32));
        bid1.setBounds(300,60, 228,30);
        bid1.setColumns(10);
        bid1.setVisible(false);
        
        bid = new JLabel("Book ID");
        bid.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bid.setBounds(200,50,150,50);
        bid.setVisible(false);
        
        uid = new JLabel("User ID");
        uid.setFont(new Font("Tahoma", Font.PLAIN, 20));
        uid.setBounds(200,100,150,50);
        uid.setVisible(false);
        
        period1 = new JTextField();
        period1.setFont(new Font("Tahoma", Font.PLAIN, 32));
        period1.setBounds(300,160, 228,30);
        period1.setColumns(10);
        period1.setVisible(false);
        
        date1 = new JTextField();
        date1.setFont(new Font("Tahoma", Font.PLAIN, 32));
        date1.setBounds(300,210, 228,30);
        date1.setColumns(10);
        date1.setVisible(false);
        
        period = new JLabel("Period");
        period.setFont(new Font("Tahoma", Font.PLAIN, 20));
        period.setBounds(200,150,150,50);
        period.setVisible(false);
        
        date = new JLabel("Date");
        date.setFont(new Font("Tahoma", Font.PLAIN, 20));
        date.setBounds(200,200,150,50);
        date.setVisible(false);
        
        contentPane.add(uid);
        contentPane.add(uid1);
        contentPane.add(bid);
        contentPane.add(bid1);
        contentPane.add(date);
        contentPane.add(date1);
        contentPane.add(period);
        contentPane.add(period1);
        
        btn9 = new JButton("Submit");
        btn9.setFont(new Font("Tahoma", Font.PLAIN,20));
        btn9.setBounds(250,250,150,50);
        btn9.setVisible(false);
        contentPane.add(btn9);
        
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
           	 if (e.getSource() == btn4) {
           		 uid.setVisible(true);
                  uid1.setVisible(true);
                   bid.setVisible(true);
                   bid1.setVisible(true);
                    period.setVisible(true);
                    period1.setVisible(true);
                    btn9.setVisible(true);
                    date.setVisible(true);
                    date1.setVisible(true);
                    name1.setVisible(false);
                    pass1.setVisible(false);
                     id1.setVisible(false);
                      name.setVisible(false);
                      id.setVisible(false);
                      pass.setVisible(false);
                      btn8.setVisible(false);
                      bid2.setVisible(false);
                      bid3.setVisible(false);
                       bname2.setVisible(false);
                       bname3.setVisible(false);
                        price2.setVisible(false);
                        price3.setVisible(false);
                        qty2.setVisible(false);
                        qty3.setVisible(false); 
                        btn10.setVisible(false);
 
        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
           	    String uid2 = uid1.getText();
                String bid2 = bid1.getText();
                String period2 = period1.getText();
                String date2 = date1.getText();
                 
                int uid3 = Integer.parseInt(uid2);
                int bid3 = Integer.parseInt(bid2);
                int period3 = Integer.parseInt(period2);
                LocalDate date3 = LocalDate.parse(date2);
                

                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/LMS", "root", "system");
                    String query = "INSERT INTO ISSUE values('" + bid3 + "','" + uid3 + "','"+ period3 + "','" + date3 + "')";
                    String query1 = "UPDATE books SET bqty=bqty-1 WHERE bid = '" +bid3 +"'";
                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    
                    if (x == 0) {
                        JOptionPane.showMessageDialog(btn9, "This is alredy taken");
                    } else {
                        JOptionPane.showMessageDialog(btn9,"Issued");
                        sta.executeUpdate(query1);
                    }
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
                
            }
        });                 
           	 }
            }
        });
        
        btn5 = new JButton("Add User");
        btn5.setFont(new Font("Tahoma", Font.PLAIN,20));
        btn5.setBounds(5,205,150,50);
        btn5.setVisible(true);
        contentPane.add(btn5);
        
        btn8 = new JButton("Add User");
        btn8.setFont(new Font("Tahoma", Font.PLAIN,20));
        btn8.setBounds(250,200,150,50);
        btn8.setVisible(false);
        contentPane.add(btn8);
        
        btn8 = new JButton("Add User");
        btn8.setFont(new Font("Tahoma", Font.PLAIN,20));
        btn8.setBounds(250,200,150,50);
        btn8.setVisible(false);
        contentPane.add(btn8);
        
        id = new JTextField();
        id.setFont(new Font("Tahoma", Font.PLAIN, 32));
        id.setBounds(300,60, 228,30);
        id.setColumns(10);
        id.setVisible(false);
        
        name = new JTextField();
        name.setFont(new Font("Tahoma", Font.PLAIN, 32));
        name.setBounds(300,110, 228,30);
        name.setColumns(10);
        name.setVisible(false);
        
        name1 = new JLabel("Username");
        name1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        name1.setBounds(200,100,150,50);
        name1.setVisible(false);
        
        id1 = new JLabel("User ID");
        id1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        id1.setBounds(200,50,150,50);
        id1.setVisible(false);
        
        pass1 = new JLabel("Password");
        pass1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        pass1.setBounds(200,150,150,50);
        pass1.setVisible(false);

        pass = new JPasswordField();
        pass.setFont(new Font("Tahoma", Font.PLAIN, 32));
        pass.setBounds(300,160,228,30);
        pass.setVisible(false);
        
        contentPane.add(btn8);
        contentPane.add(name);
        contentPane.add(id);
        contentPane.add(name1);
        contentPane.add(pass);
        contentPane.add(pass1);
        contentPane.add(id1);
        
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
           	 if (e.getSource() == btn5) {
           		 name1.setVisible(true);
                  pass1.setVisible(true);
                   id1.setVisible(true);
                    name.setVisible(true);
                    id.setVisible(true);
                    pass.setVisible(true);
                    btn8.setVisible(true);
                    uid.setVisible(false);
                    uid1.setVisible(false);
                     bid.setVisible(false);
                     bid1.setVisible(false);
                      period.setVisible(false);
                      period1.setVisible(false);
                      btn9.setVisible(false);
                      date.setVisible(false);
                      date1.setVisible(false);
                      bid2.setVisible(false);
                      bid3.setVisible(false);
                       bname2.setVisible(false);
                       bname3.setVisible(false);
                        price2.setVisible(false);
                        price3.setVisible(false);
                        qty2.setVisible(false);
                        qty3.setVisible(false); 
                        btn10.setVisible(false);
 
        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
           	    String id2 = id.getText();
                String name2 = name.getText();
                String passWord2 = pass.getText();
                String msg = "" + name2;
                msg += " \n";     
                int id3 = Integer.parseInt(id2);

                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/LMS", "root", "system");
                    String query = "INSERT INTO users values('" + id3 + "','" + name2 + "','"+ passWord2 + "')";
                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(btn5, "This is alredy exist");
                    } else {
                        JOptionPane.showMessageDialog(btn5,
                            "Welcome, " + msg + "Your account is sucessfully created.Now you can SignIn into your account");
                    }
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
                
            }
        });                 
           	 }
            }
        });
        btn6 = new JButton("Add Book");
        btn6.setFont(new Font("Tahoma", Font.PLAIN,20));
        btn6.setBounds(5,255,150,50);
        btn6.setVisible(true);
        contentPane.add(btn6);
        
        bname2 = new JTextField();
        bname2.setFont(new Font("Tahoma", Font.PLAIN, 32));
        bname2.setBounds(300,110, 228,30);
        bname2.setColumns(10);
        bname2.setVisible(false);
        
        bid2 = new JTextField();
        bid2.setFont(new Font("Tahoma", Font.PLAIN, 32));
        bid2.setBounds(300,60, 228,30);
        bid2.setColumns(10);
        bid2.setVisible(false);
        
        bid3 = new JLabel("Book ID");
        bid3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bid3.setBounds(200,50,150,50);
        bid3.setVisible(false);
        
        bname3 = new JLabel("Bname");
        bname3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bname3.setBounds(200,100,150,50);
        bname3.setVisible(false);
        
        price2 = new JTextField();
        price2.setFont(new Font("Tahoma", Font.PLAIN, 32));
        price2.setBounds(300,160, 228,30);
        price2.setColumns(10);
        price2.setVisible(false);
        
        qty2 = new JTextField();
        qty2.setFont(new Font("Tahoma", Font.PLAIN, 32));
        qty2.setBounds(300,210, 228,30);
        qty2.setColumns(10);
        qty2.setVisible(false);
        
        price3 = new JLabel("Price");
        price3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        price3.setBounds(200,150,150,50);
        price3.setVisible(false);
        
        qty3 = new JLabel("Quantity");
        qty3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        qty3.setBounds(200,200,150,50);
        qty3.setVisible(false);
        
        contentPane.add(bid2);
        contentPane.add(bid3);
        contentPane.add(bname2);
        contentPane.add(bname3);
        contentPane.add(price2);
        contentPane.add(price3);
        contentPane.add(qty2);
        contentPane.add(qty3);
        
        btn10 = new JButton("Submit");
        btn10.setFont(new Font("Tahoma", Font.PLAIN,20));
        btn10.setBounds(250,250,150,50);
        btn10.setVisible(false);
        contentPane.add(btn10);
        
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
           	 if (e.getSource() == btn6) {
           		bid2.setVisible(true);
                bid3.setVisible(true);
                 bname2.setVisible(true);
                 bname3.setVisible(true);
                  price2.setVisible(true);
                  price3.setVisible(true);
                  qty2.setVisible(true);
                  qty3.setVisible(true); 
                  btn10.setVisible(true);
           		uid.setVisible(false);
                uid1.setVisible(false);
                 bid.setVisible(false);
                 bid1.setVisible(false);
                  period.setVisible(false);
                  period1.setVisible(false);
                  btn9.setVisible(false);
                  date.setVisible(false);
                  date1.setVisible(false);
                    name1.setVisible(false);
                    pass1.setVisible(false);
                     id1.setVisible(false);
                      name.setVisible(false);
                      id.setVisible(false);
                      pass.setVisible(false);
                      btn8.setVisible(false);
 
        btn10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
           	    String bid4 = bid2.getText();
                String bname4 = bname2.getText();
                String price4 = price2.getText();
                String qty4 = qty2.getText();
                 
                int bid5 = Integer.parseInt(bid4);
                int price5 = Integer.parseInt(price4);
                int qty5 = Integer.parseInt(qty4);
                
                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/LMS", "root", "system");
                    String query = "INSERT INTO books values('" + bid5 + "','" + bname4 + "','"+ price5 + "','" + qty5 + "')";
                   
                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    
                    if (x == 0) {
                        JOptionPane.showMessageDialog(btn10, "This is alredy taken");
                    } else {
                        JOptionPane.showMessageDialog(btn10,"Inserted");
                        
                    }
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
                
            }
        });                 
           	 }
            }
        });
        
        btn7 = new JButton("Return Book");
        btn7.setFont(new Font("Tahoma", Font.PLAIN,20));
        btn7.setBounds(5,305,150,50);
        btn7.setVisible(true);
        contentPane.add(btn7);
    }
}
