import java.net.*; 
import java.io.*; 
  
class Server 
{
   
    public static void main(String args[]) throws Exception
    { 
        
        
            ServerSocket server = new ServerSocket(3222); 
            System.out.println("    ~Server is ready ~"); 
  
            System.out.println("Waiting for a client ..."); 
  
            Socket sock = sersock.accept(); 
            System.out.println("Client accepted"); 
  
            BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
            
           
            OutputStream ostream = sock.getOutputStream(); 
            PrintWriter pwrite = new PrintWriter(ostream, true);
            InputStream istream = sock.getInputStream();
            BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));


  
            String receiveMessage, sendMessage; 
  
            
            while (true) 
             {
                if((receiveMessage = receiveRead.readLine()) != null)  
                  {
                     System.out.println("From Client : " + receiveMessage);         
                  }         
                 
                 sendMessage = keyRead.readLine(); 
                 pwrite.println("To Client = " + sendMessage);             
                 pwrite.flush();
             }
      
      } 
} 
