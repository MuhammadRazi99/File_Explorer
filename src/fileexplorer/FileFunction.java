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
    String userName=System.getProperty("user.name");
    String userDir=System.getenv("SystemDrive");
    
    public FileFunction() {
        File[] SystemDrives = File.listRoots();
        for (File drive : SystemDrives) {
            System.out.println("Path:" + drive.getPath().length());
        }
    }

    
    public File getDesktop(){
        return new File(userDir+"\\Users\\"+userName+"\\Desktop");
    } 
    public File getDocument(){
        return new File(userDir+"\\Users\\"+userName+"\\Document");
    }
    public File getDownload(){
        return new File(userDir+"\\Users\\"+userName+"\\Download");
    }
    public File getPicture(){
        return new File(userDir+"\\Users\\"+userName+"\\Pictures");
    }
    public File getVideo(){
        return new File(userDir+"\\Users\\"+userName+"\\Videos");
    }
    public File getMusic(){
        return new File(userDir+"\\Users\\"+userName+"\\Music");
    }
    public File [] searchFunction(){
        
    }
    
    public File[] getDrives() {
        File[] SystemDrives = File.listRoots();
        return SystemDrives;
    }

    public static void main(String args[]){
        // TODO code application logic here
        FileFunction start = new FileFunction();
        start.getDrives();
        
        
    }
}
