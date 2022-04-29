package javaswinglogin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JavaSwingLogin implements ActionListener{

    static JTextField nameTxt;
    static JLabel label;
    static JLabel pasLabel;
    static JPasswordField passTxt;
    static JButton button;
    static JLabel success;
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String name = nameTxt.getText();
        String pass = passTxt.getText();
//        System.out.println(name + " " + pass);
        
        if(name.equals("alex") && pass.equals("fluffy"))
        {
            success.setText("Login successfull!");
        }
        else {
            success.setText("");
        }
    }

    public static void main(String[] args) {
        
                
        JPanel panel = new JPanel();        
        
        //frame
        JFrame frame = new JFrame();
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);
        
        //labels and text fields
        label = new JLabel("Name");
        label.setBounds(10, 20, 80, 25);
        panel.add(label);
        
        nameTxt = new JTextField(20);
        nameTxt.setBounds(100, 20, 165, 25);
        panel.add(nameTxt);
        
        pasLabel = new JLabel("Password");
        pasLabel.setBounds(10, 50, 80, 25);
        panel.add(pasLabel);
        
        passTxt = new JPasswordField();
        passTxt.setBounds(100, 50, 165, 25);
        panel.add(passTxt);
        
        //buttons
        button = new JButton("Login");
        button.setBounds(10,80, 80,25);
        panel.add(button);
        
        //label to show if valid
        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);
        
        button.addActionListener(new JavaSwingLogin());
        success.setText("");
        
        
        frame.setVisible(true);
        
    }
    
}
