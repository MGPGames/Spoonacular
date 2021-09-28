--[[
  spoonacular API
 
  The spoonacular Nutrition, Recipe, and Food API allows you to access over 380,000 recipes, thousands of ingredients, 800,000 food products, and 100,000 menu items. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.
 
  The version of the OpenAPI document: 1.0
  Contact: mail@spoonacular.com
  Generated by: https://openapi-generator.tech
]]

-- inline_response_200_1 class
local inline_response_200_1 = {}
local inline_response_200_1_mt = {
	__name = "inline_response_200_1";
	__index = inline_response_200_1;
}

local function cast_inline_response_200_1(t)
	return setmetatable(t, inline_response_200_1_mt)
end

local function new_inline_response_200_1(id, image, image_type, likes, missed_ingredient_count, missed_ingredients, title, unused_ingredients, used_ingredient_count, used_ingredients, )
	return cast_inline_response_200_1({
		["id"] = id;
		["image"] = image;
		["imageType"] = image_type;
		["likes"] = likes;
		["missedIngredientCount"] = missed_ingredient_count;
		["missedIngredients"] = missed_ingredients;
		["title"] = title;
		["unusedIngredients"] = unused_ingredients;
		["usedIngredientCount"] = used_ingredient_count;
		["usedIngredients"] = used_ingredients;
		[""] = ;
	})
end

return {
	cast = cast_inline_response_200_1;
	new = new_inline_response_200_1;
}