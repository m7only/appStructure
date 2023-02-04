package m7.appstructure.services;

import m7.appstructure.models.Recipe;

public interface RecipeService {
    Recipe addRecipe(Recipe recipe);
    Recipe getRecipeById(Integer id);
}
