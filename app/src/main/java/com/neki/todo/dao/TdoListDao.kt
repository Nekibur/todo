package com.neki.todo.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.neki.todo.model.TodoList
import kotlinx.coroutines.flow.Flow

@Dao
interface TdoListDao {

    @Query("select *from TodoList")
    fun getAllTodoList():Flow<List<TodoList>>

    @Insert
    suspend fun insert(todoList: TodoList)

    @Delete
    suspend fun delete(todoList: TodoList)
}