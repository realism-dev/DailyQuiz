package model.repository

import model.api.QuizResult

interface ReviewRepository {
    suspend fun getQuizResult(id: Int): QuizResult
}
