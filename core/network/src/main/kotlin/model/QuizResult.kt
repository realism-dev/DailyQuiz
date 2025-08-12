package model

data class QuizResult(
    val id:Int,
    val results: List<QuestionResult>,
    val quizDate:Long,
    val quizResult:Int
)
