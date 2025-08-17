package model.repository

import model.api.QuizResult
import model.api.TriviaResponse

interface QuizRepository {
    suspend fun fetchQuizQuestions(): TriviaResponse
    suspend fun saveQuizResult(result: QuizResult)
}