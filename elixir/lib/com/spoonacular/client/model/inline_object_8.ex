# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule com.spoonacular.client.Model.InlineObject8 do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"locale"
  ]

  @type t :: %__MODULE__{
    :"locale" => String.t | nil
  }
end

defimpl Poison.Decoder, for: com.spoonacular.client.Model.InlineObject8 do
  def decode(value, _options) do
    value
  end
end
