// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.deprecation.type

import com.apollographql.apollo.api.ScalarType
import kotlin.String

enum class CustomType : ScalarType {
  DATE {
    override fun typeName(): String = "Date"

    override fun className(): String = "kotlin.Any"
  },

  ID {
    override fun typeName(): String = "ID"

    override fun className(): String = "kotlin.String"
  },

  URL {
    override fun typeName(): String = "URL"

    override fun className(): String = "kotlin.Any"
  },

  UNSUPPORTEDTYPE {
    override fun typeName(): String = "UnsupportedType"

    override fun className(): String = "kotlin.Any"
  }
}
