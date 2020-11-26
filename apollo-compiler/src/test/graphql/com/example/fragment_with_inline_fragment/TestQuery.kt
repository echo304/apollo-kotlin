// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.fragment_with_inline_fragment

import com.apollographql.apollo.api.Operation
import com.apollographql.apollo.api.OperationName
import com.apollographql.apollo.api.Query
import com.apollographql.apollo.api.Response
import com.apollographql.apollo.api.ScalarTypeAdapters
import com.apollographql.apollo.api.ScalarTypeAdapters.Companion.DEFAULT
import com.apollographql.apollo.api.internal.OperationRequestBodyComposer
import com.apollographql.apollo.api.internal.QueryDocumentMinifier
import com.apollographql.apollo.api.internal.ResponseFieldMapper
import com.apollographql.apollo.api.internal.ResponseFieldMarshaller
import com.apollographql.apollo.api.internal.SimpleOperationResponseParser
import com.apollographql.apollo.api.internal.Throws
import com.example.fragment_with_inline_fragment.fragment.DroidDetails
import com.example.fragment_with_inline_fragment.fragment.HeroDetails
import com.example.fragment_with_inline_fragment.fragment.HumanDetails
import com.example.fragment_with_inline_fragment.type.Episode
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import okio.Buffer
import okio.BufferedSource
import okio.ByteString
import okio.IOException

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter", "PropertyName",
    "RemoveRedundantQualifierName")
class TestQuery : Query<TestQuery.Data, Operation.Variables> {
  override fun operationId(): String = OPERATION_ID

  override fun queryDocument(): String = QUERY_DOCUMENT

  override fun variables(): Operation.Variables = Operation.EMPTY_VARIABLES

  override fun name(): OperationName = OPERATION_NAME

  override fun responseFieldMapper(): ResponseFieldMapper<Data> {
    return ResponseFieldMapper { reader ->
      TestQuery_ResponseAdapter.fromResponse(reader)
    }
  }

  @Throws(IOException::class)
  override fun parse(source: BufferedSource, scalarTypeAdapters: ScalarTypeAdapters):
      Response<Data> {
    return SimpleOperationResponseParser.parse(source, this, scalarTypeAdapters)
  }

  @Throws(IOException::class)
  override fun parse(byteString: ByteString, scalarTypeAdapters: ScalarTypeAdapters):
      Response<Data> {
    return parse(Buffer().write(byteString), scalarTypeAdapters)
  }

  @Throws(IOException::class)
  override fun parse(source: BufferedSource): Response<Data> {
    return parse(source, DEFAULT)
  }

  @Throws(IOException::class)
  override fun parse(byteString: ByteString): Response<Data> {
    return parse(byteString, DEFAULT)
  }

  override fun composeRequestBody(scalarTypeAdapters: ScalarTypeAdapters): ByteString {
    return OperationRequestBodyComposer.compose(
      operation = this,
      autoPersistQueries = false,
      withQueryDocument = true,
      scalarTypeAdapters = scalarTypeAdapters
    )
  }

  override fun composeRequestBody(): ByteString = OperationRequestBodyComposer.compose(
    operation = this,
    autoPersistQueries = false,
    withQueryDocument = true,
    scalarTypeAdapters = DEFAULT
  )

  override fun composeRequestBody(
    autoPersistQueries: Boolean,
    withQueryDocument: Boolean,
    scalarTypeAdapters: ScalarTypeAdapters
  ): ByteString = OperationRequestBodyComposer.compose(
    operation = this,
    autoPersistQueries = autoPersistQueries,
    withQueryDocument = withQueryDocument,
    scalarTypeAdapters = scalarTypeAdapters
  )

  /**
   * An autonomous mechanical character in the Star Wars universe
   */
  interface Droid : Hero {
    override val __typename: String

    override fun marshaller(): ResponseFieldMarshaller
  }

