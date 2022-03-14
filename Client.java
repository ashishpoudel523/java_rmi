import java.rmi.registry.LocateRegistry; 
import java.rmi.registry.Registry;


public class Client {  
   private Client() {}  
   public static void main(String[] args) {  
      try {  
         // Getting the registry 
         Registry registry = LocateRegistry.getRegistry(null); 
    
         // Looking up the registry for the remote object 
         IRemoteMethod stub = (IRemoteMethod) registry.lookup("Hello"); 
    
         // Calling the remote method using the obtained object 
         stub.printMsg();
         int c = stub.add(2, 3);
         
         System.out.println("Thank you for giving me value : "+c); 
      } catch (Exception e) {
         System.err.println("Client exception: " + e.toString()); 
         e.printStackTrace(); 
      } 
   } 
}