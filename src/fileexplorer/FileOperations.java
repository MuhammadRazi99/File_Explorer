/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fileexplorer;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ahmed
 */
public class FileOperations {
    
    Desktop desk = Desktop.getDesktop();
    String userName=System.getProperty("user.name");
    String userDir=System.getenv("SystemDrive");
    
    public void copyFile(String src, String des) {
        String dest = des + src.substring(src.lastIndexOf("\\"));
        if (Files.isDirectory(Paths.get(src))) {
            try {
                Files.walk(Paths.get(src))
                        .forEach(source -> {
                            try {
                                Path destination = Paths.get(dest, source.toString().substring(src.length()));
                                Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
                            } catch (IOException ex) {
                                Logger.getLogger(FileOperations.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        });
            } catch (IOException ex) {
                Logger.getLogger(FileOperations.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                Path source = Paths.get(src);
                Path destination = Paths.get(dest);
                Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException ex) {
                Logger.getLogger(FileOperations.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void moveFile(String src, String dest) {
        dest = dest + src.substring(src.lastIndexOf("\\"));
        try {
            Path source = Paths.get(src);
            Path destination = Paths.get(dest);
            Files.move(source, destination);
        } catch (IOException ex) {
            Logger.getLogger(FileOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void renameFile(String src, String name) {
        String dest = src.substring(0, src.lastIndexOf("\\") + 1) + name;
        try {
            Path source = Paths.get(src);
            Path destination = Paths.get(dest);
            Files.move(source, destination);
        } catch (IOException ex) {
            Logger.getLogger(FileOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteFile(String src) {
        try {
            Path source = Paths.get(src);
            if (Files.isDirectory(source)) {
                Files.walk(source)
                        .sorted(Comparator.reverseOrder())
                        .map(Path::toFile)
                        .forEach(File::delete);
            } else {
                Files.delete(source);
            }
        } catch (IOException ex) {
            Logger.getLogger(FileOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void newFile(String src, String name) {
        try {
            Path source = Paths.get(src, name);
            if (name.contains(".")) {
                Files.createFile(source);
            } else {
                Files.createDirectory(source);
            }
        } catch (IOException ex) {
            Logger.getLogger(FileOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    public File[] getDrives() 
    {return File.listRoots();}

    public File getDesktop()
    {return new File(userDir+"\\Users\\"+userName+"\\Desktop");} 
    
    public File getDocument()
    {return new File(userDir+"\\Users\\"+userName+"\\Document");}
    
    public File getDownload()
    {return new File(userDir+"\\Users\\"+userName+"\\Download");}
    
    public File getPicture()
    {return new File(userDir+"\\Users\\"+userName+"\\Pictures");}
    
    public File getVideo()
    {return new File(userDir+"\\Users\\"+userName+"\\Videos");}
    
    public File getMusic()
    {return new File(userDir+"\\Users\\"+userName+"\\Music");}
    
}
