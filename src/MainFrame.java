import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    private boolean flag =true;
    private JButton jbtn1 = new JButton("RUN");
    private JButton jbtn2 = new JButton("REST");
    private JButton jbtn3 = new JButton("EXIT");
    private Container cp;
    private JPanel jpnc =new JPanel(new GridLayout(3,3,3,3));
    private JPanel jpnr= new JPanel(new GridLayout(3,1,3,3));
    private JButton Jbtn [][]=new JButton[3][3];

    public MainFrame(){
        init();
    }
    private void init(){
        this.setBounds(100,100,600,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp = this.getContentPane();
        cp.setLayout(new BorderLayout(3,3));
        cp.add(jpnc,BorderLayout.CENTER);
        cp.add(jpnr,BorderLayout.EAST);
        jpnc.setLayout(new GridLayout(3,3,3,3));
        jpnr.add(jbtn1);
        jpnr.add(jbtn2);
        jpnr.add(jbtn3);
        setVisible(true);
        for (int i =0;i<3;i++){
            for (int j=0;j<3;j++){
                Jbtn[i][j]=new JButton();
                Jbtn[i][j].setBackground(new Color(84, 182, 255));
                Jbtn[i][j].setFont(new Font(null,Font.BOLD ,72));
                Jbtn[i][j].setEnabled(false);
                jpnc.add(Jbtn[i][j]);
                Jbtn[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JButton tmp=(JButton)e.getSource();
                        tmp.setBackground(new Color(255, 250, 88));
                        if (tmp.getText().equals("")){
                            if (flag){
                                tmp.setText("o");
                            }
                            else {
                                tmp.setText("x");
                            }
                            flag=!flag;
                        }
                        checkStat();
                    }
                });
            }
        }
        jbtn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i =0;i<3;i++){
                    for (int j=0;j<3;j++){
                        Jbtn[i][j].setEnabled(true);
                    }
                }
            }
        });
        jbtn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i=0;i<3;i++){
                    for (int j=0;j<3;j++){
                        Jbtn[i][j].setText("");
                        Jbtn[i][j].setEnabled(false);
                        Jbtn[i][j].setBackground(new Color(84, 182, 255));

                    }
                }
            }
        });
        jbtn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
    private void checkStat(){
        if(Jbtn[0][0].getText().equals(Jbtn[0][1].getText()) && Jbtn[0][0].getText().equals(Jbtn[0][2].getText())&&Jbtn[0][0].getText()!=""){
            JOptionPane.showMessageDialog(MainFrame.this,Jbtn[0][0].getText()+"Win");
        }
if(Jbtn[1][0].getText().equals(Jbtn[1][1].getText()) && Jbtn[1][0].getText().equals(Jbtn[1][2].getText())&&Jbtn[1][0].getText()!=""){
            JOptionPane.showMessageDialog(MainFrame.this,Jbtn[1][0].getText()+"Win");
        }
if(Jbtn[2][0].getText().equals(Jbtn[2][1].getText()) && Jbtn[2][0].getText().equals(Jbtn[2][2].getText())&&Jbtn[2][0].getText()!=""){
            JOptionPane.showMessageDialog(MainFrame.this,Jbtn[2][0].getText()+"Win");
        }
if(Jbtn[0][0].getText().equals(Jbtn[1][0].getText()) && Jbtn[0][0].getText().equals(Jbtn[2][0].getText())&&Jbtn[0][0].getText()!=""){
            JOptionPane.showMessageDialog(MainFrame.this,Jbtn[0][0].getText()+"Win");
        }
if(Jbtn[0][1].getText().equals(Jbtn[1][1].getText()) && Jbtn[0][1].getText().equals(Jbtn[2][1].getText())&&Jbtn[0][1].getText()!=""){
            JOptionPane.showMessageDialog(MainFrame.this,Jbtn[0][1].getText()+"Win");
        }
if(Jbtn[0][2].getText().equals(Jbtn[1][2].getText()) && Jbtn[0][2].getText().equals(Jbtn[2][2].getText())&&Jbtn[0][2].getText()!=""){
            JOptionPane.showMessageDialog(MainFrame.this,Jbtn[0][2].getText()+"Win");
        }
if(Jbtn[0][0].getText().equals(Jbtn[1][1].getText()) && Jbtn[0][0].getText().equals(Jbtn[2][2].getText())&&Jbtn[0][0].getText()!=""){
            JOptionPane.showMessageDialog(MainFrame.this,Jbtn[0][0].getText()+"Win");
        }
if(Jbtn[0][2].getText().equals(Jbtn[1][1].getText()) && Jbtn[0][2].getText().equals(Jbtn[2][0].getText())&&Jbtn[0][2].getText()!=""){
            JOptionPane.showMessageDialog(MainFrame.this,Jbtn[0][2].getText()+"Win");
        }
    }
}
