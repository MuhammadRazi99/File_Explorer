/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package fileexplorer;
import java.awt.Color;
import java.io.File;
import javax.swing.JButton;
/**
 *
 * @author muham
 */
public class ListButton extends JButton{

    /**
     * @param args the command line arguments
     */
//    private Color bgColor=Color.Black;
    public ListButton(File file){
        super(file.getPath().substring(0,file.getPath().length()-1));
    }
            
            
    public static void main(String args[]) {
        // TODO code application logic here
    
    }
}
