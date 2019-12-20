/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Abdul Qodir
 */
public class Login extends JFrame {

    JLabel user = new JLabel("Username");
    JLabel pass = new JLabel("Password");
    JTextField usertf = new JTextField();
    JPasswordField passtf = new JPasswordField();
    JButton login = new JButton("Login");

    public Login() {
        user.setBounds(20, 20, 100, 30);
        add(user);
        pass.setBounds(20, 100, 100, 30);
        add(pass);
        usertf.setBounds(20, 60, 100, 30);
        add(usertf);
        passtf.setBounds(20, 140, 100, 30);
        add(passtf);
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user1 = usertf.getText();
                String pass1 = passtf.getText();
                if (user1.equals("admin") && pass1.equals("123")) {
                    Gui x = new Gui();
                    x.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Wrong Password / Username");
                    usertf.setText("");
                    passtf.setText("");
                    usertf.requestFocus();
                }
            }
        });
        login.setBounds(20, 180, 100, 30);
        add(login);
        setTitle("Login");
        setSize(400, 350);
        setForeground(Color.RED);
        setBackground(Color.yellow);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
