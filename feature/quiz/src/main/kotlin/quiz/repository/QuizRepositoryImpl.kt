package quiz.repository

import quiz.model.QuizRepository
import api.TriviaApiService
import api.TriviaResponse
import model.QuestionResult
import model.QuizResult
import quiz.mapper.toQuizResultEntity
import room.QuizResultDao
import room.entities.QuizResultEntity
import javax.inject.Inject

class QuizRepositoryImpl @Inject constructor(private val apiService: TriviaApiService, private val quizResultDao: QuizResultDao) :
    QuizRepository {
    override suspend fun fetchQuizQuestions(): TriviaResponse {
        return apiService.getQuestions()
    }

    override suspend fun saveQuizResult(result: QuizResult) {
        quizResultDao.insertQuizResult(result.toQuizResultEntity())
    }

    override suspend fun deleteQuizResult(result: QuizResult) {
        TODO("Not yet implemented")
    }

    override suspend fun getQuizResults(): List<QuizResult> {
        TODO("Not yet implemented")
    }

    override suspend fun getQuizResult(id: Int): QuizResult {
        TODO("Not yet implemented")
    }
}