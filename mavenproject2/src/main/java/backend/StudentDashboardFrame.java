/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;
import backend.User;
import backend.UserService;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author DELL
 */
public class StudentDashboardFrame extends JFrame {
    private User user;

    public StudentDashboardFrame(User user, UserService userService) {
        this.user = user;
        setTitle("Student Dashboard - " + user.getUsername());
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        setLayout(new BorderLayout());
        
        JLabel welcomeLabel = new JLabel("Welcome, " + user.getUsername() + " (Student)!", SwingConstants.CENTER);
        add(welcomeLabel, BorderLayout.CENTER);
        
        JButton logoutButton = new JButton("Logout");
       logoutButton.addActionListener(e -> {
    userService.logout();
    new LoginFrame(userService).setVisible(true);
    dispose();
});
        
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        topPanel.add(logoutButton);
        add(topPanel, BorderLayout.NORTH);
    }
}
