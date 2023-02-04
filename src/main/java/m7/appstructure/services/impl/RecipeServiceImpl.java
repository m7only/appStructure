package m7.appstructure.services.impl;

import m7.appstructure.models.Recipe;
import m7.appstructure.services.RecipeService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class RecipeServiceImpl implements RecipeService {
    private Map<Integer, Recipe> recipeStorage = new HashMap<>(){{
        put(0, new Recipe());
        put(1, new Recipe());
    }};
    private Integer counter = 0;

    @Override
    public Recipe addRecipe(Recipe recipe) {
        return recipeStorage.put(counter++, recipe);
    }

    @Override
    public Recipe getRecipeById(Integer id) {
        return recipeStorage.getOrDefault(id, null);
    }
}
