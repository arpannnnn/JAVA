import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements  Serializable{
    String name;
    public Student (String name){
        this.name=name;
    }
    public void print(){
        System.out.print(this.name);
    }
}
class Example{
    public static void main(String[]args){
        Student s= new Student("Arpan");
        try{
            FileOutputStream fos = new FileOutputStream("obj.txt");
            ObjectOutputStream os=new ObjectOutputStream(fos);
            os.writeObject(s);
            os.close();
            fos.close();
        }
        catch(IOException e ){
            System.out.print(e.getMessage());
        }
    }
}
