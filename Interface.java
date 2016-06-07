
import java.rmi.*;

public interface Interface extends Remote
{
    public double soma(double a, double b)
        throws RemoteException;
} 


