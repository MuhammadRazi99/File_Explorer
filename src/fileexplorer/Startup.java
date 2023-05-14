/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.Startup to edit this template
 */
package fileexplorer;

/**
 *
 * @author muham
 */
import java.io.File;

public class Startup {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            Frontend front = new Frontend();
            front.start(File.listRoots());
            front.setVisible(true);
        });
    }
}
