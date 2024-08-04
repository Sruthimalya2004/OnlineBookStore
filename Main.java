// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Updates;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.bson.types.ObjectId;
import java.awt.event.*;
import java.text.MessageFormat;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.DefaultTableModel;

public class Main {
    JFrame f1 = new JFrame("Login");
    JFrame f2 = new JFrame("SignUp");
    JFrame f3 = new JFrame("Buy Page");
    JFrame f4 = new JFrame("Bill");
    JFrame f5 = new JFrame("Admin Page");
    JLabel unl,pwl,unl1,pwl1,logs,signs,namel,cl,namel1,contactl1,al,books,cart,ud,al1,pl1,l1;
    JPasswordField pwt, pwt1;
    JTextField unt,unt1,namet,ct,namet1,contactt1,at,at1,pt;
    JButton login1, signup1,signup2,less,reset,print,purchase,add1,home1,home2,home3;
    Color lightblue = new Color(51,204,255);
    Color lightyellow = new Color(141,215,207);
    Color lightgreen = new Color(102,255,102);
    Color color=new Color(207,159,255);
    JTable jt1,jt2;
    String[] chname= new String[]{"Customer","Admin"};
    String[] rowss= new String[]{"Book Name","Author","Price","Qty"};
    String[][] entries= new String[20][4];
    String[] entries2= new String[20];
    String ch = "";
    String nametxt , contacttxt,addresstxt;
    JComboBox chose = new JComboBox(chname);
    int in=0,index=0,jn=0,row=-1,in2=0,price=0,index1=0,flag1=0,flag2=0,enin =0,indi=0,ind=0,row1=0,x=0;
    int arr[] = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    int ret[] = new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
    int p[] = new int[20];
    int quantity[] = new int[20];
    long count=0,count1=0;
    public Main() {


        //login

        Icon icon1 = new ImageIcon("/Users/sruthimalyar/Desktop/Book.png");
        l1 = new JLabel(icon1);
        l1.setBounds(20,20,100,80);
        f1.add(l1);

        logs = new JLabel("LOGIN", JLabel.CENTER);
        logs.setBounds(20, 10, 415, 80);
        logs.setFont(new Font("Times New Roman", Font.BOLD, 24));
        f1.add(logs);

        chose.setBounds(160, 120, 150, 30);
        f1.add(chose);

        unl = new JLabel("Username:");
        unl.setBounds(70, 180, 150, 30);
        f1.add(unl);

        unt = new JTextField();
        unt.setBounds(230, 180, 150, 30);
        f1.add(unt);

        pwl = new JLabel("Password:");
        pwl.setBounds(70, 230, 150, 30);
        f1.add(pwl);

        pwt = new JPasswordField();
        pwt.setBounds(230, 230, 150, 30);
        f1.add(pwt);

        login1 = new JButton("Login");
        login1.setBounds(160, 300, 150, 30);
        f1.add(login1);

        signup1 = new JButton("Signup");
        signup1.setBounds(160, 335, 150, 30);
        f1.add(signup1);


        //signup

        Icon icon = new ImageIcon("/Users/sruthimalyar/Desktop/img.png");
        home1 = new JButton(icon);
        home1.setBounds(0,0,50,50);
        f2.add(home1);

        signs = new JLabel("SIGNUP", JLabel.CENTER);
        signs.setBounds(20, 90, 420, 40);
        signs.setFont(new Font("Times New Roman", Font.BOLD, 24));
        f2.add(signs);

        namel = new JLabel("Name: ");
        namel.setBounds(70, 180, 150, 30);
        f2.add(namel);

        namet = new JTextField();
        namet.setBounds(230, 180, 150, 30);
        f2.add(namet);

        cl = new JLabel("Contact No: ");
        cl.setBounds(70, 210, 150, 30);
        f2.add(cl);

        ct = new JTextField();
        ct.setBounds(230, 210, 150, 30);
        f2.add(ct);

        al = new JLabel("Address: ");
        al.setBounds(70, 240, 150, 30);
        f2.add(al);

        at = new JTextField();
        at.setBounds(230, 240, 150, 30);
        f2.add(at);

        unl1 = new JLabel("Username:");
        unl1.setBounds(70, 270, 150, 30);
        f2.add(unl1);

        unt1 = new JTextField();
        unt1.setBounds(230, 270, 150, 30);
        f2.add(unt1);

        pwl1 = new JLabel("Password:");
        pwl1.setBounds(70, 300, 150, 30);
        f2.add(pwl1);

        pwt1 = new JPasswordField();
        pwt1.setBounds(230, 300, 150, 30);
        f2.add(pwt1);

        signup2 = new JButton("Signup");
        signup2.setBounds(160, 360, 150, 30);
        f2.add(signup2);


        //buy

        home2 = new JButton(icon);
        home2.setBounds(0,0,50,50);
        f3.add(home2);

        ud = new JLabel("USER DETAILS", JLabel.CENTER);
        ud.setBounds(285, 20, 415, 80);
        ud.setFont(new Font("Times New Roman", Font.BOLD, 24));
        f3.add(ud);

        namel1 = new JLabel("Customer Name: ");
        namel1.setBounds(30, 100, 120, 30);
        f3.add(namel1);

        namet1 = new JTextField();
        namet1.setBounds(140, 100, 150, 30);
        namet1.setEditable(false);
        f3.add(namet1);

        contactl1 = new JLabel("Contact No: ");
        contactl1.setBounds(325, 100, 120, 30);
        f3.add(contactl1);

        contactt1 = new JTextField();
        contactt1.setBounds(415, 100, 150, 30);
        contactt1.setEditable(false);
        f3.add(contactt1);

        al1 = new JLabel("Address: ");
        al1.setBounds(600, 100, 100, 30);
        f3.add(al1);

        at1 = new JTextField();
        at1.setBounds(700, 100, 190, 30);
        at1.setEditable(false);
        f3.add(at1);

        books = new JLabel("AVAILABLE BOOKS", JLabel.CENTER);
        books.setBounds(40, 180, 415, 80);
        books.setFont(new Font("Times New Roman", Font.BOLD, 24));
        f3.add(books);

        cart = new JLabel("CART", JLabel.CENTER);
        cart.setBounds(500, 180, 415, 80);
        cart.setFont(new Font("Times New Roman", Font.BOLD, 24));
        f3.add(cart);

        DefaultTableModel tableModel2 = new DefaultTableModel();
        jt1 = new JTable(tableModel2);
        jt1.setBounds(50, 280, 400, 350);
        f3.add(jt1);
        tableModel2.addColumn("Book Name");
        tableModel2.addColumn("Author");
        tableModel2.addColumn("Price");
        tableModel2.addColumn("Qty");


        DefaultTableModel tableModel = new DefaultTableModel();
        jt2 = new JTable(tableModel);
        jt2.setBounds(500, 280, 400, 350);
        f3.add(jt2);
        tableModel.addColumn("Book Name");
        tableModel.addColumn("Author");
        tableModel.addColumn("Price");
        tableModel.addColumn("Qty");

        pl1 = new JLabel("Bill Amount: ");
        pl1.setBounds(380, 660, 110, 30);
        f3.add(pl1);

        pt = new JTextField("0");
        pt.setBounds(500, 660, 80, 30);
        pt.setEditable(false);
        f3.add(pt);

        less = new JButton("Delete");
        less.setBounds(615, 660, 80, 30);
        f3.add(less);

        purchase = new JButton("Purchase");
        purchase.setBounds(715, 660, 80, 30);
        f3.add(purchase);

        reset = new JButton("Reset");
        reset.setBounds(225, 660, 80, 30);
        f3.add(reset);

        add1 = new JButton("Add");
        add1.setBounds(125, 660, 80, 30);
        f3.add(add1);

        ListSelectionModel select = jt1.getSelectionModel();
        select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        select.addListSelectionListener(new ListSelectionListener()
        {
            public void valueChanged(ListSelectionEvent e)
            {
                if (in % 2 == 0) {
                    row1 = jt1.getSelectedRow();
                }

            }
        });

        ListSelectionModel select2 = jt2.getSelectionModel();
        select2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        select2.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (jn % 2 == 0 && flag2 == 0) {
                    int r;
                    r = jt2.getSelectedRow();
                    row = r;

                }
                jn++;
            }
        });

        add1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {
                int r = row1;
               // System.out.println( " r " + r);
                if(quantity[r]<=0)
                    JOptionPane.showMessageDialog(f3, "Product out of stock", "Alert", JOptionPane.INFORMATION_MESSAGE);
                else if(arr[r]==0)
                {
                    arr[r] = 1;
                    ret[r] = ind;
                    price += p[r];
                    String s[] = new String[4];
                    s[0] = String.valueOf(tableModel2.getValueAt(r,0));
                    s[1] = String.valueOf(tableModel2.getValueAt(r,1));
                    s[2] = String.valueOf(tableModel2.getValueAt(r,2));
                    s[3] = String.valueOf(1);
                    tableModel.insertRow(ind,s);
                    ind++;
                    quantity[r]--;
                    pt.setText(String.valueOf(price));
                }
                else if(arr[r]>=1)
                {
                    arr[r] = arr[r]+1;
                    price += p[r];
                    tableModel.setValueAt(String.valueOf(arr[r]),ret[r],3);
                    pt.setText(String.valueOf(price));
                    quantity[r]--;
                }
                jt1.getSelectionModel().clearSelection();
            }
        });

        less.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (row != -1) {
                    int k=0;
                    for(int i=0;i<20;i++)
                    {
                        if(ret[i]==row)
                            k = i;
                    }
                    if(arr[k]==1)
                    {
                        arr[k] = 0;
                        ret[k] = -1;
                        tableModel.removeRow(row);
                        price -= p[k];
                        pt.setText(String.valueOf(price));
                        quantity[k]++;
                        ind--;
                    }
                    else if(arr[k]>1)
                    {
                        arr[k] = arr[k] - 1;
                        price -= p[k];
                        tableModel.setValueAt(String.valueOf(arr[k]),ret[k],3);
                        pt.setText(String.valueOf(price));
                        quantity[k]--;
                    }
                    jt2.getSelectionModel().clearSelection();
                }
            }
        });

        purchase.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                if (price != 0)
                {
                    String column[] = {"Book Name", "Author", "Price", "Qty"};
                    String sel[] = {" ", " ", " ", " "};
                    tableModel.insertRow(ind, sel);
                    ind++;
                    tableModel.insertRow(ind, sel);
                    ind++;
                    String sel1[] = {" ", " ", "Bill Amount:", " "};
                    sel1[3] = String.valueOf(price);
                    tableModel.insertRow(ind, sel1);
                    ind++;
                   // System.out.println("Ind " + ind);
                    String[][] ss = new String[ind][4];
                    for (int i = 0; i < ind; i++) {
                        for (int j = 0; j < 4; j++) {
                            ss[i][j] = String.valueOf(jt2.getModel().getValueAt(i, j));
                        }
                        //System.out.println(quantity[i]);
                    }
                    try {
                        MongoClient mongo = new MongoClient("localhost", 27017);
                        MongoDatabase dbl = mongo.getDatabase("bookstore");
                        MongoCollection<Document> coll = dbl.getCollection("books_list");
                            for (int i = 0; i < ind-3; i++)
                            {
                                MongoCursor<Document> cur = coll.find().iterator();
                                while (cur.hasNext())
                                {
                                    Document document = cur.next();
                                    if(document.get("Book_Name").toString().equals(ss[i][0]))
                                    {
                                        String s = String.valueOf(Integer.parseInt(document.get("Qty").toString())-Integer.parseInt(ss[i][3]));
                                       // System.out.println(s + " " + ss[i][0]);
                                        coll.updateOne(Filters.eq("Book_Name", ss[i][0]), Updates.set("Qty", s));
                                        if(s.equals("0"))
                                            coll.deleteOne(Filters.eq("Book_Name", ss[i][0]));
                                        break;
                                    }
                                }
                                cur.close();
                        }
                    }
                    catch(Exception e)
                    {
                        e.printStackTrace();
                    }
                    try {
                        MongoClient mongo = new MongoClient("localhost", 27017);
                        MongoDatabase dbl = mongo.getDatabase("bookstore");
                        MongoCollection<Document> coll = dbl.getCollection("customerlist");
                        MongoCursor<Document> cur = coll.find().iterator();
                        Document d1= new Document("_id", new ObjectId()).append("Name",nametxt).append("Contact_No",contacttxt).append("Bill",String.valueOf(price));
                        coll.insertOne(d1);
                        cur.close();
                    }
                    catch(Exception e)
                    {
                        e.printStackTrace();
                    }
                    JTable jt = new JTable(ss, column);
                    jt.setBounds(30, 20, 600, 300);
                    f4.add(jt);
                    print = new JButton("Print");
                    print.setBounds(240, 400, 150, 30);
                    f4.add(print);
                    f3.setVisible(false);
                    f4.setLayout(null);
                    f4.setSize(670, 500);
                    f4.getContentPane().setBackground(lightgreen);
                    f4.setVisible(true);
                    print.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent ae) {
                            try {
                                MessageFormat header = new MessageFormat("Bill \n\n");
                                MessageFormat footer = new MessageFormat("");
                                jt.print(JTable.PrintMode.NORMAL, header, footer);
                            } catch (Exception e) {
                                System.out.println("Sorry Couldn't print");
                            }
                            unt.setText("");
                            pwt.setText("");
                            ch = "";
                            f4.setVisible(false);
                            f1.setLayout(null);
                            f1.setSize(500, 500);
                            f1.getContentPane().setBackground(Color.PINK);
                            f1.setVisible(true);

                        }
                    });
                } else
                    JOptionPane.showMessageDialog(f3, "Please select books", "Alert", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                flag2 = 1;
                tableModel.setRowCount(0);
                flag2 = 0;
                ind = 0;
                in = 0;
                jn = 0;
                row = -1;
                price = 0;
                pt.setText(String.valueOf(price));
                for (int i = 0; i < 20; i++) {
                    ret[i] = -1;
                    arr[i] = 0;
                }
                try {
                    MongoClient mongo = new MongoClient("localhost", 27017);
                    MongoDatabase dbl = mongo.getDatabase("bookstore");
                    MongoCollection<Document> coll = dbl.getCollection("books_list");
                    MongoCursor<Document> cur = coll.find().iterator();
                    int i=0;
                    while (cur.hasNext()) {
                        Document document = cur.next();
                        quantity[i]=Integer.parseInt(document.get("Qty").toString());
                        i++;
                    }
                    cur.close();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                jt1.getSelectionModel().clearSelection();
            }
        });

        //admin

        home3 = new JButton(icon);
        home3.setBounds(0,0,50,50);
        f5.add(home3);

        JLabel l51 = new JLabel("ADMIN PAGE");
        l51.setBounds(430, 20, 250, 30);
        l51.setFont(new Font("Times New Roman", Font.BOLD, 24));
        f5.add(l51);
        JLabel l52 = new JLabel("Admin Name:");
        l52.setBounds(150, 70, 150, 30);
        f5.add(l52);
        JTextField t51 = new JTextField();
        t51.setEditable(false);
        t51.setBounds(260, 70, 150, 30);
        f5.add(t51);
        JLabel l53 = new JLabel("Contact No:");
        l53.setBounds(480, 70, 150, 30);
        f5.add(l53);
        JTextField t52 = new JTextField();
        t52.setBounds(560, 70, 150, 30);
        t52.setEditable(false);
        f5.add(t52);
        JLabel l54 = new JLabel("BOOK DETAILS");
        l54.setBounds(170, 150, 200, 30);
        l54.setFont(new Font("Times New Roman", Font.BOLD, 24));
        f5.add(l54);
        JLabel l55 = new JLabel("Book Name:");
        l55.setBounds(150, 200, 100, 30);
        f5.add(l55);
        JLabel l56 = new JLabel("Author Name:");
        l56.setBounds(150, 250, 100, 30);
        f5.add(l56);
        JLabel l57 = new JLabel("Price:");
        l57.setBounds(150, 300, 100, 30);
        f5.add(l57);
        JLabel l58 = new JLabel("Qty:");
        l58.setBounds(150, 350, 100, 30);
        f5.add(l58);
        JTextField t53 = new JTextField();
        t53.setBounds(250, 200, 150, 30);
        f5.add(t53);
        JTextField t54 = new JTextField();
        t54.setBounds(250, 250, 150, 30);
        f5.add(t54);
        JTextField t55 = new JTextField();
        t55.setBounds(250, 300, 150, 30);
        f5.add(t55);
        JTextField t56 = new JTextField();
        t56.setBounds(250, 350, 150, 30);
        f5.add(t56);
        f5.setSize(1000, 800);
        JButton add = new JButton("ADD");
        add.setBounds(170, 450, 100, 30);
        f5.add(add);
        JButton breset = new JButton("RESET");
        breset.setBounds(300, 450, 100, 30);
        f5.add(breset);
        JLabel l59 = new JLabel("BOOK LIST");
        l59.setBounds(650, 150, 150, 30);
        l59.setFont(new Font("Times New Roman", Font.BOLD, 24));
        f5.add(l59);

        DefaultTableModel tableModel1 = new DefaultTableModel();
        JTable jt5 = new JTable(tableModel1);
        jt5.setBounds(520, 200, 400, 400);
        f5.add(jt5);
        tableModel1.addColumn("Book Name");
        tableModel1.addColumn("Author");
        tableModel1.addColumn("Price");
        tableModel1.addColumn("Qty");
        JButton submit = new JButton("Submit");
        submit.setBounds(630,700,100,30);
        f5.add(submit);

        home1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                ch = "";
                unt.setText("");
                pwt.setText("");
                namet.setText("");
                ct.setText("");
                at.setText("");
                unt1.setText("");
                pwt1.setText("");
                f2.setVisible(false);
                f1.setLayout(null);
                f1.setSize(500, 500);
                f1.getContentPane().setBackground(Color.PINK);
                f1.setVisible(true);
            }
        });
        home2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                ch = "";
                unt.setText("");
                pwt.setText("");
                price =0;
                tableModel.setRowCount(0);
                ind = 0;
                tableModel2.setRowCount(0);
                indi = 0;
                for (int i = 0; i < 20; i++) {
                    ret[i] = -1;
                    arr[i] = 0;
                }
                try {
                    MongoClient mongo = new MongoClient("localhost", 27017);
                    MongoDatabase dbl = mongo.getDatabase("bookstore");
                    MongoCollection<Document> coll = dbl.getCollection("books_list");
                    MongoCursor<Document> cur = coll.find().iterator();
                    int i=0;
                    while (cur.hasNext()) {
                        Document document = cur.next();
                        quantity[i]=Integer.parseInt(document.get("Qty").toString());
                        i++;
                    }
                    cur.close();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                jt1.getSelectionModel().clearSelection();
                pt.setText(String.valueOf(price));
                f3.setVisible(false);
                f1.setLayout(null);
                f1.setSize(500, 500);
                f1.getContentPane().setBackground(Color.PINK);
                f1.setVisible(true);
            }
        });

        home3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                ch = "";
                unt.setText("");
                pwt.setText("");
                t53.setText("");
                t54.setText("");
                t55.setText("");
                t56.setText("");
                tableModel1.setRowCount(0);
                index1 = 0;
                f5.setVisible(false);
                f1.setLayout(null);
                f1.setSize(500, 500);
                f1.getContentPane().setBackground(Color.PINK);
                f1.setVisible(true);
            }
        });
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String s = "";
                if (t53.getText().equals(s) || t54.getText().equals(s) || t55.getText().equals(s) || t56.getText().equals(s)) {
                    JOptionPane.showMessageDialog(f5, "Enter required details", "Alert", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    String[] details = new String[4];
                    details[0] = t53.getText();
                    details[1] = t54.getText();
                    details[2] = t55.getText();
                    details[3] = t56.getText();
                    entries[enin][0] = t53.getText();
                    entries[enin][1] = t54.getText();
                    entries[enin][2] = t55.getText();
                    entries[enin][3] = t56.getText();
                    enin++;
                    tableModel1.insertRow(index1, details);
                    index1++;
                    t53.setText("");
                    t54.setText("");
                    t55.setText("");
                    t56.setText("");
                }
            }
        });

        submit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try
                {
                    int flag=0;
                    MongoClient mongo = new MongoClient("localhost", 27017);
                    MongoDatabase dbl = mongo.getDatabase("bookstore");
                    MongoCollection<Document> coll = dbl.getCollection("books_list");
                    for(int j=0;j<enin;j++)
                    {
                        MongoCursor<Document> cur = coll.find().iterator();
                        while (cur.hasNext())
                        {
                            Document document = cur.next();
                            if(document.get("Book_Name").toString().equals(entries[j][0]))
                            {
                                String s = String.valueOf(Integer.parseInt(entries[j][3])+Integer.parseInt(document.get("Qty").toString()));
                                coll.updateOne(Filters.eq("Book_Name",entries[j][0]), Updates.set("Qty",s));
                                flag = 1;
                                break;
                            }
                        }
                        if(flag==0)
                        {
                            Document d1 = new Document("_id", new ObjectId()).append("Book_Name", entries[j][0]).append("Author", entries[j][1]).append("Price", entries[j][2]).append("Qty", entries[j][3]);
                            coll.insertOne(d1);
                        }
                        cur.close();
                    }
                    JOptionPane.showMessageDialog(f5, "Books added successfully", "Alert", JOptionPane.INFORMATION_MESSAGE);

                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                index1 = 0;
                enin = 0;
                ch = "";
                unt.setText("");
                pwt.setText("");
                t53.setText("");
                t54.setText("");
                t55.setText("");
                t56.setText("");
                tableModel1.setRowCount(0);
                index1 = 0;
                tableModel1.insertRow(index1, rowss);
                index1++;
                f5.setVisible(false);
                f1.setLayout(null);
                f1.setSize(500, 500);
                f1.getContentPane().setBackground(Color.PINK);
                f1.setVisible(true);
               // tableModel1.insertRow(index1, rowss);
                //index1++;
            }
        });

        breset.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                tableModel1.setRowCount(0);
                index1 = 0;
                enin = 0;
                tableModel1.insertRow(index1, rowss);
                index1++;
                try
                {
                    MongoClient mongo = new MongoClient("localhost", 27017);
                    MongoDatabase dbl = mongo.getDatabase("bookstore");
                    MongoCollection<Document> coll = dbl.getCollection("books_list");
                    MongoCursor<Document> cur = coll.find().iterator();
                    while (cur.hasNext())
                    {
                        Document document = cur.next();
                        String[] details = new String[4];
                        details[0] = document.get("Book_Name").toString();
                        details[1] = document.get("Author").toString();
                        details[2] = document.get("Price").toString();
                        details[3] = document.get("Qty").toString();
                        tableModel1.insertRow(index1,details);
                        index1++;
                    }
                    cur.close();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        });

        login1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (ch == "")
                    JOptionPane.showMessageDialog(f1, "Please select the type of user", "Alert", JOptionPane.INFORMATION_MESSAGE);
                else if (ch.equals("Admin"))
                {
                    try {
                        int flag= 0;
                        MongoClient mongo = new MongoClient("localhost",27017);
                        MongoDatabase dbl = mongo.getDatabase("bookstore");
                        MongoCollection<Document> coll = dbl.getCollection("adminlog");
                        MongoCursor<Document> cur= coll.find().iterator();
                        while(cur.hasNext())
                        {
                            Document document  = cur.next();
                            String u = document.get("Username").toString();
                            String p = document.get("Password").toString();
                            if(unt.getText().equals(u) && String.valueOf(pwt.getPassword()).equals(p))
                            {
                                contacttxt = document.get("Contact_No").toString();
                                nametxt = document.get("Name").toString();
                                t51.setText(nametxt);
                                t52.setText(contacttxt);
                                flag=1;
                            }
                        }
                        if(flag==1)
                        {
                            f1.setVisible(false);
                            f5.setSize(1000, 800);
                            f5.getContentPane().setBackground(color);
                            f5.setLayout(null);
                            f5.setVisible(true);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(f1, "Invalid UserName and Password", "Alert", JOptionPane.INFORMATION_MESSAGE);
                        }
                        cur.close();

                    }
                    catch(Exception e)
                    {
                        e.printStackTrace();
                    }
                    try {
                        tableModel1.insertRow(index1, rowss);
                        index1++;
                        MongoClient mongo = new MongoClient("localhost", 27017);
                        MongoDatabase dbl = mongo.getDatabase("bookstore");
                        MongoCollection<Document> coll = dbl.getCollection("books_list");
                        MongoCursor<Document> cur = coll.find().iterator();
                        while (cur.hasNext()) {
                            Document document = cur.next();
                            String[] details = new String[4];
                            details[0] = document.get("Book_Name").toString();
                            details[1] = document.get("Author").toString();
                            details[2] = document.get("Price").toString();
                            details[3] = document.get("Qty").toString();
                            tableModel1.insertRow(index1, details);
                            index1++;
                        }
                        cur.close();
                    }
                    catch(Exception e)
                    {
                        e.printStackTrace();
                    }
                }
                else if (ch.equals("Customer"))
                {
                    try {
                        int flag= 0;
                        MongoClient mongo = new MongoClient("localhost",27017);
                        MongoDatabase dbl = mongo.getDatabase("bookstore");
                        MongoCollection<Document> coll = dbl.getCollection("customerlog");
                        MongoCursor<Document> cur= coll.find().iterator();
                        while(cur.hasNext())
                        {
                            Document document  = cur.next();
                            String u = document.get("Username").toString();
                            String p = document.get("Password").toString();
                            if(unt.getText().equals(u) && String.valueOf(pwt.getPassword()).equals(p))
                            {
                                contacttxt = document.get("Contact_No").toString();
                                nametxt = document.get("Name").toString();
                                addresstxt = document.get("Address").toString();
                                namet1.setText(nametxt);
                                contactt1.setText(contacttxt);
                                at1.setText(addresstxt);
                                flag=1;
                            }
                        }
                        if(flag==1)
                        {
                            f1.setVisible(false);
                            f3.setLayout(null);
                            f3.setSize(1000, 800);
                            f3.getContentPane().setBackground(lightblue);
                            f3.setVisible(true);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(f1, "Invalid UserName and Password", "Alert", JOptionPane.INFORMATION_MESSAGE);
                        }
                        cur.close();
                    }
                    catch(Exception e)
                    {
                        e.printStackTrace();
                    }
                    try {
                        price =0;
                        tableModel.setRowCount(0);
                        ind = 0;
                        tableModel2.setRowCount(0);
                        indi = 0;
                        pt.setText("0");
                        for (int i = 0; i < 20; i++) {
                            ret[i] = -1;
                            arr[i] = 0;
                        }
                        MongoClient mongo = new MongoClient("localhost", 27017);
                        MongoDatabase dbl = mongo.getDatabase("bookstore");
                        MongoCollection<Document> coll = dbl.getCollection("books_list");
                        MongoCursor<Document> cur = coll.find().iterator();
                        while (cur.hasNext()) {
                            Document document = cur.next();
                            String[] details = new String[4];
                            details[0] = document.get("Book_Name").toString();
                            details[1] = document.get("Author").toString();
                            details[2] = document.get("Price").toString();
                            details[3] = document.get("Qty").toString();
                            tableModel2.insertRow(indi, details);
                            quantity[indi] = Integer.parseInt(details[3]);
                            p[indi] = Integer.parseInt(details[2]);
                            indi++;
                        }
                        cur.close();
                    }
                    catch(Exception e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        });

        signup1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                ch = "";
                f1.setVisible(false);
                f2.setLayout(null);
                f2.setSize(500, 500);
                f2.getContentPane().setBackground(lightyellow);
                f2.setVisible(true);
            }
        });

        chose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                ch = String.valueOf(chose.getSelectedItem());
            }
        });

        signup2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String s = "";
                if (unt1.getText().equals(s) || String.valueOf(pwt1.getPassword()).equals(s) || ct.getText().equals(s) || namet.getText().equals(s) || at.getText().equals(s)) {
                    JOptionPane.showMessageDialog(f2, "Please fill the required values", "Alert", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    try {
                        MongoClient mongo = new MongoClient("localhost",27017);
                        MongoDatabase dbl = mongo.getDatabase("bookstore");
                        MongoCollection<Document> coll = dbl.getCollection("customerlog");
                        String name = namet.getText();
                        String contact = ct.getText();
                        String address = at.getText();
                        String username = unt1.getText();
                        String password = String.valueOf(pwt1.getPassword());
                        Document d1= new Document("_id", new ObjectId()).append("Name",name).append("Contact_No",contact).append("Address",address).append("Username",username).append("Password",password);
                        coll.insertOne(d1);
                        MongoCursor<Document> cur= coll.find().iterator();
                        JOptionPane.showMessageDialog(f2, "Signup Successful", "Alert", JOptionPane.INFORMATION_MESSAGE);
                        f2.setVisible(false);
                        f1.setLayout(null);
                        f1.setSize(500, 500);
                        f1.getContentPane().setBackground(Color.PINK);
                        f1.setVisible(true);
                        cur.close();
                        ch = "";
                        unt.setText("");
                        pwt.setText("");
                        namet.setText("");
                        ct.setText("");
                        at.setText("");
                        unt1.setText("");
                        pwt1.setText("");
                    }
                    catch(Exception e)
                    {
                        e.printStackTrace();
                    }

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
    public static void main(String[] args) {
        // Press ⌥⏎ with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        /*System.out.printf("Hello and welcome!");

        // Press ⌃R or click the green arrow button in the gutter to run the code.
        try {
            MongoClient mongo = new MongoClient("localhost",27017);
            DB dbl = mongo.getDB("bookstore");
            DBCollection coll = dbl.getCollection("adminlog");
            //BasicDBObject d1 = new BasicDBObject("Name","Malya").append("Rollno",1);
            //coll.insert(d1);
            DBCursor cur = coll.find();
            while(cur.hasNext())
            {
                System.out.println(cur.next());
            }
            cur.close();
        }
        catch(Exception e)
        {
            //e.printStackTrace();
        }*/
        new Main();
    }
}