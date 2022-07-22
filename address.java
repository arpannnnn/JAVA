import java.net.*;
class address{
    public static void main(String[]args){
        try{
               InetAddress[] ip=InetAddress.getAllByName("www.facebook.com");
               System.out.print("Ip address=" +ip.getHostAddress());
               System.out.print("Host Name="+ip.getHostname());
               System.out.print("is local address="+ip.isAnyLocalAddress());
               System.out.print("is multiCast="+ip.isMultiCastAddress());
               System.out.print("is loopback?="+ip.isLooopBackAddress());
               for(InetAddress g :ip){
                System.out.print(g.getHostAddress());
               }
        }
        catch(UnknownHostException e){
            System.out.print(e.getMessage());
        }

    }}
