import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MainFrame2 extends JFrame{
    private JButton jb1 =new JButton("Generate");
    private JButton jb2 =new JButton("Exit");
    private Container cp;
    private JPanel jp1 =new JPanel(new GridLayout(1,6,3,3));
    private JPanel jp2 =new JPanel(new GridLayout(1,2,3,3));
    private JLabel jl []= new JLabel[6];
    private Random ra =new Random();

    public MainFrame2 (){
        init();
    }
    public void init(){
        this.setBounds(100,100,500,200);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp = this.getContentPane();
        cp.add(jp1,BorderLayout.CENTER);
        cp.add(jp2,BorderLayout.SOUTH);
        jp2.add(jb1);
        jp2.add(jb2);


        for (int i=0;i<6;i++) {
            jl[i] = new JLabel();
            jl[i].setOpaque(true);
            jl[i].setBackground(new Color(84, 182, 255));
            jp1.add(jl[i]);
        }
            jb1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int[] b= new int[6];
                    for (int i =0;i<6;i++){
                        b[i]=ra.nextInt(49)+1;
                        for (int j=0;j<i;j++){
                            if (b[i]==b[j]){
                                i--;

                            }
                        }
                        jl[i].setText(Integer.toString(b[i]));
                        jl[i].setFont(new Font(null,Font.BOLD ,40));

                    }
                }
            });
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        }
    }


