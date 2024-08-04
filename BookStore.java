import java.awt.event.*;
import java.text.MessageFormat;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*; 
import javax.swing.table.DefaultTableModel;

public class BookStore
{
    JFrame f1 = new JFrame("Login");
    JFrame f2 = new JFrame("SignUp");
    JFrame f3 = new JFrame("Buy Page");
    JFrame f4 = new JFrame("Bill");
    JFrame f5 = new JFrame("Admin Page");
    JLabel unl,pwl,unl1,pwl1,logs,signs,namel,cl,namel1,contactl1,al,books,cart,ud,al1,pl1;
    JPasswordField pwt, pwt1;
    JTextField unt,unt1,namet,ct,namet1,contactt1,at,at1,pt;
    JButton login1, signup1,signup2,less,reset,print,purchase;
    Color lightblue = new Color(51,204,255);
    Color lightyellow = new Color(255,255,153);
    Color lightgreen = new Color(102,255,102);
    Color color=new Color(207,159,255);
    JTable jt1,jt2;
    String[] chname= new String[]{"Customer","Admin"};
    String[] rowss= new String[]{"Book Name","Author","Price","Qty"};
    String ch = "";
    JComboBox chose = new JComboBox(chname);
    int in=0,index=0,jn=0,row=-1,in2=0,price=0,index1=0,flag1=0,flag2=0;
    int arr[] = new int[]{0,0,0,0};
    int ret[] = new int[]{-1,-1,-1,-1};
    int p[] = new int[]{100,200,300};
    public BookStore()
    {
        //login

        logs = new JLabel("LOGIN",JLabel.CENTER);
        logs.setBounds(20,20,415,80);
        logs.setFont(new Font("Times New Roman",Font.BOLD,24));
        f1.add(logs);

        chose.setBounds(160,120,150,30);
        f1.add(chose);

        unl=new JLabel("Username:");
        unl.setBounds(70,180,150,30);
        f1.add(unl);

        unt=new JTextField();
        unt.setBounds(230,180,150,30);
        f1.add(unt);

        pwl=new JLabel("Password:");
        pwl.setBounds(70,230,150,30);
        f1.add(pwl);

        pwt=new JPasswordField();
        pwt.setBounds(230,230,150,30);
        f1.add(pwt);

        login1 = new JButton("Login");
        login1.setBounds(160,300,150,30);
        f1.add(login1);

        signup1 = new JButton("Signup");
        signup1.setBounds(160,335,150,30);
        f1.add(signup1);


        //signup
        signs = new JLabel("SIGNUP",JLabel.CENTER);
        signs.setBounds(20,20,420,80);
        signs.setFont(new Font("Times New Roman",Font.BOLD,24));
        f2.add(signs);

        namel=new JLabel("Name: ");
        namel.setBounds(70,180,150,30);
        f2.add(namel);

        namet=new JTextField();
        namet.setBounds(230,180,150,30);
        f2.add(namet);

        cl=new JLabel("Contact No: ");
        cl.setBounds(70,210,150,30);
        f2.add(cl);

        ct=new JTextField();
        ct.setBounds(230,210,150,30);
        f2.add(ct);
        
        al=new JLabel("Address: ");
        al.setBounds(70,240,150,30);
        f2.add(al);

        at=new JTextField();
        at.setBounds(230,240,150,30);
        f2.add(at);
        
        unl1=new JLabel("Username:");
        unl1.setBounds(70,270,150,30);
        f2.add(unl1);

        unt1=new JTextField();
        unt1.setBounds(230,270,150,30);
        f2.add(unt1);

        pwl1=new JLabel("Password:");
        pwl1.setBounds(70,300,150,30);
        f2.add(pwl1);

        pwt1=new JPasswordField();
        pwt1.setBounds(230,300,150,30);
        f2.add(pwt1);

        signup2 = new JButton("Signup");
        signup2.setBounds(160,360,150,30);
        f2.add(signup2);


        //buy
        ud = new JLabel("USER DETAILS",JLabel.CENTER);
        ud.setBounds(285,20,415,80);
        ud.setFont(new Font("Times New Roman",Font.BOLD,24));
        f3.add(ud);

        namel1=new JLabel("Customer Name: ");
        namel1.setBounds(30,100,120,30);
        f3.add(namel1);

        namet1=new JTextField();
        namet1.setBounds(140,100,150,30);
        namet1.setEditable(false);
        f3.add(namet1);

        contactl1=new JLabel("Contact No: ");
        contactl1.setBounds(325,100,120,30);
        f3.add(contactl1);

        contactt1=new JTextField();
        contactt1.setBounds(415,100,150,30);
        contactt1.setEditable(false);
        f3.add(contactt1);

        al1=new JLabel("Address: ");
        al1.setBounds(600,100,100,30);
        f3.add(al1);

        at1=new JTextField();
        at1.setBounds(700,100,190,30);
        at1.setEditable(false);
        f3.add(at1);

        books = new JLabel("AVAILABLE BOOKS",JLabel.CENTER);
        books.setBounds(40,180,415,80);
        books.setFont(new Font("Times New Roman",Font.BOLD,24));
        f3.add(books);

        cart = new JLabel("CART",JLabel.CENTER);
        cart.setBounds(500,180,415,80);
        cart.setFont(new Font("Times New Roman",Font.BOLD,24));
        f3.add(cart);

        String data[][]={ {"101","Amit","100"},{"102","Jai","200"},{"101","Sachin","300"}};    
        String column[]={"Book Name","Author","Price"};

        jt1=new JTable(data,column);    
        jt1.setBounds(50,280,400,350); 
        f3.add(jt1);

        DefaultTableModel tableModel = new DefaultTableModel();
        jt2=new JTable(tableModel);    
        jt2.setBounds(500,280,400,350); 
        f3.add(jt2);
        tableModel.addColumn("Book Name");
        tableModel.addColumn("Author");
        tableModel.addColumn("Price");
        tableModel.addColumn("Qty");

        pl1=new JLabel("Bill Amount: ");
        pl1.setBounds(380,660,110,30);
        f3.add(pl1);

        pt=new JTextField("0");
        pt.setBounds(500,660,80,30);
        pt.setEditable(false);
        f3.add(pt);

        less = new JButton("Delete");
        less.setBounds(615,660,80,30);
        f3.add(less);

        purchase = new JButton("Print");
        purchase.setBounds(715,660,80,30);
        f3.add(purchase);

        reset = new JButton("Reset");
        reset.setBounds(205,660,80,30);
        f3.add(reset);

        ListSelectionModel select= jt1.getSelectionModel();  
        select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);  
        select.addListSelectionListener(new ListSelectionListener() 
        {  
            public void valueChanged(ListSelectionEvent e) 
            {  
                if(in%2==0)
                {
                    int r = jt1.getSelectedRow();
                    if(r!=-1)
                    {
                        if(arr[r]==0)
                        {
                            String sel[] = {"","","",""};
                            sel[0] = data[r][0];
                            sel[1] = data[r][1];
                            sel[2] = data[r][2];
                            sel[3] = String.valueOf(1);
                            tableModel.insertRow(index, sel);
                            ret[r] = index;
                            index++;
                            arr[r] = 1;
                            price += p[r];
                        }
                        else
                        {
                            arr[r] = arr[r] +1;
                            String s = String.valueOf(arr[r]);
                            tableModel.setValueAt(s,ret[r],3);
                            price += p[r];
                        }
                        pt.setText(String.valueOf(price));
                    }
                    //jt1.getSelectionModel().clearSelection();
                }
                in++;
              }       
        });

