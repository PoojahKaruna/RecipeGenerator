import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface RecipeService extends Remote {

    List<Recipe> getRecipes() throws RemoteException;

    List<Recipe> filterRecipes(String category, String cuisine);

    List<Recipe> searchRecipes(String keywords, String ingredients);

    void addRecipe(Recipe recipe);

    void editRecipe(int recipeId, Recipe updatedRecipe);

    void deleteRecipe(int recipeId);

    void submitRating(int recipeId, int rating);

    void submitReview(int recipeId, String review);

}
