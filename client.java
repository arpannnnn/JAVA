import java.net.*;
import java.io.*;
import java.util.*;
class client{
public static void main(String[] args) {
    try{
          Socket S= new Socket("localhost",5000);
          System.out.print("Enter Number");
          Scanner scan=new Scanner(System.in);
           int num =scan.nextInt();
           DataOutputStream dos= new DataOutputStream(S.getOutputStream());
           dos.writeInt(num);
           dos.flush();
           DataInputStream dis=new DataInputStream(S.getInputStream());
           int ans=dis.readInt();
           System.out.print("The Square is="+ans);
           
           dis.close();
           dos.close();
           S.close();
    }

   catch (IOException e) {
       System.out.print(e.getMessage());
    }
    
}
}