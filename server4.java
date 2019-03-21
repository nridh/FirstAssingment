import java.net.*; 
import java.io.*; 
  
class Server 
{
    private Socket          socket   = null; 
    private ServerSocket    server   = null; 
    private DataInputStream in       = null; 
 
    public Server(int port) 
    { 
        
        try
        { 
            server = new ServerSocket(3222); 
            System.out.println("Server ready for chatting = "); 
  
            System.out.println("Waiting for a client ..."); 
  
            socket = server.accept(); 
            System.out.println("Client accepted"); 
  
            in = new DataInputStream new BufferedInputStream(socket.getInputStream())); 
           
            OutputStream ostream = sock.getOutputStream(); 
           PrintWriter pwrite = new PrintWriter(ostream, true);
          InputStream istream = sock.getInputStream();
          BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));


  
            String receiveMessage, sendMessage; 
  
            
            while (true) 
             {
                if((receiveMessage = receiveRead.readLine()) != null)  
               {
                  System.out.println(receiveMessage);         
               }         
                sendMessage = keyRead.readLine(); 
                pwrite.println(sendMessage);             
                pwrite.flush();
              }              
           } 
        
      catch(IOException i) 
        { 
            System.out.println(i); 
        } 
    } 
  
    public static void main(String args[]) 
    { 
        Server server = new Server(3222); 
    } 
} 
