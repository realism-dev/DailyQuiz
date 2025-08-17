package quiz.repository

import model.api.QuizResult
import network.api.TriviaApiService
import model.api.TriviaResponse
import quiz.mapper.toQuizResultEntity
import model.repository.QuizRepository
import room.QuizResultDao
import javax.inject.Inject

class QuizRepositoryImpl @Inject constructor(private val apiService: TriviaApiService, private val quizResultDao: QuizResultDao) :
    QuizRepository {
    override suspend fun fetchQuizQuestions(): TriviaResponse {
        return apiService.getQuestions()
    }

    override suspend fun saveQuizResult(result: QuizResult) {
        quizResultDao.insertQuizResult(result.toQuizResultEntity())
    }
}