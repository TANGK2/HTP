package GUI;

import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class SurFace extends JFrame implements ActionListener{
    JLabel jl1,jl2,jl3;
    JLabel label;
    JTextField jtf;
    JPasswordField jpf;
    JButton jb1,jb2,jb3;
    ImageIcon background;
    JPanel jp1,jp2,jp3;
    JPanel myPanel;

    public void init(){

        jl1=new JLabel("Account:");
        jl2=new JLabel("Password:");
        jtf=new JTextField(16);
        jpf=new JPasswordField(16);
        jb1=new JButton("Login");
        jb2=new JButton("Cancel");
        jb3=new JButton("Delete");

        jp1=new JPanel();
        jp2=new JPanel();
        jp3=new JPanel();


        background = new ImageIcon(this.getClass().getResource("000.jpg"));
        label = new JLabel(background);
        label.setBounds(0, 0, background.getIconWidth(), background.getIconHeight());
        myPanel = (JPanel)this.getContentPane();
        myPanel.setOpaque(false);
        myPanel.setLayout(new FlowLayout());
        this.getLayeredPane().setLayout(null);
        jp1.add(jl1);
        jp1.add(jtf);
        jp2.add(jl2);
        jp2.add(jpf);
        jp3.add(jb1);
        jp3.add(jb2);
        jp3.add(jb3);


        myPanel.add(jp1);
        myPanel.add(jp2);
        myPanel.add(jp3);


        this.getLayeredPane().add(label,new Integer(Integer.MIN_VALUE));


        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);

        this.setTitle("Please sign in");
        this.setSize(600,500);
        this.setLocation(250,150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new SurFace().init();
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==jb1) {
            String name="150075";
            String psw="00000";

            String j1=jtf.getText();
            String p1=jpf.getText();

            if(name.equals(j1)&&psw.equals(p1)) {
                new ASS01().init2();
            }else {
                JOptionPane.showMessageDialog(this, "Login failed");
            }

        }else if(e.getSource()==jb2) {
            this.setVisible(false);

        }else if(e.getSource()==jb3) {
            jtf.setText(null);
            jpf.setText(null);

        }

    }
}


class ASS01 extends JFrame {

    JPanel p1;
    JLabel jl1;
    JLabel jl2;
    JLabel jl3;
    JLabel jl4;
    JLabel jl5;
    JLabel jl6;
    JButton jb1;
    JButton jb2;
    JButton jb3;
    JButton jb4;
    JButton jb5;


    public void init2(){

        this.setTitle("animation characters");
        this.setVisible(true);
        this.setBounds(100,10,1460,900);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//can close in the window
        //this.setExtendedState(MAXIMIZED_BOTH);


        Container container=this.getContentPane();
        container.setLayout(null);



        jl1=new JLabel("<html>Welcome to animation world<br>Click button can get character information <html>");
        jl1.setSize(400,450);
        jl1.setLocation(0,0);
        jl1.setFont(new Font("Arial",Font.BOLD,20));



        jl2=new JLabel();
        jl2.setSize(550,450);
        jl2.setLocation(401,0);
        jb1=new JButton("View Information");
        jb1.setSize(160,30);
        jl2.add(jb1);
        jl2.setIcon(new ImageIcon(this.getClass().getResource("001.jpg")));
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GUI.MyDialog1();
            }
        });

        jl3=new JLabel();
        jl3.setBounds(951,0,550,450);
        jb2=new JButton("View Information");
        jb2.setSize(160,30);
        jl3.add(jb2);
        jl3.setIcon(new ImageIcon(this.getClass().getResource("002.jpg")));
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { new GUI.MyDialog2(); }
        });

        jl4=new JLabel();
        jl4.setBounds(0,451,500,450);
        jb3=new JButton("View Information");
        jb3.setSize(160,30);
        jl4.add(jb3);
        jl4.setIcon(new ImageIcon(this.getClass().getResource("003.jpg")));
        jb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GUI.MyDialog3();
            }
        });

        jl5=new JLabel();
        jl5.setBounds(501,451,500,450);
        jb4=new JButton("ADD NEW CHARACTER");
        jb4.setSize(160,30);
        jl5.add(jb4);
        jl5.setIcon(new ImageIcon(this.getClass().getResource("004.jpg")));
        jb4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GUI.addnew();
            }
        });

        jl6=new JLabel();
        jl6.setBounds(1001,451,500,450);
        jb5=new JButton("Enter the mysterious world");
        jb5.setSize(160,30);
        jl6.add(jb5);
        jl6.setIcon(new ImageIcon(this.getClass().getResource("005.jpg")));
        jb5.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    new GUI.frame(paramString());
                }

        });


        container.add(jl1);
        container.add(jl2);
        container.add(jl3);
        container.add(jl4);
        container.add(jl5);
        container.add(jl6);


    }
}


