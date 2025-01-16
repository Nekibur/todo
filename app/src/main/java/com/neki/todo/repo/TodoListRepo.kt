package com.neki.todo.repo

import com.neki.todo.dao.TdoListDao
import com.neki.todo.model.TodoList
import javax.inject.Inject

class TodoListRepo @Inject constructor(
    val todoListDao: TdoListDao
) {
    fun getAllTodoList()=todoListDao.getAllTodoList()

    suspend fun insert(todoList: TodoList){
        todoListDao.insert(todoList)
    }

    suspend fun delete(todoList: TodoList){
        todoListDao.delete(todoList)
    }
}