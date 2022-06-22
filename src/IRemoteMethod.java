
import java.rmi.Remote;
import java.rmi.RemoteException;  
// Creating Remote interface for our applica tion 
public interface IRemoteMethod 
extends Remote {
	
	
   void printMsg() throws RemoteException;  
;
   
   int add(int a, int b) 
		   throws RemoteException;  

} 
