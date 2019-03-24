import java.net.*; 
import java.io.*; 
  
class Server 
{
   
    public static void main(String args[]) throws Exception
    { 
        
        
            server = new ServerSocket(3222); 
            System.out.println("Server ready for chatting ~"); 
  
            System.out.println("Waiting for a client ..."); 
  
            socket = server.accept(); 
            System.out.println("Client accepted"); 
  
            BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
            
           
            OutputStream ostream = server.getOutputStream(); 
           PrintWriter pwrite = new PrintWriter(ostream, true);
          InputStream istream = server.getInputStream();
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
} 
