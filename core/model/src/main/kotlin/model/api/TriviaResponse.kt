package model.api


data class TriviaResponse(
    val response_code: Int,
    val results: List<Question>
)