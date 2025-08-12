package room

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import room.entities.QuestionResultEntity
import room.entities.QuestionResultConverter
import room.entities.QuizResultEntity

@Database(entities = [QuizResultEntity::class, QuestionResultEntity::class], version = 1, exportSchema = false)
@TypeConverters(QuestionResultConverter::class)
abstract class QuizDatabase : RoomDatabase() {
    abstract fun quizResultDao(): QuizResultDao
}
