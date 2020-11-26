// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.inline_fragment_for_non_optional_field

import com.apollographql.apollo.api.ResponseField
import com.apollographql.apollo.api.internal.ResponseAdapter
import com.apollographql.apollo.api.internal.ResponseReader
import com.apollographql.apollo.api.internal.ResponseWriter
import kotlin.Array
import kotlin.Double
import kotlin.String
import kotlin.Suppress

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter", "PropertyName",
    "RemoveRedundantQualifierName")
object TestQuery_ResponseAdapter : ResponseAdapter<TestQuery.Data> {
  private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
    ResponseField.forObject("nonOptionalHero", "nonOptionalHero", mapOf<String, Any>(
      "episode" to "EMPIRE"), false, null)
  )

  override fun fromResponse(reader: ResponseReader, __typename: String?): TestQuery.Data {
    return reader.run {
      var nonOptionalHero: TestQuery.NonOptionalHero? = null
      while(true) {
        when (selectField(RESPONSE_FIELDS)) {
          0 -> nonOptionalHero = readObject<TestQuery.NonOptionalHero>(RESPONSE_FIELDS[0]) { reader ->
            TestQuery_ResponseAdapter.NonOptionalHero_ResponseAdapter.fromResponse(reader)
          }
          else -> break
        }
      }
      TestQuery.Data(
        nonOptionalHero = nonOptionalHero!!
      )
    }
  }

  override fun toResponse(writer: ResponseWriter, value: TestQuery.Data) {
    writer.writeObject(RESPONSE_FIELDS[0]) { writer ->
      TestQuery_ResponseAdapter.NonOptionalHero_ResponseAdapter.toResponse(writer, value.nonOptionalHero)
    }
  }

  object HumanNonOptionalHero_ResponseAdapter : ResponseAdapter<TestQuery.HumanNonOptionalHero> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forDouble("height", "height", null, true, null),
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forString("name", "name", null, false, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?):
        TestQuery.HumanNonOptionalHero {
      return reader.run {
        var height: Double? = null
        var __typename: String? = __typename
        var name: String? = null
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> height = readDouble(RESPONSE_FIELDS[0])
            1 -> __typename = readString(RESPONSE_FIELDS[1])
            2 -> name = readString(RESPONSE_FIELDS[2])
            else -> break
          }
        }
        TestQuery.HumanNonOptionalHero(
          height = height,
          __typename = __typename!!,
          name = name!!
        )
      }
    }

    override fun toResponse(writer: ResponseWriter, value: TestQuery.HumanNonOptionalHero) {
      writer.writeDouble(RESPONSE_FIELDS[0], value.height)
      writer.writeString(RESPONSE_FIELDS[1], value.__typename)
      writer.writeString(RESPONSE_FIELDS[2], value.name)
    }
  }

  object OtherNonOptionalHero_ResponseAdapter : ResponseAdapter<TestQuery.OtherNonOptionalHero> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forString("name", "name", null, false, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?):
        TestQuery.OtherNonOptionalHero {
      return reader.run {
        var __typename: String? = __typename
        var name: String? = null
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> __typename = readString(RESPONSE_FIELDS[0])
            1 -> name = readString(RESPONSE_FIELDS[1])
            else -> break
          }
        }
        TestQuery.OtherNonOptionalHero(
          __typename = __typename!!,
          name = name!!
        )
      }
    }

    override fun toResponse(writer: ResponseWriter, value: TestQuery.OtherNonOptionalHero) {
      writer.writeString(RESPONSE_FIELDS[0], value.__typename)
      writer.writeString(RESPONSE_FIELDS[1], value.name)
    }
  }

  object NonOptionalHero_ResponseAdapter : ResponseAdapter<TestQuery.NonOptionalHero> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forString("name", "name", null, false, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?):
        TestQuery.NonOptionalHero {
      val typename = __typename ?: reader.readString(RESPONSE_FIELDS[0])
      return when(typename) {
        "Human" -> TestQuery_ResponseAdapter.HumanNonOptionalHero_ResponseAdapter.fromResponse(reader, typename)
        else -> TestQuery_ResponseAdapter.OtherNonOptionalHero_ResponseAdapter.fromResponse(reader, typename)
      }
    }

    override fun toResponse(writer: ResponseWriter, value: TestQuery.NonOptionalHero) {
      when(value) {
        is TestQuery.HumanNonOptionalHero -> TestQuery_ResponseAdapter.HumanNonOptionalHero_ResponseAdapter.toResponse(writer, value)
        is TestQuery.OtherNonOptionalHero -> TestQuery_ResponseAdapter.OtherNonOptionalHero_ResponseAdapter.toResponse(writer, value)
      }
    }
  }
}
