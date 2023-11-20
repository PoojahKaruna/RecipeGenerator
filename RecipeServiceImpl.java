import java.rmi.RemoteException;
import java.util.List;

public class RecipeServiceImpl extends java.rmi.server.UnicastRemoteObject implements RecipeService {

    public RecipeServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public List<Recipe> getRecipes() throws RemoteException {
        // Retrieve recipes from data storage
        List<Recipe> recipes = databaseAccessMethods.getRecipes();
        return recipes;
    }
}
