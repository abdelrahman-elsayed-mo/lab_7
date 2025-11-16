/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;
import ui.LoginFrame;
import backend.JsonDatabaseManager;
import backend.UserService;
import javax.swing.SwingUtilities;
/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        JsonDatabaseManager dbManager = new JsonDatabaseManager();
        UserService userService = new UserService(dbManager);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginFrame(userService).setVisible(true);
            }
        });
    }
}
