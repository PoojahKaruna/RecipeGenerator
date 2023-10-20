
import java.util.ArrayList;
import java.util.HashMap;

public class RecipeBook {

    // Created a Hashmap to store my recipes and have them catergories by the type
    // of diet
    private static HashMap<String, ArrayList<String>> recipesByCategory = new HashMap<String, ArrayList<String>>();
    static {
        // Under the Hashmap they will be stored as Array list in categories ex :
        // chicken or beef
        ArrayList<String> chickenRecipes = new ArrayList<>();
        chickenRecipes.add("Chicken Marsala");
        chickenRecipes.add("Tuscan creamy chicken");
        chickenRecipes.add("Chicken Fried Rice");
        chickenRecipes.add("Chicken meatball soup");
        chickenRecipes.add("Chicken rice bowl");
        chickenRecipes.add("Chicken cutlet");

        recipesByCategory.put("Chicken", chickenRecipes);

        ArrayList<String> beefRecipes = new ArrayList<>();
        beefRecipes.add("Beef Tacos");
        beefRecipes.add("Beef stir fry");
        beefRecipes.add("Spicy Beef and Broccoli");
        beefRecipes.add("Meatloaf");
        beefRecipes.add("Lasagna");
        beefRecipes.add("Beef Rice bowl");

        recipesByCategory.put("Beef", beefRecipes);

    }

    // method to add a recipe
    public static void addRecipe(String category, String recipe) {
        ArrayList<String> recipes = recipesByCategory.get(category);

        // Checks if the category exists already and then proceeds to make a new
        // ArrayList under the Hashmap and add recipes accordingly
        if (recipes == null) {
            recipes = new ArrayList<>();
            recipesByCategory.put(category, recipes);
        }
        recipes.add(recipe);
    }

    // This will generate a random recipe from a catergory for the user if requested
    public static String getRandomRecipe(String category) {
        ArrayList<String> recipes = recipesByCategory.get(category);
        if (recipes == null || recipes.isEmpty()) {
            return null;
        }
        int randomIndex = (int) (Math.random() * recipes.size());
        return recipes.get(randomIndex);
    }

}