        ListSelectionModel select2= jt2.getSelectionModel();  
        select2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);  
        select2.addListSelectionListener(new ListSelectionListener() 
        {  
            public void valueChanged(ListSelectionEvent e) 
            {  
                if(jn%2==0&&flag2==0)
                {
                    int r;
                    r = jt2.getSelectedRow();
                    row = r;
                    System.out.println("Table 2 selection");
                    for(int i =0;i<4;i++)
                            System.out.print(ret[i]+" ");
                    System.out.println();
                    System.out.println(r);
                }
                jn++;
              }       
        });

        less.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                if(row!=-1)
                {
                    if(arr[row]>1)
                    {
                        arr[row] = arr[row]  - 1;
                        String s = String.valueOf(arr[row]);
                        tableModel.setValueAt(s,ret[row],3);
                        price -= p[row];
                    }
                    else if(arr[row]==1)
                    {
                        int r = row;
                        price -= p[r];
                        arr[r] = 0;
                        tableModel.removeRow(r);
                        for(int i=r;i<=index;i++)
                        {
                            if(i==r)
                                ret[r] = -1;
                            else if(ret[i]>-1)
                                ret[i] = ret[i]-1;
                        }
                        index--;
                    }
                    row = -1;
                    pt.setText(String.valueOf(price));
                    jt2.getSelectionModel().clearSelection();
                }
            }
        });

        purchase.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                if(price!=0)
                {
                    String column[]={"Book Name","Author","Price","Qty"};
                    String sel[] ={" "," "," "," "};
                    tableModel.insertRow(index, sel);
                    index++;
                    tableModel.insertRow(index, sel);
                    index++;
                    String sel1[] = {" "," ","Bill Amount:"," "};
                    sel1[3] = String.valueOf(price);
                    tableModel.insertRow(index, sel1);
                    index++;
                    String[][] ss = new String[index][4] ;
                    for(int i=0;i<index;i++)
                    {
                        for(int j=0;j<4;j++)
                        {
                                ss[i][j] = String.valueOf(jt2.getModel().getValueAt(i,j));
                                //System.out.println(ss[i][j]);
                        }
                    }
                    JTable jt = new JTable(ss,column);
                    jt.setBounds(30,20,600,300);
                    f4.add(jt);
                    print = new JButton("Print");
                    print.setBounds(240,400,150,30);
                    f4.add(print);
                    f3.setVisible(false);
                    f4.setLayout(null);
                    f4.setSize(670, 500);
                    f4.getContentPane().setBackground(lightgreen);
                    f4.setVisible(true);
                    print.addActionListener(new ActionListener()
                    {
                        public void actionPerformed(ActionEvent ae)
                        {
                            try
                            {
                                MessageFormat header = new MessageFormat("Bill \n\n");
                                MessageFormat footer = new MessageFormat("");
                                jt.print(JTable.PrintMode.NORMAL,header,footer);
                            }
                            catch(Exception e)
                            {
                                System.out.println("Sorry Couldn't print");
                            }
                        }
                    });
                }
                else
                    JOptionPane.showMessageDialog(f3,"Please select books","Alert",JOptionPane.INFORMATION_MESSAGE);
            }
        });

        reset.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                flag2=1;
                tableModel.setRowCount(0);
                flag2=0;
                index = 0;
                in =0;
                jn =0;
                row = -1;
                price = 0;
                pt.setText(String.valueOf(price));
                for(int i=0;i<4;i++)
                {
                    ret[i] = -1;
                    arr[i]=0;
                }
                jt1.getSelectionModel().clearSelection();
            }
        });

        //admin

        JLabel l51=new JLabel("ADMIN PAGE");
        l51.setBounds(430,20,250,30);
        l51.setFont(new Font("Times New Roman",Font.BOLD,24));
        f5.add(l51);
        JLabel l52=new JLabel("Seller Name:");
        l52.setBounds(150,70,150,30);
        f5.add(l52);
        JTextField t51=new JTextField();
        t51.setEditable(false);
        t51.setBounds(260,70,150,30);
        f5.add(t51);
        JLabel l53=new JLabel("Contact No:");
        l53.setBounds(480,70,150,30);
        f5.add(l53);
        JTextField t52=new JTextField();
        t52.setBounds(560,70,150,30);
        t52.setEditable(false);
        f5.add(t52);
        JLabel l54=new JLabel("BOOK DETAILS");
        l54.setBounds(170,150,200,30);
        l54.setFont(new Font("Times New Roman",Font.BOLD,24));
        f5.add(l54);
        JLabel l55=new JLabel("Book Name:");
        l55.setBounds(150,200,100,30);
        f5.add(l55);
        JLabel l56=new JLabel("Author Name:");
        l56.setBounds(150,250,100,30);
        f5.add(l56);
        JLabel l57=new JLabel("Price:");
        l57.setBounds(150,300,100,30);
        f5.add(l57);
        JLabel l58=new JLabel("Qty:");
        l58.setBounds(150,350,100,30);
        f5.add(l58);
        JTextField t53=new JTextField();
        t53.setBounds(250,200,150,30);
        f5.add(t53);
        JTextField t54=new JTextField();
        t54.setBounds(250,250,150,30);
        f5.add(t54);
        JTextField t55=new JTextField();
        t55.setBounds(250,300,150,30);
        f5.add(t55);
        JTextField t56=new JTextField();
        t56.setBounds(250,350,150,30);
        f5.add(t56);
        f5.setSize(1000,800);
        JButton add=new JButton("ADD");
        add.setBounds(170,450,100,30);
        f5.add(add);
        JButton breset=new JButton("RESET");
        breset.setBounds(300,450,100,30);
        f5.add(breset);
        JLabel l59=new JLabel("BOOK LIST");
        l59.setBounds(650,150,150,30);
        l59.setFont(new Font("Times New Roman",Font.BOLD,24));
        f5.add(l59);

        DefaultTableModel tableModel1 = new DefaultTableModel();
        JTable jt5=new JTable(tableModel1);    
        jt5.setBounds(520,200,400,400);
        f5.add(jt5);
        tableModel1.addColumn("Book Name");
        tableModel1.addColumn("Author");
        tableModel1.addColumn("Price");
        tableModel1.addColumn("Qty");
        tableModel1.insertRow(index1,rowss);
        index1++;
        add.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                String s = "";
                if(t53.getText().equals(s) || t54.getText().equals(s) || t55.getText().equals(s) || t56.getText().equals(s))
                {
                    JOptionPane.showMessageDialog(f5,"Enter required details","Alert",JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    String[] details = new String[4];
                    details[0] = t53.getText();
                    details[1] = t54.getText();
                    details[2] = t55.getText();
                    details[3] = t56.getText();
                    tableModel1.insertRow(index1, details);
                    index1++;
                    t53.setText("");
                    t54.setText("");
                    t55.setText("");
                    t56.setText("");
                }
            }
        });

        breset.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            { 
                tableModel1.setRowCount(0);
                index1 = 0;
                tableModel1.insertRow(index1, rowss);
                index1++;
            }
        });

        login1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                //System.out.println(unt.getText() + String.valueOf(pwt.getPassword()));
                if(ch=="")
                {
                    JOptionPane.showMessageDialog(f1,"Please select the option","Alert",JOptionPane.INFORMATION_MESSAGE);
                }
                else if(ch.equals("Admin"))
                {
                    f1.setVisible(false);
                    f5.setSize(1000, 800);
                    f5.getContentPane().setBackground(color);
                    f5.setLayout(null);
                    f5.setVisible(true);
                }
                else if(ch.equals("Customer"))
                {
                    f1.setVisible(false);
                    f3.setLayout(null);
                    f3.setSize(1000, 800);
                    f3.getContentPane().setBackground(lightblue);
                    f3.setVisible(true);
                }
            }
        });

        signup1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            { 
                ch ="";
                f1.setVisible(false);
                f2.setLayout(null);
                f2.setSize(500, 500);
                f2.getContentPane().setBackground(lightyellow);
                f2.setVisible(true);
            }
        });

        chose.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            { 
                    ch = String.valueOf(chose.getSelectedItem());
            }
        });

        signup2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                String s="";
                if(unt1.getText().equals(s)||String.valueOf(pwt1.getPassword()).equals(s) || ct.getText().equals(s)||namet.getText().equals(s)||at.getText().equals(s))
                {
                    JOptionPane.showMessageDialog(f2,"Please fill the required values","Alert",JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(f2,"Signup Successful","Alert",JOptionPane.INFORMATION_MESSAGE);
                    f2.setVisible(false);
                    f1.setLayout(null);
                    f1.setSize(500, 500);
                    f1.getContentPane().setBackground(Color.PINK);
                    f1.setVisible(true);
                }
            }
        });

        f1.setLayout(null);
        f1.setSize(500, 500);
        f1.getContentPane().setBackground(Color.PINK);
        f1.setVisible(true);
        
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[])
    {
        new BookStore();
    }
}