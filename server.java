import java.io.*;
import java.net.*;

class server 
{
    public static void main(String[] args) throws Exception

       {
        int port = 3222; 
        try 
          {
            ServerSocket ss = new ServerSocket(port);
            System.out.println("Waiting for a client....");

            System.out.println("Client:");
            System.out.println();
            while(true) {
            Socket socket = ss.accept();

                SSocket sSocket = new SSocket(socket);
                Thread t = new Thread(sSocket);
                t.start();
          System.out.println("Socket Stack Size-----"+socketMap.size());
            }
        }
        catch (Exception e) { }
    }
}
