import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.time.Duration;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.text.PlainDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;

class limits extends PlainDocument
{
    private int l;
    limits(int l)
    {
        super();
        this.l = l;
    }

    public void insertString(int off,String s,AttributeSet a) throws BadLocationException
    {
        if(s==null)
        {
            return;
        }
        if((getLength()+s.length())<=l)
        {
            super.insertString(off,s,a);
        }
    }
}

class info
{
    String name;
    int age;
    char tower;
    int dd, mm;
    int ddr,mmr;
    int sumreport = 0;
    int sumrecover = 0;
    String datereport;
    String daterecover;

    public void setfunc()
    {
        this.sumreport = (this.mm)*100 + this.dd;
        this.sumrecover = (this.mmr)*100 + this.ddr;

        this.datereport = dd + "-" + mm + "-2020";
        this.daterecover = ddr + "-" + mmr + "-2020";
    }
}

public class COVIDcase
{
    public static void main(String args[])
    {
        info d[] = new info[20];
        for(int i=0;i<20;i++)
        {
            d[i] = new info();
        }

        int i = 0;
        {
            d[i].name = "Flora";
            d[i].age = 6;
            d[i].tower = 'A';
            d[i].dd = 1;
            d[i].mm = 4;
            d[i].ddr = 22;
            d[i].mmr = 4;
            d[i].setfunc();
            i++;
            d[i].name = "Denys";
            d[i].age = 24;
            d[i].tower = 'B';
            d[i].dd = 1;
            d[i].mm = 4;
            d[i].ddr = 22;
            d[i].mmr = 4;
            d[i].setfunc();
            i++;
            d[i].name = "Jim";
            d[i].age = 42;
            d[i].tower = 'C';
            d[i].dd = 18;
            d[i].mm = 5;
            d[i].ddr = 8;
            d[i].mmr = 6;
            d[i].setfunc();
            i++;
            d[i].name = "Hazel";
            d[i].age = 87;
            d[i].tower = 'D';
            d[i].dd = 23;
            d[i].mm = 6;
            d[i].ddr = 14;
            d[i].mmr = 7;
            d[i].setfunc();
            i++;
            d[i].name = "Caery";
            d[i].age = 72;
            d[i].tower = 'A';
            d[i].dd = 1;
            d[i].mm = 6;
            d[i].ddr = 22;
            d[i].mmr = 6;
            d[i].setfunc();
            i++;
            d[i].name = "David";
            d[i].age = 7;
            d[i].tower = 'B';
            d[i].dd = 14;
            d[i].mm = 6;
            d[i].ddr = 5;
            d[i].mmr = 7;
            d[i].setfunc();
            i++;
            d[i].name = "Kevim";
            d[i].age = 37;
            d[i].tower = 'D';
            d[i].dd = 5;
            d[i].mm = 6;
            d[i].ddr = 26;
            d[i].mmr = 6;
            d[i].setfunc();
            i++;
            d[i].name = "Tom";
            d[i].age = 67;
            d[i].tower = 'D';
            d[i].dd = 20;
            d[i].mm = 6;
            d[i].ddr = 11;
            d[i].mmr = 7;
            d[i].setfunc();
            i++;
            d[i].name = "Bob";
            d[i].age = 74;
            d[i].tower = 'A';
            d[i].dd = 4;
            d[i].mm = 7;
            d[i].ddr = 25;
            d[i].mmr = 7;
            d[i].setfunc();
            i++;
            d[i].name = "Rachel";
            d[i].age = 48;
            d[i].tower = 'C';
            d[i].dd = 24;
            d[i].mm = 7;
            d[i].ddr = 14;
            d[i].mmr = 8;
            d[i].setfunc();
            i++;
            d[i].name = "Thomas";
            d[i].age = 21;
            d[i].tower = 'C';
            d[i].dd = 11;
            d[i].mm = 6;
            d[i].ddr = 2;
            d[i].mmr = 7;
            d[i].setfunc();
            i++;
            d[i].name = "Mary";
            d[i].age = 17;
            d[i].tower = 'D';
            d[i].dd = 21;
            d[i].mm = 6;
            d[i].ddr = 12;
            d[i].mmr = 7;
            d[i].setfunc();
            i++;
            d[i].name = "Smith";
            d[i].age = 89;
            d[i].tower = 'A';
            d[i].dd = 7;
            d[i].mm = 8;
            d[i].ddr = 28;
            d[i].mmr = 8;
            d[i].setfunc();
            i++;
            d[i].name = "Pearson";
            d[i].age = 47;
            d[i].tower = 'B';
            d[i].dd = 4;
            d[i].mm = 6;
            d[i].ddr = 25;
            d[i].mmr = 6;
            d[i].setfunc();
            i++;
            d[i].name = "Anderson";
            d[i].age = 62;
            d[i].tower = 'B';
            d[i].dd = 27;
            d[i].mm = 7;
            d[i].ddr = 17;
            d[i].mmr = 8;
            d[i].setfunc();
            i++;
            d[i].name = "Johnson";
            d[i].age = 10;
            d[i].tower = 'D';
            d[i].dd = 1;
            d[i].mm = 8;
            d[i].ddr = 22;
            d[i].mmr = 8;
            d[i].setfunc();
            i++;
            d[i].name = "Robertz";
            d[i].age = 50;
            d[i].tower = 'A';
            d[i].dd = 9;
            d[i].mm = 8;
            d[i].ddr = 30;
            d[i].mmr = 8;
            d[i].setfunc();
            i++;
            d[i].name = "Julie";
            d[i].age = 86;
            d[i].tower = 'B';
            d[i].dd = 2;
            d[i].mm = 5;
            d[i].ddr = 23;
            d[i].mmr = 5;
            d[i].setfunc();
            i++;
            d[i].name = "Edith";
            d[i].age = 42;
            d[i].tower = 'D';
            d[i].dd = 7;
            d[i].mm = 6;
            d[i].ddr = 28;
            d[i].mmr = 6;
            d[i].setfunc();
            i++;
            d[i].name = "John";
            d[i].age = 95;
            d[i].tower = 'D';
            d[i].dd = 1;
            d[i].mm = 6;
            d[i].ddr = 22;
            d[i].mmr = 6;
            d[i].setfunc();
            i++;
        }

        Swing obj = new Swing(d);
    }
}