class MyDialog1 extends JDialog {
    public MyDialog1() {
        this.setVisible(true);
        this.setBounds(400, 50, 300, 300);
        Container container = this.getContentPane();
        container.setLayout(null);
        JLabel jLabel1 = new JLabel("<html>Name:(ごじょうさとる)<br>Appearance anime:Jujutsu Kaisen<br>Height:190 cm<br>Age:28<br>Description:Described by the author as a man who is \"perfect in everything but character.\" The character is wanton, and he hates \"orthodoxy\".<html>");
        jLabel1.setFont(new Font("Arial",Font.BOLD,14));
        jLabel1.setBounds(0, 0, 300, 300);
        JButton jbdia1= new JButton("MORE PICTURE");
        jbdia1.setSize(160,30);
        jLabel1.add(jbdia1);
        jbdia1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GUI.MyDialog6();
            }
        });
        container.add(jLabel1);
    }
}
class MyDialog6 extends JDialog {
    public MyDialog6() {
        this.setVisible(true);
        this.setBounds(100, 150, 800, 800);
        Container container = this.getContentPane();
        container.setLayout(null);
        JLabel jLabel = new JLabel();
        jLabel.setIcon(new ImageIcon(this.getClass().getResource("006.jpg")));
        jLabel.setBounds(0, 0, 800, 800);
        container.add(jLabel);
    }
}

class MyDialog2 extends JDialog {
    public MyDialog2() {
        this.setVisible(true);
        this.setBounds(901, 50, 500, 500);
        Container container = this.getContentPane();
        container.setLayout(null);
        JLabel jLabel2 = new JLabel("<html>Name:(桜島 麻衣)<br>Appearance anime:Rascal Does Not Dream of Bunny Girl Senpai<br>Height:165 cm<br>Age:19<br>Description:A third-year student at Minehara High School. She was active as a child star and became popular after she became an actress. However, he suddenly stopped performing arts two years ago, and now he is living the life of an ordinary high school student.<html>");
        jLabel2.setFont(new Font("Arial",Font.BOLD,14));
        jLabel2.setBounds(0, 0, 500, 500);
        JButton jbdia2= new JButton("MORE PICTURE");
        jbdia2.setSize(160,30);
        jLabel2.add(jbdia2);
        jbdia2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GUI.MyDialog7();
            }
        });
        container.add(jLabel2);
    }
}

class MyDialog7 extends JDialog {
    public MyDialog7() {
        this.setVisible(true);
        this.setBounds(100, 150, 800, 800);
        Container container = this.getContentPane();
        container.setLayout(null);
        JLabel jLabel = new JLabel();
        jLabel.setIcon(new ImageIcon(this.getClass().getResource("007.jpg")));
        jLabel.setBounds(0, 0, 800, 800);
        container.add(jLabel);
    }
}
class MyDialog3 extends JDialog {
    public MyDialog3() {
        this.setVisible(true);
        this.setBounds(0, 451, 400, 400);
        Container container = this.getContentPane();
        container.setLayout(null);
        JLabel jLabel3 = new JLabel("<html>Name:(上杉えりい)<br>Appearance anime:Dargon II<br>Height:172 cm<br>Age:22<br>Description:The identity is the head of the Uesugi family of three of the eight Sheqi clans, and the actual identity is the mixed-race embryo with the personal genetic blood of the former Shadow Emperor Uesugue, and has a word spirit named Judgment (serial number 111).<html>");
        jLabel3.setFont(new Font("Arial",Font.BOLD,14));
        jLabel3.setBounds(0, 0, 400, 400);
        JButton jbdia3= new JButton("MORE PICTURE");
        jbdia3.setSize(160,30);
        jLabel3.add(jbdia3);
        jbdia3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GUI.MyDialog8();
            }
        });
        container.add(jLabel3);
    }
}
class MyDialog8 extends JDialog {
    public MyDialog8() {
        this.setVisible(true);
        this.setBounds(100, 150, 800, 800);
        Container container = this.getContentPane();
        container.setLayout(null);
        JLabel jLabel = new JLabel();
        jLabel.setIcon(new ImageIcon(this.getClass().getResource("008.jpg")));
        jLabel.setBounds(0, 0, 800, 800);
        container.add(jLabel);
    }
}

class addnew extends JFrame{

    public  addnew(){
        JTextArea jt2=new JTextArea();
        this.setVisible(true);
        this.setBounds(501, 451, 800, 800);
        JPanel jp1 = new JPanel();
        JButton jb14=new JButton("ADD NEW CHARECTER");
        jb14.setSize(160,30);
        JButton jb15=new JButton("ADD INFORMATION");
        jb15.setSize(160,30);
        JButton jb16=new JButton("ADD CHARACTER BACKGROUND");
        jb15.setSize(160,30);
        JTextField jtf1=new JTextField(25);
        JTextField jtf2=new JTextField(25);
        JTextField jtf3=new JTextField(25);
        JLabel jla1=new JLabel("Please enter character name");
        JLabel jla2=new JLabel("Please enter character height");

        JLabel jla3=new JLabel("Please enter character age");

        jp1.add(jla1);
        jp1.add(jtf1);
        jp1.add(jb14);

        jp1.add(jla2);
        jp1.add(jtf2);


        jp1.add(jla3);
        jp1.add(jtf3);
        jp1.add(jb15);
        jp1.add(jt2);
        jp1.add(jb16);
        this.add(jp1);
        jb14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String j3=jtf1.getText();
                setTitle("This is "+ j3 +" page.");
            }
        });
        jb15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String j4=jtf1.getText();
                String j5=jtf2.getText();
                String j6=jtf3.getText();
                jt2.append("Name:"+j4+"\r\n\"Height:"+j5+"\r\n\""+"Age:"+j6);
            }
        });
        jb16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GUI.MenuBarDemo();
            }
        });
    }


}


