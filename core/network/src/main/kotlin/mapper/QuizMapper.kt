package mapper

import model.Question
import model.QuestionResult
import model.QuizResult

fun Question.toQuestionResult(selectedAnswer: String): QuestionResult {
    return QuestionResult(
        category = this.category,
        type = this.type,
        difficulty = this.difficulty,
        question = this.question,
        correct_answer = this.correct_answer,
        incorrect_answers = this.incorrect_answers,
        selected_answer = selectedAnswer
    )
}

fun QuestionResult.toQuestion():Question{
    return Question(
        category = this.category,
        type = this.type,
        difficulty = this.difficulty,
        question = this.question,
        correct_answer = this.correct_answer,
        incorrect_answers = this.incorrect_answers
    )
}

fun MutableMap<Question, String>.toQuizResult(rating: Int, createDate:Long):QuizResult{
    val results:List<QuestionResult> = this.map { it.key.toQuestionResult(it.value) }
    return QuizResult(
        id = 0,
        results = results,
        quizDate = createDate,
        quizResult = rating
    )
}