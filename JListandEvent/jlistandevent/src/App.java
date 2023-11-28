import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.event.*;

public class App implements ActionListener {
    JFrame f;
    JList<String> list1;
    JLabel label;
    JButton b;

    App(){
        f=new JFrame();
        label =new JLabel();
        label.setSize(500,100);
        b=new JButton("show");

        b.setBounds(200,150,80,30);
        String[] l1 = new String[]{"Java","C","C++"};
        list1 = new JList<>(l1);
        list1.setBounds(100, 100, 75, 75);

        f.add(list1); f.add(b); f.add(label);
        f.setSize(450,450);
        f.setLayout(null);
        f.setVisible(true);
        b.addActionListener(this);

    }
   public void actionPerformed(ActionEvent e){
       label.setText("your selected item: "+list1.getSelectedValue());
        }
       public static void main(String[] args) {
        
        new App();
       
    }
}
