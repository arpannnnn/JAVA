import java.util.zip.*;
import java.io.*;
class Test{
    public static void zip(File path)throws IOException{
        if (path.isDirectory()){
             throw new IllegalArgumentException("This Is not a valid path");
        }
        File[]files=path.listFiles();
        if(files.length==0){
             throw new IllegalArgumentException("Folder Empty");
        }
        FileOutputStream fos=new FileOutputStream("myzip");
        ZipOutputStream zos=new ZipOutputStream(fos);
        for(File file: files){
            FileInputStream fis=new FileInputStream(file);
            ZipEntry ze=new ZipEntry(file.getName());
            ze.putNextEntry();
            int data;
            while((data=fis.read())!=-1){
                zos.write(data);
            }
        }
    }
    
    
}