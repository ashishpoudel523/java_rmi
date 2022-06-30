
// Implementing the remote interface    
public class ImplExample 
implements IRemoteMethod {  
   
   // Implementing the interface method 
   public void printMsg() {  
      System.out.println
      ("This is an example RMI program");  
   }  
   
   public int add(int a, int b) {
	      System.out.println(a+b);
	
	   return (a+b);  

   }
} 

 
