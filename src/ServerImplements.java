//ServerImplements.java

import java.rmi.*;
import java.rmi.server.*;
import java.lang.String;
interface RemoteInterface extends Remote
{
	public int add(int x,int y)throws Exception;
}

public class ServerImplements extends UnicastRemoteObject implements RemoteInterface
{ 	public ServerImplements() throws Exception{
		super();
	}


public int add(int x, int y){
	return (x+y);
}	}