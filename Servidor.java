
import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

class Implementacao implements Interface
{
    public Implementacao() {
        System.out.println("Novo Servidor instanciado...");
    }

    public double soma(double a, double b) 
        throws RemoteException {
        return a + b;
    }
} 


public class Servidor {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(6666);
            Implementacao imp = new Implementacao();
            Interface i = (Interface) UnicastRemoteObject.exportObject(imp, 7001);
            Registry registry = LocateRegistry.getRegistry(6666);
            registry.bind("obj1", i);
        }
        catch (Exception e) {
            System.out.println("Excecao: " + e);
        }
    }
}
