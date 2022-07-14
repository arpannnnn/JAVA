import java.net.*;
import java.io.*;
   class Server{
       public static void main (String[]args){
       try{
           ServerSocket ss= new ServerSocket(5000);
         System.out.println("Server running at 5000");
         Socket s= ss.accept();
         System.out.println("client connected");
         DataInputStream dis=new DataInputStream(s.getInputStream());
          
         int num = dis.readInt();
         int sq =num*num;
         DataOutputStream dos=new DataOutputStream(s.getOutputStream());

         dos.writeInt(sq);
         dos.flush();
         s.close();
         dis.close();
         ss.close();
         dos.close();
       }
    
   

           catch   (IOException e){

           
            System.out.print(e.getMessage ());
           }

       
    
        }
    }