package com.neki.todo.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.neki.todo.dao.TdoListDao
import com.neki.todo.model.TodoList

@Database(entities = [
    TodoList::class
], version = 1)
abstract class AppDatabase : RoomDatabase(){
    abstract fun todoListDao():TdoListDao
}