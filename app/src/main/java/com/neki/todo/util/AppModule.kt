package com.neki.todo.util

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.neki.todo.dao.TdoListDao
import com.neki.todo.db.AppDatabase
import com.neki.todo.repo.TodoListRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideRoomDatabase(context: Application):AppDatabase{
        return  Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "TodoList"
        ).build()
    }

    @Provides
    @Singleton
    fun provideTodoListDao(database: AppDatabase):TdoListDao{
        return database.todoListDao()
    }

    @Provides
    @Singleton
    fun provideTodoListRepo(tdoListDao: TdoListDao):TodoListRepo{
        return TodoListRepo(tdoListDao)
    }
}