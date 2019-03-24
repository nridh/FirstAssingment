import java.net.*; 
import java.io.*; 
  
class Server 
{
   
    public static void main(String args[]) throws Exception
    { 
        
        
            ServerSocket sersock = new ServerSocket(3333); 
            System.out.println("    ~Server is ready ~"); 
            Socket sock = sersock.accept(); 
            
  
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
              {
              System.out.println("To Client = "+sendMessage);              
              }
              pwrite.println(sendMessage));
              pwrite.flush();
                 
                
             }
      
      } 
} 
