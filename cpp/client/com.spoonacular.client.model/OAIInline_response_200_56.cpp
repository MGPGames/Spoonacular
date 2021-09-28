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


#include "OAIInline_response_200_56.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIInline_response_200_56::OAIInline_response_200_56(QString json) {
    this->init();
    this->fromJson(json);
}

OAIInline_response_200_56::OAIInline_response_200_56() {
    this->init();
}

OAIInline_response_200_56::~OAIInline_response_200_56() {

}

void
OAIInline_response_200_56::init() {
    
    m_suggests_isSet = false;
    m_suggests_isValid = false;
    
    m_words_isSet = false;
    m_words_isValid = false;
    }

void
OAIInline_response_200_56::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIInline_response_200_56::fromJsonObject(QJsonObject json) {
    
    m_suggests_isValid = ::OpenAPI::fromJsonValue(suggests, json[QString("suggests")]);
    
    
    
    m_words_isValid = ::OpenAPI::fromJsonValue(words, json[QString("words")]);
    
}

QString
OAIInline_response_200_56::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIInline_response_200_56::asJsonObject() const {
    QJsonObject obj;
	if(suggests.isSet()){
        obj.insert(QString("suggests"), ::OpenAPI::toJsonValue(suggests));
    }
	
    if(words.size() > 0){
        obj.insert(QString("words"), ::OpenAPI::toJsonValue(words));
    } 
    return obj;
}


OAIInline_response_200_56_suggests
OAIInline_response_200_56::getSuggests() const {
    return suggests;
}
void
OAIInline_response_200_56::setSuggests(const OAIInline_response_200_56_suggests &suggests) {
    this->suggests = suggests;
    this->m_suggests_isSet = true;
}


QList<OAIObject>
OAIInline_response_200_56::getWords() const {
    return words;
}
void
OAIInline_response_200_56::setWords(const QList<OAIObject> &words) {
    this->words = words;
    this->m_words_isSet = true;
}

bool
OAIInline_response_200_56::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(suggests.isSet()){ isObjectUpdated = true; break;}
    
        if(words.size() > 0){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

bool
OAIInline_response_200_56::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_suggests_isValid && m_words_isValid && true;
}

}
