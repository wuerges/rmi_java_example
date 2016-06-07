import java.rmi.*;
import java.rmi.registry.*;

public class Cliente
{
    public static void main (String[] argv) {
        try
        {
            Registry registry = LocateRegistry.getRegistry(6666);
            Interface msi = (Interface) registry.lookup("obj1");
            System.out.println("Soma: " + msi.soma(20.0,40.0));
        }
        catch (Exception e)
        {
            System.out.println("Falhou o arranque do Cliente.\n"+e);                
            System.exit(0);
        }
    }
}
