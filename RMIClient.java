import java.util.List;

public class RMIClient {

    public static void main(String[] args) throws Exception {
        RecipeService recipeService = (RecipeService) Naming.lookup("rmi://localhost:1099/RecipeService");

        // Invoke remote methods on the RecipeService object
        List<Recipe> recipes = recipeService.getRecipes();
        for (Recipe recipe : recipes) {
            System.out.println(recipe.getName());
        }
    }

}
