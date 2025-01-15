package com.neki.todo.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "TodoList")
data class TodoList(

    @PrimaryKey(autoGenerate = true) val id:Long=0,
    val data:String,
    val createdAt:Long=System.currentTimeMillis(),
    val updatedAt:Long=System.currentTimeMillis()

)
