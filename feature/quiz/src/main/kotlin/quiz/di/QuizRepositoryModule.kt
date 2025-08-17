package quiz.di

import quiz.repository.QuizRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import network.api.TriviaApiService
import model.repository.QuizRepository
import room.QuizResultDao
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object QuizRepositoryModule {

    @Provides
    @Singleton
    fun provideQuizRepository(api: TriviaApiService, dao: QuizResultDao): QuizRepository {
        return QuizRepositoryImpl(api,dao)
    }
}