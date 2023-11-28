
import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame f=new JFrame();
        String courses[] = {"core java","advance java","java servlet"};
        JComboBox c = new JComboBox(courses);
        c.setBounds(40,40,90,20);
        f.add(c);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true); 

    }
}
