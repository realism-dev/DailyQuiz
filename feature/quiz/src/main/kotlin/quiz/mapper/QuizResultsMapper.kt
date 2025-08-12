package quiz.mapper

import model.QuestionResult
import model.QuizResult
import room.entities.QuestionResultEntity
import room.entities.QuizResultEntity

fun QuizResultEntity.toQuizResult():QuizResult{
    return QuizResult(
        id = this.id,
        results = this.results.map { it.toQuestionResult() },
        quizDate = this.quizDate,
        quizResult =this.quizResult
    )
}

fun QuizResult.toQuizResultEntity():QuizResultEntity{
    return QuizResultEntity(
        id = this.id,
        results = this.results.map { it.toQuestionResultEntity() },
        quizDate = this.quizDate,
        quizResult = this.quizResult
    )
}

fun QuestionResult.toQuestionResultEntity():QuestionResultEntity{
    return QuestionResultEntity(
        questionId = 0,
        category = this.category,
        type = this.type,
        difficulty = this.difficulty,
        question =this.question,
        correct_answer = this.correct_answer,
        incorrect_answers = this.incorrect_answers.joinToString (","),
        selected_answer = this.selected_answer
    )
}

fun QuestionResultEntity.toQuestionResult():QuestionResult{
    return QuestionResult(
        category = this.category,
        type = this.type,
        difficulty = this.difficulty,
        question =this.question,
        correct_answer = this.correct_answer,
        incorrect_answers = this.incorrect_answers.split(","),
        selected_answer = this.selected_answer
    )
}
