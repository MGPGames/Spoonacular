# coding: utf-8

"""
    spoonacular API

    The spoonacular Nutrition, Recipe, and Food API allows you to access over 380,000 recipes, thousands of ingredients, 800,000 food products, and 100,000 menu items. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.  # noqa: E501

    The version of the OpenAPI document: 1.0
    Contact: mail@spoonacular.com
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six


class InlineResponse20036(object):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    """
    Attributes:
      openapi_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    openapi_types = {
        'id': 'int',
        'title': 'str',
        'restaurant_chain': 'str',
        'nutrition': 'InlineResponse20028Nutrition',
        'badges': 'list[str]',
        'breadcrumbs': 'list[str]',
        'generated_text': 'str',
        'image_type': 'str',
        'likes': 'float',
        'servings': 'InlineResponse20028Servings',
        'price': 'float',
        'spoonacular_score': 'float'
    }

    attribute_map = {
        'id': 'id',
        'title': 'title',
        'restaurant_chain': 'restaurantChain',
        'nutrition': 'nutrition',
        'badges': 'badges',
        'breadcrumbs': 'breadcrumbs',
        'generated_text': 'generatedText',
        'image_type': 'imageType',
        'likes': 'likes',
        'servings': 'servings',
        'price': 'price',
        'spoonacular_score': 'spoonacularScore'
    }

    def __init__(self, id=None, title=None, restaurant_chain=None, nutrition=None, badges=None, breadcrumbs=None, generated_text=None, image_type=None, likes=None, servings=None, price=None, spoonacular_score=None):  # noqa: E501
        """InlineResponse20036 - a model defined in OpenAPI"""  # noqa: E501

        self._id = None
        self._title = None
        self._restaurant_chain = None
        self._nutrition = None
        self._badges = None
        self._breadcrumbs = None
        self._generated_text = None
        self._image_type = None
        self._likes = None
        self._servings = None
        self._price = None
        self._spoonacular_score = None
        self.discriminator = None

        self.id = id
        self.title = title
        self.restaurant_chain = restaurant_chain
        self.nutrition = nutrition
        self.badges = badges
        self.breadcrumbs = breadcrumbs
        if generated_text is not None:
            self.generated_text = generated_text
        self.image_type = image_type
        self.likes = likes
        self.servings = servings
        if price is not None:
            self.price = price
        if spoonacular_score is not None:
            self.spoonacular_score = spoonacular_score

    @property
    def id(self):
        """Gets the id of this InlineResponse20036.  # noqa: E501


        :return: The id of this InlineResponse20036.  # noqa: E501
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this InlineResponse20036.


        :param id: The id of this InlineResponse20036.  # noqa: E501
        :type: int
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def title(self):
        """Gets the title of this InlineResponse20036.  # noqa: E501


        :return: The title of this InlineResponse20036.  # noqa: E501
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title):
        """Sets the title of this InlineResponse20036.


        :param title: The title of this InlineResponse20036.  # noqa: E501
        :type: str
        """
        if title is None:
            raise ValueError("Invalid value for `title`, must not be `None`")  # noqa: E501
        if title is not None and len(title) < 1:
            raise ValueError("Invalid value for `title`, length must be greater than or equal to `1`")  # noqa: E501

        self._title = title

    @property
    def restaurant_chain(self):
        """Gets the restaurant_chain of this InlineResponse20036.  # noqa: E501


        :return: The restaurant_chain of this InlineResponse20036.  # noqa: E501
        :rtype: str
        """
        return self._restaurant_chain

    @restaurant_chain.setter
    def restaurant_chain(self, restaurant_chain):
        """Sets the restaurant_chain of this InlineResponse20036.


        :param restaurant_chain: The restaurant_chain of this InlineResponse20036.  # noqa: E501
        :type: str
        """
        if restaurant_chain is None:
            raise ValueError("Invalid value for `restaurant_chain`, must not be `None`")  # noqa: E501
        if restaurant_chain is not None and len(restaurant_chain) < 1:
            raise ValueError("Invalid value for `restaurant_chain`, length must be greater than or equal to `1`")  # noqa: E501

        self._restaurant_chain = restaurant_chain

    @property
    def nutrition(self):
        """Gets the nutrition of this InlineResponse20036.  # noqa: E501


        :return: The nutrition of this InlineResponse20036.  # noqa: E501
        :rtype: InlineResponse20028Nutrition
        """
        return self._nutrition

    @nutrition.setter
    def nutrition(self, nutrition):
        """Sets the nutrition of this InlineResponse20036.


        :param nutrition: The nutrition of this InlineResponse20036.  # noqa: E501
        :type: InlineResponse20028Nutrition
        """
        if nutrition is None:
            raise ValueError("Invalid value for `nutrition`, must not be `None`")  # noqa: E501

        self._nutrition = nutrition

    @property
    def badges(self):
        """Gets the badges of this InlineResponse20036.  # noqa: E501


        :return: The badges of this InlineResponse20036.  # noqa: E501
        :rtype: list[str]
        """
        return self._badges

    @badges.setter
    def badges(self, badges):
        """Sets the badges of this InlineResponse20036.


        :param badges: The badges of this InlineResponse20036.  # noqa: E501
        :type: list[str]
        """
        if badges is None:
            raise ValueError("Invalid value for `badges`, must not be `None`")  # noqa: E501

        self._badges = badges

    @property
    def breadcrumbs(self):
        """Gets the breadcrumbs of this InlineResponse20036.  # noqa: E501


        :return: The breadcrumbs of this InlineResponse20036.  # noqa: E501
        :rtype: list[str]
        """
        return self._breadcrumbs

    @breadcrumbs.setter
    def breadcrumbs(self, breadcrumbs):
        """Sets the breadcrumbs of this InlineResponse20036.


        :param breadcrumbs: The breadcrumbs of this InlineResponse20036.  # noqa: E501
        :type: list[str]
        """
        if breadcrumbs is None:
            raise ValueError("Invalid value for `breadcrumbs`, must not be `None`")  # noqa: E501

        self._breadcrumbs = breadcrumbs

    @property
    def generated_text(self):
        """Gets the generated_text of this InlineResponse20036.  # noqa: E501


        :return: The generated_text of this InlineResponse20036.  # noqa: E501
        :rtype: str
        """
        return self._generated_text

    @generated_text.setter
    def generated_text(self, generated_text):
        """Sets the generated_text of this InlineResponse20036.


        :param generated_text: The generated_text of this InlineResponse20036.  # noqa: E501
        :type: str
        """

        self._generated_text = generated_text

    @property
    def image_type(self):
        """Gets the image_type of this InlineResponse20036.  # noqa: E501


        :return: The image_type of this InlineResponse20036.  # noqa: E501
        :rtype: str
        """
        return self._image_type

    @image_type.setter
    def image_type(self, image_type):
        """Sets the image_type of this InlineResponse20036.


        :param image_type: The image_type of this InlineResponse20036.  # noqa: E501
        :type: str
        """
        if image_type is None:
            raise ValueError("Invalid value for `image_type`, must not be `None`")  # noqa: E501
        if image_type is not None and len(image_type) < 1:
            raise ValueError("Invalid value for `image_type`, length must be greater than or equal to `1`")  # noqa: E501

        self._image_type = image_type

    @property
    def likes(self):
        """Gets the likes of this InlineResponse20036.  # noqa: E501


        :return: The likes of this InlineResponse20036.  # noqa: E501
        :rtype: float
        """
        return self._likes

    @likes.setter
    def likes(self, likes):
        """Sets the likes of this InlineResponse20036.


        :param likes: The likes of this InlineResponse20036.  # noqa: E501
        :type: float
        """
        if likes is None:
            raise ValueError("Invalid value for `likes`, must not be `None`")  # noqa: E501

        self._likes = likes

    @property
    def servings(self):
        """Gets the servings of this InlineResponse20036.  # noqa: E501


        :return: The servings of this InlineResponse20036.  # noqa: E501
        :rtype: InlineResponse20028Servings
        """
        return self._servings

    @servings.setter
    def servings(self, servings):
        """Sets the servings of this InlineResponse20036.


        :param servings: The servings of this InlineResponse20036.  # noqa: E501
        :type: InlineResponse20028Servings
        """
        if servings is None:
            raise ValueError("Invalid value for `servings`, must not be `None`")  # noqa: E501

        self._servings = servings

    @property
    def price(self):
        """Gets the price of this InlineResponse20036.  # noqa: E501


        :return: The price of this InlineResponse20036.  # noqa: E501
        :rtype: float
        """
        return self._price

    @price.setter
    def price(self, price):
        """Sets the price of this InlineResponse20036.


        :param price: The price of this InlineResponse20036.  # noqa: E501
        :type: float
        """

        self._price = price

    @property
    def spoonacular_score(self):
        """Gets the spoonacular_score of this InlineResponse20036.  # noqa: E501


        :return: The spoonacular_score of this InlineResponse20036.  # noqa: E501
        :rtype: float
        """
        return self._spoonacular_score

    @spoonacular_score.setter
    def spoonacular_score(self, spoonacular_score):
        """Sets the spoonacular_score of this InlineResponse20036.


        :param spoonacular_score: The spoonacular_score of this InlineResponse20036.  # noqa: E501
        :type: float
        """

        self._spoonacular_score = spoonacular_score

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.openapi_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, InlineResponse20036):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other