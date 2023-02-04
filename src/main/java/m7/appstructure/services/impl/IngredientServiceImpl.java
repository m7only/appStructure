package m7.appstructure.services.impl;

import m7.appstructure.models.Ingredient;
import m7.appstructure.services.IngredientService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class IngredientServiceImpl implements IngredientService {
    private Map<Integer, Ingredient> ingredientStorage = new HashMap<>();
    private Integer counter = 0;

    @Override
    public Ingredient addIngredient(Ingredient ingredient) {
        return ingredientStorage.put(counter++, ingredient);
    }

    @Override
    public Ingredient getIngredientById(Integer id) {
        return ingredientStorage.getOrDefault(id, null);
    }
}
