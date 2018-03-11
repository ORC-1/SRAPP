/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SRAPPCode;

import java.io.File;

/**
 *
 * @author ORC1
 * 
 * 
 * 
 */

//private class javaFilter
//extends javax.swing.filechooser.FileFilter
//{
//public boolean accept(File f)
//{
//if (f.isDirectory())
//return true;
//String name = f.getName();
//if (name.matches(".*\\.java"))
//return true;
//else
//return false;
//}
//public String getDescription()
//{
//return "Java files (*.java)";
//}
//}
public class FileFilter extends javax.swing.filechooser.FileFilter{
    
    @Override
  public boolean accept(File f)
{
if (f.isDirectory())
return true;
String name = f.getName();
if (name.matches(".*\\.jpeg")| name.matches(".*\\.jpg") | name.matches(".*\\.png")) 
//else if (name.matches(".*\\.JPeg"))
return true;
else
return false;
}
    @Override
public String getDescription()
{
return "Image (*.JPeg,.jpg, .png)";
}  
    
}
