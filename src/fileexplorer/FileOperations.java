/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fileexplorer;

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
}
