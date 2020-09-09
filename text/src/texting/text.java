package texting;

import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import java.io.*;
import java.util.Scanner;
import javax.swing.Action;


/*public class text extends Frame implements ActionListener
{
    protected final static int MUM_ACCOUNTS=8;
    private final static int WASTE_TIME=1;
    private int accounts[]=new int[MUM_ACCOUNTS];
    private Customer customer[]=new Customer[MUM_ACCOUNTS];
    private int counter=0;
    private Label status=new Label("Transfers Complete:0");
    private TextArea display=new TextArea();
    Button show=new Button("Show Accounts");
    Button start=new Button("Restart");
    Button stop=new Button("Stop");
    Button file=new Button("openFile");

    public text()
    {
        super("Mystery Money");
        Panel buttons=new Panel();
        buttons.setLayout(new FlowLayout());
        buttons.add(show);show.addActionListener(this);
        buttons.add(start);start.addActionListener(this);
        buttons.add(stop);stop.addActionListener(this);
        buttons.add(file);file.addActionListener(this);
        setLayout(new BorderLayout());
        add("North",status);add("South",buttons);add("Center",display);
        for(int i=0;i<accounts.length;i++)accounts[i]=100000;
        start();
        validate();setSize(300,300);setVisible(true);
        addWindowListener(new WindowCloser());
    }
    public class WindowCloser extends WindowAdapter
    {
        public void windowClosing(WindowEvent we)
        {System.exit(0);}
    }
    private void start()
    {
        stop();
        for(int i=0;i<accounts.length;i++)
            customer[i]=new Customer(i,this);
    }
    private void stop()
    {
        for(int i=0;i<accounts.length;i++)if(customer[i]!=null)customer[i].halt();
    }
    public synchronized void transfer(int from,int into,int amount)
    {
        if((accounts[from]>=amount)&&(from!=into))
        {
            int newAmountFrom=accounts[from]-amount;
            int newAmountTo=accounts[into]+amount;
            accounts[from]=newAmountFrom;
            accounts[into]=newAmountTo;
            status.setText("Transfers completed:"+counter++);
        }
    }
    public void openFile() throws IOException
    {
        PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter("shiyishi.dat")));
        FileDialog it=new FileDialog(this,"OPENFILE",FileDialog.LOAD);
        it.setVisible(true);
    }
    private void wasteSomeTime ()
    {
        try {
            Thread.sleep(WASTE_TIME);
        }catch (InterruptedException ie)
        {
            System.err.println("Error:"+ie);
        }
    }
    private  synchronized void showAccounts()
    {
        int sum=0;
        for(int i=0;i<accounts.length;i++)
        {
            sum+=accounts[i];
            display.append("\nAccount"+i+":$"+accounts[i]);
        }
        display.append("\nTotal Amount:    $"+sum);
        display.append("\nTotal Transfers:"+counter+"\n");
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==show)
            showAccounts();
        else if(ae.getSource()==start)
            start();
        else if(ae.getSource()==stop)
            stop();
        else if(ae.getSource()==file)
        {
            try{
                openFile();
            }catch (IOException ioe)
            {
                System.err.println(ioe);
            }
        }
    }
    public static void main(String args[])
    {
        text t=new text();
    }
}*/

public class text{
    public static void swap(Integer a[])
    {
        Integer t=0;
        t=a[0];
        a[0]=a[1];
        a[1]=t;
    }
    public static void main(String args[])
    {
        Integer a[]=new Integer[2];
        Scanner sca =new Scanner(System.in);
        a[0]=sca.nextInt();
        a[1]=sca.nextInt();
        swap(a);
        System.out.println(a[0]+" "+a[1]);
    }
}