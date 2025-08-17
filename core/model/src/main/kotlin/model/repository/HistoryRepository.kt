package model.repository

import model.api.QuizResult

interface HistoryRepository {
    suspend fun getQuizResults(): List<QuizResult>
    suspend fun deleteQuizResult(result: QuizResult)
}