class Swing extends JFrame
{
    Swing(info d[])
    {
        JLabel jLabelhead = new JLabel("COVID Database");
        JTextField jd = new JTextField("",2);
        JTextField jm = new JTextField("",2);
        JTextField jy = new JTextField("2020",4);
        JCheckBox chkA = new JCheckBox();
        JCheckBox chkB = new JCheckBox();
        JCheckBox chkC = new JCheckBox();
        JCheckBox chkD = new JCheckBox();
        JButton btn = new JButton("SEARCH");
        JButton btn1 = new JButton("RESET");
        JLabel jLabeldt = new JLabel("DD / MM / YYYY");
        JLabel jLabelA = new JLabel("A");
        JLabel jLabelB = new JLabel("B");
        JLabel jLabelC = new JLabel("C");
        JLabel jLabelD = new JLabel("D");
        JPanel jp10 = new JPanel();
        JPanel jp11 = new JPanel();
        JPanel jp12 = new JPanel();
        JPanel jp13 = new JPanel();
        JPanel jp1 = new JPanel();
        JPanel jp15 = new JPanel();
        JPanel jp2 = new JPanel();
        JPanel jp2i = new JPanel();
        JPanel jp2ii = new JPanel();
        JPanel jp3 = new JPanel();
        JPanel jp3i = new JPanel();
        JPanel jp3ii = new JPanel();
        JPanel jp14 = new JPanel();
        JPanel jp4 = new JPanel();
        jp10.setLayout(new FlowLayout(FlowLayout.CENTER));
        jp11.setLayout(new FlowLayout(FlowLayout.CENTER));
        jp12.setLayout(new FlowLayout(FlowLayout.CENTER));
        jp13.setLayout(new FlowLayout(FlowLayout.CENTER));
        jp1.setLayout(new FlowLayout(FlowLayout.CENTER));
        jp15.setLayout(new FlowLayout(FlowLayout.CENTER));
        jp2.setLayout(new FlowLayout(FlowLayout.CENTER,50,0));
        jp2i.setLayout(new FlowLayout(FlowLayout.LEFT,2,0));
        jp2ii.setLayout(new FlowLayout(FlowLayout.RIGHT,10,0));
        jp3.setLayout(new FlowLayout(FlowLayout.CENTER,50,0));
        jp3i.setLayout(new FlowLayout(FlowLayout.LEFT));
        jp3ii.setLayout(new FlowLayout(FlowLayout.RIGHT,20,0));
        jp14.setLayout(new FlowLayout(FlowLayout.CENTER));
        jp4.setLayout(new FlowLayout(FlowLayout.CENTER));
        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(0,1));
        jp.add(jp10);
        jp.add(jp11);
        jp.add(jp12);
        jp.add(jp13);
        jp.add(jp1);
        jp.add(jp15);
        jp.add(jp2);
        jp.add(jp3);
        jp.add(jp14);
        jp.add(jp4);
        jp2.add(jp2i);
        jp2.add(jp2ii);
        jp3.add(jp3i);
        jp3.add(jp3ii);

