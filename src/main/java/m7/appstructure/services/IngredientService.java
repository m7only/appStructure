package m7.appstructure.services;

import m7.appstructure.models.Ingredient;

public interface IngredientService {
    Ingredient addIngredient(Ingredient ingredient);

    Ingredient getIngredientById(Integer id);
}
