/**
 * spoonacular API
 * The spoonacular Nutrition, Recipe, and Food API allows you to access over 380,000 recipes, thousands of ingredients, 800,000 food products, and 100,000 menu items. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.
 *
 * The version of the OpenAPI document: 1.0
 * Contact: mail@spoonacular.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.spoonacular;

import com.spoonacular.client.ApiException;
import com.spoonacular.client.ApiInvoker;
import com.spoonacular.client.Pair;

import com.spoonacular.client.model.*;

import java.util.*;

import java.math.BigDecimal;
import com.spoonacular.client.model.InlineObject;
import com.spoonacular.client.model.InlineObject1;
import com.spoonacular.client.model.InlineResponse20027;
import com.spoonacular.client.model.InlineResponse20028;
import com.spoonacular.client.model.InlineResponse20030;
import com.spoonacular.client.model.InlineResponse20031;
import com.spoonacular.client.model.InlineResponse20032;
import com.spoonacular.client.model.InlineResponse20033;
import java.util.*;

import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class ProductsApi {
  String basePath = "https://api.spoonacular.com";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
   * Autocomplete Product Search
   * Generate suggestions for grocery products based on a (partial) query. The matches will be found by looking in the title only.
   * @param query The (partial) search query.
   * @param number The number of results to return (between 1 and 25).
   * @return InlineResponse20032
   */
  public InlineResponse20032  autocompleteProductSearch (String query, Integer number) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'query' is set
    if (query == null) {
       throw new ApiException(400, "Missing the required parameter 'query' when calling autocompleteProductSearch");
    }

    // create path and map variables
    String localVarPath = "/food/products/suggest".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<String, String>();

    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "number", number));


    String[] localVarContentTypes = {
      
    };
    String localVarContentType = localVarContentTypes.length > 0 ? localVarContentTypes[0] : "application/json";

    if (localVarContentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      localVarPostBody = localVarBuilder.build();
    } else {
      // normal form params
          }

    try {
      String localVarResponse = apiInvoker.invokeAPI(basePath, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
      if(localVarResponse != null){
        return (InlineResponse20032) ApiInvoker.deserialize(localVarResponse, "", InlineResponse20032.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  /**
   * Classify Grocery Product
   * This endpoint allows you to match a packaged food to a basic category, e.g. a specific brand of milk to the category milk.
   * @param inlineObject1 
   * @param locale The display name of the returned category, supported is en_US (for American English) and en_GB (for British English).
   * @return InlineResponse20033
   */
  public InlineResponse20033  classifyGroceryProduct (InlineObject1 inlineObject1, String locale) throws ApiException {
    Object localVarPostBody = inlineObject1;
    // verify the required parameter 'inlineObject1' is set
    if (inlineObject1 == null) {
       throw new ApiException(400, "Missing the required parameter 'inlineObject1' when calling classifyGroceryProduct");
    }

    // create path and map variables
    String localVarPath = "/food/products/classify".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<String, String>();

    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "locale", locale));


    String[] localVarContentTypes = {
      "application/json"
    };
    String localVarContentType = localVarContentTypes.length > 0 ? localVarContentTypes[0] : "application/json";

    if (localVarContentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      localVarPostBody = localVarBuilder.build();
    } else {
      // normal form params
          }

    try {
      String localVarResponse = apiInvoker.invokeAPI(basePath, localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
      if(localVarResponse != null){
        return (InlineResponse20033) ApiInvoker.deserialize(localVarResponse, "", InlineResponse20033.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  /**
   * Classify Grocery Product Bulk
   * Provide a set of product jsons, get back classified products.
   * @param inlineObject 
   * @param locale The display name of the returned category, supported is en_US (for American English) and en_GB (for British English).
   * @return List<InlineResponse20033>
   */
  public List<InlineResponse20033>  classifyGroceryProductBulk (List<InlineObject> inlineObject, String locale) throws ApiException {
    Object localVarPostBody = inlineObject;
    // verify the required parameter 'inlineObject' is set
    if (inlineObject == null) {
       throw new ApiException(400, "Missing the required parameter 'inlineObject' when calling classifyGroceryProductBulk");
    }

    // create path and map variables
    String localVarPath = "/food/products/classifyBatch".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<String, String>();

    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "locale", locale));


    String[] localVarContentTypes = {
      "application/json"
    };
    String localVarContentType = localVarContentTypes.length > 0 ? localVarContentTypes[0] : "application/json";

    if (localVarContentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      localVarPostBody = localVarBuilder.build();
    } else {
      // normal form params
          }

    try {
      String localVarResponse = apiInvoker.invokeAPI(basePath, localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
      if(localVarResponse != null){
        return (List<InlineResponse20033>) ApiInvoker.deserialize(localVarResponse, "array", InlineResponse20033.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  /**
   * Get Comparable Products
   * Find comparable products to the given one.
   * @param upc The UPC of the product for which you want to find comparable products.
   * @return InlineResponse20031
   */
  public InlineResponse20031  getComparableProducts (BigDecimal upc) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'upc' is set
    if (upc == null) {
       throw new ApiException(400, "Missing the required parameter 'upc' when calling getComparableProducts");
    }

    // create path and map variables
    String localVarPath = "/food/products/upc/{upc}/comparable".replaceAll("\\{format\\}","json").replaceAll("\\{" + "upc" + "\\}", apiInvoker.escapeString(upc.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<String, String>();



    String[] localVarContentTypes = {
      
    };
    String localVarContentType = localVarContentTypes.length > 0 ? localVarContentTypes[0] : "application/json";

    if (localVarContentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      localVarPostBody = localVarBuilder.build();
    } else {
      // normal form params
          }

    try {
      String localVarResponse = apiInvoker.invokeAPI(basePath, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
      if(localVarResponse != null){
        return (InlineResponse20031) ApiInvoker.deserialize(localVarResponse, "", InlineResponse20031.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  /**
   * Get Product Information
   * Use a product id to get full information about a product, such as ingredients, nutrition, etc. The nutritional information is per serving.
   * @param id The item&#39;s id.
   * @return InlineResponse20030
   */
  public InlineResponse20030  getProductInformation (Integer id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling getProductInformation");
    }

    // create path and map variables
    String localVarPath = "/food/products/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<String, String>();



    String[] localVarContentTypes = {
      
    };
    String localVarContentType = localVarContentTypes.length > 0 ? localVarContentTypes[0] : "application/json";

    if (localVarContentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      localVarPostBody = localVarBuilder.build();
    } else {
      // normal form params
          }

    try {
      String localVarResponse = apiInvoker.invokeAPI(basePath, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
      if(localVarResponse != null){
        return (InlineResponse20030) ApiInvoker.deserialize(localVarResponse, "", InlineResponse20030.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  /**
   * Product Nutrition by ID Image
   * Visualize a product&#39;s nutritional information as an image.
   * @param id The id of the product.
   * @return Object
   */
  public Object  productNutritionByIDImage (BigDecimal id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling productNutritionByIDImage");
    }

    // create path and map variables
    String localVarPath = "/food/products/{id}/nutritionWidget.png".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<String, String>();



    String[] localVarContentTypes = {
      
    };
    String localVarContentType = localVarContentTypes.length > 0 ? localVarContentTypes[0] : "application/json";

    if (localVarContentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      localVarPostBody = localVarBuilder.build();
    } else {
      // normal form params
          }

    try {
      String localVarResponse = apiInvoker.invokeAPI(basePath, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
      if(localVarResponse != null){
        return (Object) ApiInvoker.deserialize(localVarResponse, "", Object.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  /**
   * Product Nutrition Label Image
   * Get a product&#39;s nutrition label as an image.
   * @param id The product id.
   * @param showOptionalNutrients Whether to show optional nutrients.
   * @param showZeroValues Whether to show zero values.
   * @param showIngredients Whether to show a list of ingredients.
   * @return Object
   */
  public Object  productNutritionLabelImage (BigDecimal id, Boolean showOptionalNutrients, Boolean showZeroValues, Boolean showIngredients) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling productNutritionLabelImage");
    }

    // create path and map variables
    String localVarPath = "/food/products/{id}/nutritionLabel.png".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<String, String>();

    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "showOptionalNutrients", showOptionalNutrients));
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "showZeroValues", showZeroValues));
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "showIngredients", showIngredients));


    String[] localVarContentTypes = {
      
    };
    String localVarContentType = localVarContentTypes.length > 0 ? localVarContentTypes[0] : "application/json";

    if (localVarContentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      localVarPostBody = localVarBuilder.build();
    } else {
      // normal form params
          }

    try {
      String localVarResponse = apiInvoker.invokeAPI(basePath, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
      if(localVarResponse != null){
        return (Object) ApiInvoker.deserialize(localVarResponse, "", Object.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  /**
   * Product Nutrition Label Widget
   * Get a product&#39;s nutrition label as an HTML widget.
   * @param id The product id.
   * @param defaultCss Whether the default CSS should be added to the response.
   * @param showOptionalNutrients Whether to show optional nutrients.
   * @param showZeroValues Whether to show zero values.
   * @param showIngredients Whether to show a list of ingredients.
   * @return String
   */
  public String  productNutritionLabelWidget (BigDecimal id, Boolean defaultCss, Boolean showOptionalNutrients, Boolean showZeroValues, Boolean showIngredients) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling productNutritionLabelWidget");
    }

    // create path and map variables
    String localVarPath = "/food/products/{id}/nutritionLabel".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<String, String>();

    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "defaultCss", defaultCss));
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "showOptionalNutrients", showOptionalNutrients));
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "showZeroValues", showZeroValues));
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "showIngredients", showIngredients));


    String[] localVarContentTypes = {
      
    };
    String localVarContentType = localVarContentTypes.length > 0 ? localVarContentTypes[0] : "application/json";

    if (localVarContentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      localVarPostBody = localVarBuilder.build();
    } else {
      // normal form params
          }

    try {
      String localVarResponse = apiInvoker.invokeAPI(basePath, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
      if(localVarResponse != null){
        return (String) ApiInvoker.deserialize(localVarResponse, "", String.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  /**
   * Search Grocery Products
   * Search packaged food products, such as frozen pizza or Greek yogurt.
   * @param query The (natural language) search query.
   * @param minCalories The minimum amount of calories the product must have.
   * @param maxCalories The maximum amount of calories the product can have.
   * @param minCarbs The minimum amount of carbohydrates in grams the product must have.
   * @param maxCarbs The maximum amount of carbohydrates in grams the product can have.
   * @param minProtein The minimum amount of protein in grams the product must have.
   * @param maxProtein The maximum amount of protein in grams the product can have.
   * @param minFat The minimum amount of fat in grams the product must have.
   * @param maxFat The maximum amount of fat in grams the product can have.
   * @param offset The number of results to skip (between 0 and 900).
   * @param number The maximum number of items to return (between 1 and 100). Defaults to 10.
   * @return InlineResponse20027
   */
  public InlineResponse20027  searchGroceryProducts (String query, BigDecimal minCalories, BigDecimal maxCalories, BigDecimal minCarbs, BigDecimal maxCarbs, BigDecimal minProtein, BigDecimal maxProtein, BigDecimal minFat, BigDecimal maxFat, Integer offset, Integer number) throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/food/products/search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<String, String>();

    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "minCalories", minCalories));
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "maxCalories", maxCalories));
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "minCarbs", minCarbs));
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "maxCarbs", maxCarbs));
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "minProtein", minProtein));
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "maxProtein", maxProtein));
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "minFat", minFat));
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "maxFat", maxFat));
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "number", number));


    String[] localVarContentTypes = {
      
    };
    String localVarContentType = localVarContentTypes.length > 0 ? localVarContentTypes[0] : "application/json";

    if (localVarContentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      localVarPostBody = localVarBuilder.build();
    } else {
      // normal form params
          }

    try {
      String localVarResponse = apiInvoker.invokeAPI(basePath, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
      if(localVarResponse != null){
        return (InlineResponse20027) ApiInvoker.deserialize(localVarResponse, "", InlineResponse20027.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  /**
   * Search Grocery Products by UPC
   * Get information about a packaged food using its UPC.
   * @param upc The product&#39;s UPC.
   * @return InlineResponse20028
   */
  public InlineResponse20028  searchGroceryProductsByUPC (BigDecimal upc) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'upc' is set
    if (upc == null) {
       throw new ApiException(400, "Missing the required parameter 'upc' when calling searchGroceryProductsByUPC");
    }

    // create path and map variables
    String localVarPath = "/food/products/upc/{upc}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "upc" + "\\}", apiInvoker.escapeString(upc.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<String, String>();



    String[] localVarContentTypes = {
      
    };
    String localVarContentType = localVarContentTypes.length > 0 ? localVarContentTypes[0] : "application/json";

    if (localVarContentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      localVarPostBody = localVarBuilder.build();
    } else {
      // normal form params
          }

    try {
      String localVarResponse = apiInvoker.invokeAPI(basePath, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
      if(localVarResponse != null){
        return (InlineResponse20028) ApiInvoker.deserialize(localVarResponse, "", InlineResponse20028.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  /**
   * Product Nutrition by ID Widget
   * Visualize a product&#39;s nutritional information as HTML including CSS.
   * @param id The item&#39;s id.
   * @param defaultCss Whether the default CSS should be added to the response.
   * @param accept Accept header.
   * @return String
   */
  public String  visualizeProductNutritionByID (Integer id, Boolean defaultCss, String accept) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling visualizeProductNutritionByID");
    }

    // create path and map variables
    String localVarPath = "/food/products/{id}/nutritionWidget".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<String, String>();

    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "defaultCss", defaultCss));

    localVarHeaderParams.put("Accept", ApiInvoker.parameterToString(accept));

    String[] localVarContentTypes = {
      
    };
    String localVarContentType = localVarContentTypes.length > 0 ? localVarContentTypes[0] : "application/json";

    if (localVarContentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      localVarPostBody = localVarBuilder.build();
    } else {
      // normal form params
          }

    try {
      String localVarResponse = apiInvoker.invokeAPI(basePath, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
      if(localVarResponse != null){
        return (String) ApiInvoker.deserialize(localVarResponse, "", String.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
}