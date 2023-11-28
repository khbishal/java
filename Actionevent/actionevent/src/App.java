import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.*;

public class App implements ActionListener {
    JTextField tf;
    JButton b;
    App(){
        JFrame f=new JFrame();
        tf=new JTextField();
        tf.setBounds(50,50,150,20);
        b=new JButton("Click here");
        b.setBounds(50,100,60,30);

        b.addActionListener(this);
        f.add(b);
        f.add(tf);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionperformed(ActionEvent e){
        tf.setText("Hello World");
    }
    public static void main(String[] args) throws Exception {
        new App();
    }
}
