import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIRegistryServer {
    public class RMIRegistryServer {

        public static void main(String[] args) throws RemoteException {
            LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
            RecipeServiceImpl recipeService = new RecipeServiceImpl();
            Naming.rebind("RecipeService", recipeService);
            System.out.println("RMI Registry started");
        }

    }

}