        jLabelhead.setFont(new Font("Verdana", Font.PLAIN, 18));
        add(jp,BorderLayout.CENTER);
        jd.setHorizontalAlignment(SwingConstants.CENTER);
        jm.setHorizontalAlignment(SwingConstants.CENTER);
        jy.setHorizontalAlignment(SwingConstants.CENTER);
        jp1.add(jLabelhead);
        jp2i.add(jd);
        jd.setDocument(new limits(2));
        jp2i.add(jm);
        jm.setDocument(new limits(2));
        jp2i.add(jy);
        jy.setDocument(new limits(4));
        jy.setText("2020");
        jp2ii.add(chkA);
        jp2ii.add(chkB);
        jp2ii.add(chkC);
        jp2ii.add(chkD);
        jp3i.add(jLabeldt);
        jp3ii.add(jLabelA);
        jp3ii.add(jLabelB);
        jp3ii.add(jLabelC);
        jp3ii.add(jLabelD);
        jp4.add(btn);
        btn.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(!jy.getText().equals("2020"))
                {
                    JOptionPane.showMessageDialog(null, "Invalid Date input!\nDate should be from April, 2020 to August, 2020", "ERROR!", JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    int d1 = Integer.parseInt(jd.getText());
                    int m1 = Integer.parseInt(jm.getText());
                    int y1 = Integer.parseInt(jy.getText());
                    String s = jd.getText() + "-" + jm.getText() + "-" + jy.getText();
                    if(m1<4 || m1>8)
                    {
                        JOptionPane.showMessageDialog(null, "Invalid Date input!\nDate should be from April, 2020 to August, 2020", "ERROR!", JOptionPane.ERROR_MESSAGE);
                    }
                    else if(!chkA.isSelected() && !chkB.isSelected() && !chkC.isSelected() && !chkD.isSelected())
                    {
                        JOptionPane.showMessageDialog(null, "No Tower selected!", "ERROR!", JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                        int t = 0;
                        try
                        {
                            DateFormat some = new SimpleDateFormat("dd-MM-yyyy");
                            some.setLenient(false);
                            some.parse(s);
                        }catch(ParseException ee)
                        {
                            t = 1;
                            JOptionPane.showMessageDialog(null, "Invalid Date input!\nDate should be from April, 2020 to August, 2020", "ERROR!", JOptionPane.ERROR_MESSAGE);
                        }

                        if(t==0)
                        {
                            DefaultTableModel model = new DefaultTableModel();
                            JTable table = new JTable(model);
                            model.addColumn("NAME");
                            model.addColumn("AGE");
                            model.addColumn("TOWER");
                            model.addColumn("DATE OF REPORTING");
                            model.addColumn("DATE OF RECOVERY");
                            model.addColumn("STATUS OF COVID");
                            model.addRow(new Object[]{"NAME","AGE","TOWER","DATE OF REPORTING","DATE OF RECOVERY","COVID STATUS"});

                            int ar = 0;
                            int br = 0;
                            int cr = 0;
                            int dr = 0;
                            int aa = 0;
                            int ba = 0;
                            int ca = 0;
                            int da = 0;

                            int inputdate = (m1*100) + d1;

                            for(int i=0;i<20;i++)
                            {
                                /*Calendar chkdate = Calendar.getInstance();
                                Calendar chkdate2 = Calendar.getInstance();
                                String z = d[i].date.getDay() + "-" + d[i].date.getMonth() + "-" + d[i].date.getYear();
                                try
                                {
                                    chkdate.setTime(form.parse(z));
                                    chkdate2.setTime(form.parse(z));
                                }catch(ParseException ee)
                                {
                                }
                                chkdate2.add(Calendar.DAY_OF_MONTH, 21);*/

                                if(d[i].tower=='A')
                                {
                                    if(chkA.isSelected())
                                    {
                                        if(d[i].sumrecover<=inputdate)
                                        {
                                            ar++;
                                            model.addRow(new Object[]{d[i].name,d[i].age,d[i].tower,d[i].datereport,d[i].daterecover,"RECOVERED"});
                                        }
                                        else
                                        {
                                            if(d[i].sumreport>inputdate)
                                            {

                                            }
                                            else
                                            {
                                                aa++;
                                                model.addRow(new Object[]{d[i].name,d[i].age,d[i].tower,d[i].datereport,d[i].daterecover,"ACTIVE"});
                                            }
                                        }
                                    }
                                }
                                else if(d[i].tower=='B')
                                {
                                    if(chkB.isSelected())
                                    {
                                        if(d[i].sumrecover<=inputdate)
                                        {
                                            br++;
                                            model.addRow(new Object[]{d[i].name,d[i].age,d[i].tower,d[i].datereport,d[i].daterecover,"RECOVERED"});
                                        }
                                        else
                                        {
                                            if(d[i].sumreport>inputdate)
                                            {

                                            }
                                            else
                                            {
                                                ba++;
                                                model.addRow(new Object[]{d[i].name,d[i].age,d[i].tower,d[i].datereport,d[i].daterecover,"ACTIVE"});
                                            }
                                        }
                                    }
                                }
                                else if(d[i].tower=='C')
                                {
                                    if(chkC.isSelected())
                                    {
                                        if(d[i].sumrecover<=inputdate)
                                        {
                                            cr++;
                                            model.addRow(new Object[]{d[i].name,d[i].age,d[i].tower,d[i].datereport,d[i].daterecover,"RECOVERED"});
                                        }
                                        else
                                        {
                                            if(d[i].sumreport>inputdate)
                                            {

                                            }
                                            else
                                            {
                                                ca++;
                                                model.addRow(new Object[]{d[i].name,d[i].age,d[i].tower,d[i].datereport,d[i].daterecover,"ACTIVE"});
                                            }
                                        }
                                    }
                                }
                                else if(d[i].tower=='D')
                                {
                                    if(chkD.isSelected())
                                    {
                                        if(d[i].sumrecover<=inputdate)
                                        {
                                            dr++;
                                            model.addRow(new Object[]{d[i].name,d[i].age,d[i].tower,d[i].datereport,d[i].daterecover,"RECOVERED"});
                                        }
                                        else
                                        {
                                            if(d[i].sumreport>inputdate)
                                            {

                                            }
                                            else
                                            {
                                                da++;
                                                model.addRow(new Object[]{d[i].name,d[i].age,d[i].tower,d[i].datereport,d[i].daterecover,"ACTIVE"});
                                            }
                                        }
                                    }
                                }
                            }
                            boolean a = chkA.isSelected();
                            boolean b = chkB.isSelected();
                            boolean c = chkC.isSelected();
                            boolean d = chkD.isSelected();
                            Swing2 obj2 = new Swing2(table,ar,br,cr,dr,aa,ba,ca,da,a,b,c,d,d1,m1);
                        }
                    }
                }
            }
        });
        jp4.add(btn1);
        btn1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                jd.setText("");
                jm.setText("");
                jy.setText("2020");
                chkA.setSelected(false);
                chkB.setSelected(false);
                chkC.setSelected(false);
                chkD.setSelected(false);
            }
        });

        setTitle("COVID Database");
        FlowLayout fl = new FlowLayout(FlowLayout.CENTER,50,20);
        setLayout(fl);
        setVisible(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class Swing2 extends JFrame
{
    Swing2(JTable table,int ar,int br,int cr,int dr,int aa,int ba,int ca,int da,boolean a,boolean b,boolean c,boolean d,int d1,int m1)
    {
        JLabel jLabelhead = new JLabel("COVID Results for " + d1 + "-" + m1 + "-2020",JLabel.CENTER);
        JLabel jLabela = new JLabel("TOWER A ->     Active cases: " + aa + "   Recovered cases: " + ar,JLabel.CENTER);
        JLabel jLabelb = new JLabel("TOWER B ->     Active cases: " + ba + "   Recovered cases: " + br,JLabel.CENTER);
        JLabel jLabelc = new JLabel("TOWER C ->     Active cases: " + ca + "   Recovered cases: " + cr,JLabel.CENTER);
        JLabel jLabeld = new JLabel("TOWER D ->     Active cases: " + da + "   Recovered cases: " + dr,JLabel.CENTER);
        JPanel jp = new JPanel();
        JPanel jp1 = new JPanel();
        jp1.setLayout(new FlowLayout(FlowLayout.CENTER,40,50));
        jp.setLayout(new GridLayout(0,1));

        add(jp);
        jLabelhead.setFont(new Font("Verdana", Font.PLAIN, 22));
        jp.add(jLabelhead);
        for(int r=0;r<6;r++)
        {
            DefaultTableCellRenderer Renderer = new DefaultTableCellRenderer();
            Renderer.setHorizontalAlignment(JLabel.CENTER);
            table.getColumnModel().getColumn(r).setCellRenderer(Renderer);
        }
        table.setBorder(BorderFactory.createCompoundBorder());
        table.getColumnModel().getColumn(5).setMinWidth(200);
        table.getColumnModel().getColumn(4).setMinWidth(200);
        table.getColumnModel().getColumn(3).setMinWidth(200);
        jp.add(table);
        jp.add(jp1);
        if(a)
        {
            jp1.add(jLabela);
        }
        if(b)
        {
            jp1.add(jLabelb);
        }
        if(c)
        {
            jp1.add(jLabelc);
        }
        if(d)
        {
            jp1.add(jLabeld);
        }

        setTitle("COVID Results");
        FlowLayout fl = new FlowLayout(FlowLayout.CENTER,50,20);
        setLayout(fl);
        setVisible(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
}