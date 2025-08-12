package quiz.model

import api.TriviaResponse
import model.QuizResult

interface QuizRepository {
    suspend fun fetchQuizQuestions(): TriviaResponse
    suspend fun saveQuizResult(result: QuizResult)
    suspend fun deleteQuizResult(result: QuizResult)
    suspend fun getQuizResults(): List<QuizResult>
    suspend fun getQuizResult(id: Int): QuizResult
}