  /**
   * A character from the Star Wars universe
   */
  data class Node(
    /**
     * The name of the character
     */
    override val name: String
  ) : HeroDetails.Node {
    override fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller { writer ->
        TestQuery_ResponseAdapter.Node_ResponseAdapter.toResponse(writer, this)
      }
    }
  }

  /**
   * An edge object for a character's friends
   */
  data class Edge(
    /**
     * The character represented by this friendship edge
     */
    override val node: Node?
  ) : HeroDetails.Edge {
    override fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller { writer ->
        TestQuery_ResponseAdapter.Edge_ResponseAdapter.toResponse(writer, this)
      }
    }
  }

  /**
   * A connection object for a character's friends
   */
  data class FriendsConnection(
    /**
     * The total number of friends
     */
    override val totalCount: Int?,
    /**
     * The edges for each of the character's friends.
     */
    override val edges: List<Edge?>?
  ) : HeroDetails.FriendsConnection {
    override fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller { writer ->
        TestQuery_ResponseAdapter.FriendsConnection_ResponseAdapter.toResponse(writer, this)
      }
    }

    fun edgesFilterNotNull(): List<Edge>? = edges?.filterNotNull()
  }

  /**
   * A character from the Star Wars universe
   */
  data class CharacterHero(
    override val __typename: String = "Character",
    /**
     * The name of the character
     */
    override val name: String,
    /**
     * The friends of the character exposed as a connection with edges
     */
    override val friendsConnection: FriendsConnection,
    /**
     * The movies this character appears in
     */
    override val appearsIn: List<Episode?>
  ) : HeroDetails, Hero {
    override fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller { writer ->
        TestQuery_ResponseAdapter.CharacterHero_ResponseAdapter.toResponse(writer, this)
      }
    }

    fun appearsInFilterNotNull(): List<Episode> = appearsIn.filterNotNull()
  }

  /**
   * A character from the Star Wars universe
   */
  data class Node1(
    /**
     * The name of the character
     */
    override val name: String
  ) : HeroDetails.Node {
    override fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller { writer ->
        TestQuery_ResponseAdapter.Node1_ResponseAdapter.toResponse(writer, this)
      }
    }
  }

  /**
   * An edge object for a character's friends
   */
  data class Edge1(
    /**
     * The character represented by this friendship edge
     */
    override val node: Node1?
  ) : HeroDetails.Edge {
    override fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller { writer ->
        TestQuery_ResponseAdapter.Edge1_ResponseAdapter.toResponse(writer, this)
      }
    }
  }

  /**
   * A connection object for a character's friends
   */
  data class FriendsConnection1(
    /**
     * The total number of friends
     */
    override val totalCount: Int?,
    /**
     * The edges for each of the character's friends.
     */
    override val edges: List<Edge1?>?
  ) : HeroDetails.FriendsConnection {
    override fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller { writer ->
        TestQuery_ResponseAdapter.FriendsConnection1_ResponseAdapter.toResponse(writer, this)
      }
    }

    fun edgesFilterNotNull(): List<Edge1>? = edges?.filterNotNull()
  }

  data class CharacterDroidHero(
    override val __typename: String,
    /**
     * The name of the character
     */
    override val name: String,
    /**
     * The friends of the character exposed as a connection with edges
     */
    override val friendsConnection: FriendsConnection1,
    /**
     * This droid's primary function
     */
    override val primaryFunction: String?,
    /**
     * The movies this character appears in
     */
    override val appearsIn: List<Episode?>
  ) : HeroDetails, Droid, DroidDetails, Hero {
    override fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller { writer ->
        TestQuery_ResponseAdapter.CharacterDroidHero_ResponseAdapter.toResponse(writer, this)
      }
    }

    fun appearsInFilterNotNull(): List<Episode> = appearsIn.filterNotNull()
  }

  /**
   * A character from the Star Wars universe
   */
  data class Node2(
    /**
     * The name of the character
     */
    override val name: String
  ) : HeroDetails.Node {
    override fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller { writer ->
        TestQuery_ResponseAdapter.Node2_ResponseAdapter.toResponse(writer, this)
      }
    }
  }

  /**
   * An edge object for a character's friends
   */
  data class Edge2(
    /**
     * The character represented by this friendship edge
     */
    override val node: Node2?
  ) : HeroDetails.Edge {
    override fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller { writer ->
        TestQuery_ResponseAdapter.Edge2_ResponseAdapter.toResponse(writer, this)
      }
    }
  }

  /**
   * A connection object for a character's friends
   */
  data class FriendsConnection2(
    /**
     * The total number of friends
     */
    override val totalCount: Int?,
    /**
     * The edges for each of the character's friends.
     */
    override val edges: List<Edge2?>?
  ) : HeroDetails.FriendsConnection {
    override fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller { writer ->
        TestQuery_ResponseAdapter.FriendsConnection2_ResponseAdapter.toResponse(writer, this)
      }
    }

    fun edgesFilterNotNull(): List<Edge2>? = edges?.filterNotNull()
  }

  data class CharacterHumanHero(
    override val __typename: String,
    /**
     * The name of the character
     */
    override val name: String,
    /**
     * The friends of the character exposed as a connection with edges
     */
    override val friendsConnection: FriendsConnection2,
    /**
     * The movies this character appears in
     */
    override val appearsIn: List<Episode?>
  ) : HeroDetails, HumanDetails, Hero {
    override fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller { writer ->
        TestQuery_ResponseAdapter.CharacterHumanHero_ResponseAdapter.toResponse(writer, this)
      }
    }

    fun appearsInFilterNotNull(): List<Episode> = appearsIn.filterNotNull()
  }

  /**
   * A character from the Star Wars universe
   */
  data class OtherHero(
    override val __typename: String = "Character",
    /**
     * The name of the character
     */
    override val name: String,
    /**
     * The movies this character appears in
     */
    override val appearsIn: List<Episode?>
  ) : Hero {
    override fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller { writer ->
        TestQuery_ResponseAdapter.OtherHero_ResponseAdapter.toResponse(writer, this)
      }
    }

    fun appearsInFilterNotNull(): List<Episode> = appearsIn.filterNotNull()
  }

  /**
   * A character from the Star Wars universe
   */
  interface Hero {
    val __typename: String

    /**
     * The name of the character
     */
    val name: String

    /**
     * The movies this character appears in
     */
    val appearsIn: List<Episode?>

    fun asHeroDetails(): HeroDetails? = this as? HeroDetails

    fun asDroid(): Droid? = this as? Droid

    fun asDroidDetails(): DroidDetails? = this as? DroidDetails

    fun asHumanDetails(): HumanDetails? = this as? HumanDetails

    fun marshaller(): ResponseFieldMarshaller
  }

  /**
   * Data from the response after executing this GraphQL operation
   */
  data class Data(
    val hero: Hero?
  ) : Operation.Data {
    override fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller { writer ->
        TestQuery_ResponseAdapter.toResponse(writer, this)
      }
    }
  }

  companion object {
    const val OPERATION_ID: String =
        "e01fcc7b255552f79419f653def959b6a7ab9bffd519c57e826d91ffc2c7fb1f"

    val QUERY_DOCUMENT: String = QueryDocumentMinifier.minify(
          """
          |query TestQuery {
          |  hero {
          |    __typename
          |    name
          |    ...HeroDetails
          |    appearsIn
          |  }
          |}
          |fragment HeroDetails on Character {
          |  __typename
          |  ...HumanDetails
          |  ... on Droid {
          |    __typename
          |    ...DroidDetails
          |  }
          |  name
          |  friendsConnection {
          |    totalCount
          |    edges {
          |      node {
          |        name
          |      }
          |    }
          |  }
          |}
          |fragment HumanDetails on Human {
          |  __typename
          |  name
          |}
          |fragment DroidDetails on Droid {
          |  __typename
          |  name
          |  primaryFunction
          |}
          """.trimMargin()
        )

    val OPERATION_NAME: OperationName = object : OperationName {
      override fun name(): String {
        return "TestQuery"
      }
    }
  }
}
