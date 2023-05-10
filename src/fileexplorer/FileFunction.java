/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.FileFunction to edit this template
 */
package fileexplorer;

//issues :
//printing drive name
//As some file does not have file name so using File Path for File Name
/**
 *
 * @author muham
 */
import java.io.File;
import java.awt.Desktop;
import java.io.IOException;

public class FileFunction {

    /**
     * @param args the command line arguments
     */
//    LinkedList<File> files=new LinkedList<File>;
    Desktop desk = Desktop.getDesktop();

    public FileFunction() {
        File[] SystemDrives = File.listRoots();
        for (File drive : SystemDrives) {
            System.out.println("Path:" + drive.getPath().length());
        }
    }

    public void openFile(File file) throws IOException {

    }

    public File[] getDrives() {
        File[] SystemDrives = File.listRoots();
        return SystemDrives;
    }

    public static void main(String args[]) {
        // TODO code application logic here
        FileFunction start = new FileFunction();
        start.getDrives();

    }
}
