/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.Startup to edit this template
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

public class Startup {

    /**
     */
//    LinkedList<File> files=new LinkedList<File>;
    public Startup() {
        File[] SystemDrives = File.listRoots();
        for (File drive : SystemDrives) {
            System.out.println("Path:" + drive.getPath().length());
        }
    }

    public static void main(String args[]) {
// TODO code application logic here
        System.out.println("Startup");
    }
}
