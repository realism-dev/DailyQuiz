package room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import room.entities.QuestionResultEntity
import room.entities.QuizResultEntity

@Dao
interface QuizResultDao {
    @Insert
    suspend fun insertQuizResult(quizResultEntity: QuizResultEntity)

    @Insert
    suspend fun insertQuestionResult(questionResultEntity: QuestionResultEntity)

    @Delete
    suspend fun deleteQuizResult(quizResultEntity: QuizResultEntity)

    @Delete
    suspend fun deleteQuestionResult(questionResultEntity: QuestionResultEntity)

    @Query("SELECT * FROM quiz_results WHERE id = :id")
    suspend fun getQuizResultById(id: Int): QuizResultEntity

    @Query("SELECT * FROM question_results WHERE questionId = :questionId")
    suspend fun getQuestionResultById(questionId: Int): QuestionResultEntity

    @Query("DELETE FROM quiz_results")
    suspend fun deleteAllQuizResults()

    @Query("DELETE FROM question_results")
    suspend fun deleteAllQuestionResults()
}
