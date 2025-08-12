package room.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

@Entity(tableName = "quiz_results")
data class QuizResultEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @TypeConverters(QuestionResultConverter::class) val results: List<QuestionResultEntity>,
    val quizDate:Long,
    val quizResult:Int
)

@Entity(tableName = "question_results")
data class QuestionResultEntity(
    @PrimaryKey(autoGenerate = true) val questionId: Int = 0,
    val category: String,
    val type: String,
    val difficulty: String,
    val question: String,
    val correct_answer: String,
    val incorrect_answers: String,
    val selected_answer: String
)

class QuestionResultConverter {
    @TypeConverter
    fun fromListToString(results: List<QuestionResultEntity>): String {
        return Gson().toJson(results)
    }

    @TypeConverter
    fun fromStringToList(results: String): List<QuestionResultEntity> {
        val listType = object : TypeToken<List<QuestionResultEntity>>() {}.type
        return Gson().fromJson(results, listType)
    }
}