class frame extends JFrame implements ActionListener{
    JLabel l2;
    JRadioButton r1,r2,r3;
    Box b2;
    ButtonGroup bg;
    Container contentPane;
    JScrollPane js;
    JTextArea jt;
    public frame(String name) {

        contentPane = getContentPane();
        this.setTitle("Welcome to the realm of mysterious characters");

        setBounds(901,451,600, 600);
        setVisible(true);
        JPanel p1=new JPanel();
        jt=new JTextArea();
        js=new JScrollPane(jt);
        contentPane.add(p1,BorderLayout.NORTH);
        contentPane.add(js,BorderLayout.CENTER);
        p1.setLayout(new GridLayout(1, 1));


        l2=new JLabel("Please choose a mysterious character");
        bg=new ButtonGroup();
        r1=new JRadioButton("Role 1");
        r2=new JRadioButton("Role 2");
        bg.add(r1);
        bg.add(r2);
        b2=Box.createHorizontalBox();
        b2.add(l2);
        b2.add(Box.createHorizontalStrut(40));
        b2.add(r1);
        b2.add(Box.createHorizontalStrut(40));
        b2.add(r2);
        p1.add(b2);
        r1.addActionListener(this);
        r2.addActionListener(this);
        validate();

    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==r1) {
            jt.append("The mystery character is:"+"\r\n"+"Name:Goblin" + "\r\n" + "Height:100 cm" + "\r\n" + "Personality: Greedy, violent"+"\r\n"+"-------------------------------------------------------------------------"+"\r\n");
            new GUI.MyDialog10();
        }
        if(e.getSource()==r2) {
            jt.append("The mystery character is:"+"\r\n"+"Name:Freedom Gundam" + "\r\n" + "Height:18 m" + "\r\n" + "Personality: Advanced Assault Combat Gundam"+"\r\n"+"-------------------------------------------------------------------------"+"\r\n");
            new GUI.MyDialog11();
        }
    }

}
class MyDialog10 extends JDialog {
    public MyDialog10() {
        this.setVisible(true);
        this.setBounds(100, 150, 800, 800);
        Container container = this.getContentPane();
        container.setLayout(null);
        JLabel jLabel = new JLabel();
        jLabel.setIcon(new ImageIcon(this.getClass().getResource("010.jpg")));
        jLabel.setBounds(0, 0, 800, 800);
        container.add(jLabel);
    }
}
class MyDialog11 extends JDialog {
    public MyDialog11() {
        this.setVisible(true);
        this.setBounds(100, 150, 800, 800);
        Container container = this.getContentPane();
        container.setLayout(null);
        JLabel jLabel = new JLabel();
        jLabel.setIcon(new ImageIcon(this.getClass().getResource("011.jpg")));
        jLabel.setBounds(0, 0, 800, 800);
        container.add(jLabel);
    }
}


 class MenuBarDemo {
    private Frame frame;
    private MenuBar menuBar;
    private Menu menu;
    private Menu subMenu;
    private MenuItem menuItem,openFileBtn;
    private FileDialog openFile;
    private TextArea ta;
    public MenuBarDemo() {
        init();
        addEvents();
    }

    public void init() {
        frame = new Frame("Character background");
        frame.setBounds(501, 451, 800, 800);

        menuBar = new MenuBar();

        menu = new Menu("Choose background");

        openFileBtn=new MenuItem("CHOOOSE TXTX FILE");
        menuItem = new MenuItem("EXIT");

        menu.add(openFileBtn);
        menu.add(menuItem);

        menuBar.add(menu);
        frame.setMenuBar(menuBar);

        ta=new TextArea();
        frame.add(ta);

        frame.setVisible(true);

    }

    public void addEvents(){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.setVisible(false);
            }
        });

        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
            }
        });


        openFileBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openFile=new FileDialog(frame, "Choose file", FileDialog.LOAD);
                openFile.setVisible(true);
                String dirName=openFile.getDirectory();
                String fileName=openFile.getFile();
                System.out.println(dirName);


                if(dirName==null || fileName==null){
                    return;
                }
                File file=new File(dirName,fileName);
                try {
                    BufferedReader br=new BufferedReader(new FileReader(file));
                    String line;
                    StringBuilder text = new StringBuilder();
                    while((line=br.readLine()) != null){
                        text.append(line);
                        text.append("\r\n");
                    }
                    ta.setText(text.toString());
                } catch (Exception e1) {
                    e1.printStackTrace();
                }

            }
        });
    }
}