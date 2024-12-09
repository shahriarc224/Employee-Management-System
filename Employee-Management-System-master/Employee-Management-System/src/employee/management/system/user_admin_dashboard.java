import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class user_admin_dashboard {

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Dashboard");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        // Create user login button
        JButton userLoginButton = new JButton("User Login");
        userLoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "User Login Clicked");
            }
        });

        // Create admin login button
        JButton adminLoginButton = new JButton("Admin Login");
        adminLoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Admin Login Clicked");
            }
        });

        // Add buttons to the frame
        frame.add(userLoginButton);
        frame.add(adminLoginButton);

        // Set frame visibility
        frame.setVisible(true);
    }
}